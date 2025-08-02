package Herencias;

public class Libro {

    // atributos
    private String titulo;
    private long isbn;
    private String autor;
    private int anyoPublicacion;
    // atributos representado la relacion de composicion private pagina
    private int numeroPaginas;
    private Pagina[] paginas;

    // constructor
    public Libro(String titulo, long isbn, String autor, int anyoPublicacion, int numeroPaginas) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.anyoPublicacion = anyoPublicacion;
        //reserva el espacio para las paginas
        this.paginas = new Pagina[999];
        for (int i = 0; i < 99; i++) {
            paginas[i] = new Pagina("",1); // Inicializa cada página
            this.numeroPaginas = 99;
        }  
    }

    //metodos de instancias
    public String getTitulo(){return this.titulo;}
    public void setTitulo(String titulo){this.titulo = titulo;}
    public long getIsbn(){return this.isbn;}
    public void setIsbn(long nuevo_isbn){this.isbn = nuevo_isbn;}
    public String getAutor(){return this.autor;}
    public void setAutor(String nuevo_autor){this.autor = nuevo_autor;}
    public int getAnyoPublicacion(){return this.anyoPublicacion;}
    public void setAnyoPublicacion(int nuevo_anyo){this.anyoPublicacion = nuevo_anyo;}
    public int getNumeroPaginas(){return this.numeroPaginas;}

    public void anyadirPagina(Pagina nuevaPagina){
        if (this.numeroPaginas < 10){
            this.paginas[this.numeroPaginas] = nuevaPagina;
            this.numeroPaginas++;
        }
    }
    public String getPaginaNumero(int numero_pagina){
        return this.paginas[numero_pagina].getContenido();
    }
    public void registrarPagina(String Contenido, int numero){
        paginas[numero].setContenido(Contenido);
    }
}

