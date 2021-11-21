package com.practica.cajanegra;

import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.NoSuchElementException;


public class TestRemoveLastConParametro {
	@Test
	/* CP1 Elemento está en la lista */
	public void elementoEnLista() throws NoSuchElementException, EmptyCollectionException {
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A","B","D","E");
		String elem = "D";
		mylist.removeLast(elem);
	    assertEquals("[A, B, E]", mylist.toString());
	}
	
	@Test
	/* CP2 Elemento no está en la lista */
	public void elementoNoEnLista() throws NoSuchElementException, EmptyCollectionException {
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("B","D","E");
		String elem = "A";
		Assertions.assertThrows(java.util.NoSuchElementException.class, () -> {mylist.removeLast(elem);}); //NO DA EXCEPTION, SIMPLEMENTE NO BORRA
	}
	
	
	@Test
	/* CP3 Elemento en la lista vacia */
	public void elementoEnListaVacia() throws NoSuchElementException, EmptyCollectionException {
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>();
		String elem = "A";
		Assertions.assertThrows(EmptyCollectionException.class, () -> {mylist.removeLast(elem);});
	}
	
	@Test
	/* CP4 Elemento null en la lista  */
	public void elementoNullEnLista() throws NoSuchElementException, EmptyCollectionException {
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A","B");
		String elem = null;
		Assertions.assertThrows(NullPointerException.class, () -> {mylist.removeLast(elem);});
	}
	
	@Test
	/* CP5 Elemento null en la lista vacia */
	public void elementoNullEnListaVacia() throws NoSuchElementException, EmptyCollectionException {
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>();
		String elem = null;
		Assertions.assertThrows(EmptyCollectionException.class, () -> {mylist.removeLast(elem);});
	}
	
	
	/* CP6 Elemento diferente tipo no es posible */
	
	@Test
	/* CP7 Elemento A en la lista  */
	public void elementoAEnLista() throws NoSuchElementException, EmptyCollectionException {
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("B","A","D","E");
		String elem = "A";
		mylist.removeLast(elem); 
	    assertEquals("[B, D, E]", mylist.toString());
	}
	
	@Test
	/* CP8 Elemento B en la lista  */
	public void elementoBEnLista() throws NoSuchElementException, EmptyCollectionException {
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A","B","D","E");
		String elem = "B";
		mylist.removeLast(elem); 
	    assertEquals("[A, D, E]", mylist.toString());
	}
	
	@Test
	/* CP9 Elemento N en la lista  */
	public void elementoNEnLista() throws NoSuchElementException, EmptyCollectionException {
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A","B","D","N");
		String elem = "N";
		mylist.removeLast(elem); 
	    assertEquals("[A, B, D]", mylist.toString());
	}
	
	@Test
	/* CP10 Elemento Y en la lista  */
	public void elementoYEnLista() throws NoSuchElementException, EmptyCollectionException {
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A","B","D","Y");
		String elem = "Y";
		mylist.removeLast(elem); 
	    assertEquals("[A, B, D]", mylist.toString());
	}
	
	@Test
	/* CP11 Elemento Z en la lista  */
	public void elementoZEnLista() throws NoSuchElementException, EmptyCollectionException {
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A","B","D","Z");
		String elem = "Z";
		mylist.removeLast(elem); 
	    assertEquals("[A, B, D]", mylist.toString());
	}
	
	@Test
	/* CP12 Elemento @ en la lista  */
	public void elementoMenorEnLista() throws NoSuchElementException, EmptyCollectionException {
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A","B","D");
		String elem = "@";
		mylist.removeLast(elem); 
	    assertEquals("[A, B, D]", mylist.toString());
	}
	
	@Test
	/* CP13 Elemento [ en la lista  */
	public void elementoMayorEnLista() throws NoSuchElementException, EmptyCollectionException {
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A","B","D");
		String elem = "[";
		mylist.removeLast(elem); 
	    assertEquals("[A, B, D]", mylist.toString());
	}
	
	@Test
	/* CP14 Elemento primero en la lista  */
	public void elementoPrimeroEnLista() throws NoSuchElementException, EmptyCollectionException {
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A","B","D");
		String elem = "A";
		mylist.removeLast(elem); //ELIMINA TODA LA LISTA SI EL ELEMENTO ESTÁ EL PRIMERO
	    assertEquals("[B, D]", mylist.toString());
	}
	
	@Test
	/* CP15 Elemento mitad de la lista  */
	public void elementoMitadEnLista() throws NoSuchElementException, EmptyCollectionException {
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("B","D","E","A","B","D","E");
		String elem = "A";
		mylist.removeLast(elem); 
	    assertEquals("[B, D, E, B, D, E]", mylist.toString());
	}
	
	@Test
	/* CP16 Elemento ultimo de la lista  */
	public void elementoUltimoEnLista() throws NoSuchElementException, EmptyCollectionException {
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("B","D","E","B","D","E","A");
		String elem = "A";
		mylist.removeLast(elem); 
	    assertEquals("[B, D, E, B, D, E]", mylist.toString());
	}
	
	
	@Test
	/* CP17 Elemento repetido X veces en la lista  */
	public void elementoRepetidoXvecesEnLista() throws NoSuchElementException, EmptyCollectionException {
		SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("B","A","A","A","B","A","C","D");
		String elem = "A";
		mylist.removeLast(elem); // ELIMINA TODOS ELEMENTOS A
	    assertEquals("[B, A, A, A, B, C, D]", mylist.toString());
	}
	
}
