package bachishche.testedClasses;

import bachishche.*;

/**
 * Класс, содержащий два метода с аннотацией @DoAfterAll
 */
public class MoreThanOneDoAfter {
    @DoAfterAll
    public int after() {
        return 2;
    }

    @DoAfterAll
    public int otherAfter() {
        return 3;
    }

    @DoTest(1)
    public int test() {
        return 1;
    }
}
