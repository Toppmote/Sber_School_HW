package vereshchagina.classesForTests;


import vereshchagina.DoBeforeAll;
import vereshchagina.DoTest;

/**
 * класс, содержащий несколько методов с аннотацией @DoBeforeAll
 */
public class SeveralDoBeforeAllTest {
    @DoBeforeAll
    public int method1() {
        return 1;
    }

    @DoBeforeAll
    public int method2() {
        return 2;
    }

    @DoTest(order = 1)
    public int method3() {
        return 3;
    }
}
