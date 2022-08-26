package Day39_Inheritance.Computer;

public class Computer {
    String os;
    int memory;

    public Computer(String os, int memory) {
        this.os = os;
        this.memory = memory;

    }

    public String toString() {
        return "Computer{" +
                "os='" + os + '\'' +
                ", memory=" + memory +
                '}';
    }
}
