package Decorator;

/**
 * Created by andry on 22/01/2017.
 */
public class BasicCar implements Car {

    @Override
    public void assemble() {
        System.out.println("Basic Car.");
    }
}
