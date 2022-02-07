package vereshchagina.classesForTests;

import vereshchagina.DoAfterAll;
import vereshchagina.DoBeforeAll;

/**
 * класс, не содержащий методов с аннотацией @DoTest
 */
public class ZeroDoTestTest {
    @DoBeforeAll
    public int method1() {
        return 1;
    }

    @DoAfterAll
    public int method2() {
        return 2;
    }
}
