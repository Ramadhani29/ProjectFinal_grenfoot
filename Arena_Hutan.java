import greenfoot.*;

public class Arena_Hutan extends AArena {

    private double angle = 0; // Sudut awal
    private double angularSpeed = 0.02; // Kecepatan perputaran

    public void performAction() {
        int health = 300;
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new CharacterSelection("Arena 3"));
        }
    turn(3);
    move(2);
    }
}
