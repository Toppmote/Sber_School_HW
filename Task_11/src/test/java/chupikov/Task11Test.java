package chupikov;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс с тестами банковских переводов
 */
public class Task11Test {

    /**
     * Тест с большим количеством клиентов и счетов
     */
    @Test
    void manyAccountsAndClientsTest() {
        new Config("manyObjectsScenario.properties");
        Bank bank = new Bank();
        assertEquals("All good", FunctionalMethods.executeThreads(bank));
    }

    /**
     * Тест, в котором демон-наблюдатель кидает RuntimeException.
     * В этом тесте намеренно изменяем баланс первого счёта на большую сумму
     */
    @Test
    void daemonObserverExceptionTest() {
        new Config("manyObjectsScenario.properties");
        Bank bank = new Bank();
        bank.getAccountList().get(0).setBalance(BigDecimal.valueOf(10000));
        assertThrows(RuntimeException.class, () -> FunctionalMethods.executeThreads(bank));
    }

    /**
     * Тест с большим количеством клиентов и всего двумя счётами
     */
    @Test
    void onlyTwoAccountsTest() {
        new Config("twoAccountsScenario.properties");
        Bank bank = new Bank();
        assertEquals("All good", FunctionalMethods.executeThreads(bank));
    }

}
