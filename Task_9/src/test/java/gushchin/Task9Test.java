package gushchin;

import gushchin.test_classes.CorrectClass;
import gushchin.test_classes.IncorrectClassWith2DoAfter;
import gushchin.test_classes.IncorrectClassWithoutDoBefore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Task9Test {

    /**
     * Тест на корректный класс с заданным порядком
     */
    @Test
    public void correctClassTest() {
        try {
            assertArrayEquals(new Object[]{4, 0, 1, 3, 2, 5}, CustomAnnotationsProcessor.start(CorrectClass.class).toArray());
        } catch (Exception ignored) {
        }
    }

    /**
     * Тест на неккоректный класс без метода DoBeforeAll
     */
    @Test
    public void incorrectClassWithoutDoBeforeTest() {
        try {
            assertThrows(RuntimeException.class, () -> CustomAnnotationsProcessor.start(IncorrectClassWithoutDoBefore.class));
        } catch (Exception ignored) {
        }
    }

    /**
     * Тест на некорректный класс с 2 методами DoAfterAll
     */
    @Test
    public void incorrectClassWith2DoAfterTest() {
        try {
            assertThrows(RuntimeException.class, () -> CustomAnnotationsProcessor.start(IncorrectClassWith2DoAfter.class));
        } catch (Exception ignored) {
        }
    }
}
