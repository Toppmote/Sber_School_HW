package mescheryakov;

/**
 * Класс, являющийся примером тестирования методов с аннотациями.
 * В классе присутствуют повторяющиеся методы DoAfterAll и DoBeforeAll.
 * Это должно выкинуть исключение.
 * Каждый метод возвращает строку с собщением о том, что тест пройден.
 */
public class ExceptionExample {

    @DoBeforeAll
    public static String test1() {
        return "test done";
    }

    @DoBeforeAll
    public static String test2() {
        return "test done";
    }

    @DoAfterAll
    public static String test3() {
        return "test done";
    }

    @DoAfterAll
    public static String test4() {
        return "test done";
    }

    @DoTest
    public static String test5() {
        return "test done";
    }
}
