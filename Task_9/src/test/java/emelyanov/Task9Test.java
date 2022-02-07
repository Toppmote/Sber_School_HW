package emelyanov;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static emelyanov.Task9.start;
import static org.junit.jupiter.api.Assertions.*;

public class Task9Test {

    @Test
    @DisplayName("Проверка на корректность выполнения теста на корректном классе ClassA")
    public void test1() {
        assertDoesNotThrow(() -> {
            List<Object> resultTest = start("emelyanov.ClassA");
            assertEquals(6, resultTest.size(), "Количество найденных методов корректно");
            assertArrayEquals(new Object[]{"BeforeAll", "Four", "Three", "Two", "One", "AfterAll"},
                    resultTest.toArray(), "Результаты выполнения найденных методов корректны");
        }, "исключений не должно быть");
    }

    @Test
    @DisplayName("Проверка на ислючение при выполнение теста на классе ClassB с несколькими @DoBeforeAll")
    public void test2() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            List<Object> resultTest = start("emelyanov.ClassB");
        }, "исключение - Количество методов BeforeAll не корректно");
        assertEquals("Количество методов BeforeAll не корректно", exception.getMessage());
    }

    @Test
    @DisplayName("Проверка на корректность выполнения теста на корректном классе ClassE без @DoBeforeAll и @DoAfterAll ")
    public void test3() {
        assertDoesNotThrow(() -> {
            List<Object> resultTest = start("emelyanov.ClassE");
            assertEquals(3, resultTest.size(), "Количество найденных методов корректно");
            assertArrayEquals(new Object[]{"Three", "Two", "One"},
                    resultTest.toArray(), "Результаты выполнения найденных методов корректны");
        }, "исключений не должно быть");
    }
}
