package belajar_oop;

public class Player {
    //definisi atribut
    String name;
    int speed;
    int healthPoin;

    //definisi method run
    void run(){
        System.out.println(name  + "  isrunning");
        System.out.println("Speed "+speed);
    }
    //definisi method isDead
    boolean isDead(){
        if(healthPoin<=0) return true;
        return false;
    }
    public void run() {
    }
}

