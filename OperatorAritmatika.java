import java.util.Scanner;

public class OperatorAritmatika {
    public static void main(String[] args){
        int angka1;
        int angka2;
        int hasil;

        Scanner keyboard= new Scanner(System.in);

        System.out.print("Input angka ke -1 = ");
        angka1=keyboard.nextInt();
        System.out.print ("Input angka ke -2 =  ");
        angka2=keyboard.nextInt();


        System.out.println ("==RESULT== ");
        //penjumlahan

        hasil =angka1+angka2;
        System.out.println("Hasil penjumlahan = "+hasil);

        //penkalian

        hasil =angka1*angka2;
        System.out.println("Hasil perkalian = "+hasil);

        //pembagian

        hasil =angka1/angka2;
        System.out.println("Hasil pembagian = "+hasil);

        //sisa bagi

        hasil =angka1%angka2;
        System.out.println("Hasil sisa bagi = "+hasil);

        
    }    
}
