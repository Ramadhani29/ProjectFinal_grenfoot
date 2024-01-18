import greenfoot.*;

public class Bomb extends Actor {
    private static final int INITIAL_Y = 0;  // Posisi awal bom di atas layar

    public Bomb() {
        GreenfootImage image = new GreenfootImage("bom.png");
        setImage(image);
    }

    public void act() {
        fall();
    }

    private void fall() {
        // Jika bom mencapai batas bawah layar, kembalikan ke posisi awal di atas layar
        if (getY() >= getWorld().getHeight() - 1) {
            setLocation(getX(), INITIAL_Y);
        } else {
            // Jika belum mencapai batas bawah, biarkan bom terus jatuh
            setLocation(getX(), getY() + 1);
        }
    }
}
