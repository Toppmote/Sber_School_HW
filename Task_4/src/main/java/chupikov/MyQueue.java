package chupikov;

/**
 * Класс, реализующий модель кольцевой очереди с ограниченным количеством элементов
 */
public class MyQueue {

    /**
     * Поле storage является массивом для хранения элементов очереди
     * Поле frontIndex является индексом первого элемента в очереди
     * Поле backIndex является индексом последнего элемента в очереди
     * Поле elementsCount хранит текущее количество элементов в очереди
     * Поле size хранит максимально допустимое количество элементов очереди
     */
    private final Object[] storage;
    private int frontIndex, backIndex, elementsCount;
    private final int size;

    /**
     * Конструктор без параметров
     * Создает экземпляр класса очередь с максимальным размером в 100 элементов
     */
    public MyQueue() {
        this.frontIndex = 0;
        this.backIndex = -1;
        this.size = 100;
        this.storage = new Object[100];
    }

    /**
     * Конструктор, создающий экземпляр класса очередь с заданным размером
     * @param size размер очереди
     */
    public MyQueue(int size) {
        this.frontIndex = 0;
        this.backIndex = -1;
        this.size = size;
        this.storage = new Object[size];
    }

    /**
     * Метот, который вставляет элемент в конец очереди
     * @param newObject новый объект, добавляемый в очередь
     * @return 1 если вставка прошла успешно, -1 если ошибка вставки
     */
    public int Enqueue(Object newObject){
        if(elementsCount != size) {
            backIndex = (backIndex + 1) % size;
            storage[backIndex] = newObject;
            elementsCount++;
            return 1;
        } else {
            System.out.println("Очередь полностью заполнена");
            return -1;
        }
    }

    /**
     * Метот, который удаляет элемент из начала очереди
     * @return 1 если удаление прошло успешно, -1 если ошибка удаления
     */
    public int Dequeue(){
        if(isEmpty()){
            System.out.println("Очередь пуста");
            return -1;
        } else {
            storage[frontIndex] = null;
            frontIndex = (frontIndex + 1) % size;
            elementsCount--;
            return 1;
        }

    }

    /**
     * Метод, который выполняет проверку очереди на пустоту
     * @return true, если очередь пуста, или false - если очередь не является пустой
     */
    public boolean isEmpty(){
        return elementsCount == 0;
    }

    /**
     * Метод, который возвращает верхний элемент без удаления из очереди
     * @return верхний элемент, если очередь не пуста, или null, если очередь пуста
     */
    public Object Top() {
        if(isEmpty()){
            System.out.println("Очередь пуста");
            return null;
        }
        else
            return storage[frontIndex];
    }

}
