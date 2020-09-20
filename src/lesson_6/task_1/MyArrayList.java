package lesson_6.task_1;

import java.util.Arrays;
import java.util.Objects;

public class MyArrayList<E> implements MyCollection<E> {

    public int size = 0;
    private E[] array = (E[]) new Object[10];

    @Override
    public int size() {
        return size;
    }

    public E[] toArray() {
        return (E[]) Arrays.copyOf(array, size);
    }

    @Override
    public boolean add(E item) {
        if (size == array.length) {
            Object[] arr = new Object[array.length + 1];
            System.arraycopy(array, 0, arr, 0, array.length);
            array = (E[]) arr;
        }
        array[size] = item;
        size++;
        return false;
    }

    @Override
    public E remove(int index) {
        checkIndexRange(index);
        int newSize = size - 1;
        if (newSize > index) {
            System.arraycopy(array, index + 1, array, index, newSize - index);
        }
        array[newSize] = null;
        size = newSize;
        return null;
    }

    @Override
    public boolean remove(E item) {
        int index = lastIndexOf(item);
        if (index >= 0) {
            remove(index);
        }
        return false;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            this.array[i] = null;
        }
        size = 0;
    }

    private void checkIndexRange(int index) {
        if ((index) < 0 || (index >= size)) {
            throw new IndexOutOfBoundsException(index);
        }
    }

    public int lastIndexOf(E item) {
        // see notes on indexOf
        for (int i = size - 1; i >= 0; i--) {
            if (Objects.equals(item, array[i])) {
                return i;
            }
        }
        return -1;
    }
}
