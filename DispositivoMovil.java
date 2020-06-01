
public abstract class DispositivoMovil {
    TipoMovil tipo;
    
    public DispositivoMovil(TipoMovil tipo){
        this.tipo = tipo;
    }
    
    public TipoMovil getTipo(){
        return tipo;
    }
    
    @Override
    public abstract String toString();
    
}
