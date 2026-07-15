package ar.edu.unahur.obj2.practicaparcial1.criterios;

import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public interface CriterioStrategy {
    Boolean leGusta(IReceta receta);
}
