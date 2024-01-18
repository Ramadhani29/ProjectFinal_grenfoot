import greenfoot.*;

public class Arena_Api extends AArena {

    private int direction = 1; 
    private int speed = 1; // Kecepatan gerakan

    public void performAction() {
        int health = 200;
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new CharacterSelection("Arena 2"));
        }
        turn(-3);
        move(2);
    }
}
