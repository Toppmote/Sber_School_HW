package chupikov.electricWatches;

import chupikov.watchTypes.ElectricWatch;

/**
 * Класс, реализующий сущность электрических часов компании "Tissot"
 */
public class TissotElectricWatch implements ElectricWatch {

    /**
     * Конструктор, который выводит сообщение о создании экземпляра
     */
    public TissotElectricWatch() {
        System.out.println("Tissot Electric Watch created!");
    }
}
