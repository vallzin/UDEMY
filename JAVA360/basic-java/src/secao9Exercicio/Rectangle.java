package secao9Exercicio;

public class Rectangle {

    private double width;
    private double height;
    private double square;

    public Rectangle(double base, double altura) {
        this.width = base;
        this.height = altura;
        square = width * height;
    }

    public Rectangle(double width){
        this(width, width);
    }

    public double square(){
        return square;
    }
}
