package ed.implementacion.cola;

import ed.implementacion.clases.Persona;

public class PruebaCola {

    public static void main(String[] args) {

        Cola<Persona> cola = new Cola<>();

        cola.insertar(new Persona("omar", 33));
        cola.insertar(new Persona("jonatahan", 32));
        cola.insertar(new Persona("x", 0));

        cola.mostrar();
    }

}
