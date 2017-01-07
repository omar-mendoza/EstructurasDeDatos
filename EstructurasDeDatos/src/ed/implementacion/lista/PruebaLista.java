package ed.implementacion.lista;

public class PruebaLista {
	
	public static void main(String[] args) {
		
		// Lista de Enteros
		Lista<Integer> lista = new Lista<Integer>();		
		for(int i = 0; i < 5; i++)
			lista.agregarAlFinal(i);
		
		System.out.println("Tamaño de la lista: " + lista.getTamanio());
		System.out.println("Lista:");
		lista.mostrar();
		
		// Lista de Doubles
		System.out.println("\n\nLista Doubles");
		Lista<Double> listaDoubles = new Lista<>();
		listaDoubles.agregarAlInicio(1.0);
		listaDoubles.agregarAlInicio(2.0);
		listaDoubles.agregarAlInicio(3.0);
		listaDoubles.mostrar();
	}

}
