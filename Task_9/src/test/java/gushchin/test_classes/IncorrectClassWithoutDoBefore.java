package gushchin.test_classes;

import gushchin.DoAfterAll;
import gushchin.DoTest;

public class IncorrectClassWithoutDoBefore {
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

    @DoAfterAll
    public int afterTest() {
        return 5;
    }
}
