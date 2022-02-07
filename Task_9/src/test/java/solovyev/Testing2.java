package solovyev;

/**
 * В данном классе отсутсвуют методы с аннотацией DoTest
 */
public class Testing2 {
    public void test1() {
        System.out.println("Тест 1 выполнен.");
    }

    @DoBeforeAll
    public void before() {
        System.out.println("Before");
    }
}
