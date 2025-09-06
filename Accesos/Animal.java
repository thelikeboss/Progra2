package Accesos;

public class Animal {
   protected int patas;
   private int ojos;
   
   public Animal(int patas , int ojos ){
    this.patas= patas;
    this.ojos= ojos;
   }

   public void setPatas(int patas){
        this.patas= patas;
   }    

   public int getPatas(){
    return patas;
   }

   public void setOjos(int ojos){
    this.ojos= ojos;
   }

   public int getOjos(){
    return ojos;
   }

   public String habla(){
    return "soy un animal";
   }

   public static void main(String args[]) {
       try {
           Animal miAnimal = new Animal(4, 2);
           System.out.println(miAnimal.habla());
           System.out.println("Patas: " + miAnimal.getPatas());
           System.out.println("Ojos: " + miAnimal.getOjos());
       } catch (Exception e) {
           System.out.println("Ocurrió una excepción: " + e.getMessage());
           e.printStackTrace();
       }
   }
}
