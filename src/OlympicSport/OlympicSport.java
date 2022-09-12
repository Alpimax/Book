package OlympicSport;

public class OlympicSport {
//    Create a class OlympicSport
//
//	instance variables
//		- name (String)
//		- participants (int)
//
//	constructor:
//		- initialize all fields
//
//	methods:
//		- compete(), toString()
//
//		override compete in sub classes

    String name;
    int participants;

    public OlympicSport(String name, int participants) {
        this.name = name;
        this.participants = participants;
    }

    public void compete(){
        System.out.println();
    }

    @Override
    public String toString() {
        return "OlympicSport{" +
                "name='" + name + '\'' +
                ", participants=" + participants +
                '}';
    }
}
