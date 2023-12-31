package entities;

import interfaces.ConcreteElement;
import interfaces.Visitor;

public class Triangle implements ConcreteElement{

    private Double side1;
    private Double side2;
    private Double side3;
    private Double base;
    private Double height;

    public Triangle(Double side1, Double side2, Double side3, Double base, Double height) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.base = base;
        this.height = height;
    }

    public Triangle() {
    }

    @Override
    public void acceptVisit(Visitor visitor) {
        Double result = visitor.visitTriangle(this);

        if (result != 0) {
            System.out.println(result);
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", base=" + base +
                ", height=" + height +
                '}';
    }
}