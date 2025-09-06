package Accesos;

public class LoroMutante extends Loro {

    public LoroMutante(int patas, int ojos){
        super(patas, ojos);
    }
    
    public String vuelo(){
        return "vuelo...";
    }
    public static void main(String args[]){
        try {
            LoroMutante miLoroMutante= new LoroMutante(2,2);
            System.out.println(miLoroMutante.habla());
            System.out.println(miLoroMutante.vuelo());
            System.out.println("Patas: "+miLoroMutante.getPatas());
            System.out.println("Ojos: "+miLoroMutante.getOjos());
        } catch (Exception e) {
            System.out.println("Ocurrió una excepción: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
