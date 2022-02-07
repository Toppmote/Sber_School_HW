package chupikov;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс, тестирующий функционал моей реализации кольцевой очереди. Тестируются все реализованные методы в нескольких ситуациях
 */
public class QueueTest {

    /**
     * Доавление в полностью заполненную очередь нового элемента
     */
    @Test
    public void testEnqueueFailed(){
        MyQueue queue = new MyQueue(2);
        queue.Enqueue(new Object());
        queue.Enqueue(new Object());
        assertEquals(-1, queue.Enqueue(new Object()));
    }

    /**
     * Добавление элемента в очередь
     */
    @Test
    public void testEnqueueSuccessful(){
        MyQueue queue = new MyQueue(2);
        queue.Enqueue(new Object());
        assertEquals(1, queue.Enqueue(new Object()));
    }

    /**
     * Удаление элемента из начала пустой очереди
     */
    @Test
    public void testDequeueFailed(){
        MyQueue queue = new MyQueue(1);
        assertEquals(-1, queue.Dequeue());
    }

    /**
     * Удаление элемента из начала очереди. Выполняем метод 2 раза, один за другим
     */
    @Test
    public void testDequeueSuccessful(){
        MyQueue queue = new MyQueue(2);
        queue.Enqueue(new Object());
        queue.Enqueue(new Object());
        assertEquals(1, queue.Dequeue());
        assertEquals(1, queue.Dequeue());
    }

    /**
     * Проверяем функцию isEmpty на пустой и на непустой очереди
     */
    @Test
    public void isEmptyTest(){
        MyQueue queue = new MyQueue(1);
        assertTrue(queue.isEmpty());
        queue.Enqueue(new Object());
        assertFalse(queue.isEmpty());
    }

    /**
     * Попытка вернуть первый элемент из пустой очереди
     */
    @Test
    public void testTopFailed(){
        MyQueue queue = new MyQueue(1);
        assertNull(queue.Top());
    }

    /**
     * Попытка вернуть первый элемент очереди. Выполняем 2 раза.
     * После первого выполнения удаляем первый элемент и выполняем метод снова.
     */
    @Test
    public void testTopSuccessful(){
        MyQueue queue = new MyQueue(2);
        queue.Enqueue("first");
        queue.Enqueue("second");
        assertEquals("first", queue.Top());
        queue.Dequeue();
        assertEquals("second", queue.Top());
    }

}
