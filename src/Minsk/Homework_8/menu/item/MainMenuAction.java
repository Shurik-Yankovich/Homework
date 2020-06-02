package Minsk.Homework_8.menu.item;

import Minsk.Homework_8.exception.MenuActionException;

public enum MainMenuAction {
    READ_FILE, ADD_FILE, DELETE_FILE, ADD_NEW_FILE_RECORD, BACKUP_OF_FILES, RECOVERY_FILES, EXIT;

    public static MainMenuAction getMainMenuAction(int actionNumber) throws MenuActionException {
        MainMenuAction[] valuesArr = values();
        if (actionNumber >=0 && actionNumber < valuesArr.length) {
            return valuesArr[actionNumber];
        }
        throw new MenuActionException("Wrong action number");
    }
}
