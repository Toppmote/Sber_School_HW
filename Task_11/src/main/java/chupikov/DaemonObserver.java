package chupikov;

import java.math.BigDecimal;

/**
 * Класс демона-наблюдателя, подсчитывающего сумму денег в банке
 */
public class DaemonObserver extends Thread {

    private final Bank bank;

    /**
     * Флаг, обозначающий, произошла ли утечка в банке
     */
    private boolean isFailed = false;

    public DaemonObserver(Bank bank) {
        this.bank = bank;
    }

    /**
     * Процедура потока демона-наблюда. Выполняется каждые 0,1 секунды, пока не завершатся все потоки.
     * Каждую 0,1 секунду происходит суммирование денег на счетах банка и сравнение посчитанной суммы с денежной массой банка.
     * Если данные значения не равны, поток прерывает свое выполнение.
     */
    @Override
    public void run() {
        BigDecimal moneyAmount = new BigDecimal(Config.ACCOUNT_QUANTITY * Config.MAX_TRANSACTION_AMOUNT);
        while (!isFailed) {
            BigDecimal receivedMoneyAmount = FunctionalMethods.computeMoneyAmount(bank.getAccountList());
            if(receivedMoneyAmount.compareTo(moneyAmount) != 0) {
                isFailed = true;
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Метод, возвращающий значение флага, указывающего на утечку
     * @return флаг, показывающий на утечку денег
     */
    public boolean getFailFlag() {
        return isFailed;
    }
}
