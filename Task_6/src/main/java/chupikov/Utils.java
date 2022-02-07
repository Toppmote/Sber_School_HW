package chupikov;

import java.util.*;

/**
 * Класс с методами для поиска дубликатов в двух списках клиентов СберБанка
 */
public class Utils {

    /**
     * Первый метод поиска дубликатов основан на сравнении каждого элемента первого списка с каждым элементом второго списка
     * @param collA первый список клиентов СберБанка
     * @param collB второй список клиентов СберБанка
     * @return список дубликатов
     */
    public static List<UserSber> findDuplicates1(Collection<UserSber> collA, Collection<UserSber> collB) {
        List<UserSber> duplicates = new ArrayList<>();
        HashSet<UserSber> setA = new HashSet<>(collA);
        HashSet<UserSber> setB = new HashSet<>(collB);
        for (UserSber user : setA)
            if (setB.contains(user))
                duplicates.add(user);
        return duplicates;
    }

    /**
     * Второй метод основан на методе retainAll, который удаляет элементы, не принадлежащие переданной коллекции
     * @param collA первый список клиентов СберБанка
     * @param collB второй список клиентов СберБанка
     * @return список дубликатов
     */
    public static List<UserSber> findDuplicates2(Collection<UserSber> collA, Collection<UserSber> collB){
        HashSet<UserSber> setA = new HashSet<>(collA);
        HashSet<UserSber> setB = new HashSet<>(collB);
        List<UserSber> duplicates = new ArrayList<>(setA);
        duplicates.retainAll(setB);
        return duplicates;
    }


    /**
     * Второй метод основан на методе removeAll, который удаляет элементы, принадлежащие переданной коллекции
     * @param collA первый список клиентов СберБанка
     * @param collB второй список клиентов СберБанка
     * @return список дубликатов
     */
    public static List<UserSber> findDuplicates3(Collection<UserSber> collA, Collection<UserSber> collB){
        HashSet<UserSber> setA = new HashSet<>(collA);
        HashSet<UserSber> setB = new HashSet<>(collB);
        HashSet<UserSber> allUsers = new HashSet<>(Set.copyOf(setA));
        allUsers.addAll(setB);
        allUsers.removeAll(setA);
        setB.removeAll(allUsers);
        return new ArrayList<>(setB);
    }

}
