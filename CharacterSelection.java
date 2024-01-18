import greenfoot.*;

public class CharacterSelection extends World {

    private String selectedArena;

    public CharacterSelection(String arena) {
        super(600, 600, 1);
        selectedArena = arena;
        prepare();
    }

    private void prepare() {
        Ayam_Kampung ayam1 = new Ayam_Kampung();
        addObject(ayam1, getWidth() / 4, getHeight() / 2);

        Ayam_Kate ayam2 = new Ayam_Kate();
        addObject(ayam2, getWidth() / 2, getHeight() / 2);

        Ayam_Jago ayam3 = new Ayam_Jago();
        addObject(ayam3, getWidth() - getWidth() / 4, getHeight() / 2);

        int textHeightOffset = 200;
        showText("Pilih Karakter", getWidth() / 2, ayam1.getY() - ayam1.getImage().getHeight() / 2 - textHeightOffset);
        //showText("Arena: " + selectedArena, getWidth() / 2, getHeight() / 2 - 50);
    }

    public void act() {
        if (Greenfoot.mouseClicked(null)) {
            Actor clickedActor = Greenfoot.getMouseInfo().getActor();
            if (clickedActor instanceof Ayam_Kampung || clickedActor instanceof Ayam_Kate || clickedActor instanceof Ayam_Jago) {
                if (selectedArena.equals("Arena 1")) {
                    Greenfoot.setWorld(new ChickenWorld(clickedActor));
                } else if (selectedArena.equals("Arena 2")) {
                    Greenfoot.setWorld(new ChickenWorld2(clickedActor));
                } else if (selectedArena.equals("Arena 3")) {
                    Greenfoot.setWorld(new ChickenWorld3(clickedActor));
                }
            }
        }
    }
}
