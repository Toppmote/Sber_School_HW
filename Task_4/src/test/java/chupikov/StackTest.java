package chupikov;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс, тестирующий функционал моей реализации стека. Тестируются все реализованные методы в нескольких ситуациях
 */
public class StackTest {

    /**
     * Доавление в полностью заполненный стек нового элемента
     */
    @Test
    public void testPushFailed(){
        MyStack stack = new MyStack(2);
        stack.Push(new Object());
        stack.Push(new Object());
        assertEquals(-1, stack.Push(new Object()));
    }

    /**
     * Добавление элемента в стек
     */
    @Test
    public void testPushSuccessful() {
        MyStack stack = new MyStack(2);
        stack.Push(new Object());
        assertEquals(1, stack.Push(new Object()));
    }

    /**
     * Попытка вернуть верхний элемент из пустого стека после удаления
     */
    @Test
    public void testPopFailed() {
        MyStack stack = new MyStack(5);
        assertNull(stack.Pop());
    }

    /**
     * Попытка вернуть верхний элемент из непустого стека после удаления. Выполняем метод 2 раза, один за другим
     */
    @Test
    public void testPopSuccessful() {
        MyStack stack = new MyStack(2);
        stack.Push("first");
        stack.Push("second");
        assertEquals("second", stack.Pop());
        assertEquals("first", stack.Pop());
    }

    /**
     * Проверяем функцию isEmpty на пустом и на непустом стеке
     */
    @Test
    public void isEmptyTest(){
        MyStack stack = new MyStack(1);
        assertTrue(stack.isEmpty());
        stack.Push(new Object());
        assertFalse(stack.isEmpty());
    }

    /**
     * Попытка вернуть верхний элемент из пустого стека
     */
    @Test
    public void testTopFailed(){
        MyStack stack = new MyStack(5);
        assertNull(stack.Top());
    }

    /**
     * Попытка вернуть верхний элемент из стека. Выполняем метод 2 раза, один за другим
     */
    @Test
    public void testTopSuccessful() {
        MyStack stack = new MyStack(2);
        stack.Push("first");
        stack.Push("second");
        assertEquals("second", stack.Top());
        assertEquals("second", stack.Top());
    }

}
