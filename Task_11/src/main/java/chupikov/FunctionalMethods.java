package chupikov;

import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

/**
 * Класс утильных методов
 */
public class FunctionalMethods {

    /**
     * Процедура, запускающая потоки и останавливающая их выполнение и дальнейший запуск в случае денежной утечки.
     * @param bank банк
     * @throws RuntimeException исключение, выбрасываемое при обнаружении утечки
     */
    public static String executeThreads(Bank bank) throws RuntimeException {
        var daemonObserver = executeDaemon(bank);
        ExecutorService executorService = Executors.newFixedThreadPool(Config.CLIENT_QUANTITY);
        for(int i = 0; i < Config.CLIENT_QUANTITY; i++) {
            if (!daemonObserver.getFailFlag())
                executorService.execute(new Client(bank));
        }
        executorService.shutdown();
        if(daemonObserver.getFailFlag())
            throw new RuntimeException("Accounts money sum and total money amount mismatch");
        return "All good";
    }

    /**
     * Метод запуска демона-наблюдателя
     * @param bank банк
     * @return экземпляр демона-наблюдателя
     */
    public static DaemonObserver executeDaemon(Bank bank) {
        DaemonObserver daemonObserver = new DaemonObserver(bank);
        daemonObserver.setDaemon(true);
        daemonObserver.start();
        return daemonObserver;
    }

    /**
     * Метод, подсчитывающий текущее количество денег в банке
     */
    public static BigDecimal computeMoneyAmount(List<Account> accounts) {
        return cloneAccounts(accounts).stream().map(Account::getBalance).reduce(BigDecimal::add).orElse(BigDecimal.ZERO);
    }

    /**
     * Функция, создающая копию списка счетов
     * @param accounts список счетов
     * @return копия списка счетов
     */
    public static List<Account> cloneAccounts(List<Account> accounts) {
        lockAllAccounts(accounts);
        var clone =  accounts.stream().map(account -> new Account(account.getBalance().intValue())).collect(Collectors.toList());
        unlockAllAccounts(accounts);
        return clone;
    }

    /**
     * Процедура, блокирующая все счета в банке
     * @param accounts список счетов
     */
    public static void lockAllAccounts(List<Account> accounts) {
        accounts.forEach(Account::lockAccount);
    }

    /**
     * Процедура, открывающая все счета в банке
     * @param accounts список счетов
     */
    public static void unlockAllAccounts(List<Account> accounts) {
        accounts.forEach(Account::unlockAccount);
    }

    /**
     * Метод, возвращающий случайное значение от 0 до верхней границы
     * @param ceilingValue верхняя граница
     * @return сгенерированное случайное значение
     */
    public static int generateRandomValue(int ceilingValue) {
        return (int) (Math.random() * ceilingValue);
    }

    /**
     * Функция, возвращающая флаг, показывающий, возможно ли снять с текущего счёта заданную сумму.
     * Если снятие возможно, то снимаем сумму.
     * @param from счёт снятия
     * @param moneyAmount сумма снятия
     * @return true - если денег на счету больше или равно заданной суммы, false - если денег на счету меньше заданной суммы
     * @see Account
     */
    public static boolean tookMoneyFromAccount(Account from, BigDecimal moneyAmount) {
        from.lockAccount();
        try {
            if (from.getBalance().compareTo(moneyAmount) >= 0) {
                from.setBalance(from.getBalance().subtract(moneyAmount));
                return true;
            }
            return false;
        }
        finally {
            from.unlockAccount();
        }
    }

    /**
     * Процедура, добавляющая деньги на счёт
     * @param to счёт зачисления
     * @param moneyAmount сумма перевода
     * @see Account
     */
    public static void addMoneyOnAccount(Account to, BigDecimal moneyAmount) {
        to.lockAccount();
        try {
            to.setBalance(to.getBalance().add(moneyAmount));
        }
        finally {
            to.unlockAccount();
        }
    }

}
