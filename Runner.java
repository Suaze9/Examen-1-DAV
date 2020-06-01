
public class Runner {
    RunnerState estado;
    int distancia;
    int cansancio;
    
    public Runner(){
        estado = new Normal();
        distancia = 0;
        cansancio = 5;
    }
    
    public void correr(){
        int dist = estado.correr();
        System.out.println("Corrió " + dist + " metros");
        cansancio++;
        if(cansancio%5 == 0){
            actualizarCansancio();
        }
        distancia += dist;
        System.out.println("Distancia total: " + distancia);
    }
    
    public void descansar(){
        System.out.println("Descansó");
        cansancio--;
        if(cansancio%5 == 0){
            actualizarCansancio();
        }
        System.out.println("Distancia total: " + distancia);
    }
    
    private void actualizarCansancio(){
        if(cansancio <= 0){
            estado = new Descansado();
        }else if(cansancio == 5){
            estado = new Normal();
        }else if(cansancio == 10){
            estado = new Cansado();
        }else{
            estado = new MuyCansado();
        }
    }
}
