public class Canil {
    
    public static void main(String[] args) {
        
        System.out.println("Bienvenido al Canil");

        Perro perro_del_profe = new Perro();
        Perro perro_bvsqz = new Perro() ;
        

        perro_del_profe.nombre = "Gimli" ;
        perro_del_profe.edad = 6 ;
        perro_del_profe.peso = 40 ;
        perro_del_profe.tiene_vacuna = false ;


        perro_bvsqz.nombre = "sekki" ;
        perro_bvsqz.edad =  1 ;
        perro_bvsqz.peso =  20 ;
        perro_bvsqz.tiene_vacuna = true ;

        if (perro_bvsqz.edad > 2) {
            System.out.println("El/La perr@ tiene mas de dos años ");
        }

        else {
            System.out.println("El/La perr@ no tiene mas de dos años");
        }
        
        if (perro_del_profe.peso > 20 ) {
            System.out.println("Perro Pesado");
        }
        else {
            System.out.println("Perro Ligero");
        }

        System.out.println("Gracias por su visita ");

    }

}
