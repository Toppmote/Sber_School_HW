package bachishche.testedClasses;

import bachishche.*;

/**
 * Класс, который нужно "протестировать" -
 * калькулятор из двух чисел, реализующий операции
 * сложения, умножения и деления.
 */
public class CalculateTest {
    private Double operand1 = 3.;
    private Double operand2 = 3.;

    /**
     * Первичная инициализация перед тестированием
     */
    @DoBeforeAll
    public void init() {
        this.operand1 = 2.;
        this.operand2 = 1.;
    }

    /**
     * Методы, которые необходимо протестировать
     *
     * @return результаты выполнения арифметических процедур
     */


    @DoTest(3)
    double sum() {
        return operand1 + operand2;
    }

    @DoTest(0)
    double mult() {
        return operand1 * operand2;
    }

    @DoTest(2)
    double div() {
        if (operand2 < 1e-10)
            throw new IllegalArgumentException("Dividing by zero!");
        return operand1 / operand2;
    }

    /**
     * Освобожение памяти после выполнения тестов.
     *
     * @return 0, если освобождение прошло успешно
     */
    @DoAfterAll
    int clear() {
        operand2 = null;
        operand1 = null;
        return 0;
    }

}
