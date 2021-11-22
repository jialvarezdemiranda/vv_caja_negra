package com.practica.cajanegra.Remove;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.cajanegra.SingleLinkedListImpl;
import com.cajanegra.EmptyCollectionException;

public class TestRemoveLast {
	
	
	
	
		@Test
		/* CP1 Comprobamos que para la lista de seis elementos delimina el último de ellos*/
		public void listaSeisElementos() throws Exception {
			SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A","B","C","D","E","F");
			assertEquals("F", mylist.removeLast());
		}
	
	
		/* CP2 Comprobamos que para la lista vacia lanza la excepción */
		
		
		@Test
		void testListaVacia() {
			SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>();
		    Throwable exception= assertThrows(EmptyCollectionException.class,() -> mylist.removeLast());
		}
			
		
		@Test
		/* CP3 Comprobamos que para la lista de un elemento, la lista queda vacía */
		public void listaUnElemento() throws Exception {
			SingleLinkedListImpl<String> mylist = new SingleLinkedListImpl<String>("A");
			assertEquals("A", mylist.removeLast());
		}
		
		
	}