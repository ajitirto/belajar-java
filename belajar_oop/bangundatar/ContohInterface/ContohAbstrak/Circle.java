package belajar_oop.bangundatar.ContohInterface.ContohAbstrak;

public class Circle extends Shape {
    private float radius;

    public Circle(float radius){
        this.radius =radius;
    }
    @Override
    float getArea(){
        return (float)(Math.PI *radius*radius);
    }
}
