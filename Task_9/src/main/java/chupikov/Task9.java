package chupikov;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Класс, реализующий метод обработки выполнения методов с указанными аннотациями, реализованными в рамках данной лабораторной
 */
public class Task9 {

    /**
     * Метод, обрабатывающий методы переданного класса с указанными аннотациями, реализованными в рамках данной лабораторной.
     * Выбрасывает NPE, если передан null, количество DoBeforeAll и DoAfterAll превышает 1 и нет методов с аннотацией DoTest
     * @param className имя класса с методами для тестов
     * @return результат тестирования методов указанного класса
     * @throws Exception выбрасываемое исключение
     */
    public static List<Object> start(String className) throws Exception {
        if (className == null)
            throw new NullPointerException();
        Class<?> testedClass = Class.forName(className);
        Method[] declaredMethods = testedClass.getDeclaredMethods();
        Method beforeMethod = null;
        Method afterMethod = null;
        List<Method> methods = new ArrayList<>();
        for(Method method : declaredMethods)
            if(method.isAnnotationPresent(DoBeforeAll.class)) {
                if (beforeMethod == null)
                    beforeMethod = method;
                else
                    throw new RuntimeException("Количество DoBeforeAll методов > 1");
            }
            else if(method.isAnnotationPresent(DoAfterAll.class)) {
                if (afterMethod == null)
                    afterMethod = method;
                else
                    throw new RuntimeException("Количество DoAfterAll методов > 1");
            }
            else if(method.isAnnotationPresent(DoTest.class))
                methods.add(method);
        if(methods.size() == 0)
            throw new RuntimeException("Количество DoTest методов == 0");
        methods = methods.stream()
                .sorted(Comparator.comparingInt(method -> method.getAnnotation(DoTest.class).order()))
                .collect(Collectors.toList());
        var resultList = new ArrayList<>();
        if(beforeMethod != null)
            resultList.add(beforeMethod.invoke(className));
        for(Method method : methods)
            resultList.add(method.invoke(className));
        if(afterMethod != null)
            resultList.add(afterMethod.invoke(className));
        return resultList;
    }

}
