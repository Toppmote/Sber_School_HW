package chupikov;

import java.util.Iterator;

/**
 * Класс, реализующий перебор всех элементов двумерного массива
 * @param <E> тип элементов массива
 */
public class ArrayIterator<E> implements Iterator<E> {

    /**
     * Поле storage хранит в себе исходный массим
     * Поле currentIndex хранит текущий индекс элемента
     * Поле size хранит количество элементов в массиве
     */
    private final E[][] storage;
    private int currentIndex;
    private final int size;


    public ArrayIterator(E[][] storage) {
        currentIndex = 0;
        this.storage = storage;
        this.size = storage.length * storage[0].length;
    }

    /**
     * Функция, проверяющая, остались ли элементы в массиве.
     * @return true - если остались, false - если не остались
     */
    @Override
    public boolean hasNext() {
        return currentIndex != size;
    }

    /**
     * Функция, возвращающая следующий элемент массива
     * @return следующий элемент
     */
    @Override
    public E next() {
        if(currentIndex == size)
            throw new NullPointerException();
        int currentRow = currentIndex / storage[0].length;
        int currentColumn = currentIndex % storage[0].length;
        currentIndex++;
        return storage[currentRow][currentColumn];
    }
}
