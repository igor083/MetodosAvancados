package entities;

import interfaces.ConcreteElement;
import interfaces.Visitor;

public class Trapezium implements ConcreteElement {

    private Double smallestBase;
    private Double biggestBase;
    private Double side1;
    private Double side2;
    private Double height;

    public Trapezium(Double smallestBase, Double biggestBase, Double side1, Double side2, Double height) {
        this.smallestBase = smallestBase;
        this.biggestBase = biggestBase;
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
    }

    public Trapezium() {
    }

    @Override
    public void acceptVisit(Visitor visitor) {
        Double result = visitor.visitTrapezium(this);

        if (result != 0) {
            System.out.println(result);
        }
    }

    @Override
    public String toString() {
        return "Trapezium{" +
                "smallestBase=" + smallestBase +
                ", biggestBase=" + biggestBase +
                ", side1=" + side1 +
                ", side2=" + side2 +
                ", height=" + height +
                '}';
    }
}