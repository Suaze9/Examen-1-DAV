
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int resp = 0;
        PS4Player PS4 = new PS4Player();
        
        do{
            System.out.println("1. Jugar juego de PS1");
            System.out.println("2. Jugar juego de PS2");
            System.out.println("3. Jugar juego de PS4");
            System.out.println("4. Salir");
            resp = s.nextInt();
            s.nextLine();
            switch(resp){
                case 1:{
                    System.out.println("Ingrese titulo del juego:");
                    String juego = s.nextLine();
                    PS4.play("PS1", juego);
                    break;
                }
                case 2:{
                    System.out.println("Ingrese titulo del juego:");
                    String juego = s.nextLine();
                    PS4.play("PS2", juego);
                    break;
                }
                case 3:{
                    System.out.println("Ingrese titulo del juego:");
                    String juego = s.nextLine();
                    PS4.play("PS4", juego);
                    break;
                }
                case 4:{
                    break;
                }
                default:{
                    System.out.println("Opción no válida");
                }
            }
            
        }while(resp != 4);
        
    }
}
