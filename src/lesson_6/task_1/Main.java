package lesson_6.task_1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MyArrayList<Integer> array = new MyArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        System.out.println("Массив: " + Arrays.toString(array.toArray()) + ", размер массива: " + array.size);
        array.remove(0);
        System.out.println("Удален элемент с индексом 0. Новый массив: " + Arrays.toString(array.toArray())
                + ", размер массива: " + array.size);
        Integer a = array.get(1);
        array.remove(a);
        System.out.println("Удален элемент равный 3. Новый массив: " + Arrays.toString(array.toArray())
                + ", размер массива: " + array.size);
        array.clear();
        System.out.println("Массив пуст: " + Arrays.toString(array.toArray())
                + ", размер массива: " + array.size);

        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(4);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(1);
        System.out.println("\nСвязанный список: " + (Arrays.toString(linkedList.toArray())) + ", размер списка: "
                + linkedList.size);
        linkedList.remove(0);
        System.out.println("Удален элемент с индексом 0. Новый список: " + Arrays.toString(linkedList.toArray())
                + ", размер списка: " + linkedList.size);
        Integer b = linkedList.get(1);
        linkedList.remove(b);
        System.out.println("Удален элемент равный 3. Новый список: " + Arrays.toString(linkedList.toArray())
                + ", размер списка: " + linkedList.size);
        linkedList.clear();
        System.out.println("Список пуст: " + Arrays.toString(array.toArray())
                + ", размер списка: " + linkedList.size);

    }
}