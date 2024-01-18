import greenfoot.*; 

public class EnemyChicken extends Actor {
    private int health = 1000;
    private boolean dead = false;

    public void act() {
        moveRandomly();
        checkForWin();
    }

    public void takeDamage(int damage) {
        if (!dead) { 
            health -= damage;
            if (health <= 0) {
                dead = true;
                getWorld().removeObject(this); 
                Greenfoot.setWorld(new VictoryScreen());
            }
        }
    }

    public boolean isDead() {
        return dead;
    }

    private void moveRandomly() {
        if (!dead) { 
            int randomDirection = Greenfoot.getRandomNumber(4);
            switch (randomDirection) {
                case 0: // Up
                    setLocation(getX(), getY() - 2);
                    break;
                case 1: // Down
                    setLocation(getX(), getY() + 2);
                    break;
                case 2: // Left
                    setLocation(getX() - 2, getY());
                    break;
                case 3: // Right
                    setLocation(getX() + 2, getY());
                    break;
            }
        }
    }

    private void checkForWin() {
        if (isTouching(PlayerChicken.class) && !dead) {
            Greenfoot.stop();
        }
    }
}
