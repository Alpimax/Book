package Shape;

public class Triangle extends Shape {

    public  double radium ;

    public Triangle(double radium) {
        this.radium = radium;
    }

    public double area() {
        return radium * radium;
    }

//    @Override
//    public String toString() {
//        return "Triangle{" +
//                "radium=" + radium +
//                '}';
//    }
}
