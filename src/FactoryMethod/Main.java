package FactoryMethod;

import FactoryMethod.creator.DigitalWatchCreator;
import FactoryMethod.creator.RomeWatchCreator;
import FactoryMethod.creator.WatchCreator;
import FactoryMethod.watch.Watch;
import FactoryMethod.watch.WatchType;

public class Main {
    public static void main(String[] args) {
        WatchCreator watchCreator = getCreator(WatchType.ROME);
        Watch watch = watchCreator.createWatch();
        watch.showTime();
    }

    public static WatchCreator getCreator(WatchType type) {
        WatchCreator watchCreator;
        switch (type) {
            case DIGITAL: watchCreator = new DigitalWatchCreator(); break;
            case ROME: watchCreator = new RomeWatchCreator(); break;
            default: throw new RuntimeException("unsupported watch type");
        }

        return watchCreator;
    }
}
