package turkov;

/**
 * Пример класса для тестирования его методов с аннотациями.
 * В классе представлен полный набор методов с задекларированными аннотациями.
 * Один метод не имеет аннотаций.
 * Каждый метод возвращают строку, в которой записаны его аннотация (при наличии) и имя.
 */
public class ExampleAllAnnotations {

    @DoBeforeAll
    public static String m1() {
        return "DoBeforeAll m1";
    }

    @DoTest(order = 1)
    public static String m2() {
        return "DoTest m2";
    }

    @DoTest(order = 3)
    public static String m3() {
        return "DoTest m3";
    }

    @DoTest(order = 2)
    public static String m4() {
        return "DoTest m4";
    }

    @DoAfterAll
    public static String m5() {
        return "DoAfterAll m5";
    }

    public static String m6() {
        return "DoAfterAll m6";
    }
}
