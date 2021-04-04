package belajar_oop;

class Senjata{
    //atribut
    String nama;
    int jumlahPeluru;

    //method 
    void tembak(){
        jumlahPeluru--;
    }
    void reload(){
        jumlahPeluru=300;
    }
}