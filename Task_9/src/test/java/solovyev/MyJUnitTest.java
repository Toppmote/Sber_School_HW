package solovyev;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс тестируюещиий работу MyJUnitProcessor-а.
 */
public class MyJUnitTest {

    /**
     * Тестируемый класс Testing1.
     * Тест сравнивает массив методов в правильном порядке с массивом полученным
     * в результате работы MyJUnitProcessor-а.
     * <p>
     * Отсутствует метод тестирующий класс в котором методы аннотированные DoTest,
     * не имеют приоритетов выполнения, так как они будут запущены в непредсказуемом порядке,
     * после метода помеченного DoBeforeAll, а после них будет запущен метод помеченный DoAfterAll.
     *
     * @throws NoSuchMethodException если метод не объявлен
     */
    @Test
    public void test1() throws NoSuchMethodException {
        List<Object> ExpectedOrder = new ArrayList<>();
        ExpectedOrder.add(Testing1.class.getDeclaredMethod("test5Before"));
        ExpectedOrder.add(Testing1.class.getDeclaredMethod("test3"));
        ExpectedOrder.add(Testing1.class.getDeclaredMethod("test2"));
        ExpectedOrder.add(Testing1.class.getDeclaredMethod("test4After"));

        assertArrayEquals(ExpectedOrder.toArray(), MyJUnitProcessor.startTests(Testing1.class).toArray());
    }

    /**
     * В тестируемом классе Testing2 отсутствуют методы с аннотацией DoTest.
     * Так как их должно быть не менее одного, выбрасывает исключение.
     */
    @Test
    public void test2() {
        assertThrows(MyAnnotationException.class, () -> MyJUnitProcessor.startTests(Testing2.class));
    }

    /**
     * В тестируемом классе Testing3 2 метода с аннотацией DoBeforeAll.
     * Так как их должно быть не более одного, выбрасывает исключение.
     */
    @Test
    public void test3() {
        assertThrows(MyAnnotationException.class, () -> MyJUnitProcessor.startTests(Testing3.class));
    }

    /**
     * В тестируемом классе Testing4 2 метода с аннотацией DoAfterAll.
     * Так как их должно быть не более одного, выбрасывает исключение.
     */
    @Test
    public void test4() {
        assertThrows(MyAnnotationException.class, () -> MyJUnitProcessor.startTests(Testing4.class));
    }
}
