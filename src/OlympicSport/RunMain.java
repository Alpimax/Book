package OlympicSport;

public class RunMain {
    public static void main(String[] args) {
        Surfing obj1 = new Surfing("Muhammet",24);
        System.out.println(obj1);
        obj1.compete();

        Soccer obj2 =new Soccer("Alper",11);
        System.out.println(obj2);
        obj2.compete();
        Track obj3 =new Track("Jasmine", 6);
        System.out.println(obj3);
        obj3.compete();
    }
}
