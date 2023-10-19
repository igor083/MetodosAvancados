

import Entities.Circle;
import Entities.GeometricShapeFactory;
import Entities.Square;
import Entities.Triangle;

public class Main {
    public static void main(String[] args) {
        GeometricShapeFactory factory = GeometricShapeFactory.getInstance();
        
        Circle circle = factory.createCircle();
        Triangle isoscelesTriangle = factory.createIsoscelesTriangle();
        Triangle equilateralTriangle = factory.createEquilateralTriangle();
        Triangle rectangle = factory.createRectangle();
        Square square1 = factory.createSquare();
        Square square2 = factory.createSquare();
        
    }
}