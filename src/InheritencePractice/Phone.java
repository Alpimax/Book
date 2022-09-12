package InheritencePractice;

public class Phone extends Device {

    public Phone(String brand, int model, double price, boolean wireless) {
        super(brand, model, price, wireless);
    }

    @Override
    public void useDevice() {
        super.useDevice();
    }


    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model=" + model +
                ", price=" + price +
                ", wireless=" + wireless +
                '}';
    }
}
