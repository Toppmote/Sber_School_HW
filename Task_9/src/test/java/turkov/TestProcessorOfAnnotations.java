package turkov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 *
 */
public class TestProcessorOfAnnotations {

    /**
     * Метод для тестирования класса, в котором представлен полный набор методов с задекларированными аннотациями.
     * Один метод в классе не имеет аннотации.
     * @throws Exception - в данном тесте не выбрасывается
     */
    @Test
    public void ExampleAllAnnotationTest() throws Exception {
        String[] target = new String[]{"DoBeforeAll m1", "DoTest m2", "DoTest m4", "DoTest m3", "DoAfterAll m5"};
        assertArrayEquals(target, ProcessorOfAnnotations.start(ExampleAllAnnotations.class).toArray());
    }

    /**
     * Метод для тестирования класса, в котором представле представлен набор методов только с аннотациями DoTest,
     * которые имеют различный приоритет. Один метод в классе не имеет аннотации.
     * @throws Exception - в данном тесте не выбрасывается
     */
    @Test
    public void ExampleDoTestAnnotationTest() throws Exception {
        String[] target = new String[]{"DoTest m2", "DoTest m3", "DoTest m5", "DoTest m1", "DoTest m4"};
        assertArrayEquals(target, ProcessorOfAnnotations.start(ExampleDoTestAnnotations.class).toArray());
    }

    /**
     * Метод для проверки выброса исключения в результате тестирования класса, который имеет несколько методов
     * с аннотациями DoBeforeAll и DoAfterAll.
     */
    @Test
    public void ExampleDuplicateSingleAnnotationTest() {
        assertThrows(Exception.class, () -> ProcessorOfAnnotations.start(ExampleDuplicateSingleAnnotation.class));
    }
}
