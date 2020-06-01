
public class Descansado implements RunnerState{

    @Override
    public int correr() {
        System.out.println("Está descansado");
        return 40;
    }
    
}
