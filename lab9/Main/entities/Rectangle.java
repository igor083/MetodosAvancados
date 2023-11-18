package entities;

import interfaces.ConcreteElement;
import interfaces.Visitor;
public class Rectangle implements ConcreteElement {

    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle() {
    }

    @Override
    public void acceptVisit(Visitor visitor) {
        Double result = visitor.visitRectangle(this);

        if (result != 0.0) {
            System.out.println(result);
        }
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
