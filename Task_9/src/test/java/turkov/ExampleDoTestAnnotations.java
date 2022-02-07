package turkov;

/**
 * Пример класса для тестирования его методов с аннотациями.
 * В классе представлен набор методов только с аннотациями DoTest, которые имеют различный приоритет.
 * Один метод не имеет аннотаций.
 * Каждый метод возвращают строку, в которой записаны его аннотация (при наличии) и имя.
 */
public class ExampleDoTestAnnotations {

    @DoTest(order = 3)
    public static String m1() {
        return "DoTest m1";
    }

    @DoTest
    public static String m2() {
        return "DoTest m2";
    }

    @DoTest(order = 2)
    public static String m5() {
        return "DoTest m5";
    }

    @DoTest(order = 1)
    public static String m3() {
        return "DoTest m3";
    }

    @DoTest(order = 3)
    public static String m4() {
        return "DoTest m4";
    }

    public static String m6() {
        return "DoTest m6";
    }
}
