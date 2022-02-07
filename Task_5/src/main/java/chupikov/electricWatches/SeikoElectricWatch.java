package chupikov.electricWatches;

import chupikov.watchTypes.ElectricWatch;

/**
 * Класс, реализующий сущность электрических часов компании "Seiko"
 */
public class SeikoElectricWatch implements ElectricWatch {

    /**
     * Конструктор, который выводит сообщение о создании экземпляра
     */
    public SeikoElectricWatch() {
        System.out.println("Seiko Electric Watch created!");
    }
}
