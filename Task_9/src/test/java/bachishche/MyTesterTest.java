package bachishche;

import bachishche.testedClasses.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Проверка класса-тестировщика, взаимодействующего с аннотациями
 * с аннотациями @DoBeforeAll, @DoAfterAll и @DoTest
 */
public class MyTesterTest {
    /**
     * Проверка класса-тестироващика на корректность полученных
     * результатов выполнения функций
     */
    @Test
    void testerResultTest() {
        Object[] res = Tester.start(CalculateTest.class);
        assertArrayEquals(new Object[]{null, 2., 2., 3., 0}, res);
    }

    /**
     * Проверка класса-тестироващика на порядок
     * выова методов
     */
    @Test
    void testerOrderTest() {
        Object[] res = Tester.start(MethodsOrderTest.class);
        assertArrayEquals(new Object[]{0, 1, 2, 3, 4, 5, 6}, res);
    }

    /**
     * Проверка класса-тетсировщика на обработку
     * некорректного числа аннотированных методов
     */
    @Test
    void testerTrowsTest() {
        assertThrows(IllegalArgumentException.class, () -> Tester.start(NoOneDoTest.class));
        assertThrows(IllegalArgumentException.class, () -> Tester.start(MoreThanOneDoAfter.class));
        assertThrows(IllegalArgumentException.class, () -> Tester.start(MoreThanOneDoBefore.class));
    }

}
