package golovnev;

import golovnev.tests_annotations.TestDoAfterAll;
import golovnev.tests_annotations.TestDoBeforeAll;
import golovnev.tests_annotations.TestAnnotations;
import golovnev.tests_annotations.TestEmptyClass;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс с тестами для проверки реализованных аннотаций
 */
class Task9Test{

    @Test
    @DisplayName("More two DoBeforeAll method's")
    void testDoBeforeAll() {
        assertThrows(RuntimeException.class, () -> Task9.start(TestDoBeforeAll.class.getName()));
    }

    @Test
    @DisplayName("More two DoAfterAll method's")
    void testDoAfterAll() {
        assertThrows(RuntimeException.class, () -> Task9.start(TestDoAfterAll.class.getName()));
    }

    @Test
    void testEmptyClass() {
        assertThrows(RuntimeException.class, () -> Task9.start(TestEmptyClass.class.getName()));
    }

    @Test
    void testAnnotations() throws ClassNotFoundException, InvocationTargetException, IllegalAccessException {
        assertEquals("[1, 2, 3, 4, 5]", Task9.start(TestAnnotations.class.getName()).toString());
    }

}