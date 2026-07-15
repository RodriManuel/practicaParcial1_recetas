package ar.edu.unahur.obj2.practicaparcial1.recetas;

public class Receta implements IReceta {
    private String nombre;
    private String autor;
    private Double valorNutricionalBase;
    private Integer annosDeTradicion;
    
    public Receta(String nombre, String autor, Double valorNutricionalBase, Integer annosDeTradicion) {
        this.nombre = nombre;
        this.autor = autor;
        this.valorNutricionalBase = valorNutricionalBase;
        this.annosDeTradicion = annosDeTradicion;
    }

//*************************************************

    @Override
    public Integer getAnnosDeTradicion() {
        return annosDeTradicion;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public Double getValorNutricionalBase() {
        return valorNutricionalBase;
    }
  
    @Override
    public Boolean esTradicional() {
        return this.getAnnosDeTradicion() >= 20;
    }

//*************************************************
 
}
