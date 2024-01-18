import greenfoot.*; 

public class AboutUsScreen extends World{
    public AboutUsScreen() {
        super(600, 400, 1);
        prepare();
    }

    private void prepare() {
        addObject(new BackButton(), getWidth() / 2, getHeight() - 30);
        showText("About Us:\nMuhammad ageng zayem wahid\nKhairil Hakim\nMoch Ihsan Ramadhani!", getWidth() / 2, getHeight() / 2);
    }
}
