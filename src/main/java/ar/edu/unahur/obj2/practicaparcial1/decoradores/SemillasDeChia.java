package ar.edu.unahur.obj2.practicaparcial1.decoradores;

import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public class SemillasDeChia extends IngredientesDecorator {

    public SemillasDeChia(IReceta receta) {
        super(receta);
    }

//***************************************************    

    @Override
    public String getNombreDeIngrediente() {
        return "semillas de chia";
    }

    @Override
    public Integer getValorNutricionalDeIngrediente() {
        return 490;
    }
}
