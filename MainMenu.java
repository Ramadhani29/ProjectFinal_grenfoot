import greenfoot.*;

public class MainMenu extends World {

    public MainMenu() {
        super(600, 600, 1);
        prepare();
    }

    private void prepare() {
        addObject(new StartButton(), getWidth() / 2, getHeight() / 2);
        addObject(new AboutUsButton(), getWidth() / 2, getHeight() / 2 + 50);
    }
}
