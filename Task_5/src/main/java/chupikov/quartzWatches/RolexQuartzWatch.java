package chupikov.quartzWatches;

import chupikov.watchTypes.QuartzWatch;

/**
 * Класс, реализующий сущность кварцевых часов бренда "Rolex"
 */
public class RolexQuartzWatch implements QuartzWatch {

    /**
     * Конструктор, который выводит сообщение о создании экземпляра
     */
    public RolexQuartzWatch() {
        System.out.println("Rolex Quartz Watch created!");
    }
}
