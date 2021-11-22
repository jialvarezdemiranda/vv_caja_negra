package com.practica.cajanegra.OtrasOperaciones;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import com.cajanegra.SingleLinkedListImpl;

public class TestIterator {

	
private SingleLinkedListImpl<String> listaBase;
	
	
	
	@BeforeEach
	public void setUp()
	{
		listaBase=new SingleLinkedListImpl<String>("A","B","C");
	}
	
	@Test
	@DisplayName("El metodo debe devolver algo")
	public void IteratorTest() {
		Iterator it=listaBase.iterator();
		Assertions.assertTrue(it instanceof Iterator);
		Assertions.assertEquals("A", it.next());
		Assertions.assertEquals("B", it.next());
		Assertions.assertEquals("C", it.next());	
		
	}
}
