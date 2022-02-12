package troitskiy;


/**
 * Один из класс-тестов, чьи методы с аннотациями
 * будут запускаться, в результате правильного запуска
 * в teststr должна быть строка "B123A"
 */
public class FirstTestClass
{
    static public String teststr = "";

    @DoTest(order = 1)
    public static boolean Metod1()
    {
        teststr = teststr + "1";
        return true;
    }

    @DoTest(order = 3)
    public static boolean Metod3()
    {
        teststr = teststr + "3";
        return true;
    }

    @DoTest(order = 2)
    public static boolean Metod2()
    {
        teststr = teststr + "2";
        return true;
    }

    @DoBeforeAll
    public static boolean MetodBeforeAll()
    {
        teststr = teststr + "B";
        return true;
    }

    @DoAfterAll
    public static boolean MetodAfterAll()
    {
        teststr = teststr + "A";
        return true;
    }

    public static void main(String[] args)
    {
    }

}