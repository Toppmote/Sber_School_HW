package emelyanov;

/**
 * Тестовый класс с несколькими аннотациями @DoBeforeAll
 */
public class ClassB {
    @DoBeforeAll
    private String BeforeAllOne(){
        return "BeforeAllOne";
    }
    @DoBeforeAll
    private String BeforeAllTwo(){
        return "BeforeAllTwo";
    }
    @DoAfterAll
    public String AfterAll(){
        return "AfterAll";
    }
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

    @DoTest(order = 4)
    private String Four(){
        return "Four";
    }

    public String Newer(){
        return "Newer";
    }
}
