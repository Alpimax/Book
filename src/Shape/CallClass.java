package Shape;

public class CallClass {
    public static void main(String[] args) {

//        Shape obj2 = new Shape() ;



        Triangle obj = new Triangle(75);
        System.out.println(obj.area());

        Triangle obj2 = new Triangle(100);
        System.out.println(obj2.area());
    }
}
