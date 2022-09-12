package day43_abstraction.language;

public class Speaking {
    public static void main(String[] args) {
        Spanish obj = new Spanish();
        obj.hello();
        obj.bye();
        English obj2 = new English();
        obj2.hello();
        obj2.bye();

    }
}
