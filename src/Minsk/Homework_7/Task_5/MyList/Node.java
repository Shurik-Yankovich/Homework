package Minsk.Homework_7.Task_5.MyList;

public class Node<T> {
    private T value;
    private Node nextNode;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
