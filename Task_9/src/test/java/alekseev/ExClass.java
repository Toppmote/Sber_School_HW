package alekseev;

/**
 * Класс где аннотаций DoAfterAll больше 1
 *
 * @author alekseev.a
 * @since 1.0
 */
public class ExClass {

    @DoBeforeAll
    Object testBefore() {
        return 0;
    }

    @DoTest(order = 12)
    Object testDoTest() {
        return 12;
    }

    @DoTest(order = 1)
    Object testDoTest1() {
        return 1;
    }

    @DoTest(order = 5)
    Object testDoTest2() {
        return 5;
    }

    void test() {
    }

    @DoAfterAll
    Object testAfter() {
        return 100;
    }

    @DoAfterAll
    Object testAfter2() {
        return 100;
    }

}
