package chupikov;

/**
 * Тестовый класс для проверки ситуации, когда аннотацию DoAfterAll имеют два метода
 */
public class TestDoAfterAll {

    @DoAfterAll
    public static String doAfterAll1(){
        return "a";
    }

    @DoAfterAll
    public static String doAfterAll2(){
        return "a";
    }

}
