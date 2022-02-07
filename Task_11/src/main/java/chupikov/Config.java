package chupikov;

import java.io.*;
import java.util.Properties;

/**
 * Класс, в котором находятся основные константы и методы для их инициализации
 */
public class Config {

    public Config(String propertyFileName) {
        initAllData(propertyFileName);
    }

    /**
     * Общее количество счетов в банке
     */
    public static int ACCOUNT_QUANTITY;

    /**
     * Общее количество клиентов в банке
     */
    public static int CLIENT_QUANTITY;

    /**
     * Максимальная сумма перевода
     */
    public static int MAX_TRANSACTION_AMOUNT;

    /**
     * Инициализация всех данных
     */
    public void initAllData(String propertyFileName) {
        Properties properties = initProperties(propertyFileName);
        ACCOUNT_QUANTITY = Integer.parseInt(properties.getProperty("account_quantity"));
        CLIENT_QUANTITY = Integer.parseInt(properties.getProperty("client_quantity"));
        MAX_TRANSACTION_AMOUNT = Integer.parseInt(properties.getProperty("max_transaction_amount"));
    }

    /**
     * Получить свойства из файла
     * @return объект со свойствами
     */
    private Properties initProperties(String propertyFileName) {
        Properties properties = new Properties();
        try {
            InputStream inputStream = Config.class.getResourceAsStream(propertyFileName);
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }


}
