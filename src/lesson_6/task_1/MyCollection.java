package lesson_6.task_1;

public interface MyCollection<E> {

    int size();
    boolean add(E item);
    E remove(int index);
    boolean remove (E item);
    E get(int index);
    void clear();
}
