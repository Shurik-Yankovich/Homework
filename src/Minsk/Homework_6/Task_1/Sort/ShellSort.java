package Minsk.Homework_6.Task_1.Sort;

public class ShellSort implements Sortable {

    @Override
    public void sortAscending(int[] array) {
        for (int step = array.length / 2; step >= 1; step = step / 2)
            for (int start = 0; start < step; start++)
                insertionSortAscending(array, start, step);
    }

    private void insertionSortAscending(int[] array, int start, int step) {
        int tempNumber;
        for (int i = start; i < array.length - 1; i += step)
            for (int j = Math.min(i + step, array.length - 1); j - step >= 0; j -= step)
                if (array[j - step] > array[j]) {
                    tempNumber = array[j];
                    array[j] = array[j - step];
                    array[j - step] = tempNumber;
                } else break;
    }

    @Override
    public void sortDescending(int[] array) {
        for (int step = array.length / 2; step >= 1; step = step / 2)
            for (int start = 0; start < step; start++)
                insertionSortDescending(array, start, step);
    }

    private void insertionSortDescending(int[] array, int start, int step) {
        int tempNumber;
        for (int i = start; i < array.length - 1; i += step)
            for (int j = Math.min(i + step, array.length - 1); j - step >= 0; j -= step)
                if (array[j - step] < array[j]) {
                    tempNumber = array[j];
                    array[j] = array[j - step];
                    array[j - step] = tempNumber;
                } else break;
    }


}
