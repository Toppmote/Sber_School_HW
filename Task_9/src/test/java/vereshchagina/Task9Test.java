package vereshchagina;


import org.junit.jupiter.api.Test;
import vereshchagina.classesForTests.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Task9Test {
    /**
     * тестирование пустого класса
     */
    @Test
    public void testEmptyClass() {
        assertThrows(RuntimeException.class, () -> Task9.start(EmptyClassTest.class.getName()));
    }

    /**
     * тестирование класса с полным набором аннотаций
     */
    @Test
    public void testNormalClass() throws Exception {

        assertEquals("[1, 2, 3, 4, 5]", Task9.start(NormalClassTest.class.getName()).toString());

    }

    /**
     * тестирование класса с несколькими методами с аннотацией DoAfterAll
     */
    @Test
    public void testSeveralDoAfterAll() {

        assertThrows(IllegalArgumentException.class, () -> Task9.start(SeveralDoAfterAllTest.class.getName()));

    }

    /**
     * тестирование класса с несколькими методами с аннотацией DoBeforeAll
     */
    @Test
    public void testSeveralDoBeforeAll() {

        assertThrows(IllegalArgumentException.class, () -> Task9.start(SeveralDoBeforeAllTest.class.getName()));

    }

    /**
     * тестирование класса без методов с аннотацией DoTest
     */
    @Test
    public void testZeroDoTest() {

        assertThrows(IllegalArgumentException.class, () -> Task9.start(ZeroDoTestTest.class.getName()));

    }
}
