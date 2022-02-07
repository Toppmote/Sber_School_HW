package koleda;

/**
 * Класс, в котором дублируются аннотации DoAfterAll и DoBeforeAll
 */

public class TestException {

    @DoAfterAll
    public static int test1(){
        return 3;
    }

    @DoBeforeAll
    public static int test2(){
        return 1;
    }

    @DoAfterAll
    public static int test3(){
        return 4;
    }

    @DoBeforeAll
    public static int test4(){ return 2; }

}
