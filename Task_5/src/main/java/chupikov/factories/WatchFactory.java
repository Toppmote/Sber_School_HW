package chupikov.factories;

import chupikov.watchTypes.ElectricWatch;
import chupikov.watchTypes.MechanicalWatch;
import chupikov.watchTypes.QuartzWatch;

/**
 * Интерфейс, реализующий абстрактную фабрику производства наручных часов.
 * Возможно создание часов трёх видов: кварцевые, механические, электрические
 */
public interface WatchFactory {
    /**
     * Абстрактный метод для создания электрических часов
     * @return экземпляр электрических часов выбранной компании
     */
    ElectricWatch createElectricWatch();

    /**
     * Абстрактный метод для создания механических часов
     * @return экземпляр механических часов выбранной компании
     */
    MechanicalWatch createMechanicalWatch();

    /**
     * Абстрактный метод для создания кварцевых часов
     * @return экземпляр кварцевых часов выбранной компании
     */
    QuartzWatch createQuartzWatch();

}
