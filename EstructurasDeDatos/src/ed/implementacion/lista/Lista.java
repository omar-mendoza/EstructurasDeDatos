package ed.implementacion.lista;

/**
 * 
 * @author omar mendoza
 *
 * @param <T> Objetos de los que constará la lista
 * 
 * Lista genérica
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
    public void remover(T valor){
    	if(inicio.getValor().equals(valor)) {
    		inicio = inicio.getSiguiente();
    		tamanio--;
    	} else {
			Nodo<T> aux = inicio;
			while(aux != null) {
				if(aux.getSiguiente() != null && aux.getSiguiente().getValor().equals(valor)) {
					//Nodo<T> nodo = aux.getSiguiente();
					//aux.setSiguiente(nodo.getSiguiente());
					aux.setSiguiente(aux.getSiguiente().getSiguiente());
					tamanio--;
					return;
				} else {
					aux = aux.getSiguiente();
				}
			}
    		
    	}
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
