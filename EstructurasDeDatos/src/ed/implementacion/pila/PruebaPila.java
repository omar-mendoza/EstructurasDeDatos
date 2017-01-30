package ed.implementacion.pila;

import ed.implementacion.clases.Persona;

public class PruebaPila {

    public static void main(String[] args) {

        Pila<Persona> pila = new Pila<>();
        pila.insertar(new Persona("omar", 33));
        pila.insertar(new Persona("jonatahan", 32));
        pila.insertar(new Persona("x", 0));

        System.out.println("Tamaño de la pila: " + pila.tamanio());
        pila.mostrar();

    }

}
