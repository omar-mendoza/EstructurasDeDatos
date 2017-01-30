package ed.implementacion.pila;

import ed.implementacion.lista.Lista;

/**
 *
 * LIFO
 * @author omar mendoza
 *
 * @param <T>
 */
public class Pila<T> {

    private Lista<T> lista;

    public Pila() {
        lista = new Lista<>();
    }

    public void insertar(T valor) {
        lista.agregarAlInicio(valor);
    }

    public T obtener() {
        return lista.obtenerPrimero();
    }

    public void limpiar() {
        lista.limpia();
    }

    public boolean esVacia() {
        return lista.esVacia();
    }

    public int tamanio() {
        return lista.getTamanio();
    }

    public void mostrar() {
        lista.mostrar();
    }
}
