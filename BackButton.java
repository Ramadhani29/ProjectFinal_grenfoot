import greenfoot.*; 

public class BackButton extends Button {

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new MainMenu());
        }
    }
}
