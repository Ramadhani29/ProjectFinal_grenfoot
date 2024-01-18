import greenfoot.*;

public class Arena_Pemandangan extends AArena {
    
    public void performAction() {
        int health = 150;
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new CharacterSelection("Arena 1"));
        }
        // Mendapatkan posisi X saat ini
        int currentX = getX();
        
        
        if (currentX >= getWorld().getWidth() - 1) {
            setLocation(currentX - 1, getY());
        } else {
            
            if (currentX <= 0) {
                setLocation(currentX + 1, getY());
            } else {
                int randomDirection = Greenfoot.getRandomNumber(2) * 2 - 1; 
                setLocation(currentX + randomDirection, getY());
                }
            }
        }
    }

