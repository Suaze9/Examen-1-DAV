
public class PSAdapter implements PSConsole{

    RetroPlayer retroPlayer;
    
    public PSAdapter(String console){
        if(console.equals("PS1")){
            retroPlayer = new PS1Player();
        }else{
            retroPlayer = new PS2Player();
        }
    }
    
    @Override
    public void play(String consola, String juego) {
        if(consola.equals("PS1")){
            retroPlayer.playPS1(juego);
        }else{
            retroPlayer.playPS2(juego);
        }
    }
    
}
