package day43_abstraction;

public class Tesla extends ElectricCar{
    @Override
    public void start() {
        System.out.println("Key car near by, starting car");
    }

    @Override
    public void charge() {
        System.out.println("telsa charging station");
    }
}
