package chupikov;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс с тестами для проверки реализованных аннотаций
 */
public class Task9Test {

    /**
     * Тест для проверки условия существования хотя бы одного метода с аннотацией DoTest
     */
    @Test
    void testEmptyClass() {
        assertThrows(RuntimeException.class, () -> Task9.start(TestEmptyClass.class.getName()));
    }

    /**
     * Тест для проверки порядка выполнения методов согласно указанным к ним аннотациям
     * @throws Exception выбрасываемое исключение
     */
    @Test
    void testWithAllAnnotations() throws Exception {
        assertEquals("[a, b, c, d, e]", Task9.start(TestWithAllAnnotations.class.getName()).toString());
    }

    /**
     * Тест для проверки условия существования только одного метода с аннотацией DoBeforeAll
     */
    @Test
    void testDoBeforeAll() {
        assertThrows(RuntimeException.class, () -> Task9.start(TestDoBeforeAll.class.getName()));
    }

    /**
     * Тест для проверки условия существования только одного метода с аннотацией DoAfterAll
     */
    @Test
    void testDoAfterAll() {
        assertThrows(RuntimeException.class, () -> Task9.start(TestDoAfterAll.class.getName()));
    }


    /**
     * Тест для проверки результата, когда только один метод имеет аннотацию DoTest
     * @throws Exception выбрасываемое исключение
     */
    @Test
    void testWithOneAnnotation() throws Exception {
        assertEquals("[Z]", Task9.start(TestWithOneAnnotation.class.getName()).toString());
    }

}
