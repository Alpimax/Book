package InheritencePractice;

public class TV extends Device {

    public TV(String brand, int model, double price, boolean wireless) {
        super(brand, model, price, wireless);
    }

    @Override
    public void useDevice() {
        System.out.println("Using TV");
    }

    public String toString() {
        return "CalledTV{" +
                "brand='" + brand + '\'' +
                ", model=" + model +
                ", price=" + price +
                ", wireless=" + wireless +
                '}';
    }
}
