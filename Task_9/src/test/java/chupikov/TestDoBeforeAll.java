package chupikov;

/**
 * Тестовый класс для проверки ситуации, когда аннотацию DoBeforeAll имеют два метода
 */
public class TestDoBeforeAll {

    @DoBeforeAll
    public static String doBeforeAll1(){
        return "a";
    }

    @DoBeforeAll
    public static String doBeforeAll2(){
        return "a";
    }

}
