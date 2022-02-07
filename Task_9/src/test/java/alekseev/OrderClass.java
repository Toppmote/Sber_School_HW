package alekseev;

/**
 * Класс где присутствуют все аннотации и есть ранжирование по order
 *
 * @author alekseev.a
 * @since 1.0
 */

public class OrderClass {

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

    Object test() {
        return 999;
    }

    @DoAfterAll
    Object testAfter() {
        return 100;
    }


}
