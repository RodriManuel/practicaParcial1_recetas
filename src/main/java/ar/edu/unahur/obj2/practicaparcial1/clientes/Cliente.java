package ar.edu.unahur.obj2.practicaparcial1.clientes;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.practicaparcial1.criterios.ComeTutti;
import ar.edu.unahur.obj2.practicaparcial1.criterios.ICriterio;
import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public class Cliente {
    private final Integer DNI;
    private ICriterio criterioDeReceta = new ComeTutti();
    private List<IReceta> registroDeRecetasRecibidas = new ArrayList<>();

    public Cliente(Integer dNI) {
        DNI = dNI;
    }

//***************************************************

    public Integer getDNI() {
        return DNI;
    }

    public ICriterio getCriterioDeReceta() {
        return criterioDeReceta;
    }

    public List<IReceta> getRegistroDeRecetasRecibidas() {
        return registroDeRecetasRecibidas;
    }

    public void cambiarCriterioDeReceta(ICriterio criterioDeReceta) {
        this.criterioDeReceta = criterioDeReceta;
    }

//***************************************************


}
