package OlympicSport;

public class Soccer extends OlympicSport {
//   Create a class Soccer
//
//	child class of OlympicSport
//
//	constructor: set name and participants variables
//
//	methods:
//		compete(): Print Playing a soccer game

    public Soccer(String name, int participants) {
        super(name, participants);
    }

    @Override
    public void compete() {
        System.out.println("Playing a soccer game ");
    }
}
