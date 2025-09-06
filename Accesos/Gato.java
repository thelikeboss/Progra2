package Accesos;

public class Gato extends Animal {

    public Gato (int patas , int ojos){
        super(patas,ojos);
    }
    
    public String habla(){
        return "Soy un Gato";
    }
    public static void main(String args[]){
        try {
            Gato miGato= new Gato(4,2);
            System.out.println(miGato.habla());
            System.out.println("Patas: "+miGato.getPatas());
            System.out.println("Ojos: "+miGato.getOjos());
        } catch (Exception e) {
            System.out.println("Ocurrió una excepción: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
