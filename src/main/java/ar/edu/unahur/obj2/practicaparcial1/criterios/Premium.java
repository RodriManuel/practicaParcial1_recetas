package ar.edu.unahur.obj2.practicaparcial1.criterios;

import java.util.List;

import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public class Premium implements ICriterio {
    private List<String> autoresPreferidos;

    public Premium(List<String> autoresPreferidos) {
        this.autoresPreferidos = autoresPreferidos;
    }

//***************************************************

    @Override
    public Boolean leGusta(IReceta receta) {
        String autorDeEstaReceta = receta.getAutor();

        return Boolean.valueOf(autoresPreferidos.contains(autorDeEstaReceta));
    }
    
}
