package mescheryakov;

/**
 * Класс, являющийся примером тестирования методов с аннотациями.
 * В классе присутствуют все имеющиеся методы.
 * Один метод не имеет аннотации.
 * Каждый метод возвращает строку для определения очередности.
 */
public class AllAnnotationsExample {

    public static String test0() {
        return "Test failed";
    }

    @DoAfterAll
    public static String test1() {
        return "DoAfterAll";
    }

    @DoTest(order = 3)
    public static String test2() {
        return "DoTest3";
    }

    @DoTest(order = 2)
    public static String test3() {
        return "DoTest2";
    }

    @DoTest(order = 1)
    public static String test4() {
        return "DoTest1";
    }

    @DoBeforeAll
    public static String test5() {
        return "DoBeforeAll";
    }
}
