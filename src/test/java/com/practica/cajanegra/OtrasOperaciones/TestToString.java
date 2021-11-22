package com.practica.cajanegra.OtrasOperaciones;

import com.cajanegra.SingleLinkedListImpl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestToString {
	@Test
	/* CP1 Comprobamos que para la lista vacia simplemente devuelve una lista vacia */
	public void listaVacia() {
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>();
		assertEquals("[]", mylist.toString());
	}
	
	@Test
	/* CP2 Comprobamos que para la lista de un elemento devuelve el elemento */
	public void listaUnElemento() {
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A");
		assertEquals("[A]", mylist.toString());
	}
	
	@Test
	/* CP1 Comprobamos que para la lista de siete elementos devuelve todos los elementos */
	public void listaSieteElementos() {
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A","B","C","D","D","E","F");
		assertEquals("[A, B, C, D, D, E, F]", mylist.toString());
	}
}