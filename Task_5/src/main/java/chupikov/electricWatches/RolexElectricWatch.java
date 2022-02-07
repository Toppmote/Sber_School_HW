package chupikov.electricWatches;

import chupikov.watchTypes.ElectricWatch;

/**
 * Класс, реализующий сущность электрических часов компании "Rolex"
 */
public class RolexElectricWatch implements ElectricWatch {

    /**
     * Конструктор, который выводит сообщение о создании экземпляра
     */
    public RolexElectricWatch() {
        System.out.println("Rolex Electric Watch created!");
    }
}
