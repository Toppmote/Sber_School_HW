package vereshchagina.classesForTests;

import vereshchagina.DoAfterAll;
import vereshchagina.DoBeforeAll;
import vereshchagina.DoTest;

/**
 * класс со всеми аннотациями + методы без аннотаций
 */
public class NormalClassTest {
    @DoBeforeAll
    public int method1() {
        return 1;
    }

    @DoTest(order = 1)
    public int method2() {
        return 2;
    }

    @DoTest(order = 2)
    public int method3() {
        return 3;
    }

    @DoTest(order = 3)
    public int method4() {
        return 4;
    }

    @DoAfterAll
    public int method5() {
        return 5;
    }

    public int methodWithoutAnnotation1() {
        return 6;
    }

    public int methodWithoutAnnotation2() {
        return 7;
    }
}
