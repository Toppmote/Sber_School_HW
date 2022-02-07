package chupikov;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static chupikov.FunctionalMethods.*;

/**
 * Класс, реализующий банк
 */
public class Bank {

    /**
     * Список всех счетов банка
     */
    private final List<Account> accountList = new ArrayList<>();

    public Bank() {
        generateSomeAccounts(Config.ACCOUNT_QUANTITY);
    }

    /**
     * Геттер для списка счетов банка
     * @return список счетов
     */
    public List<Account> getAccountList() {
        return accountList;
    }

    /**
     * Процедура создания счетов банка в определённом количестве
     * @param accountsQuantity количество счетов, которые необходимо создать
     */
    public void generateSomeAccounts(int accountsQuantity) {
        for(int i = 0; i < accountsQuantity; i++)
            addAccount(new Account(Config.MAX_TRANSACTION_AMOUNT));
    }

    /**
     * Процедура добавления нового счёта в список счетов
     * @param account новый счёт
     */
    public void addAccount(Account account) {
        accountList.add(account);
    }

    /**
     * Метод для перевода денег с одного счёта на другой
     * @param from счёт, с которого переводим деньги
     * @param to счёт, на который переводим деньги
     * @param transferAmount сумма перевода
     * @see FunctionalMethods
     */
    public void makeTransfer(Account from, Account to, BigDecimal transferAmount) {
        if(FunctionalMethods.tookMoneyFromAccount(from, transferAmount))
            FunctionalMethods.addMoneyOnAccount(to, transferAmount);
    }

    /**
     * Метод, возвращающий 2 случайных аккаунта
     * @return список из двух случайных аккаунтов
     * @see FunctionalMethods
     */
    public List<Account> generateTransferAccounts() {
        return IntStream.range(0, 2)
                .map(num -> generateRandomValue(Config.ACCOUNT_QUANTITY))
                .mapToObj(accountList::get).collect(Collectors.toList());
    }

}
