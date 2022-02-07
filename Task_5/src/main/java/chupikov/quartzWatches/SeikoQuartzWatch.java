package chupikov.quartzWatches;

import chupikov.watchTypes.QuartzWatch;

/**
 * Класс, реализующий сущность кварцевых часов бренда "Seiko"
 */
public class SeikoQuartzWatch implements QuartzWatch {

    /**
     * Конструктор, который выводит сообщение о создании экземпляра
     */
    public SeikoQuartzWatch() {
        System.out.println("Seiko Quartz Watch created!");
    }
}
