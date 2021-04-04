package belajar_oop.bangundatar.ClassAnonymous.AplikasiFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BacaFile{
    
    public static void main(String[] args){
        String fileName= "puisi.txt";

        try{
            //membaca fle
            File myFile = new File(fileName);
            Scanner fileReader = new Scanner(myFile);

            //cetak isi file
            while(fileReader.hasNextLine()){
                String data = fileReader.nextLine();
                System.out.println(data);
            }
        } catch(FileNotFoundException e ){
            System.out.println("Terhadi kesalahan "+ e.getMessage());
            e.printStackTrace();
        }
    }
}
