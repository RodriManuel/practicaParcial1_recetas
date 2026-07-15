package ar.edu.unahur.obj2.practicaparcial1.decoradores;

import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public class SemillasDeChia extends IngredientesDecorator {

    public SemillasDeChia(IReceta receta) {
        super(receta);
    }

    @Override
    public String getNombreIngredienteExtra() {
        return "Semillas de Chia";
    }

    @Override
    public Double getValorNutricionalIngredienteExtra() {
        return 490.0;
    }

}
