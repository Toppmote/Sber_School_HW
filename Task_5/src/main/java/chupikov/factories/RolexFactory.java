package chupikov.factories;

import chupikov.electricWatches.RolexElectricWatch;
import chupikov.mechanicalWatches.RolexMechanicalWatch;
import chupikov.quartzWatches.RolexQuartzWatch;
import chupikov.watchTypes.ElectricWatch;
import chupikov.watchTypes.MechanicalWatch;
import chupikov.watchTypes.QuartzWatch;

/**
 * Класс, являющийся реализацией файбрики компании "Rolex",
 * на которой делают часы трёх видов: кварцевые, механические, электрические
 */
public class RolexFactory implements WatchFactory {

    /**
     * Метод, реализующий создание электрических часов компании "Rolex"
     * @return экземпляр электрических часов компании "Rolex"
     */
    @Override
    public ElectricWatch createElectricWatch() {
        return new RolexElectricWatch();
    }

    /**
     * Метод, реализующий создание механических часов компании "Rolex"
     * @return экземпляр механических часов компании "Rolex"
     */
    @Override
    public MechanicalWatch createMechanicalWatch() {
        return new RolexMechanicalWatch();
    }

    /**
     * Метод, реализующий создание кварцевых часов компании "Rolex"
     * @return экземпляр кварцевых часов компании "Rolex"
     */
    @Override
    public QuartzWatch createQuartzWatch() {
        return new RolexQuartzWatch();
    }
}
