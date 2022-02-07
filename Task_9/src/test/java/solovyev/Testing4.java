package solovyev;

/**
 * В данном классе 2 метода с аннотацией DoAfterAll и 1 метод с аннотацией DoTest.
 */
public class Testing4 {
    @DoTest
    public void test1() {
        System.out.println("Тест 1 выполнен");
    }

    @DoAfterAll
    public void after1() {
        System.out.println("after1");
    }

    @DoAfterAll
    public void after2() {
        System.out.println("after2");
    }
}
