package chupikov;

import chupikov.electricWatches.OmegaElectricWatch;
import chupikov.electricWatches.RolexElectricWatch;
import chupikov.electricWatches.SeikoElectricWatch;
import chupikov.electricWatches.TissotElectricWatch;
import chupikov.factories.*;
import chupikov.mechanicalWatches.OmegaMechanicalWatch;
import chupikov.mechanicalWatches.RolexMechanicalWatch;
import chupikov.mechanicalWatches.SeikoMechanicalWatch;
import chupikov.mechanicalWatches.TissotMechanicalWatch;
import chupikov.quartzWatches.OmegaQuartzWatch;
import chupikov.quartzWatches.RolexQuartzWatch;
import chupikov.quartzWatches.SeikoQuartzWatch;
import chupikov.quartzWatches.TissotQuartzWatch;
import chupikov.watchTypes.ElectricWatch;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Класс с тестами для проверки абстрактной фабрики наручных часов
 */
public class Task5Test {
    /**
     * Тест для проверки экземплряров часов компании "Omega"
     */
    @Test
    public void OmegaWatchesTest() {
        WatchFactory omegaFactory = new OmegaFactory();
        assertEquals(OmegaFactory.class, omegaFactory.getClass());
        assertEquals(OmegaElectricWatch.class, omegaFactory.createElectricWatch().getClass());
        assertEquals(OmegaMechanicalWatch.class, omegaFactory.createMechanicalWatch().getClass());
        assertEquals(OmegaQuartzWatch.class, omegaFactory.createQuartzWatch().getClass());
    }

    /**
     * Тест для проверки экземплряров часов компании "Rolex"
     */
    @Test
    public void RolexWatchesTest() {
        WatchFactory rolexFactory = new RolexFactory();
        assertEquals(RolexFactory.class, rolexFactory.getClass());
        assertEquals(RolexElectricWatch.class, rolexFactory.createElectricWatch().getClass());
        assertEquals(RolexMechanicalWatch.class, rolexFactory.createMechanicalWatch().getClass());
        assertEquals(RolexQuartzWatch.class, rolexFactory.createQuartzWatch().getClass());
    }

    /**
     * Тест для проверки экземплряров часов компании "Tissot"
     */
    @Test
    public void TissotWatchesTest() {
        WatchFactory tissotFactory = new TissotFactory();
        assertEquals(TissotFactory.class, tissotFactory.getClass());
        assertEquals(TissotElectricWatch.class, tissotFactory.createElectricWatch().getClass());
        assertEquals(TissotMechanicalWatch.class, tissotFactory.createMechanicalWatch().getClass());
        assertEquals(TissotQuartzWatch.class, tissotFactory.createQuartzWatch().getClass());
    }

    /**
     * Тест для проверки экземплряров часов компании "Seiko"
     */
    @Test
    public void SeikoWatchesTest() {
        WatchFactory seikoFactory = new SeikoFactory();
        assertEquals(SeikoFactory.class, seikoFactory.getClass());
        assertEquals(SeikoElectricWatch.class, seikoFactory.createElectricWatch().getClass());
        assertEquals(SeikoMechanicalWatch.class, seikoFactory.createMechanicalWatch().getClass());
        assertEquals(SeikoQuartzWatch.class, seikoFactory.createQuartzWatch().getClass());
    }
}
