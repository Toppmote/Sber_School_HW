package koleda;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс с тестами для проверки аннотаций
 */

public class Task9Test {

    @Test
    public void testAllAnnotationTest() throws ClassNotFoundException, InvocationTargetException, IllegalAccessException {
        assertEquals("[5, 4, 3, 2, 1]", Task9.start(TestAllAnnotation.class.getName()).toString());
    }

    @Test
    public void testNotAllAnnotationTest() throws ClassNotFoundException, InvocationTargetException, IllegalAccessException {
        assertEquals("[4, 3]", Task9.start(TestNotAllAnnotation.class.getName()).toString());
    }

    @Test
    public void testExceptionTest(){
        assertThrows(RuntimeException.class, () -> Task9.start(TestException.class.getName()));
    }

}
