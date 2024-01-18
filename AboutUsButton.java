import greenfoot.*; 

public class AboutUsButton extends Button {

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new AboutUsScreen());
        }
    }
}
