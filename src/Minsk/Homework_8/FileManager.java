package Minsk.Homework_8;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.*;

import static Minsk.Homework_8.Consts.BACKUP_DIR_PATH;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;

class FileManager {

    private static int compare(File file1, File file2) {
        return file1.getName().compareTo(file2.getName());
    }

    private File rootDirectory;

    FileManager(String rootDirPath) {
        this.rootDirectory = new File(rootDirPath);
    }

    List<File> getFileList() {
        return getListForDirectory(rootDirectory);
    }

    List<File> getBackupDirectoryList() {
        return getListForDirectory(new File(BACKUP_DIR_PATH));
    }

    private List<File> getListForDirectory(File directory) {
        File[] fileArray = directory.listFiles();
        if (fileArray != null) {
            Arrays.sort(fileArray, FileManager::compare);
        }
        return fileArray != null ? asList(fileArray) : emptyList();
    }

    String readFile(File file) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                stringBuilder.append(line)
                        .append("\n");
            }
        }
        return stringBuilder.toString();
    }

    void writeFile(String fileName, String fileText) throws IOException {
        File file = new File(rootDirectory, fileName);
        if (!file.exists()) {
            file.createNewFile();
        }

        try (FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(fileText);
        }
    }

    void deleteFile(File file) {
        file.delete();
    }

    void addNewFileRecord(File file, String fileText) throws IOException {
        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(fileText);
        }
    }

    void backupFiles(List<File> files) throws IOException {
        String backupPath = String.format("%s\\%s\\", BACKUP_DIR_PATH, getDateAndTime());
        Files.createDirectory(Paths.get(backupPath));
        for (File file : files) {
            Files.copy(file.toPath(), Paths.get(backupPath + file.getName()), REPLACE_EXISTING);
        }
    }

    private String getDateAndTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH.mm.ss");
        return dateFormat.format(new Date());
    }

    void recoveryFiles(File recoveryDirectory) throws IOException {
        List<File> fileList = getListForDirectory(recoveryDirectory);
        String recoveryPath = String.format("%s\\", rootDirectory.getAbsolutePath());

        deleteAllFilesInRootDirectory();

        for (File file : fileList) {
            Files.copy(file.toPath(), Paths.get(recoveryPath + file.getName()), REPLACE_EXISTING);
        }
    }

    private void deleteAllFilesInRootDirectory(){
        for (File file: getListForDirectory(rootDirectory)){
            deleteFile(file);
        }
    }
}
