package entities;

import interfaces.ConcreteElement;
import interfaces.Visitor;

public class Circle implements ConcreteElement {

    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    public void acceptVisit(Visitor visitor) {
        Double result = visitor.visitCircle(this);

        if (result != 0.0) {
            System.out.println(result);
        }
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}