package chupikov.quartzWatches;

import chupikov.watchTypes.QuartzWatch;

/**
 * Класс, реализующий сущность кварцевых часов бренда "Omega"
 */
public class OmegaQuartzWatch implements QuartzWatch {

    /**
     * Конструктор, который выводит сообщение о создании экземпляра
     */
    public OmegaQuartzWatch() {
        System.out.println("Omega Quartz Watch created!");
    }
}
