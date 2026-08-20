public class Personaje {
    
    String nombre ;
    String apellido ;
    private int vidas ;
    boolean esta_vivo = true ; 
    private int edad ;   


    




    public void setearVida(int vidas){

        if (vidas < 0) {
           this.vidas =  0 ;
            
        }
        else {
            this.vidas = vidas;
        }
    }

    public void setear_edad(int edad) {

        if (edad < 0) {
            
            System.out.println("La edad no puede ser negativa , entonces le asignamos a tu personaje la edad de 18 años ");
            this.edad = 18 ;
        }
        else {

            this.edad = edad ;

        }
    }


    public int veredad(){

        return edad ;

    }


    public int verVida(){
        return vidas ;
    }
}
    

