
import java.util.Scanner;

public class PS4Player implements PSConsole {
    
    Scanner s = new Scanner(System.in);
    PSAdapter adapter;
    
    @Override
    public void play(String consola, String juego) {
        if(consola.equals("PS4")){
            System.out.println("Jugando juego " + juego + " de PS4");
            s.nextLine();
        }else{
            adapter = new PSAdapter(consola);
            adapter.play(consola, juego);
        }
    }
    
}
