package Accesos;


public class Carro {
    private String modelo;
    private int precio;

    public Carro(String modelo, int precio) {
        this.modelo = modelo;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean equals(Object obj) {
        Carro otro = (Carro) obj;
        return (otro.getPrecio() == this.precio) && (otro.getModelo().equals(this.modelo));
    }

    protected Object clone() {
        return new Carro(modelo, precio);
    }

    public String toString() {
        return "(" + modelo + "," + precio + ")";
    }

    public static void main(String args[]) {
        Carro miCarro = new Carro("bmw", 2000);
        Carro otCarro = new Carro("toyota", 1000);

        if (miCarro.equals(otCarro)) {
            System.out.println("iguales");
            System.out.println(miCarro);
        }
    }

}
