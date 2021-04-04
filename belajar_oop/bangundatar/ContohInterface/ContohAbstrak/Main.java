package belajar_oop.bangundatar.ContohInterface.ContohAbstrak;

public class Main {
       public static void main(String[]args){
           //membuat objek
           Shape segitiga = new Triangle(4,5);
           Shape lingkaran = new Circle(10);

           System.out.println("Luas segitiga "+segitiga.getArea());
           System.out.println("Luas lingkaran "+lingkaran.getArea());
       }
}
