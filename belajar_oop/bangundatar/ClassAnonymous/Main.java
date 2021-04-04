package belajar_oop.bangundatar.ClassAnonymous;



public class Main {
    //membuat variabel di dalam class
    static String title ="Tutorial Anonymous Class";
    public static void main(String[] args){
       
       //membuat variabel di dalam method main
       String name="aji kode";
       
        Button btn = new Button();
        
        
        //membuat class nonymous untuk implementasi interface
        btn.setClickAction(new Clickable() {
            //membuat variabel di dalam class anonymous 
            String message ="Belajar anonymous class di java";
            
            //membuat class anonymous untuk implementasi interface 
            @Override
            public void onClick() {
                System.out.println("Tombol sudah diklik");
                System.out.println("Nice");
                //mengkses variabel 
                System.out.println("Hello "+name);
                System.out.println(title);
                System.out.println(message);
            }
        });
        //mencoba klik tombol
        btn.doClick();
        }
    }

        
    
    

