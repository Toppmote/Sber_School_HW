package zurnachyan;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс для тестов лабораторной работы.
 */
public class Task9Tests {
    List<Object> test;

    /**
     * Тест порядка выполнения методов в зависимости от их аннотации
     * @throws Exception Исключение, если класс не найден или содержит более
     * одного метода с аннотацией @DoBeforeAll или @DoAfterAll
     */
    @Test
    public void test1() throws Exception {
        test = new ArrayList<>();
        test.add(5);
        test.add(10);
        test.add(15);
        assertEquals(test, Tester.start(TestClassA.class.getName()));
    }

    /**
     * Тест выбрасывания исключения в случае, если тестируемый класс содержит более
     * одного метода с аннотацией @DoBeforeAll или @DoAfterAll
     */
    @Test
    public void test2(){
        assertThrows(TestException.class, ()-> test = Tester.start(TestClassB.class.getName()));
    }

    /**
     * Тест порядка выполнения методов с аннотациями @DoTest имеющими разные приоритеты
     * @throws Exception Исключение, если класс не найден или содержит более
     * одного метода с аннотацией @DoBeforeAll или @DoAfterAll
     */
    @Test
    public void test3() throws Exception {
        test = new ArrayList<>();
        test.add(5);
        test.add(11);
        test.add(13);
        test.add(10);
        test.add(15);
        assertEquals(test, Tester.start(TestClassC.class.getName()));
    }

    /**
     * Тест выполнения метода в случае, если нет методов @DoBeforeAll или @DoAfterAll
     * @throws Exception Исключение, если класс не найден или содержит более
     * одного метода с аннотацией @DoBeforeAll или @DoAfterAll
     */
    @Test
    public void test4() throws Exception {
        test = new ArrayList<>();
        test.add(10);
        assertEquals(test, Tester.start(TestClassD.class.getName()));
    }
}
