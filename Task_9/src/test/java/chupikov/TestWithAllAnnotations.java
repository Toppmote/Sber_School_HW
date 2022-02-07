package chupikov;

/**
 * Класс, в котором каждый метод имеет какую-либо аннотацию
 */
public class TestWithAllAnnotations {

    @DoBeforeAll
    public static String methodBeforeAll(){
        return "a";
    }

    @DoAfterAll
    public static String methodAfterAll(){
        return "e";
    }

    @DoTest(order = 2)
    public static String method2(){
        return "c";
    }

    @DoTest(order = 1)
    public static String method1(){
        return "b";
    }

    @DoTest(order = 3)
    public static String method3(){
        return "d";
    }

}
