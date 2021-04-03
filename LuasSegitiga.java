import java.util.Scanner;
public class LuasSegitiga {
    public static void main(String[] args){
        //deklarasi
        Double luas;
        int alas, tinggi;

        //membuat scannner baru
        Scanner baca = new Scanner(System.in);

        //input
        System.out.println("==Program hitung luas segitiga ==");
        System.out.print("Input alas : ");
        alas=baca.nextInt();
        System.out.print("Input tinggi: ");
        tinggi= baca.nextInt();

        //proses 
        luas=Double.valueOf((alas*tinggi)/2);
        //output
        System.out.println("Luas segitiga = "+luas);

    }
}
