package lesson_6.task_1;

import java.util.Arrays;
import java.util.Objects;

public class MyArrayList<E> implements MyCollection<E> {

    private int size = 0;
    @SuppressWarnings("unchecked")
    private E[] array = (E[]) new Object[10];

    @Override
    public int size() {
        return size;
    }

    //Возвращаем массив
    public E[] toArray() {
        return Arrays.copyOf(array, size);
    }

    @Override
    @SuppressWarnings("unchecked")
    public void add(E item) {
        if (size == array.length) {
            Object[] arr = new Object[array.length + 1];
            System.arraycopy(array, 0, arr, 0, array.length);
            array = (E[]) arr;
        }
        array[size] = item;
        size++;
    }

    @Override
    public void remove(int index) {
        checkIndexRange(index);
        int newSize = size - 1;
        if (newSize > index) {
            System.arraycopy(array, index + 1, array, index, newSize - index);
        }
        array[newSize] = null;
        size = newSize;
    }

    @Override
    public void remove(E item) {
        int index = lastIndexOf(item);
        if (index >= 0) {
            remove(index);
        }
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

    //Проверяем, есть ли индекс в массиве
    private void checkIndexRange(int index) {
        if ((index) < 0 || (index >= size)) {
            throw new IndexOutOfBoundsException(index);
        }
    }

    //Получаем индекс элемента
    public int lastIndexOf(E item) {
        for (int i = size - 1; i >= 0; i--) {
            if (Objects.equals(item, array[i])) {
                return i;
            }
        }
        return -1;
    }
}
