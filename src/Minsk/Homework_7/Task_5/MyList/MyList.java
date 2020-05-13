package Minsk.Homework_7.Task_5.MyList;

public class MyList<T> {

    private Node<T> head;
    private int countElements;

    public void add(T newElement) {
        if (head == null) {
            head = new Node<>();
            head.setValue(newElement);
            countElements = 1;
        } else {
            Node<T> node = head;
            while (node.getNextNode() != null) {
                node = node.getNextNode();
            }
            node.setNextNode(new Node<T>());
            node.getNextNode().setValue(newElement);
            countElements++;
        }
    }

    public T get(int index) {
        if (index < countElements && index >= 0) {
            Node<T> node = head;
            for (int i = 0; i < index; i++) {
                node = node.getNextNode();
            }
            return node.getValue();
        } else {
            System.out.println("Неверно введен индекс числа!");
            return null;
        }
    }

    public int size() {
        return countElements;
    }

    @Override
    public String toString() {
        String text = "[";
        if (head == null) {
            text += "Список пуст";
        } else {
            Node<T> node = head;
            while (node.getNextNode() != null) {
                text += node.getValue() + ", ";
                node = node.getNextNode();
            }
            text += node.getValue() + "]";
        }
        return text;
    }
}
