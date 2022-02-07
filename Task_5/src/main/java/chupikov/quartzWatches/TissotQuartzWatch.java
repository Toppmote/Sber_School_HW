package chupikov.quartzWatches;

import chupikov.watchTypes.QuartzWatch;

/**
 * Класс, реализующий сущность кварцевых часов бренда "Tissot"
 */
public class TissotQuartzWatch implements QuartzWatch {

    /**
     * Конструктор, который выводит сообщение о создании экземпляра
     */
    public TissotQuartzWatch() {
        System.out.println("Tissot Quartz Watch created!");
    }
}
