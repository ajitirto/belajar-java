package belajar_oop.Jframe;

import javax.swing.JFrame;


public class FirstWindow {
    
    public static void main(String[] args){
        //membuat objek jendela
        JFrame myWindow = new JFrame();

        //berikan judul pada jendela
        myWindow.setTitle("Jendela program");

        //tentukan ukuran jendela
        myWindow.setSize(400,200);

        //tampilkan jendela ke layar
        myWindow.setVisible(true);
    }
}
