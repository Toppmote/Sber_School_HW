package chupikov;

/**
 * Класс, реализующий модель стека с ограниченным количеством элементов
 */
public class MyStack {

    /**
     * Поле storage является массивом для хранения элементов стека
     * Поле topIndex является индексом верхнего элемента в стеке
     * Поле size хранит максимально допустимое количество элементов стека
     */
    private final Object[] storage;
    private int topIndex;
    private final int size;

    /**
     * Конструктор без параметров
     * Создает экземпляр класса стек с максимальным размером в 100 элементов
     */
    public MyStack(){
        this.topIndex = -1;
        this.size = 100;
        this.storage = new Object[100];
    }

    /**
     * Конструктор, создающий экземпляр класса стек с заданным размером
     * @param size размер стека
     */
    public MyStack(int size){
        this.storage = new Object[size];
        this.topIndex = -1;
        this.size = size;
    }

    /**
     * Метод, который возвращает верхний элемент после удаления из стека
     * @param newObject новый объект, добавляемый в стек
     * @return 1 если вставка прошла успешно, -1 если ошибка вставки
     */
    public int Push(Object newObject) {
        if(topIndex < size - 1) {
            storage[++topIndex] = newObject;
            return 1;
        }
        else {
            System.out.println("Стек полностью заполнен");
            return -1;
        }
    }

    /**
     * Метод, который возвращает верхний элемент после удаления из стека
     * @return верхний элемент, если стек не пустой, или null, если стек пуст
     */
    public Object Pop(){
        if(!isEmpty()) {
            Object topElement = storage[topIndex];
            storage[topIndex--] = null;
            return topElement;
        }
        else {
            System.out.println("Стек пустой");
            return null;
        }
    }

    /**
     * Метод, который выполняет проверку стека на пустоту
     * @return true, если стек пуст, или false - если стек не является пустым
     */
    public boolean isEmpty(){
        return topIndex == -1;
    }

    /**
     * Метод, который возвращает верхний элемент без удаления из стека
     * @return верхний элемент, если стек не пустой, или null, если стек пуст
     */
    public Object Top(){
        if(isEmpty()) {
            System.out.println("Стек пустой");
            return null;
        }
        else
            return storage[topIndex];
    }

}
