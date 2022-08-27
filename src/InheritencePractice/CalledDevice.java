package InheritencePractice;

public class CalledDevice {
    String  brand;
    int model;
    double price;
    boolean wireless;

    public CalledDevice(String brand, int model, double price, boolean wireless) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.wireless = wireless;
    }
    public void useDevice(){

    }


    public String toString() {
        return "CalledDevice{" +
                "brand='" + brand + '\'' +
                ", model=" + model +
                ", price=" + price +
                ", wireless=" + wireless +
                '}';
    }
}
