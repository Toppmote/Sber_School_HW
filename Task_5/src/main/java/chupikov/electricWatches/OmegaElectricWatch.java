package chupikov.electricWatches;

import chupikov.watchTypes.ElectricWatch;

/**
 * Класс, реализующий сущность электрических часов компании "Omega"
 */
public class OmegaElectricWatch implements ElectricWatch {

    /**
     * Конструктор, который выводит сообщение о создании экземпляра
     */
    public OmegaElectricWatch() {
        System.out.println("Omega Electric Watch created!");
    }
}
