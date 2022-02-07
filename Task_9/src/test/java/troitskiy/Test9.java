package troitskiy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test9
{
    /**
     * Сценарий теста №1
     * в результате правильного запуска
     * в teststr должна быть строка "B123A"
     */
    @Test
    void FirstTest()
    {
        try {
            TTest.Start("troitskiy.FirstTestClass");
        } catch (Exception ignored) {

        }
        assertEquals(FirstTestClass.teststr, "B123A");
    }


    /**
     * Сценарий теста №2
     * в результате правильного запуска
     * в teststr должна быть строка "123A"
     */
    @Test
    void SecondTest()
    {
        try {
            TTest.Start(SecondTestClass.class);
        } catch (Exception ignored) {

        }
        assertEquals(SecondTestClass.teststr, "123A");
    }


    /**
     * Сценарий теста №3
     * в результате правильного запуска
     * должно быть исключение, т.к. неверно раставлены аннотации
     */
    @Test
    void ThirdTest()
    {
        assertThrows(Exception.class, () -> TTest.Start(ThirdTestClass.class));
    }

}
