
import java.util.Random;

public class Observador extends Persona{
    public Observador(SingleBanner banner, String nombre){
        super(banner, nombre);
        Random r = new Random();
        super.llave = r.nextInt(5000);
    }
}
