package chupikov.factories;

import chupikov.electricWatches.TissotElectricWatch;
import chupikov.mechanicalWatches.TissotMechanicalWatch;
import chupikov.quartzWatches.TissotQuartzWatch;
import chupikov.watchTypes.ElectricWatch;
import chupikov.watchTypes.MechanicalWatch;
import chupikov.watchTypes.QuartzWatch;

/**
 * Класс, являющийся реализацией файбрики компании "Tissot",
 * на которой делают часы трёх видов: кварцевые, механические, электрические
 */
public class TissotFactory implements WatchFactory {

    /**
     * Метод, реализующий создание электрических часов компании "Tissot"
     * @return экземпляр электрических часов компании "Tissot"
     */
    @Override
    public ElectricWatch createElectricWatch() {
        return new TissotElectricWatch();
    }

    /**
     * Метод, реализующий создание механических часов компании "Tissot"
     * @return экземпляр механических часов компании "Tissot"
     */
    @Override
    public MechanicalWatch createMechanicalWatch() {
        return new TissotMechanicalWatch();
    }

    /**
     * Метод, реализующий создание кварцевых часов компании "Tissot"
     * @return экземпляр кварцевых часов компании "Tissot"
     */
    @Override
    public QuartzWatch createQuartzWatch() {
        return new TissotQuartzWatch();
    }
}
