
import java.util.ArrayList;

public class Casa {
    private final ArrayList<Habitacion> habitaciones;
    
    public Casa(){
        habitaciones = new ArrayList();
    }
    
    public void agregarHabitacion(Habitacion habitacion){
        habitaciones.add(habitacion);
    }
    
    public String verCasa(){
        String reporte = "";
        
        for (Habitacion habitacion : habitaciones) {
            reporte += habitacion.tipo +
                    ": " +
                    habitacion.ancho +
                    "x" +
                    habitacion.largo +
                    "\n";
        }
        return reporte;
    }
}
