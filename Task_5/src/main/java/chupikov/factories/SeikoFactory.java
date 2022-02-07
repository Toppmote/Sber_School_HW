package chupikov.factories;

import chupikov.electricWatches.SeikoElectricWatch;
import chupikov.mechanicalWatches.SeikoMechanicalWatch;
import chupikov.quartzWatches.SeikoQuartzWatch;
import chupikov.watchTypes.ElectricWatch;
import chupikov.watchTypes.MechanicalWatch;
import chupikov.watchTypes.QuartzWatch;

/**
 * Класс, являющийся реализацией файбрики компании "Seiko",
 * на которой делают часы трёх видов: кварцевые, механические, электрические
 */
public class SeikoFactory implements WatchFactory {

    /**
     * Метод, реализующий создание электрических часов компании "Seiko"
     * @return экземпляр электрических часов компании "Seiko"
     */
    @Override
    public ElectricWatch createElectricWatch() {
        return new SeikoElectricWatch();
    }

    /**
     * Метод, реализующий создание механических часов компании "Seiko"
     * @return экземпляр механических часов компании "Seiko"
     */
    @Override
    public MechanicalWatch createMechanicalWatch() {
        return new SeikoMechanicalWatch();
    }

    /**
     * Метод, реализующий создание кварцевых часов компании "Seiko"
     * @return экземпляр кварцевых часов компании "Seiko"
     */
    @Override
    public QuartzWatch createQuartzWatch() {
        return new SeikoQuartzWatch();
    }
}
