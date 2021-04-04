package belajar_oop.bangundatar.ContohInterface;

public class PhoneUser {
    private Phone phone;

    public PhoneUser(Phone phone){
        this.phone=phone;
    }
    void turnOnThePhone(){
        this.phone.powerOn();
    }
    
    void turnOfThePhone(){
        this.phone.powerOff();
    }
    
    void makePhoneLouder(){
        this.phone.volumeUp();
    }
    
    void makePhoneSilent(){
        this.phone.volumeDown();
    }
    
}
