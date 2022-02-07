package chupikov;

import java.util.*;

/**
 * Класс, реализующий метод подсчёта частоты появления слов в тексте с помощью Stream API
 */
public class Task8 {

    /**
     * Метод подсчёта частоты появления слов в тексте.
     * Возвращает массив из 10 слов, чаще всего встречающихся в тексте.
     * Если слов меньше 10, возвращает сколько есть.
     * @param text исходный текст
     * @return массив из слов, чаще всего встречающихся в тексте.
     */
    public static String[] findRepeatingWords(String text) {
        if(text == null)
            throw new NullPointerException();
        var wordsFrequency = new HashMap<String, Integer>();
        var words = new ArrayList<>(List.of(text.toLowerCase().split(" ")));
        words.forEach((word) -> wordsFrequency.put(word, Collections.frequency(words, word)));
        return wordsFrequency.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(10)
                .map(Map.Entry::getKey)
                .toArray(String[]::new);
    }

}
