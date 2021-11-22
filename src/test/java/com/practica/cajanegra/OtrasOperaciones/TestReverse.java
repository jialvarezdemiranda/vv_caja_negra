package com.practica.cajanegra.OtrasOperaciones;

import com.cajanegra.AbstractSingleLinkedListImpl;
import com.cajanegra.SingleLinkedListImpl;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestReverse {
	@Test
	/* CP1 Comprobamos que para la lista vacia simplemente devuelve una lista vacia */
	public void listaVacia() {
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>();
	    AbstractSingleLinkedListImpl<String> salida= mylist.reverse();
	    assertTrue("Debe ser la lista vacia", salida.isEmpty());
	}
	
	@Test
	/* CP2 Comprobamos que para la lista de un elemento devuelve la lista con ese elemento */
	public void listaUnElemento() {
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A");
	    AbstractSingleLinkedListImpl<String> salida= mylist.reverse();
	    assertEquals("[A]", salida.toString());
	}
	
	@Test
	/* CP3 Comprobamos que para la lista de dos elementos devuelve la lista correcta */
	public void listaDosElementos() {
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A","B");
	    AbstractSingleLinkedListImpl<String> salida= mylist.reverse();
	    assertEquals("[B, A]", salida.toString());
	}
	
	@Test
	/* CP4 Comprobamos que para la lista de 7 elementos devuelve la lista correcta */
	public void listaSieteElementos() {
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A","B","C","D","D","E","F");
	    AbstractSingleLinkedListImpl<String> salida= mylist.reverse();
	    assertEquals("[F, E, D, D, C, B, A]", salida.toString());
	}
	
}
