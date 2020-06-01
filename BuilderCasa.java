
public class BuilderCasa {
    public static Casa buildCasaGrande(){
        Casa casa = new Casa();
        casa.agregarHabitacion(new Dormitorio(5, 10));
        casa.agregarHabitacion(new Dormitorio(7, 12));
        casa.agregarHabitacion(new Dormitorio(10, 12));
        casa.agregarHabitacion(new Dormitorio(12, 15));
        casa.agregarHabitacion(new Bano(3, 3));
        casa.agregarHabitacion(new Bano(5, 7));
        casa.agregarHabitacion(new Bano(10, 10));
        casa.agregarHabitacion(new Bano(7, 10));
        casa.agregarHabitacion(new Bano(5, 5));
        casa.agregarHabitacion(new Sala(10, 10));
        casa.agregarHabitacion(new Sala(10, 15));
        casa.agregarHabitacion(new Cocina(7, 10));
        casa.agregarHabitacion(new Cocina(10, 10));
        casa.agregarHabitacion(new Comedor(6,12));
        casa.agregarHabitacion(new Comedor(10,12));
        casa.agregarHabitacion(new Comedor(8,8));
        return casa;
    }
    
    public static Casa buildCasaMediana(){
        Casa casa = new Casa();
        casa.agregarHabitacion(new Dormitorio(5, 10));
        casa.agregarHabitacion(new Dormitorio(7, 12));
        casa.agregarHabitacion(new Bano(3, 3));
        casa.agregarHabitacion(new Bano(5, 7));
        casa.agregarHabitacion(new Bano(5, 5));
        casa.agregarHabitacion(new Sala(10, 10));
        casa.agregarHabitacion(new Cocina(5, 10));
        casa.agregarHabitacion(new Comedor(6,12));
        return casa;
    }
    
    public static Casa buildCasaPequena(){
        Casa casa = new Casa();
        casa.agregarHabitacion(new Dormitorio(5, 10));
        casa.agregarHabitacion(new Bano(3, 3));
        casa.agregarHabitacion(new Sala(7, 10));
        casa.agregarHabitacion(new Cocina(4, 4));
        return casa;
    }
}
