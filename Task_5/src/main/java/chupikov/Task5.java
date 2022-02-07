package chupikov;

import chupikov.factories.OmegaFactory;
import chupikov.factories.TissotFactory;
import chupikov.factories.WatchFactory;

public class Task5 {

    public static void main(String[] args) {
        WatchFactory omegaFactory = new OmegaFactory();
        omegaFactory.createMechanicalWatch();

        WatchFactory tissotFactory = new TissotFactory();
        tissotFactory.createQuartzWatch();
    }

}
