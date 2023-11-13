package visitors;
import figuras.Circle;
import figuras.Rectangle;
import figuras.Triangle;
import interfaces.VisitorIF;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class visitorDesenhar extends JFrame implements VisitorIF   {
    @Override
    public double visitaCirculo(Circle circle) {
        return this.MostrarImagem(
            "Raio do circulo: "+circle.getRaio(), 
            "circle.png", 
            circle.getRaio()
        );
    }

    @Override
    public double visitaRetangulo(Rectangle rectangle) {
        return this.MostrarImagem(
            "Tamanho retangulo: "+rectangle.getAltura()+"X"+rectangle.getLargura(), 
            "retangulo.png", 
            rectangle.getAltura()
        );
    }

    @Override
    public double visitaTriangulo(Triangle triangle) {
        return this.MostrarImagem(
            "Triangulo medidas: "+triangle.getAltura()+"X"+triangle.getBase(), 
            "triangle.png", 
            triangle.getAltura()
        );
    }

    public double MostrarImagem(String title, String imgName, double data) {
        JLabel label = new JLabel(new ImageIcon("imgs/"+imgName));

        add(label);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setTitle(title);

        setVisible(true);

        return data;
    }
}

