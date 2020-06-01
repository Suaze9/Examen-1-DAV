
public abstract class Persona {
    protected String nombre;
    protected int llave;
    private final SingleBanner banner;
    
    public Persona(SingleBanner banner, String nombre){
        this.banner = banner;
        this.nombre = nombre;
        this.llave = 0;
    }
    
    public String verBanner(){
        return banner.verBanner();
    }
    
    public boolean modificarBanner(String banner){
        return this.banner.modificarBanner(banner, this.llave);
    }
    
    public String toString(){
        return "Nombre: " + this.nombre + " Llave: " + this.llave;
    }
    
}
