package nuridinov;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;


/**
 * Класс для тестирования обработчика аннатаций
 */
public class AnnotationProcessorTest {

    /**
     * тест для проверки соблюдении порядка, прописанного в обработчике
     * @throws NoSuchMethodException исключение срабатывает когда не удается найти конкретный метод
     * @throws InvocationTargetException исключение метода к которому использовали .invoke
     * @throws InstantiationException исключенние срабатывает, когда указанный объект класса не может быть создан
     * @throws IllegalAccessException генерируется, когда приложение пытается рефлексивно вызвать метод, но текущий выполняющийся метод не имеет доступа к определению указанного класса, поля, метод или конструктора.
     */
    @Test
    public  void runTest1() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        assertArrayEquals(new Object[]{0, 2, 1, 3}, AnnotationProcessor.runTest(TestingClass1.class).toArray());
    }

    /**
     * проверка выбрасываемого исключения при передачи в обработчик класса без единого метода с @DoTest
     */
    @Test
    public void runTest2(){
        assertThrows(MyException.class, ()-> AnnotationProcessor.runTest(TestingClass2.class));
    }

    /**
     * проверка выбрасываемого исключения при передачи в обработчик класса содержащего более одного @DoBeforeAll/@DoAfterAll
     */
    @Test
    public void runTest3(){
        assertThrows(MyException.class, ()-> AnnotationProcessor.runTest(TestingClass3.class));
    }
}
