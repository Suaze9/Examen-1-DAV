
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int resp = 0;
        ArrayList<Casa> casas = new ArrayList();
        
        do{
            System.out.println("1. Build Casa");
            System.out.println("2. Listar Casa");
            System.out.println("3. Salir");
            resp = s.nextInt();
            s.nextLine();
            switch(resp){
                case 1:{
                    System.out.println("1. Pequeña");
                    System.out.println("2. Mediana");
                    System.out.println("3. Grande");
                    int res = s.nextInt();
                    s.nextLine();
                    switch(res){
                        case 1:{
                            casas.add(BuilderCasa.buildCasaPequena());
                            break;
                        }
                        case 2:{
                            casas.add(BuilderCasa.buildCasaMediana());
                            break;
                        }
                        default:{
                            casas.add(BuilderCasa.buildCasaGrande());
                            break;
                        }
                    }
                    System.out.println("Casa agregara: ");
                    System.out.println(casas.get(casas.size() - 1).verCasa());
                    break;
                }
                case 2:{
                    for (int i = 0; i < casas.size(); i++) {
                        System.out.println(i + ". " + casas.get(i).verCasa());
                    }
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
