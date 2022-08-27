package Season;

public class Spring extends Season{
    public Spring(String name, double highest, double lowest) {
        super(name, highest, lowest);
    }

    @Override
    public void activity() {
        System.out.println("Go Outside");
    }




}
