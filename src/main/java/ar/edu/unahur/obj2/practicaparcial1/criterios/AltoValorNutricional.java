package ar.edu.unahur.obj2.practicaparcial1.criterios;

import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public class AltoValorNutricional implements CriterioStrategy {
    private Double caloriasMinimas;

    public AltoValorNutricional(Double caloriasMinimas) {
        this.caloriasMinimas = caloriasMinimas;
    }

    @Override
    public Boolean leGusta(IReceta receta) {
        return Boolean.valueOf(receta.getValorNutricionalBase() > caloriasMinimas); 
    }

}
