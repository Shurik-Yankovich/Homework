package Minsk.Homework_6.Task_1.Sort;

public class BubbleSort implements Sortable {

    @Override
    public void sortAscending(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    swapAdjacentArrayElements(array, j);
                }
            }
        }
    }

    @Override
    public void sortDescending(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] > array[j - 1]) {
                    swapAdjacentArrayElements(array, j);
                }
            }
        }
    }

    private void swapAdjacentArrayElements(int[] array, int elementIndex) {
        int tempNumber = array[elementIndex];
        array[elementIndex] = array[elementIndex - 1];
        array[elementIndex - 1] = tempNumber;

    }
}
