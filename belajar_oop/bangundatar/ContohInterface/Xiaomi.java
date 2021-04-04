package belajar_oop.bangundatar.ContohInterface;

public class Xiaomi implements Phone{
    private int volume;
    private boolean isPowerOn;

    public Xiaomi(){
        //set volume awl
        this.volume = 50;
    }
    @Override
    public void powerOn() {
        isPowerOn =true;
        System.out.println("Hndphone menyala . . \n");
        System.out.println("Selamatn dantang di XIAOMI");
    }
    @Override
    public void powerOff() {
        isPowerOn= false;
        System.out.println("Handphone dimatikan\n");
    }
    @Override
    public void volumeUp() {
        if(isPowerOn){
            if(this.volume == MAX_VOLUME){
                System.out.println("Volume FULL");
                System.out.println("sudah "+this.getVolume() +"%");
            }else{
                this.volume +=10;
                System.out.println("Volume sekarag "+this.getVolume());
            }
        }else{
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
    }
    @Override
    public void volumeDown() {
        if(isPowerOn){
            if(this.volume == MIN_VOLUME){
                System.out.println("Volume = 0 %");
                 
            }else{
                this.volume -=10;
                System.out.println("Volume sekarag "+this.getVolume());
            }
        }else{
            System.out.println("Nyalakan dulu donk HP-nya!!");
        }
        
    }
    public int getVolume(){
        return this.volume;
    }


    
}
