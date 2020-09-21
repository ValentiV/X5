package lesson_6.task_1;

import java.util.Objects;

public class MyLinkedList<E> implements MyCollection<E> {

    private class Node {
        public E item;
        public Node next;

        public Node(E item) {
            this.item = item;
            this.next = null;
        }
    }

    public int size = 0;
    private Node head = null;

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E item) {
        if (head == null) {
            head = new Node(item);
        } else {
            Node node = head;
            for (; node.next != null; node = node.next) {
            }
            node.next = new Node(item);
        }
        size++;
    }

    @Deprecated
    public void clear() {
        head = null;
        size = 0;
    }

    //Возвращаем массив
    public E[] toArray() {
        @SuppressWarnings("unchecked")
        E[] array = (E[]) new Object[size];
        int i = 0;
        for (Node node = head; node != null; node = node.next) {
            array[i] = node.item;
            i++;
        }
        return array;
    }

    @Override
    public E get(int index) {
        Node node = getNode(index);
        return node.item;
    }

    private Node getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    @Override
    public void remove(Object obj) {
        int index = indexOf(obj);
        if (index == -1) {
            return;
        }
        remove(index);
    }

    @Override
    public void remove(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node node = getNode(index - 1);
            node.next = node.next.next;
        }
        size--;
    }

    //Получаем индекс элемента
    public int indexOf(Object target) {
        Node node = head;
        for (int i = 0; i < size; i++) {
            if (Objects.equals(target, node.item)) {
                return i;
            }
            node = node.next;
        }
        return -1;
    }
}