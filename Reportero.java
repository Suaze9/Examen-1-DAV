
public class Reportero extends Subject{
    public Reportero(){}

    public void nuevaNoticia(String noticia){
        super.notificarSeguidores(noticia);
    }
    
}
