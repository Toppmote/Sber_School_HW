package mescheryakov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Класс, содержащий методы для тестирования "классов-примеров"
 */
public class AnnotationsProcessorTest {

    /**
     * Метод, тестирующий класс AllAnnotationsExample
     */
    @Test
    public void allAnnotationsExampleTest() {
        String[] expectation = new String[]{"DoBeforeAll", "DoTest1", "DoTest2", "DoTest3", "DoAfterAll"};
        try {
            assertArrayEquals(expectation, AnnotationsProcessor.start("mescheryakov.AllAnnotationsExample").toArray());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод, тестирующий класс DoTestExample
     */
    @Test
    public void doTestExampleTest() {
        String[] expectation = new String[]{"DoTest1", "DoTest2", "DoTest3", "DoTest4"};
        try {
            assertArrayEquals(expectation, AnnotationsProcessor.start("mescheryakov.DoTestExample").toArray());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод на проверку выброса исключеий. Тестуирует класс ExceptionExample.
     */
    @Test
    public void exceptionExampleTest() {
        assertThrows(Exception.class, () -> AnnotationsProcessor.start("ExceptionExample"));
    }
}