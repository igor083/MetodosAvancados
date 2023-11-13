import figuras.Circle;
import figuras.Rectangle;
import interfaces.VisitorIF;
import visitors.visitorCalcularArea;
import visitors.visitorDesenhar;

public class main {
    public static void main(String[] args) {
        VisitorIF visitorArea = new visitorCalcularArea();
        VisitorIF visitorDesenho = new visitorDesenhar();

        Circle circle = new Circle(15);
        Rectangle rectangle = new Rectangle(20, 40);

        circle.aceitaVisita(visitorDesenho);
        circle.aceitaVisita(visitorArea);

        rectangle.aceitaVisita(visitorDesenho);
    }
}
