package Entities;


public class Triangle {
    private String type;
    
    public Triangle(String type) {
        this.type = type;
    }
    
    @Override
    public String toString() {
        return type + " triângulo criado";
    }
}