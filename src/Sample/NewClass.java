package Sample;

public class NewClass {

    private String name ;
    int money ;
    double salary;
    boolean isCorrect ;

    public NewClass(String name, int money, double salary, boolean isCorrect) {
        this.name = name;
        this.money = money;
        this.salary = salary;
        this.isCorrect = isCorrect;
    }

    public  void method(){
        System.out.println();
    }


    @Override
    public String toString() {
        return "NewClass{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", salary=" + salary +
                ", isCorrect=" + isCorrect +
                '}';
    }
}
