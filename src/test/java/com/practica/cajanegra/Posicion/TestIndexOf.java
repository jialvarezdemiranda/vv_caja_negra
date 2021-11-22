package com.practica.cajanegra.Posicion;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.cajanegra.SingleLinkedListImpl;

public class TestIndexOf {

	private SingleLinkedListImpl<String> listaBase;
	private SingleLinkedListImpl<String> lista2;
	private SingleLinkedListImpl<String> listaVacia;
	
	public static Stream<Arguments> data(){
		int expected1=1;
		int expected2=2;
		int expected3=4;
		int expected4=5;
		int expected5=6;
		
		return Stream.of(
				Arguments.of("A",expected1),
				Arguments.of("B",expected2),
				Arguments.of("D",expected3),
				Arguments.of("E",expected4),
				Arguments.of("F",expected5)
				);
	}
	
	public static Stream<Arguments> dataIncorrectas(){
		int expected6=1;
		int expected7=2;
		
		return Stream.of(
				Arguments.of("@",expected6),
				Arguments.of("[",expected7)
				);
	}
	
	/* CP 1-5 */
	@ParameterizedTest
	@MethodSource("data")
	void testIndexOfCorrectas(String input, int expected)
	{
		assertEquals(expected,listaBase.indexOf(input));
	}
	
	/* CP 6-7 */
	@ParameterizedTest
	@MethodSource("dataIncorrectas")
	void testIndexOfIncorrectas(String input, int expected)
	{
		assertEquals(expected,lista2.indexOf(input));
	}
	
	/* CP 8 */
	@Test
	void testIndexOfElemNoEnLista() {
		Throwable exception= assertThrows(NoSuchElementException.class,() -> listaBase.indexOf("Z"));
	}
	
	/* CP 9 */
	@Test
	void testIndexOfListaVacia() {
		Throwable exception= assertThrows(NoSuchElementException.class,() -> listaVacia.indexOf("A"));
	}
	
	/* CP 10 */
	@Test
	void testIndexOfElemNull() {
		Throwable exception= assertThrows(NoSuchElementException.class,() -> listaBase.indexOf(null));
	}
	
	/* CP 11 */
	@Test
	void testIndexOfElemNullListaVacia() {
		Throwable exception= assertThrows(NoSuchElementException.class,() -> listaVacia.indexOf(null));
	}
	
	@BeforeEach
	public void setUp()
	{
		listaBase=new SingleLinkedListImpl<String>("A","B","C","D","E","F");
		lista2=new SingleLinkedListImpl<String>("@","[");
		listaVacia=new SingleLinkedListImpl<String>();
	}
	
}
