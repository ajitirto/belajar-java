package belajar_oop.bangundatar.ClassAnonymous;

public class Button {
    private Clickable action;

    void setClickAction (Clickable action){
        this.action = action;

    }
    void doClick(){
        action.onClick();
    }
    
}
