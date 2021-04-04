package belajar_oop.bangundatar.ContohInterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //membuat ibjek 
        Phone redmiNoted = new Xiaomi();
        PhoneUser dian = new PhoneUser(redmiNoted);

        //coba nyalakan hp-nya
        dian.turnOnThePhone();

        //kita buat dalam program
        Scanner input = new Scanner(System.in);
        String aksi;

        while (true){
            System.out.println("===Aplikasi inteface ===");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matika HP");
            System.out.println("[3] Perbesar volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("-------------------------");
            System.out.print("Pilih aksi> ");
            aksi= input.nextLine();

            if(aksi.equalsIgnoreCase("1")){
                dian.turnOnThePhone();
            }else if(aksi.equalsIgnoreCase("2")){
                dian.turnOfThePhone();
            }else if(aksi.equalsIgnoreCase("3")){
                dian.makePhoneLouder();
            }else if(aksi.equalsIgnoreCase("4")){
                dian.makePhoneSilent();
            }else if(aksi.equalsIgnoreCase("0")){
                System.exit(0);
            }else{
                System.out.println("Kamu meilih aksi yang salah\n");
            }

        }
    }
    
}
