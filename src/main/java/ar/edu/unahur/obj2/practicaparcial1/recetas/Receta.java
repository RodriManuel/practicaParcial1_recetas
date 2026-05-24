package ar.edu.unahur.obj2.practicaparcial1.recetas;

public class Receta implements IReceta {
    protected String nombre;
    protected String autor;
    protected Integer valorNutricionalBase;
    protected Integer annosDeTradicion;

    public Receta(String nombre, String autor, Integer valorNutricionalBase, Integer annosDeTradicion) {
        this.nombre = nombre;
        this.autor = autor;
        this.valorNutricionalBase = valorNutricionalBase;
        this.annosDeTradicion = annosDeTradicion;
    }

//***************************************************

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getValorNutricionalBase() {
        return valorNutricionalBase;
    }

    public Integer getAnnosDeTradicion() {
        return annosDeTradicion;
    }

    public Boolean esTradicional() {
        return Boolean.valueOf(annosDeTradicion > 20);
    }

//***************************************************

    @Override
    public Integer calcularValorNutricionalTotal() {
        return this.valorNutricionalBase;
    }
}
