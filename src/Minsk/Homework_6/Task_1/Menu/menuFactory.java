package Minsk.Homework_6.Task_1.Menu;

import Minsk.Homework_6.Task_1.Menu.Item.MainMenuActions;
import Minsk.Homework_6.Task_1.Menu.Item.MenuItem;
import Minsk.Homework_6.Task_1.Menu.Item.SecondMenuActions;

import java.util.LinkedList;
import java.util.List;

import static Minsk.Homework_6.Task_1.Menu.Item.MainMenuTextConst.*;
import static Minsk.Homework_6.Task_1.Menu.Item.SecondMenuTextConst.TEXT_ITEM_SORT_ASCENDING;
import static Minsk.Homework_6.Task_1.Menu.Item.SecondMenuTextConst.TEXT_ITEM_SORT_DESCENDING;

public class menuFactory {

    public static List<MenuItem> getMainMenu(MainMenuActions[] mainMenuActions) {
        List<MenuItem> listMenuItems = new LinkedList<>();
        for (int i = 1; i <= mainMenuActions.length; i++) {
            MenuItem menuItem = getMainMenuItem(i, mainMenuActions[i - 1]);
            if (menuItem != null) {
                listMenuItems.add(menuItem);
            }
        }
        return listMenuItems;
    }

    private static MenuItem getMainMenuItem(int index, MainMenuActions mainMenuAction) {
        switch (mainMenuAction) {
            case BUBBLE_SORT:
                return new MenuItem(index, TEXT_ITEM_BUBBLE_SORT);
            case SELECTION_SORT:
                return new MenuItem(index, TEXT_ITEM_SELECTION_SORT);
            case SHELL_SORT:
                return new MenuItem(index, TEXT_ITEM_SHELL_SORT);
            case EXIT:
                return new MenuItem(index, TEXT_ITEM_EXIT);
        }
        return null;
    }

    public static List<MenuItem> getSecondMenu(SecondMenuActions[] secondMenuActions) {
        List<MenuItem> listMenuItems = new LinkedList<>();
        for (int i = 1; i <= secondMenuActions.length; i++) {
            MenuItem menuItem = getSecondMenuItem(i, secondMenuActions[i - 1]);
            if (menuItem != null) {
                listMenuItems.add(menuItem);
            }
        }
        return listMenuItems;
    }

    private static MenuItem getSecondMenuItem(int index, SecondMenuActions secondMenuAction) {
        switch (secondMenuAction) {
            case SORT_ASCENDING:
                return new MenuItem(index, TEXT_ITEM_SORT_ASCENDING);
            case SORT_DESCENDING:
                return new MenuItem(index, TEXT_ITEM_SORT_DESCENDING);
        }
        return null;
    }

    private menuFactory() {
    }
}
