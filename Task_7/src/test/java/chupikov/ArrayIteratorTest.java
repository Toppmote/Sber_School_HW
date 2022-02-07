package chupikov;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс, проверяющий корректность работы итератора для двумерного массива
 */
public class ArrayIteratorTest {

    /**
     * testingArrayInt - двумерный массив Integer для тестирования функционала итератора
     * sourceListInt - список из Integer элементов двумерного массива для проверки
     */
    static Integer[][] testingArrayInt;
    static List<Integer> sourceListInt;

    /**
     * testingArrayDouble - двумерный массив Double для тестирования функционала итератора
     * sourceListDouble - список из Double элементов двумерного массива для проверки
     */
    static Double[][] testingArrayDouble;
    static List<Double> sourceListDouble;

    /**
     * Метод инициализирующий исходные двумерные массивы и списки для проверки.
     */
    @BeforeAll
    public static void createArray(){
        Random random = new Random();
        int rowsCount = random.nextInt(9) + 1, columnsCount = random.nextInt(9) + 1;
        testingArrayInt = new Integer[rowsCount][columnsCount];
        sourceListInt = new ArrayList<>();
        testingArrayDouble = new Double[rowsCount][columnsCount];
        sourceListDouble = new ArrayList<>();
        for(int i = 0; i < rowsCount; i++)
            for(int j = 0; j < columnsCount; j++) {
                int valueInt = random.nextInt(200);
                testingArrayInt[i][j] = valueInt;
                sourceListInt.add(valueInt);
                double valueDouble = 200 * random.nextDouble();
                testingArrayDouble[i][j] = valueDouble;
                sourceListDouble.add(valueDouble);
            }
    }

    /**
     * Тест для проверки перебора значений двумерного массива Integer с помощью итератора.
     * Элементы добавляются в список, который сравнивается с исходным по значениям элементов
     */
    @Test
    public void checkValuesInt(){
        List<Integer> resultArray = new ArrayList<>();
        ArrayIterator<Integer> arrayIterator = new ArrayIterator<>(testingArrayInt);
        while(arrayIterator.hasNext())
            resultArray.add(arrayIterator.next());
        assertArrayEquals(sourceListInt.toArray(), resultArray.toArray());
    }

    /**
     * Тест для проверки перебора значений двумерного массива Double с помощью итератора.
     * Элементы добавляются в список, который сравнивается с исходным по значениям элементов
     */
    @Test
    public void checkValuesDouble(){
        List<Double> resultArray = new ArrayList<>();
        ArrayIterator<Double> arrayIterator = new ArrayIterator<>(testingArrayDouble);
        while(arrayIterator.hasNext())
            resultArray.add(arrayIterator.next());
        assertArrayEquals(sourceListDouble.toArray(), resultArray.toArray());
    }

    /**
     * Тест для проверки выбрасываемого исключения NullPointerException при выходе за границу массива
     */
    @Test
    public void testNPE(){
        ArrayIterator<Integer> arrayIterator = new ArrayIterator<>(testingArrayInt);
        assertThrows(NullPointerException.class, () -> {
            int count = 0;
            while (count < testingArrayInt.length * testingArrayInt[0].length + 1) {
                arrayIterator.next();
                count++;
            }
        });

    }

}
