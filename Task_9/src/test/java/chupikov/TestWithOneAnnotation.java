package chupikov;

/**
 * Класс для теста аннотаций, в котором только у одного метода есть аннотация DoTest
 */
public class TestWithOneAnnotation {

    public static String method1(){
        return "a";
    }

    public static String method2(){
        return "a";
    }

    public static String method3(){
        return "a";
    }

    @DoTest
    public static String methodWithAnnotation(){
        return "Z";
    }

    public static String method4(){
        return "a";
    }

}
