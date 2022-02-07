package vereshchagina.classesForTests;

import vereshchagina.DoAfterAll;
import vereshchagina.DoBeforeAll;
import vereshchagina.DoTest;

/**
 * класс, содержащий несколько методов с аннотацией @DoAfterAll
 */
public class SeveralDoAfterAllTest {
    @DoAfterAll
    public int method1() {
        return 1;
    }

    @DoAfterAll
    public int method2() {
        return 2;
    }

    @DoTest(order = 1)
    public int method3() {
        return 3;
    }
}
