package solovyev;

/**
 * В данном классе 2 матода с аннотацией DoBeforeAll и 1 метод с аннотацией DoTest.
 */
public class Testing3 {

    @DoTest
    public void test1() {
        System.out.println("Выполнен 1 тест");
    }

    @DoBeforeAll
    public void before1() {
        System.out.println("before1");
    }

    @DoBeforeAll
    public void before2() {
        System.out.println("before2");
    }
}
