package chupikov;

import java.math.BigDecimal;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Класс счёта банка
 */
public class Account {

    /**
     * Баланс счёта
     */
    private BigDecimal balance;

    /**
     * Объект для блокировки счёта
     */
    Lock locker;

    public Account(int balance) {
        this.balance = BigDecimal.valueOf(balance);
        locker = new ReentrantLock();
    }

    /**
     * Геттер для баланса счёта
     * @return баланс счёта
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Сеттер для баланса счёта
     * @param balance новый баланс
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * Процедура, закрывающая счёт для клиентов
     */
    public void lockAccount() {
        locker.lock();
    }

    /**
     * Процедура, открывающая счёт для клиентов
     */
    public void unlockAccount() {
        locker.unlock();
    }

}
