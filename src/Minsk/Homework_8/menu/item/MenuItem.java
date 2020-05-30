package Minsk.Homework_8.menu.item;

public class MenuItem {

    private int ind;
    private String text;

    public MenuItem(int ind, String text) {
        this.ind = ind;
        this.text = text;
    }

    public int getInd() {
        return ind;
    }

    public void setInd(int ind) {
        this.ind = ind;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return ind + " - " + text;
    }
}
