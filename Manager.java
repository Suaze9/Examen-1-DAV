
import java.util.Random;

public class Manager extends Persona{
    public Manager(SingleBanner banner, String nombre){
        super(banner, nombre);
        Random r = new Random();
        super.llave = r.nextInt(5000) + 5001;
    }
}
