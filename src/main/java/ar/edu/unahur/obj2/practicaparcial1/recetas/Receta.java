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

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String getAutor() {
        return this.autor;
    }

    @Override
    public Integer getValorNutricional() {
        return this.valorNutricionalBase;
    }

    @Override
    public Integer getAnnosDeTradicion() {
        return this.annosDeTradicion;
    }

    @Override
    public Boolean esTradicional() {
        return Boolean.valueOf(this.annosDeTradicion >= 20);
    }

//***************************************************

}
