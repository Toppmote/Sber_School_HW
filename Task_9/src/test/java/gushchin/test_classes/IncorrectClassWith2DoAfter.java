package gushchin.test_classes;

import gushchin.DoAfterAll;
import gushchin.DoBeforeAll;
import gushchin.DoTest;

public class IncorrectClassWith2DoAfter {
    @DoTest(order = 1)
    public int test0() {
        return 0;
    }

    @DoTest(order = 2)
    public int test1() {
        return 1;
    }

    @DoTest(order = 4)
    public int test2() {
        return 2;
    }

    @DoTest(order = 3)
    public int test3() {
        return 3;
    }

    @DoBeforeAll
    public int beforeTest() {
        return 4;
    }

    @DoAfterAll
    public int afterTest0() {
        return 5;
    }

    @DoAfterAll
    public int afterTest1() {
        return 6;
    }
}
