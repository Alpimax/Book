package Season;

public class Summer extends Season {
    public Summer(String name, double highest, double lowest) {
        super(name, highest, lowest);
    }

    @Override
    public void activity() {
        System.out.println("Drink Lemonade");
    }
}
