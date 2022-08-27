package Season;

public class CheckSeason {
    public static void main(String[] args) {
        Winter obj1 = new Winter("Winter",40.8,35.1);
        System.out.println(obj1);
        obj1.activity();

        Summer obj2 =new Summer("Summer",100.1,65.2);
        System.out.println(obj2);
        obj2.activity();

        Fall obj3 =new Fall("Fall",70,50);
        System.out.println(obj3);
        obj3.activity();

        Spring obj4 =new Spring("Spring ",80.1,70.9);
        System.out.println(obj4);
        obj4.activity();

    }
}
