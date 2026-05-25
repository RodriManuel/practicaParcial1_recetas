package ar.edu.unahur.obj2.practicaparcial1.criterios;

import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public class RecetaTradicional implements ICriterio {

    public RecetaTradicional() {
    }

//***************************************************

    @Override
    public Boolean leGusta(IReceta receta) {
        return Boolean.valueOf(receta.esTradicional());
    }    
}
