package ar.edu.unahur.obj2.practicaparcial1.decoradores;

import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public class FrutosSecos extends IngredientesDecorator {
    
    public FrutosSecos(IReceta receta) {
        super(receta);
    }

//***************************************************

    @Override
    public String getNombreDeIngrediente() {
        return "frutos secos";
    }

    @Override
    public Integer getValorNutricionalDeIngrediente() {
        return 594;
    }
}
