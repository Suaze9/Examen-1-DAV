
import java.util.Scanner;

public class PS1Player implements RetroPlayer{
    Scanner s = new Scanner(System.in);
    @Override
    public void playPS1(String juego) {
        System.out.println("Jugando juego " + juego + " de PS1");
        s.nextLine();
    }

    @Override
    public void playPS2(String juego) {
        
    }
    
}
