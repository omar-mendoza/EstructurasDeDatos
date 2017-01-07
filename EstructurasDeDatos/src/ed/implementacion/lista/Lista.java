package ed.implementacion.lista;

public class Lista<T> {

    private Nodo<T> inicio;
    private int tamanio;

    public Lista() {
        this.inicio = null;
        this.tamanio = 0;
    }

    public boolean esVacia() {
        return inicio == null;
    }

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
