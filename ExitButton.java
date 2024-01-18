import greenfoot.*; 

public class ExitButton extends Button {

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new MainMenu());
        }
    }
}
