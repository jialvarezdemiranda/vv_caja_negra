package com.practica.cajanegra.OtrasOperaciones;

import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.NoSuchElementException;

public class TestIsSubList {
	@Test
	/* CP1 Part está en la lista */
	public void partEnLista() throws NoSuchElementException, EmptyCollectionException {
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("B","A","B");
		SingleLinkedListImpl<String> part = new SingleLinkedListImpl<String>("A","B");
	    assertEquals(2, mylist.isSubList(part));
	}
	
	@Test
	/* CP2 Part no está en la lista */
	public void partNoEnLista() throws NoSuchElementException, EmptyCollectionException {
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A","C");
		SingleLinkedListImpl<String> part = new SingleLinkedListImpl<String>("A","B");
	    assertEquals(-1, mylist.isSubList(part));
	}
	
	
	@Test
	/* CP3 part es una lista vacia */
	public void partEsListaVacia() throws NoSuchElementException, EmptyCollectionException {
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A","B");
		SingleLinkedListImpl<String> part = new SingleLinkedListImpl<String>();
	    assertEquals(0, mylist.isSubList(part));
	}
	
	@Test
	/* CP4 La lista está vacia  */
	public void partEnListaVacia() throws NoSuchElementException, EmptyCollectionException {
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>();
		SingleLinkedListImpl<String> part = new SingleLinkedListImpl<String>("A","B");
	    assertEquals(-1, mylist.isSubList(part));
	}
	
	@Test
	/* CP5 Part null */
	public void partNullEnLista() throws NoSuchElementException, EmptyCollectionException {
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A","B");
		SingleLinkedListImpl<String> part = null;
	    assertEquals(0, mylist.isSubList(part));
	}
	
	/* CP6 Part de diferente tipo no es posible */
	
	@Test
	/* CP7 Part fuera del rango */
	public void partFueraRangoEnListaVacia() throws NoSuchElementException, EmptyCollectionException {
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A");
		SingleLinkedListImpl<String> part = new SingleLinkedListImpl<String>("@");
	    assertEquals(-1, mylist.isSubList(part));
	}
	
	@Test
	/* CP8 Part a partir de la primera posición  */
	public void partPrimeraPosicion() throws NoSuchElementException, EmptyCollectionException {
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A","B","C");
		SingleLinkedListImpl<String> part = new SingleLinkedListImpl<String>("A","B");
	    assertEquals(1, mylist.isSubList(part));
	}
	
	@Test
	/* CP9 Part a partir de una posición intermedia  */
	public void partPosicionIntermedia() throws NoSuchElementException, EmptyCollectionException {
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("B","C","A","B","D","E");
		SingleLinkedListImpl<String> part = new SingleLinkedListImpl<String>("A","B");
	    assertEquals(3, mylist.isSubList(part));
	}
	
	@Test
	/* CP10 Part es único elemento y está en la lista en la última posición  */
	public void partUltimaPosicion() throws NoSuchElementException, EmptyCollectionException {
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("B","C","D","A");
		SingleLinkedListImpl<String> part = new SingleLinkedListImpl<String>("A");
	    assertEquals(4, mylist.isSubList(part));
	}
	
	@Test
	/* CP11 Part exactamente igual que la lista  */
	public void partIgualTamanioLista() throws NoSuchElementException, EmptyCollectionException {
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A","B","C");
		SingleLinkedListImpl<String> part = new SingleLinkedListImpl<String>("A","B","C");
	    assertEquals(1, mylist.isSubList(part));
	}
	
	@Test
	/* CP12 Part es de mayor tamaño que la lista  */
	public void partMayorLista() throws NoSuchElementException, EmptyCollectionException {
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A","B");
		SingleLinkedListImpl<String> part = new SingleLinkedListImpl<String>("A","B","C");
	    assertEquals(-1, mylist.isSubList(part));
	}
	
	@Test
	/* CP13 Lista contiene el primer elemento de part y posteriormente está la sublista dentro de la lista  */
	public void partPrimerElementoEncontradoAntesSublista() throws NoSuchElementException, EmptyCollectionException {
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("B","A","C","A","B","D","E");;
		SingleLinkedListImpl<String> part = new SingleLinkedListImpl<String>("A","B");
	    assertEquals(4, mylist.isSubList(part));
	}
}
