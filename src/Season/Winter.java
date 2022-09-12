package Season;

public class Winter extends Season {

    public Winter(String name, double highest, double lowest) {
        super(name, highest, lowest);
    }

    @Override
    public void activity() {
        System.out.println("Use Fireplace. ");
    }

}
