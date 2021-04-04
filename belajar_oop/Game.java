package belajar_oop;

public class Game {
    public static void main(String[] args){
        //Membuat objek player
        Player aji = new Player();

        //mengisi atribut platyer
        aji.name="ajitirto";
        aji.speed = 78;
        aji.healthPoin=100;

        //menjalankan method
        aji.run();
        

        if(aji.isDead()){
            System.out.println("Game Over");
        }

    }
    
}
