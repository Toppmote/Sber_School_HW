package koleda;

/**
 * Класс, в котором не на всех методах проставлены аннотации DoTest
 */

public class TestNotAllAnnotation {

    public static int test1(){
        return 1;
    }

    public static int test2(){
        return 2;
    }

    @DoTest(order = 1)
    public static int test3(){
        return 3;
    }

    @DoTest(order = 3)
    public static int test4(){
        return 4;
    }

}
