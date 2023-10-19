package Entities;

public class GeometricShapeFactory {
    private static GeometricShapeFactory instance;
    
    private GeometricShapeFactory() {
    }
    
    public static GeometricShapeFactory getInstance() {
        if (instance == null) {
            synchronized (GeometricShapeFactory.class) {
                if (instance == null) {
                    instance = new GeometricShapeFactory();
                }
            }
        }
        return instance;
    }
    
    
    public Circle createCircle() {
        return new Circle();
    }
    
    public Triangle createIsoscelesTriangle() {
        return new Triangle("Isosceles");
    }
    
    public Triangle createEquilateralTriangle() {
        return new Triangle("Equilateral");
    }
    
    public Triangle createRectangle() {
        return new Triangle("Rectangle");
    }
    
    public Square createSquare() {
        return new Square();
    }
}