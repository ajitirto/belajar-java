import java.util.Scanner;

public class DataAnggota {
    public static void main(String[] args){
        //deklaresi variable
        String nama, alamat;
        int usia,gaji;

        //membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        //Tampil output ke server
        System.out.println("pendataan anggota Software Engineer python");
        System.out.print("Nama Anggota  ");
        nama = keyboard.nextLine();

        System.out.print("Alamat: ");
        alamat = keyboard.nextLine();

        System.out.print("Usia: ");
        usia = keyboard.nextInt();

        System.out.print("Gaji: ");
        gaji=keyboard.nextInt();

        //menampilkan apa yang sudah simpan di variavel 
        System.out.println("=============");
        System.out.println("Nama KAryawan: "+ nama);
        System.out.println("Alamat : "+ alamat);
        System.out.println("Usia: "+ usia + " Tahun");
        System.out.println("Gaji Rp : "+ gaji);
    }
}
