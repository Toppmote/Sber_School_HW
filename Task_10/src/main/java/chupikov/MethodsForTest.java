package chupikov;

/**
 * Класс, в котором находятся методы для получения некоторых состояний потока
 */
public class MethodsForTest {

    /**
     * Метод для получения состояний "BLOCKED" и "TIMED_WAITING".
     * В данном методе переводим поток в состояние "сна" на 2 секунды.
     * Для отлавливания состояния "BLOCKED" применяем для двух потоков.
     * Для отлавливания "TIMED_WAITING" - для одного.
     */
    public synchronized void blockedAndTimedWaitingMethod() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод для получения состояния "WAITING".
     * В данном методе выполняем метод wait для потока.
     */
    public synchronized void waitingMethod() {
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}