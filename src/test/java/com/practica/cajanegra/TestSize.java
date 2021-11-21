package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSize {
	@Test
	/* CP1 Comprobamos que para la lista vacia devuelve un 0 */
	public void listaVacia() {
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>();
		assertEquals(0, mylist.size());
	}
	
	@Test
	/* CP2 Comprobamos que para la lista de un elemento devuelve un 1 */
	public void listaUnElemento() {
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A");
		assertEquals(1, mylist.size());
	}
	
	@Test
	/* CP1 Comprobamos que para la lista de siete elementos devuelve un 7 */
	public void listaSieteElementos() {
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A","B","C","D","D","E","F");
		assertEquals(7, mylist.size());
	}
}
