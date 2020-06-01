
import java.util.Scanner;

public class PS2Player implements RetroPlayer{
    Scanner s = new Scanner(System.in);
    @Override
    public void playPS1(String juego) {
        
    }

    @Override
    public void playPS2(String juego) {
        System.out.println("Jugando juego " + juego + " de PS2");
        s.nextLine();
    }
}
