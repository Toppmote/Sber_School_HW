package bachishche.testedClasses;


import bachishche.*;

/**
 * Класс, не содержащий методов с аннотацией @DoTest
 */
public class NoOneDoTest {
    @DoBeforeAll
    public int doBefore() {
        return -1;
    }

    public int someTest() {
        return 0;
    }

    @DoAfterAll
    public int doAfter() {
        return 1;
    }
}
