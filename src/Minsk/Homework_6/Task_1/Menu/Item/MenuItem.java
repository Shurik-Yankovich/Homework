package Minsk.Homework_6.Task_1.Menu.Item;

public class MenuItem {

    private int index;
    private String textMenuItem;

    public MenuItem(int index, String textMenuItem) {
        this.index = index;
        this.textMenuItem = textMenuItem;
    }

    public int getIndex() {
        return index;
    }

    public String getTextMenuItem() {
        return textMenuItem;
    }

    @Override
    public String toString() {
        return index + " - " + textMenuItem;
    }
}
