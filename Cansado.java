
public class Cansado implements RunnerState{

    @Override
    public int correr() {
        System.out.println("Está cansado");
        return 20;
    }
    
}
