import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContohBufferReader {
    public static void main(String[] args) throws IOException{
        String nama ;

        //Membuat objeck inputstream
        InputStreamReader isr= new InputStreamReader(System.in);

        //membuat objek befferreader
        BufferedReader br = new BufferedReader(isr);
        
        //Mengisi variabel nama dengan bufferreader
        System.out.print("Inputkan nama : ");
        nama=br.readLine();

        //tampilkan outpu isi variabel nama
        System.out.println("Nama kamu adalah" + nama);
    } 
}
