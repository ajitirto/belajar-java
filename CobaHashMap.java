import java.util.HashMap;

public class CobaHashMap {
    public static void main(String[] args){
        //membuat objeck hashmap
        HashMap<Integer, String> days = new HashMap<Integer,String>();

        //mengisi nilai ke objek days
        days.put(1,"minggu");
        days.put(2,"senin");
        days.put(3,"selasa");
        days.put(4,"rabu");
        days.put(5,"kamis");
        days.put(6,"jumat");
        days.put(7,"sabtu");

        //mencetak semua isi dari objek days
        System.out.println("Isi objek days:"+days);
        //mengambil hari senin
        System.out.println("Hari kedua:"+days.get(2));

        //menghapis semua hari 
       // days.clear();
        //System.out.println("Isi objek days "+days);

        //mengubah hari rabu menjadi rebo
        days.replace(4,"rebo");

        //mencetak semua isi dari objek days
        System.out.println("Isi objek days: "+days);
    }
}
