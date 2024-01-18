import greenfoot.*;

public class PlayerChicken extends Actor {
    //private int health = 100;
    private int score = 0;

    private GreenfootSound shootSound = new GreenfootSound("laser.mp3");

    public PlayerChicken(Actor chosenChicken) {
        setImage(chosenChicken.getImage());
    }

    public void act() {
        moveAround();
        checkForAttack();
        displayStatus();
    }

    private void moveAround() {
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 2);
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + 2);
        }
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - 2, getY());
        }
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + 2, getY());
        }
    }

    private void checkForAttack() {
        if (Greenfoot.isKeyDown("space")) {
            attack();
            playShootSound();
        }
    }

    private void attack() {
        Projectile projectile = new Projectile();
        getWorld().addObject(projectile, getX(), getY());
    }
    
    public void addScore(int points) {
        score += points;
    }

    private void displayStatus() {
        if (getWorld() instanceof ChickenWorld) {
            int health = 150;
            ChickenWorld chickenWorld = (ChickenWorld) getWorld();
            chickenWorld.showText("Player HP: " + health, 100, 20);
            chickenWorld.showText("Score: " + score, 500, 20);
        }else if (getWorld() instanceof ChickenWorld2) {
            int health = 200;
            ChickenWorld2 chickenWorld = (ChickenWorld2) getWorld();
            chickenWorld.showText("Player HP: " + health, 100, 20);
            chickenWorld.showText("Score: " + score, 500, 20);
        }else if(getWorld() instanceof ChickenWorld3) {
            int health = 300;
            ChickenWorld3 chickenWorld = (ChickenWorld3) getWorld();
            chickenWorld.showText("Player HP: " + health, 100, 20);
            chickenWorld.showText("Score: " + score, 500, 20);
    }
}

    private void playShootSound() {
        shootSound.stop();
        shootSound.play();
    }
}
