import java.io.Console;


public class InputConsole {
    public static void main(String[] args){

        String nama;
        int usia;

        //membbuat console
        Console con = System.console();

        //mengisi variabela nama da usia dengan console
        System.out.print("Inputkan nama : ");
        nama=con.readLine();
        System.out.print("Inputkan usia: ");
        usia= Integer.parseInt(con.readLine());

        //menampilkan isi varibel nama dan usia
        System.out.println("Nama kamu adalah: "+ nama);
        System.out.println("Saat ini berusia "+usia+"tahun");
    }
}
