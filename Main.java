
import java.util.ArrayList;

import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int resp = 0;
        ArrayList<Persona> personas = new ArrayList();
        do{
            System.out.println("1. Crear Persona");
            System.out.println("2. Ver Banner");
            System.out.println("3. Modificar Banner");
            System.out.println("4. Salir");
            resp = s.nextInt();
            s.nextLine();
            switch(resp){
                case 1:{
                    System.out.println("Ingrese Nombre");
                    String nombre = s.nextLine();
                    System.out.println("Ingrese tipo (1. Observador, 2. Manager)");
                    int tipo = s.nextInt();
                    if(tipo == 1){
                        System.out.println("Observador");
                        personas.add(new Observador(SingleBanner.getInstance(), nombre));
                    }else{
                        System.out.println("Manager");
                        personas.add(new Manager(SingleBanner.getInstance(), nombre));
                    }
                    break;
                }
                case 2:{
                    listar(personas);
                    int p = s.nextInt();
                    s.nextLine();
                    System.out.println("Banner: " + personas.get(p).verBanner());
                    break;
                }
                case 3:{
                    listar(personas);
                    int p = s.nextInt();
                    s.nextLine();
                    System.out.println("Nuevo Banner: ");
                    String mensaje = s.nextLine();
                    if(personas.get(p).modificarBanner(mensaje)){
                        System.out.println("Modificado!");
                    }else{
                        System.out.println("No modificado!");
                    }
                    break;
                }
                case 4:{
                    break;
                }
                default:{
                    System.out.println("Opción no válida");
                    break;
                }
            }
        }while(resp != 4);
    }
    
    static void listar(ArrayList<Persona> personas){
        for (int i = 0; i < personas.size(); i++) {
            System.out.println(i + ". " + personas.get(i).toString());
        }
        System.out.println("");
    }
}

