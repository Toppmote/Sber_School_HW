package turkov;

/**
 * Пример класса для тестирования его методов с аннотациями.
 * В классе представлен набор методов с повторяющимися аннотациями DoBeforeAll и DoAfterAll,
 * что при тестировании вызовет исключение.
 * Каждый метод возвращают строку, в которой записаны его аннотация и имя.
 */
public class ExampleDuplicateSingleAnnotation {

    @DoBeforeAll
    public static String m1() {
        return "DoBeforeAll m1";
    }

    @DoAfterAll
    public static String m2() {
        return "DoAfterAll m2";
    }

    @DoTest
    public static String m3() {
        return "DoTest m3";
    }

    @DoBeforeAll
    public static String m4() {
        return "DoBefore m4";
    }

    @DoAfterAll
    public static String m5() {
        return "DoAfterAll m5";
    }
}
