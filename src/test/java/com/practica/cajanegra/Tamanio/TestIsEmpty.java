package com.practica.cajanegra.Tamanio;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;
import com.cajanegra.SingleLinkedListImpl;

public class TestIsEmpty {
		
	
@Test
void testIsEmpty()
{
	SingleLinkedListImpl<String> input1=new SingleLinkedListImpl<String>();
	assertTrue(input1.isEmpty());
}
@Test
void testIsNotEmpty()
{
	SingleLinkedListImpl<String> input2=new SingleLinkedListImpl<String>("A");
	assertTrue(!input2.isEmpty());
}
}
