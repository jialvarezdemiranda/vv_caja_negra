package com.practica.cajanegra;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.cajanegra.SingleLinkedListImpl;

public class TestGetAtPos {
	
	private SingleLinkedListImpl<String> listaBase;
	private SingleLinkedListImpl<String> listaVacia;
	private SingleLinkedListImpl<String> listaUnElem;
	
	public static Stream<Arguments> data(){
		String expected1="A";
		String expected2="B";
		String expected3="C";
		String expected4="E";
		String expected5="F";
		
		return Stream.of(
				Arguments.of(expected1,1),
				Arguments.of(expected2,2),
				Arguments.of(expected3,3),
				Arguments.of(expected4,5),
				Arguments.of(expected5,6)
				);
	}
	
	public static Stream<Arguments> dataException(){
        return Stream.of(
                Arguments.of(0),
                Arguments.of(7)
                );
    }
	
	@BeforeEach
	public void setUp()
	{
		listaBase=new SingleLinkedListImpl<String>("A","B","C","D","E","F");
		listaVacia=new SingleLinkedListImpl<String>();
		listaUnElem= new SingleLinkedListImpl<String>("A");
	}
	
	
	/* CP 1-5 */
	@ParameterizedTest
	@MethodSource("data")
	void testGetAtPosNoException(String expected, int n)
	{
		assertEquals(expected,listaBase.getAtPos(n));
	}

	/* CP 6-7 */
	@ParameterizedTest
    @MethodSource("dataException")
    void testGetAtPosException(int n)
    {
        Throwable exception= assertThrows(IllegalArgumentException.class,() -> listaBase.getAtPos(n));
    }
	
	
	/* CP 8 */
	@Test
	void testListaVacia(){
		Throwable exception = assertThrows(IllegalArgumentException.class,() -> listaVacia.getAtPos(1));
	}
	
	/* CP 9 */
	@Test
	void testListaUnElemento(){
		assertEquals("A",listaUnElem.getAtPos(1));
	}
	
}
