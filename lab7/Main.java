public class Main {
    public static void main(String[] args) {
        GeometricShapeFactory factory = GeometricShapeFactory.getInstance();
        
        Circle circle = factory.createCircle();
        Triangle isoscelesTriangle = factory.createIsoscelesTriangle();
        Triangle equilateralTriangle = factory.createEquilateralTriangle();
        Triangle rectangle = factory.createRectangle();
        Square square1 = factory.createSquare();
        Square square2 = factory.createSquare();
        
        // Você pode criar quantos quadrados quiser, mas apenas um círculo e três tipos de triângulos.
    }
}