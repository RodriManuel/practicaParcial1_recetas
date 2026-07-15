package ar.edu.unahur.obj2.practicaparcial1;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.practicaparcial1.clientes.Cliente;
import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;
import ar.edu.unahur.obj2.practicaparcial1.recetas.Receta;

public class Nutricionista {
    private static Nutricionista instance = new Nutricionista();
    private List<IReceta> recetasDisponibles = new ArrayList<>();

    private Nutricionista() {
    }

    public static Nutricionista getInstance() {
        return instance;
    }

    public List<IReceta> getRecetasDisponibles() {
        return new ArrayList<>(recetasDisponibles);
    }

    public void agregarReceta(IReceta receta) {
        recetasDisponibles.add(receta);
    }

    public void visitarCliente(Cliente cliente) {
        IReceta batidoMagico = new Receta("Batido Mágico", "Nutricionista", 2000.0, 0);

        IReceta recetaAdecuada = recetasDisponibles.stream()
                                                   .filter(r -> cliente.leGustaLaReceta(r))
                                                   .findFirst()
                                                   .orElse(batidoMagico);

        cliente.recibirReceta(recetaAdecuada);
    }
    
}
