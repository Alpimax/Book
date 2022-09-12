package Season;

public class Fall extends Season {
    public Fall(String name, double highest, double lowest) {
        super(name, highest, lowest);
    }

    @Override
    public void activity() {
        System.out.println("Read A Book");
    }



}
