package Minsk.Homework_6.Task_1.Sort;

public class SelectionSort implements Sortable {

    @Override
    public void sortAscending(int[] array) {
        int indexMinNumber;
        for (int i = 0; i < array.length; i++) {
            indexMinNumber = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indexMinNumber]) {
                    indexMinNumber = j;
                }
            }
            swapArrayElements(array, i, indexMinNumber);
        }
    }

    @Override
    public void sortDescending(int[] array) {
        int indexMaxNumber;
        for (int i = 0; i < array.length; i++) {
            indexMaxNumber = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[indexMaxNumber]) {
                    indexMaxNumber = j;
                }
            }
            swapArrayElements(array, i, indexMaxNumber);
        }
    }

    private void swapArrayElements(int[] array, int firstElementIndex, int secondElementIndex) {
        int tempNumber;
        if (firstElementIndex != secondElementIndex) {
            tempNumber = array[firstElementIndex];
            array[firstElementIndex] = array[secondElementIndex];
            array[secondElementIndex] = tempNumber;
        }
    }

}
