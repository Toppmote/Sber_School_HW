package solovyev;

/**
 * В данном классе 2 метода с аннотацией DoTest (им задан приоритет выполнения),
 * и по одному DoBeforeAll и DoAfterAll.
 * Так же есть не аннотированный метод.
 */
public class Testing1 {

    public void test1() {
        System.out.println("Тест 1 выполнен.");
    }

    @DoTest(order = 2)
    public void test2() {
        System.out.println("Тест 2 выполнен.");
    }

    @DoTest(order = 1)
    public void test3() {
        System.out.println("Тест 3 выполнен.");
    }

    @DoAfterAll
    public void test4After() {
        System.out.println("Тест дуАфтер выполнен");
    }

    @DoBeforeAll
    public void test5Before() {
        System.out.println("Тест дуБефор выполнен");
    }
}
