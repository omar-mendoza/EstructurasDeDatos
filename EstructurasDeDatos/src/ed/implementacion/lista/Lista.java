package ed.implementacion.lista;

/**
 * Lista genérica
 * Implementación de una lista enlazada.
 *
 * NOTA: Para funcionar, la clase T debe tener implementación de equals
 *
 * @author omar mendoza
 *
 * @param <T> Objetos de los que constará la lista
 *
 */
public class Lista<T> {

    private Nodo<T> inicio;
    private int tamanio;

    public Lista() {
        this.inicio = null;
        this.tamanio = 0;
    }

    /**
     * Prueba de lista vacía
     *
     * @return true si la lista está vacía, si no es vacía retorna false
     */
    public boolean esVacia() {
        return inicio == null;
    }

    /**
     * Agrega al final de la lista
     *
     * @param valor Valor que se almacenará en la lista
     */
    public void agregarAlFinal(T valor) {
        Nodo<T> nuevo = new Nodo<>();
        nuevo.setValor(valor);
        if(esVacia()) {
            inicio = nuevo;
        } else {
            Nodo<T> aux = inicio;
            while(aux.getSiguiente() != null)
                aux = aux.getSiguiente();
            aux.setSiguiente(nuevo);
        }
        tamanio++;
    }

    /**
     *
     * Agrega al inicio de la lista
     *
     * @param valor Valor que se almacenará en la lista
     *
     */
    public void agregarAlInicio(T valor) {
        Nodo<T> nuevo = new Nodo<>();
        nuevo.setValor(valor);
        if(esVacia()) {
            inicio = nuevo;
        } else {
            Nodo<T> aux = inicio;
            inicio = nuevo;
            nuevo.setSiguiente(aux);
        }
        tamanio++;
    }

    /**
     * Busca un valor en la lista
     *
     * @param valor Valor a buscar en la lista
     * @return true si el valor se encuentra en la lista, si no se encuentra retorna false
     */
    public boolean buscar(T valor) {
        Nodo<T> aux = inicio;
        while(aux != null) {
            if(aux.getValor().equals(valor))
                return true;

            aux = aux.getSiguiente();
        }
        return false;
    }

    /**
     * Elimina un valor de la lista
     *
     * @param valor Valor a eliminar de la lista
     */
    public boolean remover(T valor) {
        Nodo<T> actual = inicio;
        Nodo<T> anterior = null;
        boolean encontrado = false;
        while(actual != null && !encontrado) {
            
        	encontrado = actual.getValor().equals(valor);
        	
        	if(!encontrado) {
        		anterior = actual;
            	actual = actual.getSiguiente();
        	}
        }
        
       if(actual != null) {
    	   if(actual == inicio) {
    		   inicio = actual.getSiguiente();
    	   } else {
    		   anterior.setSiguiente(actual.getSiguiente());
    	   }
       }
        return encontrado;
     }

    /**
     * Regresa y elimina el primer elemento de la lista
     * @return Primer elemento T de la lista
     */
    public T obtenerPrimero() {
        if(esVacia())
            return null;

        T valor = inicio.getValor();
        inicio = inicio.getSiguiente();
        tamanio--;
        return valor;
    }

    /**
     * Regresa y elimina el último elemento de la lista
     * @return Último elemento T de la lista
     */
    public T obtenerUltimo() {
        if(esVacia())
            return null;
        Nodo<T> actual = inicio;
        Nodo<T> anterior = null;
        while(actual.getSiguiente() != null) {
        	anterior = actual;
            actual = actual.getSiguiente();
        }
        
        T valor = actual.getValor();
        
        if(actual == inicio) {
        	inicio = null;
        } else {
        	anterior.setSiguiente(null);
        }
        
        tamanio--;
        return valor;
    }

    /**
     * Limpia la lista
     */
    public void limpia() {
        this.inicio = null;
        this.tamanio = 0;
    }

    /**
     * Tamaño de la lista
     *
     * @return Tamaño de la lista
     */
    public int getTamanio() {
        return tamanio;
    }

    public void mostrar() {
        if(!esVacia()) {
            Nodo<T> aux = inicio;
            while(aux != null) {
                System.out.println(aux.getValor());
                aux = aux.getSiguiente();
            }
        }
    }
}