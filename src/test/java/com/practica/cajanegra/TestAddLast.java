package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import com.cajanegra.SingleLinkedListImpl;

public class TestAddLast {

	private SingleLinkedListImpl<String> listaBase;
	
	public static Stream<Arguments> data(){
		SingleLinkedListImpl<String> expected1=new SingleLinkedListImpl<String>("A","B","C","D","E","F","A");
		SingleLinkedListImpl<String> expected2=new SingleLinkedListImpl<String>("A","B","C","D","E","F","B");
		SingleLinkedListImpl<String> expected3=new SingleLinkedListImpl<String>("A","B","C","D","E","F","N");
		SingleLinkedListImpl<String> expected4=new SingleLinkedListImpl<String>("A","B","C","D","E","F","Y");
		SingleLinkedListImpl<String> expected5=new SingleLinkedListImpl<String>("A","B","C","D","E","F","Z");
		SingleLinkedListImpl<String> expected6=new SingleLinkedListImpl<String>("A","B","C","D","E","F","@");
		SingleLinkedListImpl<String> expected7=new SingleLinkedListImpl<String>("A","B","C","D","E","F","[");
		
		return Stream.of(
				Arguments.of("A",expected1),
				Arguments.of("B", expected2),
				Arguments.of("N",expected3),
				Arguments.of("Y", expected4),
				Arguments.of("Z",expected5),
				Arguments.of("@", expected6),
				Arguments.of("[", expected7)
				);
	}
	
	public static Stream<Arguments> dataEspeciales(){
		SingleLinkedListImpl<String> expected9=new SingleLinkedListImpl<String>("A");
		SingleLinkedListImpl<String> expected10=new SingleLinkedListImpl<String>();
		SingleLinkedListImpl<String> expected11=new SingleLinkedListImpl<String>("A","B","C","D","E","F");
		SingleLinkedListImpl<String> input9=new SingleLinkedListImpl<String>();
		SingleLinkedListImpl<String> input10=new SingleLinkedListImpl<String>();
		SingleLinkedListImpl<String> input11=new SingleLinkedListImpl<String>("A","B","C","D","E","F");
		SingleLinkedListImpl<String> input12=new SingleLinkedListImpl<String>("A","B","C","D","E","F");
		
        return Stream.of(
                Arguments.of("A",expected9,input9),
                Arguments.of(null,expected10,input10),
                Arguments.of(null,expected11,input11),
                Arguments.of(Integer.valueOf(1), expected11,input12)
               
                );
    }
	
	
	@BeforeEach
	public void setUp()
	{
		listaBase=new SingleLinkedListImpl<String>("A","B","C","D","E","F");
	}
	
	@ParameterizedTest
	@MethodSource("data")
	void testAddLast(String elemento,SingleLinkedListImpl<String> expected)
	{
		listaBase.addLast(elemento);
		assertEquals(expected.toString(),listaBase.toString());
	}
	
	@ParameterizedTest
	@MethodSource("dataEspeciales")
	void testCasosEspeciales(String elemento,SingleLinkedListImpl<String> expected, SingleLinkedListImpl<String> input)
	{
		input.addLast(elemento);
		assertEquals(expected.toString(),input.toString());
	}
}
