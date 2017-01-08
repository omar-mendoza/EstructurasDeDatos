package ed.implementacion.lista;

import ed.implementacion.clases.Persona;

public class PruebaLista {

    public static void main(String[] args) {

        // Lista de Enteros
        Lista<Integer> lista = new Lista<Integer>();
        for(int i = 0; i < 5; i++)
            lista.agregarAlFinal(i);

        System.out.println("Lista:");
        lista.remover(22);
        lista.mostrar();
        System.out.println("Tamaño de la lista: " + lista.getTamanio());
        int buscar = 4;
        System.out.println("Está el elemento " + buscar + " : " + lista.buscar(buscar));
        buscar = 9;
        System.out.println("Está el elemento " + buscar + " : " + lista.buscar(buscar));

        // Lista de Doubles
        System.out.println("\n\nLista Doubles");
        Lista<Double> listaDoubles = new Lista<>();
        listaDoubles.agregarAlInicio(1.0);
        listaDoubles.agregarAlInicio(2.0);
        listaDoubles.agregarAlInicio(3.0);
        listaDoubles.mostrar();
        listaDoubles.remover(2.0);
        listaDoubles.mostrar();
        
        // Lista de Personas
        Lista<Persona> personas = new Lista<>();
        personas.agregarAlFinal(new Persona("omar", 33));
        personas.agregarAlFinal(new Persona("pancho", 23));
        personas.agregarAlFinal(new Persona("juancho", 28));
        personas.mostrar();
        
        //Buscamos una persona en la lista
        Persona omar = new Persona("omar", 33);
        System.out.println(personas.buscar(omar));
        
        // Eliminamos una persona de la lista
        personas.remover(omar);
        personas.mostrar();
        
    }
}
