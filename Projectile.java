import greenfoot.*;

public class Projectile extends Actor {

    private int speed = 1;

    public void act() {
        move(speed);
        checkForCollision();
    }

    private void checkForCollision() {
        if (isAtEdge()) {
            getWorld().removeObject(this);
        } else {
            EnemyChicken enemy = (EnemyChicken) getOneIntersectingObject(EnemyChicken.class);
            if (enemy != null) {
                enemy.takeDamage(10);
                // Tambah skor pada pemain
                PlayerChicken player = (PlayerChicken) getWorld().getObjects(PlayerChicken.class).get(0);
                player.addScore(50); // Gantilah dengan jumlah skor yang diinginkan
                getWorld().removeObject(this);
            }
        }
    }
}
