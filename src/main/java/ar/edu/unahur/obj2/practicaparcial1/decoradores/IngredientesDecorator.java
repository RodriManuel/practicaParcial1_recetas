package ar.edu.unahur.obj2.practicaparcial1.decoradores;

import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public abstract class IngredientesDecorator implements IReceta {
    private IReceta receta;

    public IngredientesDecorator(IReceta receta) {
        this.receta = receta;
    }

    @Override
    public Boolean esTradicional() {
        return receta.esTradicional();
    }

    @Override
    public Integer getAnnosDeTradicion() {
        return receta.getAnnosDeTradicion();
    }

    @Override
    public String getAutor() {
        return receta.getAutor();
    }

    @Override
    public String getNombre() {
        return receta.getNombre() + getNombreIngredienteExtra();
    }

    @Override
    public Double getValorNutricionalBase() {
        return receta.getValorNutricionalBase() + getValorNutricionalIngredienteExtra();
    }

    public abstract String getNombreIngredienteExtra();

    public abstract Double getValorNutricionalIngredienteExtra();
}
