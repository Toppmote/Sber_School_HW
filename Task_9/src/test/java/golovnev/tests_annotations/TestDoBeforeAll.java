package golovnev.tests_annotations;

import golovnev.DoBeforeAll;

/**
 * Класс-тест, который проверяется на наличие только одного метода с аннотацией {@link golovnev.DoBeforeAll}
 */
public class TestDoBeforeAll {

    @DoBeforeAll
    public static int doBeforeOne() {
        return 1;
    }

    @DoBeforeAll
    public static int doBeforeTwo() {
        return 2;
    }
}
