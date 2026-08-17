import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
       mostrar_menu();
    }

    static void mostrar_menu(){
         String opcion_elegida ;
        Scanner scaner = new Scanner(System.in);
        boolean iniciar_menu = true ;
        Personaje personaje_jugador = new Personaje() ;
        System.out.println("**Bienvenidos al mundo WESTEROS");
        
        while ( iniciar_menu) {
            System.out.println("- Crear Personaje");
        System.out.println("- Ver Personaje");
        System.out.println("- Salir");

        System.out.println("Por favor ingrese una opcion :  ");

        opcion_elegida = scaner.nextLine();

        System.out.println("La opcion escogida por el usuario es : " + opcion_elegida);

        
        

        switch (opcion_elegida) {
            case "1":
                System.out.println("CREACION DE PERSONAJE");
                

                System.out.println("nombre ?");
                personaje_jugador.nombre = scaner.nextLine() ;
                
                System.out.println("apellido?");
                personaje_jugador.apellido = scaner.nextLine() ;

                System.out.println("vida?");
                personaje_jugador.setearVida(Integer.parseInt(scaner.nextLine()));                
                break;

            case "2":
                System.out.println(" Ver Personaje :");

                System.out.println(" NOMBRE :" + personaje_jugador.nombre);

                System.out.println(" APELLIDO :" + personaje_jugador.apellido );

                System.out.println(" VIDA:" + personaje_jugador.verVida());

                break;

            case "3" :
                System.out.println("Gracias por jugar");
                iniciar_menu = false ;

                break;
            
            default:
                System.out.println("Por favor ingrese una opcion correcta");
        }
        }


    }

}




