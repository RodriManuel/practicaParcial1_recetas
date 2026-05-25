package ar.edu.unahur.obj2.practicaparcial1.recetas;

public interface IReceta {
    String getNombre();
    String getAutor();
    Integer getValorNutricional();
    Integer getAnnosDeTradicion();
    //Integer calcularValorNutricionalTotal();
    //Boolean leGusta(Cliente cliente);
    Boolean esTradicional();
}
