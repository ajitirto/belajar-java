package belajar_oop.Jframe;

import javax.swing.JFrame;
public class MainWindow extends JFrame{

    public MainWindow(){
        this.setTitle("Jendela Utama");
        this.setSize(600,3200);

    }
    public static void main(String[] args){
        MainWindow mWindow=new MainWindow();
        mWindow.setVisible(true);
    }

    
}
