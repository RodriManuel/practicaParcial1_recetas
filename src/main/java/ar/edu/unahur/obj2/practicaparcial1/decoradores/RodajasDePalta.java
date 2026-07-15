package ar.edu.unahur.obj2.practicaparcial1.decoradores;

import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public class RodajasDePalta extends IngredientesDecorator {

    public RodajasDePalta(IReceta receta) {
        super(receta);
    }

    @Override
    public String getNombreIngredienteExtra() {
        return "Rodajas de Palta";
    }

    @Override
    public Double getValorNutricionalIngredienteExtra() {
        return 160.0;
    }
}
