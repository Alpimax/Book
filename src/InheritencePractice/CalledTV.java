package InheritencePractice;

public class CalledTV extends CalledDevice {

    public CalledTV(String brand, int model, double price, boolean wireless) {
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
