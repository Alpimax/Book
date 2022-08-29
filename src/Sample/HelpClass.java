package Sample;

public class HelpClass extends NewClass{


    public HelpClass(String name, int money, double salary, boolean isCorrect) {
        super(name, money, salary, isCorrect);
    }

    @Override
    public String toString() {
        return "HelpClass{" +
                "money=" + money +
                ", salary=" + salary +
                '}';
    }
}
