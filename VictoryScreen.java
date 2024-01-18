import greenfoot.*; 

public class VictoryScreen extends World {

    public VictoryScreen() {
        super(600, 600, 1);
        prepare();
    }

    private void prepare() {
        addObject(new ExitButton(), getWidth() / 2, getHeight() - 30);
        showText("Victory!", getWidth() / 2, getHeight() / 2);
    }
}
