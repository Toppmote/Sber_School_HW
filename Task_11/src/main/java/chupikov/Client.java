package chupikov;

import java.math.BigDecimal;

/**
 * Класс, реализующий клиента в банке
 */
public class Client extends Thread {

    /**
     * Поле с объектом банка, которым пользуется клиент
     */
    Bank bank;

    public Client(Bank bank) {
        this.bank = bank;
    }

    /**
     * Процедура потока-клиента. Клиент 1 раз выполняет перевод денег с одного счёта на другой, после чего поток завершает выполнение.
     */
    @Override
    public void run() {
        var transferAccountsList = bank.generateTransferAccounts();
        BigDecimal transferAmount = BigDecimal.valueOf(FunctionalMethods.generateRandomValue(Config.MAX_TRANSACTION_AMOUNT));
        bank.makeTransfer(transferAccountsList.get(0), transferAccountsList.get(1), transferAmount);
    }
}
