import greenfoot.*;

public class Arena extends World {


    public Arena() {
        super(600, 600, 1);
        prepare();
        arena1();
        arena2();
        arena3();
    }

    private void prepare() {
        showText("SILAHKAN PILIH ARENA : ", 300, 100);
        
    }
    
    private void arena1(){
        Arena_Pemandangan arena1 = new Arena_Pemandangan();
        addObject(arena1, 132, 300);
        showText("ARENA", 130, 350);
        showText("PEMANDANGAN ", 130, 370);

    }
    
    private void arena2(){
        Arena_Api arena2 = new Arena_Api();
        addObject(arena2, 288, 300);
        showText("ARENA", 290, 350);
        showText("API", 290, 370);
       
    }
    
    private void arena3(){
        Arena_Hutan arena3 = new Arena_Hutan();
        addObject(arena3, 455, 300);
        showText("ARENA", 470, 350);
        showText("HUTAN", 470, 370);
       
    }
}