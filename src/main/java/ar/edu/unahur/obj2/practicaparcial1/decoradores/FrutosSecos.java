package ar.edu.unahur.obj2.practicaparcial1.decoradores;

import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public class FrutosSecos extends IngredientesDecorator {

    public FrutosSecos(IReceta receta) {
        super(receta);
    }

    @Override
    public String getNombreIngredienteExtra() {
        return "Frutos Secos";
    }

    @Override
    public Double getValorNutricionalIngredienteExtra() {
        return 594.0;
    }
}
