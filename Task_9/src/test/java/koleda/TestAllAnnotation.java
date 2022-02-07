package koleda;

/**
 * Класс, в котором присутствуют ве аннотации. Должен выполняться без ошибок
 */

public class TestAllAnnotation {

    @DoAfterAll
    public static int test1(){
        return 1;
    }

    @DoTest(order = 3)
    public static int test2(){ return 4; }

    @DoTest(order = 1)
    public static int test3(){
        return 2;
    }

    @DoTest(order = 2)
    public static int test4(){
        return 3;
    }

    @DoBeforeAll
    public static int test5(){
        return 5;
    }

}
