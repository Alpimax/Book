package day43_abstraction;

public abstract class ElectricCar extends Car {
    @Override
    public void start() {
        System.out.println();
    }

    public abstract void charge();
}
