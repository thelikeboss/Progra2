package Herencias;

public class Principal_Libro {
    
    public static void main(String[] args) {
        //declaracion y definicion de un objeto libros
        Libro elQuijote = new Libro("don quijote de la mancha", 1234567890123L, "Miguel de Cervantes", 1605, 10);
        elQuijote.registrarPagina("En un lugar de la mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor.", 0);
        elQuijote.registrarPagina("En tanto que el hidalgo se dedicaba a leer libros de caballería, su sobrina y ama se burlaban de él.", 1);
        //añadir paginas al libro
            System.out.println(elQuijote.getNumeroPaginas());
            System.out.println(elQuijote.getTitulo());
            System.out.println(elQuijote.getAutor());
            System.out.println(elQuijote.getAnyoPublicacion());
            System.out.println(elQuijote.getIsbn());
            for (int i = 0; i < elQuijote.getNumeroPaginas(); i++) {
                System.out.println("Pagina " + i + ": " + elQuijote.getPaginaNumero(i));
            }
         //   System.out.println(elQuijote.getPaginaNumero(0));
           /// System.out.println(elQuijote.getPaginaNumero(1));
        
    }




}
