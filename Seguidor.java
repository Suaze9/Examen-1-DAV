import java.util.ArrayList;

public class Seguidor extends ObserverNoticia {
    private final ArrayList<String> noticias;
    
    public Seguidor(){
        noticias = new ArrayList();
    }
    
    public String siguienteNoticia(){
        String noticia;
        if(noticias.size() > 0){
            noticia = noticias.get(0);
            noticias.remove(0);
        }else{
            noticia = "No hay mas noticias nuevas!";
        }
        return noticia;
    }
    
    public void update(String noticia){
        noticias.add(noticia);
    }
}
