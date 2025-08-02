package Herencias;

public class Pagina {
    private String contenido;
    private int numero;
    // Constructor
    public Pagina(String contenido, int numero) {
        this.contenido = new String(contenido);
        this.numero = numero;
    }

    // Métodos de instancia
    public String getContenido() {
        return this.contenido;
    }
    public void setContenido(String nuevo_Contenido){
        this.contenido = nuevo_Contenido;
    }
    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int nuevo_numero){
        this.numero = nuevo_numero;
    }
}