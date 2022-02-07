package chupikov;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Класс с тестами для метода подсчёта частоты появления слов в тексте с помощью Stream API (метод findRepeatingWords)
 */
public class Task8Test {

    /**
     * Тест, в котором все слова текста находятся в одном регистре.
     * Количество слов равно значению их имени.
     */
    @Test
    void testText() {
        assertArrayEquals(new String[] {"four", "three", "two", "one"}, Task8.findRepeatingWords("four one three two three three four two four four"));
    }

    /**
     * Тест, в котором все слова текста находятся в разных регистрах.
     * Количество слов равно значению их имени.
     */
    @Test
    void testRegisterText() {
        assertArrayEquals(new String[] {"four", "three", "two"}, Task8.findRepeatingWords("tWo TWO tHreE tHREe THrEe FOUR foUR FoUr FOuR"));
    }

    /**
     * Тест, в котором передается null
     */
    @Test
    void testNullString() {
        assertThrows(NullPointerException.class, () -> Task8.findRepeatingWords(null));
    }

}
