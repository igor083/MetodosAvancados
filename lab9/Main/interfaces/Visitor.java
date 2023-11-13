package interfaces;

import entities.Circle;
import entities.Rectangle;
import entities.Trapezium;
import entities.Triangle;

public interface Visitor{
    Double visitRectangle(Rectangle rectangle);
    Double visitTriangle(Triangle triangle);
    Double visitCircle(Circle circle);
    Double visitTrapezium(Trapezium trapezium);
}