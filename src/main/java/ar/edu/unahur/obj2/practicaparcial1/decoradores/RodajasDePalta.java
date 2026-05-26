package ar.edu.unahur.obj2.practicaparcial1.decoradores;

import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public class RodajasDePalta extends IngredientesDecorator {

    public RodajasDePalta(IReceta receta) {
        super(receta);
    }

//***************************************************

    @Override
    public String getNombreDeIngrediente() {
        return "rodaja de palta";
    }

    @Override
    public Integer getValorNutricionalDeIngrediente() {
        return 160;
    }
}
