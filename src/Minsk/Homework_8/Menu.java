package Minsk.Homework_8;

import Minsk.Homework_8.exception.MenuActionException;
import Minsk.Homework_8.menu.item.MainMenuAction;
import Minsk.Homework_8.menu.item.MenuItem;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import static Minsk.Homework_8.Consts.LOGS_PROPERTIES_PATH;
import static Minsk.Homework_8.menu.MainMenuTextConst.*;
import static Minsk.Homework_8.menu.MenuFactory.getMainMenu;

class Menu {

    private FileManager fileManager;
    private Scanner scanner;
    private Logger logger;

    Menu(String rootDirPath) throws IOException {
        this.fileManager = new FileManager(rootDirPath);
        this.scanner = new Scanner(System.in);
        LogManager.getLogManager().readConfiguration(new FileInputStream(LOGS_PROPERTIES_PATH));
        logger = Logger.getLogger(Menu.class.getName());
    }

    void start() {
        logger.log(Level.INFO, "The program began work");
        while (true) {
            printMenuItems(getMainMenu(MainMenuAction.values()));
            try {
                int menuNumber = readIntFromConsole();
                MainMenuAction mainMenuAction = MainMenuAction.getMainMenuAction(menuNumber);
                mainMenuAction(mainMenuAction);
            } catch (MenuActionException e) {
                e.printStackTrace();
                printText(ACTION_ITEM_ERROR_MESSAGE);
                logger.log(Level.SEVERE, ACTION_ITEM_ERROR_MESSAGE, e);
            }
        }
    }

    private void mainMenuAction(MainMenuAction mainMenuAction) {
        switch (mainMenuAction) {
            case READ_FILE:
                workWithFiles();
                break;
            case ADD_FILE:
                addNewFileAction();
                break;
            case DELETE_FILE:
                deleteFileAction();
                break;
            case ADD_NEW_FILE_RECORD:
                addNewFileRecordAction();
                break;
            case BACKUP_OF_FILES:
                backupFilesAction();
                break;
            case RECOVERY_FILES:
                recoveryFilesAction();
                break;
            case EXIT:
                logger.log(Level.INFO, "The program ended work");
                System.exit(0);
        }

    }

    private void addNewFileAction() {
        System.out.println("Введите имя файла.");
        String fileName = readStringFromConsole();
        String fileText = readStringLines();

        try {
            fileManager.writeFile(fileName, fileText);
            logger.log(Level.INFO, String.format("Created file \"%s\"", fileName));
        } catch (IOException e) {
            e.printStackTrace();
            printText(WRITE_FILE_ERROR_MESSAGE);
            logger.log(Level.SEVERE, WRITE_FILE_ERROR_MESSAGE, e);
        }
    }

    private void workWithFiles() {
        File file = getFileName();

        String text;
        try {
            text = fileManager.readFile(file);
            logger.log(Level.INFO, String.format("Read file \"%s\"", file.getName()));
        } catch (IOException e) {
            e.printStackTrace();
            text = READ_FILE_ERROR_MESSAGE;
            logger.log(Level.SEVERE, READ_FILE_ERROR_MESSAGE, e);
        }
        printText(text);
    }

    private void deleteFileAction() {
        File file = getFileName();
        fileManager.deleteFile(file);
        logger.log(Level.INFO, String.format("Deleted file \"%s\"", file.getName()));
    }

    private void addNewFileRecordAction() {
        File file = getFileName();
        String fileText = readStringLines();

        try {
            fileManager.addNewFileRecord(file, fileText);
            logger.log(Level.INFO, String.format("Edited  file \"%s\"", file.getName()));
        } catch (IOException e) {
            e.printStackTrace();
            printText(WRITE_FILE_ERROR_MESSAGE);
            logger.log(Level.SEVERE, WRITE_FILE_ERROR_MESSAGE, e);
        }
    }

    private void backupFilesAction(){
        try {
            fileManager.backupFiles(fileManager.getFileList());
            logger.log(Level.INFO, "Backed up files");
        } catch (IOException e) {
            e.printStackTrace();
            printText(WRITE_BACKUP_ERROR_MESSAGE);
            logger.log(Level.SEVERE, WRITE_BACKUP_ERROR_MESSAGE, e);
        }
    }

    private void recoveryFilesAction(){
        List<File> files = fileManager.getBackupDirectoryList();
        printFiles(files);
        File recoveryDirectory = files.get(readIntFromConsole());
        try {
            fileManager.recoveryFiles(recoveryDirectory);
            logger.log(Level.INFO, String.format("Restored files from backup \"%s\"",recoveryDirectory.getName()));
        } catch (IOException e) {
            e.printStackTrace();
            printText(WRITE_RECOVERY_ERROR_MESSAGE);
            logger.log(Level.SEVERE, WRITE_RECOVERY_ERROR_MESSAGE, e);
        }
    }

    private File getFileName() {
        List<File> files = fileManager.getFileList();
        printFiles(files);
        return files.get(readIntFromConsole());
    }

    private <T> void printText(T text) {
        System.out.println(text.toString());
    }

    private void printFiles(List<File> files) {
        for (int i = 0; i < files.size(); i++) {
            File file = files.get(i);
            printText(String.format(ITEM_WITH_NUMBER, i, file.getName()));
        }
    }

    private void printMenuItems(List<MenuItem> menuItems) {
        for (MenuItem menuItem : menuItems) {
            printText(menuItem);
        }
    }

    private int readIntFromConsole() {
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    private String readStringFromConsole() {
        return scanner.nextLine();
    }

    private String readStringLines() {
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        System.out.println("Введите текст. По завершению введите с новой строки \"*exit\".");
        while ((line = readStringFromConsole()) != null && !line.equals("*exit")) {
            stringBuilder.append(line).append("\n");
        }
        return stringBuilder.toString();
    }
}
