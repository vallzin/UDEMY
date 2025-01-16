package secao9Exercicio;

public class Lamp {

    private boolean on;

    public Lamp(boolean on) {
        this.on = on;
    }

    public void turnOn(){
        on = true;
    }

    public void turnOff(){
        on = false;
    }

    public void showState(){
        System.out.println("Lâmpada " + (on ? "Ligada" : "Desligada"));
    }
}
