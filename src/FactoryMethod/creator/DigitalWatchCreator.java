package FactoryMethod.creator;

import FactoryMethod.watch.DigitalWatch;
import FactoryMethod.watch.Watch;

public class DigitalWatchCreator implements WatchCreator {
    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
