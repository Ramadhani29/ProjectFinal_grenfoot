import greenfoot.*;

public class ChickenWorld extends World {

    public ChickenWorld(Actor chosenChicken) {
        super(600, 600, 1);
        prepare(chosenChicken);
    }

    private void prepare(Actor chosenChicken) {
        PlayerChicken playerChicken = new PlayerChicken(chosenChicken);
        addObject(playerChicken, getWidth() / 4, getHeight() / 2);

        EnemyChicken enemyChicken = new EnemyChicken();
        addObject(enemyChicken, getWidth() - getWidth() / 4, getHeight() / 2);

        // Menambahkan obstacle
        //Obstacle obstacle = new Obstacle();
        //addObject(obstacle, getWidth() / 2, getHeight() / 2);

        // Menambahkan bom
        //Bomb bomb = new Bomb();
        //addObject(bomb, Greenfoot.getRandomNumber(getWidth()), 0);
    }
}
