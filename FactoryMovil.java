
public class FactoryMovil {
    public static DispositivoMovil getMovil(TipoMovil tipo){
        switch(tipo){
            case TABLET: {
                return new Tablet();
            }
            case TELEFONO: {
                return new Telefono();
            }
            case LAPTOP: {
                return new Laptop();
            }
            default:{
                return null;
            }
        }
    }
}
