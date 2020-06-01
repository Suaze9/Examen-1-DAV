
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Runner corredor = new Runner();
        int resp = 0;
        
        do{
            System.out.println("1. Correr");
            System.out.println("2. Descansar");
            System.out.println("3. Salir");
            resp = s.nextInt();
            s.nextLine();
            switch(resp){
                case 1:{
                    corredor.correr();
                    break;
                }
                case 2:{
                    corredor.descansar();
                    break;
                }
                case 3:{
                    break;
                }
                default:{
                    System.out.println("Opción no válida");
                }
            }
            
        }while(resp != 3);
        
    }
}
