package ar.edu.unahur.obj2.practicaparcial1.criterios;

import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public class ComeTutti implements ICriterio {
    
    public ComeTutti() {
    }

//***************************************************

    @Override
    public Boolean leGusta(IReceta receta) {
        return Boolean.valueOf(true);
    }
    
}
