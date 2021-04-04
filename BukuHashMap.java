import java.util.HashMap;
import java.util.Map;

public class BukuHashMap {
    public static void main(String[] args){
        //membuat objek hashmap
        HashMap<String,  buku > books= new HashMap<String, buku>();
        //membuat objek buku
        buku bukuJava= new buku("Tutorial Java", "Petani Kode");
        buku bukuKotlin = new buku("Pemrograman Kotlin", "Petani Kode");
        buku bukuAndroid = new buku("Pemrograman Android", "Petani Kode");
        
        // mengisi objek hashmap dengan objek buku
        books.put("java", bukuJava);
        books.put("kotlin", bukuKotlin);
        books.put("android", bukuAndroid);
        
        // cetak semua buku
        for(Map.Entry b: books.entrySet()){
            buku buku = (buku) b.getValue();
            System.out.println(b.getKey() + ": "+ buku.getTitle());
        }
        
    }

    }
    
