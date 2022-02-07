package golovnev.tests_annotations;

import golovnev.DoAfterAll;

/**
 * Класс-тест, который проверяется на наличие только одного метода с аннотацией {@link golovnev.DoAfterAll}
 */
public class TestDoAfterAll {
    @DoAfterAll
    public static int afterAllOne() {
        return 1;
    }

    @DoAfterAll
    public static int afterAllTwo() {
        return 2;
    }
}
