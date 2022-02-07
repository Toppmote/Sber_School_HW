package bachishche.testedClasses;

import bachishche.*;

/**
 * Класс, в котором необходимо протестировать порядок выполнения методов.
 * Методы возвращают число, равное порядку вызовы метода, переданному в аннотацию.
 * Метод с аннотацией @DoBeforeAll возвращает "0", а @DoAfterAll - "6"
 */
public class MethodsOrderTest {
    @DoBeforeAll
    public int start() {
        return 0;
    }

    @DoTest(1)
    public int GetOne() {
        return 1;
    }

    @DoTest(2)
    public int getTwo() {
        return 2;
    }

    @DoTest(3)
    public int getThree() {
        return 3;
    }

    @DoTest(4)
    public int getFour() {
        return 4;
    }

    @DoTest(5)
    public int getFive() {
        return 5;
    }

    @DoAfterAll
    public int end() {
        return 6;
    }

}
