package mescheryakov;

/**
 * Класс, являющийся примером тестирования методов с аннотациями.
 * В классе присутствуют только методы с аннотациями DoTest и различным приоритетом,
 * кроме одного метода - он не имеет аннотации.
 * Каждый метод возвращает строку для определения очередности.
 */
public class DoTestExample {

    public static String test0() {
        return "Test failed";
    }

    @DoTest(order = 2)
    public static String test1() {
        return "DoTest3";
    }

    @DoTest(order = 1)
    public static String test2() {
        return "DoTest2";
    }

    @DoTest(order = 2)
    public static String test3() {
        return "DoTest4";
    }

    @DoTest
    public static String test4() {
        return "DoTest1";
    }
}
