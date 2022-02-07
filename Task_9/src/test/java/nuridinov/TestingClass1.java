package nuridinov;

/**
 * Класс с методами для проверки работы обработчика
 */
public class TestingClass1 {

    @DoBeforeAll
    public int beforeAll() {
        return 0;
    }

    @DoTest(order = 2)
    public int doTest1() {
        return 1;
    }

    @DoTest(order = 1)
    public int doTest2() {
        return 2;
    }

    @DoAfterAll
    public int AfterAll() {
        return 3;
    }
}
