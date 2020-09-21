package lesson_6.task_1;

public interface MyCollection<E> {

    int size();
    void add(E item);
    void remove(int index);
    void remove (E item);
    E get(int index);
    void clear();
}
