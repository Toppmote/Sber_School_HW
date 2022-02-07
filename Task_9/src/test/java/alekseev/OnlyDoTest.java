package alekseev;

/**
 * Только аннотации с DoTest
 *
 * @author alekseev.a
 * @since 1.0
 */
public class OnlyDoTest {
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

    @DoTest(order = 2)
    Object testDoTest3() {
        return 2;
    }

    @DoTest(order = 98)
    Object testDoTest4() {
        return 98;
    }

}
