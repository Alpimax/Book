package Season;

public class Season {
    String name;
    double highest;
    double lowest ;

    public Season(String name, double highest, double lowest) {
        this.name = name;
        this.highest = highest;
        this.lowest = lowest;
    }

    public void activity(){
        System.out.println(name);
    }




    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", highest=" + highest +
                ", lowest=" + lowest +
                '}';
    }
}

