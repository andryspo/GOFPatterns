package FactoryMethod.creator;

import FactoryMethod.watch.RomeWatch;
import FactoryMethod.watch.Watch;

public class RomeWatchCreator implements WatchCreator {
    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}
