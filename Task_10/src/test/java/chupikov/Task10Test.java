package chupikov;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс, содержащий демонстрацию каждого из возможных состояний потока
 */
public class Task10Test {

    /**
     * Демонстрация состояния "NEW"
     * Поток имеет данное состояние до запуска
     */
    @Test
    void testNewState() {
        Thread thread = new Thread();
        assertEquals("NEW", thread.getState().toString());
    }

    /**
     * Демонстрация состояния "RUNNABLE"
     * Добиваемся данного состояния с помощью метода start()
     */
    @Test
    void testRunnableState() {
        Thread thread = new Thread();
        thread.start();
        assertEquals("RUNNABLE", thread.getState().toString());
    }

    /**
     * Демонстрация состояния "WAITING"
     * Добиваемся данного состояния при помощи синхронизированного метода waitingTest из класса chupikov.MethodsForTest
     * Создаем поток на основе ссылки на метод waitingTest и запускаем его.
     * Останавливаем главый поток для того, чтобы тестовый поток успел перейти в состояние "WAITING"
     * @see MethodsForTest
     */
    @Test
    void testWaitingState() throws InterruptedException {
        MethodsForTest object = new MethodsForTest();
        Runnable runnable = object::waitingMethod;
        Thread thread = new Thread(runnable);

        thread.start();
        Thread.sleep(10);

        assertEquals("WAITING", thread.getState().toString());
    }

    /**
     * Демонстрация состояния "TIMED_WAITING".
     * Добиваемся данного состояния при помощи синхронизированного метода blockedAndTimedWaitingMethod из класса chupikov.MethodsForTest.
     * Создаем поток на основе ссылки на метод blockedAndTimedWaitingMethod и запускаем его.
     * В данном методе поток переводится в состояние "сна" на 2 секунды. Состояние "сна" как раз является состоянием "TIMED_WAITING".
     * Для отлова данного состояния остановим выполнение главного потока на полсекунды.
     */
    @Test
    void testTimedWaitingState() throws InterruptedException {
        MethodsForTest object = new MethodsForTest();
        Runnable runnable = object::blockedAndTimedWaitingMethod;
        Thread thread = new Thread(runnable);
        thread.start();
        Thread.sleep(500);
        assertEquals("TIMED_WAITING", thread.getState().toString());
    }

    /**
     * Демонстрация состояния "TERMINATED"
     * Добиваемся данного состояния с помощью метода join()
     */
    @Test
    void testTerminatedState() throws InterruptedException {
        Thread thread = new Thread();
        thread.start();
        thread.join();
        assertEquals("TERMINATED", thread.getState().toString());
    }

    /**
     * Демонстрация состояния "BLOCKED"
     * Добиваемся данного состояния при помощи синхронизированного метода blockedAndTimedWaitingMethod из класса chupikov.MethodsForTest
     * Создаем два потока, каждый из который стремится выполнить метод blockedAndTimedWaitingMethod.
     * Т.к. данный метод synchronized, то первый поток заблокирует мьютекс класса MethodsForTest.
     * Второй поток при этом будет находиться в состоянии "BLOCKED".
     * Главный поток переводим в состояние "сна" для того, чтобы успеть отловить состояние "BLOCKED" для второго потока.
     * @see MethodsForTest
     */
    @Test
    void testBlockedState() throws InterruptedException {
        MethodsForTest object = new MethodsForTest();
        Runnable runnable = object::blockedAndTimedWaitingMethod;
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();
        Thread.sleep(500);

        assertEquals("BLOCKED", thread2.getState().toString());
    }

}