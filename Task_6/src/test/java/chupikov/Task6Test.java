package chupikov;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

/**
 * Класс для тестирования методов поиска дубликатов
 */
public class Task6Test {

    /**
     * Две коллекции, содержащие экземпляры пользователей СберБанка
     */
    static Collection<UserSber> collA;
    static Collection<UserSber> collB;

    /**
     * Инициализация коллекций
     */
    @BeforeAll
    public static void init(){
        collA = new ArrayList<>();
        collB = new ArrayList<>();
        for(int i = 0; i < 100_000; i++){
            collA.add(new UserSber(Integer.toString(i), Integer.toString(i)));
            if (i % 10_000 == 0)
                collB.add(new UserSber(Integer.toString(i), Integer.toString(i)));
            else collB.add(new UserSber(Integer.toString(-i), Integer.toString(i)));
        }
    }

    /**
     * Тестирование первого метода на время работы и корректность результата
     */
    @Test
    @Timeout(value = 200, unit = TimeUnit.MILLISECONDS)
    public void testingMethod1(){
        assertEquals(10, Utils.findDuplicates1(collA, collB).size());
    }

    /**
     * Тестирование второго метода на время работы и корректность результата (самый быстрый)
     */
    @Test
    @Timeout(value = 200, unit = TimeUnit.MILLISECONDS)
    public void testingMethod2(){
        assertEquals(10, Utils.findDuplicates2(collA, collB).size());
    }

    /**
     * Тестирование третьего метода на время работы и корректность результата (не проходит по времени)
     */
    @Test
    @Timeout(value = 200, unit = TimeUnit.MILLISECONDS)
    public void testingMethod3(){
        assertEquals(10, Utils.findDuplicates3(collA, collB).size());
    }

}
