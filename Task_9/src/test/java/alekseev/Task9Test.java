package alekseev;

import org.junit.jupiter.api.Test;

import java.util.List;

import static alekseev.Task9.start;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author alekseev.a
 * @since 1.0
 */
class Task9Test {

    /**
     * Тест на проверку класса OrderClass, проверяем порядок, отсутсвие throw
     */
    @Test
    void orderTest() {
        assertDoesNotThrow(() -> {
            List<Object> result = start("alekseev.OrderClass");
            assertArrayEquals(new Object[]{0, 12, 5, 1, 100}, result.toArray());
        });
    }

    /**
     * Тест на проверку класса DoAfterAll, в классе их больше
     */
    @Test
    void exDoAfterAllTest() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            List<Object> result = start("alekseev.ExClass");
        });
        assertEquals("No correct count size DoAfterAll methode", exception.getLocalizedMessage());
    }

    /**
     * Тест на проверку класса throws, пустой класс
     */
    @Test
    void emptyClass() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            List<Object> result = start("alekseev.EmptyClass");
        });
        assertEquals("No correct count size DoTest methode", exception.getLocalizedMessage());
    }

    /**
     * Тест на проверку класса только DoTest
     */
    @Test
    void onlyDoTest() {
        assertDoesNotThrow(() -> {
            List<Object> result = start("alekseev.OnlyDoTest");
            assertArrayEquals(new Object[]{98, 12, 5, 2, 1}, result.toArray());
        });
    }

}
