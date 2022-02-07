package chupikov.factories;

import chupikov.electricWatches.OmegaElectricWatch;
import chupikov.mechanicalWatches.OmegaMechanicalWatch;
import chupikov.quartzWatches.OmegaQuartzWatch;
import chupikov.watchTypes.ElectricWatch;
import chupikov.watchTypes.MechanicalWatch;
import chupikov.watchTypes.QuartzWatch;

/**
 * Класс, являющийся реализацией файбрики компании "Omega",
 * на которой делают часы трёх видов: кварцевые, механические, электрические
 */
public class OmegaFactory implements WatchFactory {

    /**
     * Метод, реализующий создание электрических часов компании "Omega"
     * @return экземпляр электрических часов компании "Omega"
     */
    @Override
    public ElectricWatch createElectricWatch() {
        return new OmegaElectricWatch();
    }

    /**
     * Метод, реализующий создание механических часов компании "Omega"
     * @return экземпляр механических часов компании "Omega"
     */
    @Override
    public MechanicalWatch createMechanicalWatch() {
        return new OmegaMechanicalWatch();
    }

    /**
     * Метод, реализующий создание кварцевых часов компании "Omega"
     * @return экземпляр кварцевых часов компании "Omega"
     */
    @Override
    public QuartzWatch createQuartzWatch() {
        return new OmegaQuartzWatch();
    }
}
