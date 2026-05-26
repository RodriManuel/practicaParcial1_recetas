package ar.edu.unahur.obj2.practicaparcial1.decoradores;

import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public abstract class IngredientesDecorator implements IReceta {
    private final IReceta receta;

    public IngredientesDecorator(IReceta receta) {
        this.receta = receta;
    }

//***************************************************

    public IReceta getReceta() {
        return receta;
    }

    @Override
    public Boolean esTradicional() {
        return this.receta.esTradicional();
    }

    @Override
    public Integer getAnnosDeTradicion() {
        return this.receta.getAnnosDeTradicion();
    }

    @Override
    public String getAutor() {
        return this.receta.getAutor();
    }

    @Override
    public String getNombre() {
        String nuevoNombre = this.receta.getNombre() + " con " + getNombreDeIngrediente();
        return nuevoNombre;
    }

    @Override
    public Integer getValorNutricional() {
        Integer nuevoValor = this.receta.getValorNutricional() + getValorNutricionalDeIngrediente();
        return nuevoValor;
    }

//***************************************************

    public abstract String getNombreDeIngrediente();

    public abstract Integer getValorNutricionalDeIngrediente();
}
