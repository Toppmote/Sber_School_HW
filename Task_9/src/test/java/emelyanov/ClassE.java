package emelyanov;

/**
 * Тестовый класс без аннотаций @DoBeforeAll и @DoAfterAll
 */
public class ClassE {
    @DoTest(order = 1)
    private String One(){
        return "One";
    }
    @DoTest(order = 3)
    public String Three(){
        return "Three";
    }

    @DoTest(order = 2)
    public String Two(){
        return "Two";
    }
}
