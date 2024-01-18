import greenfoot.*;

public class ChickenWorld3 extends World {

    public ChickenWorld3(Actor chosenChicken) {
        super(600, 600, 1);
        prepare(chosenChicken);
    }

    private void prepare(Actor chosenChicken) {
        PlayerChicken playerChicken = new PlayerChicken(chosenChicken);
        addObject(playerChicken, getWidth() / 4, getHeight() / 2);

        EnemyChicken enemyChicken = new EnemyChicken();
        addObject(enemyChicken, getWidth() - getWidth() / 4, getHeight() / 2);
    }
}
