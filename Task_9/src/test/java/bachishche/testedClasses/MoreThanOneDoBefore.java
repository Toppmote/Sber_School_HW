package bachishche.testedClasses;

import bachishche.*;

/**
 * Класс, содержащий два метода с аннотацией @DoBeforeAll
 */
public class MoreThanOneDoBefore {
    @DoBeforeAll
    public int before() {
        return -1;
    }

    @DoBeforeAll
    public int otherBefore() {
        return -2;
    }

    @DoTest(1)
    public int test() {
        return 1;
    }
}
