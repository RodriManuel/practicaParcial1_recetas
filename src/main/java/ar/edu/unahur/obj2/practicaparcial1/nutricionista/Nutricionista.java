package ar.edu.unahur.obj2.practicaparcial1.nutricionista;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.practicaparcial1.clientes.Cliente;
import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;
import ar.edu.unahur.obj2.practicaparcial1.recetas.Receta;

public class Nutricionista {
    private static Nutricionista instance = new Nutricionista();
    private static List<IReceta> recetasDisponibles = new ArrayList<>();
    private static String nombre = "Dr. Nutrición";
    
    private Nutricionista() {
    }

//***************************************************

    public static Nutricionista getInstance() {
        return instance;
    }

    public List<IReceta> getRecetasDisponibles() {
        return recetasDisponibles;
    }

    public void agregarNuevaReceta(IReceta nuevaReceta) {
        recetasDisponibles.add(nuevaReceta);
    }

    public static String getNombre() {
        return nombre;
    }

//***************************************************

    public void visitarCliente(Cliente cliente) {
        IReceta batidoMagico = new Receta("Batido Mágico", nombre, 2000, 0);
        
        IReceta recetaAdecuada = recetasDisponibles.stream()
                                                   .filter(r -> cliente.leGustaLaReceta(r))
                                                   .findFirst()
                                                   .orElse(batidoMagico);

        cliente.recibirReceta(recetaAdecuada);
    }
}
