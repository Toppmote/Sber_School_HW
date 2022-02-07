package golovnev.tests_annotations;

import golovnev.DoAfterAll;
import golovnev.DoBeforeAll;
import golovnev.DoTest;

/**
 * Класс-тест, в котором присутствуют все написанные аннотации: {@link golovnev.DoTest}, {@link golovnev.DoAfterAll},
 * {@link golovnev.DoBeforeAll}
 */
public class TestAnnotations {

    @DoBeforeAll
    public static int testBeforeAll(){
        return 1;
    }

    @DoTest(order = 2)
    public static int test2(){
        return 3;
    }

    @DoTest(order = 1)
    public static int test1(){
        return 2;
    }

    @DoTest(order = 3)
    public static int test3(){
        return 4;
    }

    @DoAfterAll
    public static int testAfterAll(){
        return 5;
    }

}
