import java.util.ArrayList;

public abstract class Subject {
    protected final ArrayList<ObserverNoticia> seguidores = new ArrayList();
    public void agregarSeguidor(ObserverNoticia seguidor){
        if(!seguidores.contains(seguidor))
            seguidores.add(seguidor);
    }
    public void eliminarSeguidor(ObserverNoticia seguidor){
        seguidores.remove(seguidor);
    }
    public void notificarSeguidores(String noticia){
        for (ObserverNoticia seguidor : seguidores) {
            seguidor.update(noticia);
        }
    }
}
