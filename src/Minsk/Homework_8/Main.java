package Minsk.Homework_8;

import java.io.IOException;

import static Minsk.Homework_8.Consts.ROOT_DIR_PATH;

public class Main {
    public static void main(String[] args) {
        try {
            new Menu(ROOT_DIR_PATH).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
