package ar.edu.unahur.obj2.practicaparcial1.criterios;

import java.util.List;

import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public class Premium implements CriterioStrategy{
    private List<String> autoresPreferidos;

    @Override
    public Boolean leGusta(IReceta receta) {
        return Boolean.valueOf(autoresPreferidos.contains(receta.getAutor()));
    }

}
