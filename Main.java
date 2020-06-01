
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int resp = 0;
        ArrayList<Seguidor> seguidores = new ArrayList();
        Reportero reportero = new Reportero();
        
        do{
            System.out.println("1. Crear Seguidor");
            System.out.println("2. Seguir Reportero");
            System.out.println("3. Crear noticia");
            System.out.println("4. Ver noticia");
            System.out.println("5. Salir");
            resp = s.nextInt();
            s.nextLine();
            switch(resp){
                case 1:{
                    seguidores.add(new Seguidor());
                    System.out.println("Seguidor agregado!");
                    break;
                }
                case 2:{
                    for (int i = 0; i < seguidores.size(); i++) {
                        System.out.println("Seguidor " + i);
                    }
                    System.out.println("\n¿Qué seguidor desea que siga al reportero?");
                    int seg = s.nextInt();
                    s.nextLine();
                    reportero.agregarSeguidor(seguidores.get(seg));
                    break;
                }
                case 3:{
                    System.out.println("Ingrese la noticia:");
                    String noticia = s.nextLine();
                    reportero.nuevaNoticia(noticia);
                    break;
                }
                case 4:{
                    for (int i = 0; i < seguidores.size(); i++) {
                        System.out.println("Seguidor " + i);
                    }
                    System.out.println("\n¿De qué seguidor desea ver las noticias?");
                    int seg = s.nextInt();
                    s.nextLine();
                    System.out.println("Noticia: " + seguidores.get(seg).siguienteNoticia());
                    break;
                }
                case 5:{
                    break;
                }
                default:{
                    System.out.println("Opción no válida");
                }
            }
            
        }while(resp != 5);
        
    }
}
