package secao9Exercicio;

public class ProgramLamp {
    public static void main(String[] args) {

        Lamp l1 = new Lamp(true);
        l1.showState();
        l1.turnOff();
        l1.showState();

        System.out.println("-------------------");

        Lamp l2 = new Lamp(false);
        l2.showState();
        l2.turnOn();
        l2.showState();
    }
}
