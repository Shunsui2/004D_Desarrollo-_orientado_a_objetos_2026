public class Personaje {
    
    String nombre ;
    String apellido ;
    private int vidas ;
    boolean esta_vivo = true ;    


    public void setearVida(int vidas){

        if (vidas < 0) {
           this.vidas =  0 ;
            
        }
        else {
            this.vidas = vidas;
        }
    }
    public int verVida(){
        return vidas ;
    }
}
    

