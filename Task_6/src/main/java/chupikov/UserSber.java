package chupikov;

import java.util.Arrays;
import java.util.Objects;

/**
 * Класс пользователя СберБанка, содержащий 3 поля:
 * 1. Имя пользователя
 * 2. Адрес эл. почты
 * 3. Пароль
 */
public class UserSber {

    private String username;
    private String email;
    private byte[] passwordHash;

    public UserSber(String username, String email) {
        this.username = username;
        this.email = email;
        this.passwordHash = username.getBytes();
    }

    /**
     * Геттер для имени пользователя
     * @return имя пользователя
     */
    public String getUsername() {
        return username;
    }

    /**
     * Сеттер для имени пользователя
     * @param username новое имя пользователя
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Геттер для эл. почты
     * @return эл. почта
     */
    public String getEmail() {
        return email;
    }

    /**
     * Сеттер для эл. почты
     * @param email новая эл. почта
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Геттер для пароля
     * @return пароль
     */
    public byte[] getPasswordHash() {
        return passwordHash;
    }

    /**
     * Сеттер для пароля
     * @param passwordHash новый пароль
     */
    public void setPasswordHash(byte[] passwordHash) {
        this.passwordHash = passwordHash;
    }

    /**
     * Метод для сравнения двух пользователей СберБанка
     * @param obj объект для сравнения
     * @return true - если объекты одинаковы, false - если разные
     */
    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null || this.getClass() != obj.getClass())
            return false;
        UserSber userSber = (UserSber) obj;
        return this.email.equals(userSber.email) && this.username.equals(userSber.username) && Arrays.equals(this.passwordHash, userSber.passwordHash);
    }

    /**
     * Метод для генерации хэш-кода
     * @return хэш-код
     */
    @Override
    public int hashCode() {
        return Objects.hash(username, email);
    }
}