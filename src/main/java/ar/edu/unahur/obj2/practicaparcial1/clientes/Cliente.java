package ar.edu.unahur.obj2.practicaparcial1.clientes;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.practicaparcial1.criterios.ComeTutti;
import ar.edu.unahur.obj2.practicaparcial1.criterios.CriterioStrategy;
import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public class Cliente {
    private final Integer dni;
    private CriterioStrategy criterioPreferido = new ComeTutti();
    private List<IReceta> registroDeRecetas = new ArrayList<>();

    public Cliente(Integer dni, CriterioStrategy criterioPreferido) {
        this.dni = dni;
    }

//*************************************************

    public Integer getDni() {
        return dni;
    }

    public CriterioStrategy getCriterioPreferido() {
        return criterioPreferido;
    }

    public List<IReceta> getRegistroDeRecetas() {
        return new ArrayList<>(registroDeRecetas);
    }

    public void cambiarCriterioPreferido(CriterioStrategy nuevoCriterioPreferido) {
        criterioPreferido = nuevoCriterioPreferido;
    }

//*************************************************

    public Boolean leGustaLaReceta(IReceta receta) {
        return criterioPreferido.leGusta(receta);
    }

    public void recibirReceta(IReceta receta) {
        registroDeRecetas.add(receta);
    }
}
