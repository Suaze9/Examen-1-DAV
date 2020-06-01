
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int resp = 0;
        ArrayList<DispositivoMovil> dispositivos = new ArrayList();
        
        do{
            System.out.println("1. Crear Dispositivo Movil");
            System.out.println("2. Listar Dispositivos");
            System.out.println("3. Salir");
            resp = s.nextInt();
            s.nextLine();
            switch(resp){
                case 1:{
                    System.out.println("1. Telefono");
                    System.out.println("2. Tablet");
                    System.out.println("3. Laptop");
                    int tipo = s.nextInt();
                    s.nextLine();
                    TipoMovil tm;
                    switch(tipo){
                        case 1:{
                            tm = TipoMovil.TELEFONO;
                            break;
                        }
                        case 2:{
                            tm = TipoMovil.TABLET;
                            break;
                        }
                        default:{
                            tm = TipoMovil.LAPTOP;
                            break;
                        }
                    }
                    dispositivos.add(FactoryMovil.getMovil(tm));
                    break;
                }
                case 2:{
                    for (int i = 0; i < dispositivos.size(); i++) {
                        System.out.println(i + ". " + dispositivos.get(i).toString());
                    }
                    System.out.println("");
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
