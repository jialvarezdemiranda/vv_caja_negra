package com.practica.cajanegra.Add;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.cajanegra.SingleLinkedListImpl;

public class TestAddAtPos {
	
private SingleLinkedListImpl<String> listaBase;

	
	public static Stream<Arguments> dataNoExceptions(){
		
		
		SingleLinkedListImpl<String> expected1=new SingleLinkedListImpl<String>("A", "A","B","C","D","E","F");
		SingleLinkedListImpl<String> expected2=new SingleLinkedListImpl<String>("A", "A","B","C","D","E","F");
		SingleLinkedListImpl<String> expected3=new SingleLinkedListImpl<String>("A","B","A","C","D","E","F");
		SingleLinkedListImpl<String> expected4=new SingleLinkedListImpl<String>("A","B","C","D","A","E","F");
		SingleLinkedListImpl<String> expected5=new SingleLinkedListImpl<String>("A","B","C","D","E","A","F");

		SingleLinkedListImpl<String> expected7=new SingleLinkedListImpl<String>("A","B","C","D","E","F","A");
		
		SingleLinkedListImpl<String> expected8=new SingleLinkedListImpl<String>("B","A","B","C","D","E","F");
		SingleLinkedListImpl<String> expected9=new SingleLinkedListImpl<String>("A","B","B","C","D","E","F");
		SingleLinkedListImpl<String> expected10=new SingleLinkedListImpl<String>("A","B","B","C","D","E","F");
		SingleLinkedListImpl<String> expected11=new SingleLinkedListImpl<String>("A","B","C","D","B","E","F");
		SingleLinkedListImpl<String> expected12=new SingleLinkedListImpl<String>("A","B","C","D","E","B","F");
	
		SingleLinkedListImpl<String> expected14=new SingleLinkedListImpl<String>("A","B","C","D","E","F","B");
		
		
		SingleLinkedListImpl<String> expected15=new SingleLinkedListImpl<String>("N","A","B","C","D","E","F");
		SingleLinkedListImpl<String> expected16=new SingleLinkedListImpl<String>("A","N","B","C","D","E","F");
		SingleLinkedListImpl<String> expected17=new SingleLinkedListImpl<String>("A","B","N","C","D","E","F");
		SingleLinkedListImpl<String> expected18=new SingleLinkedListImpl<String>("A","B","C","D","N","E","F");
		SingleLinkedListImpl<String> expected19=new SingleLinkedListImpl<String>("A","B","C","D","E","N","F");
	
		SingleLinkedListImpl<String> expected21=new SingleLinkedListImpl<String>("A","B","C","D","E","F","N");
		
		SingleLinkedListImpl<String> expected22=new SingleLinkedListImpl<String>("Y","A","B","C","D","E","F");
		SingleLinkedListImpl<String> expected23=new SingleLinkedListImpl<String>("A","Y","B","C","D","E","F");
		SingleLinkedListImpl<String> expected24=new SingleLinkedListImpl<String>("A","B","Y","C","D","E","F");
		SingleLinkedListImpl<String> expected25=new SingleLinkedListImpl<String>("A","B","C","D","Y","E","F");
		SingleLinkedListImpl<String> expected26=new SingleLinkedListImpl<String>("A","B","C","D","E","Y","F");

		SingleLinkedListImpl<String> expected28=new SingleLinkedListImpl<String>("A","B","C","D","E","F","Y");
		
		SingleLinkedListImpl<String> expected29=new SingleLinkedListImpl<String>("Z","A","B","C","D","E","F");
		SingleLinkedListImpl<String> expected30=new SingleLinkedListImpl<String>("A","Z","B","C","D","E","F");
		SingleLinkedListImpl<String> expected31=new SingleLinkedListImpl<String>("A","B","Z","C","D","E","F");
		SingleLinkedListImpl<String> expected32=new SingleLinkedListImpl<String>("A","B","C","D","Z","E","F");
		SingleLinkedListImpl<String> expected33=new SingleLinkedListImpl<String>("A","B","C","D","E","Z","F");
	
		SingleLinkedListImpl<String> expected35=new SingleLinkedListImpl<String>("A","B","C","D","E","F","Z");
		
		SingleLinkedListImpl<String> expected36=new SingleLinkedListImpl<String>("@","A","B","C","D","E","F");
		SingleLinkedListImpl<String> expected37=new SingleLinkedListImpl<String>("A","@","B","C","D","E","F");
		SingleLinkedListImpl<String> expected38=new SingleLinkedListImpl<String>("A","B","@","C","D","E","F");
		SingleLinkedListImpl<String> expected39=new SingleLinkedListImpl<String>("A","B","C","D","@","E","F");
		SingleLinkedListImpl<String> expected40=new SingleLinkedListImpl<String>("A","B","C","D","E","@","F");
	
		SingleLinkedListImpl<String> expected42=new SingleLinkedListImpl<String>("A","B","C","D","E","F","@");
		
		SingleLinkedListImpl<String> expected43=new SingleLinkedListImpl<String>("[","A","B","C","D","E","F");
		SingleLinkedListImpl<String> expected44=new SingleLinkedListImpl<String>("A","[","B","C","D","E","F");
		SingleLinkedListImpl<String> expected45=new SingleLinkedListImpl<String>("A","B","[","C","D","E","F");
		SingleLinkedListImpl<String> expected46=new SingleLinkedListImpl<String>("A","B","C","D","[","E","F");
		SingleLinkedListImpl<String> expected47=new SingleLinkedListImpl<String>("A","B","C","D","E","[","F");
	
		SingleLinkedListImpl<String> expected49=new SingleLinkedListImpl<String>("A","B","C","D","E","F","[");
		
		return Stream.of(
				Arguments.of("A",1,expected1),
				Arguments.of("A",2 ,expected2),
				Arguments.of("A",3,expected3),
				Arguments.of("A",5,expected4),
				Arguments.of("A",6,expected5),
		
				Arguments.of("A", 7,expected7),
				
				Arguments.of("B",1,expected8),
				Arguments.of("B",2,expected9),
				Arguments.of("B",3,expected10),
				Arguments.of("B",5,expected11),
				Arguments.of("B",6,expected12),
				
				Arguments.of("B",7,expected14),
				
				Arguments.of("N",1,expected15),
				Arguments.of("N",2,expected16),
				Arguments.of("N",3,expected17),
				Arguments.of("N",5,expected18),
				Arguments.of("N",6,expected19),
				
				Arguments.of("N",7,expected21),
				
				Arguments.of("Y",1,expected22),
				Arguments.of("Y",2,expected23),
				Arguments.of("Y",3,expected24),
				Arguments.of("Y",5,expected25),
				Arguments.of("Y",6,expected26),
				
				Arguments.of("Y",7,expected28),
				
				Arguments.of("Z",1,expected29),
				Arguments.of("Z",2,expected30),
				Arguments.of("Z",3,expected31),
				Arguments.of("Z",5,expected32),
				Arguments.of("Z",6,expected33),
				
				Arguments.of("Z",7,expected35),
				
				Arguments.of("@",1,expected36),
				Arguments.of("@",2,expected37),
				Arguments.of("@",3,expected38),
				Arguments.of("@",5,expected39),
				Arguments.of("@",6,expected40),
				
				Arguments.of("@",7,expected42),
				
				Arguments.of("[",1,expected43),
				Arguments.of("[",2,expected44),
				Arguments.of("[",3,expected45),
				Arguments.of("[",5,expected46),
				Arguments.of("[",6,expected47),
				
				Arguments.of("[",7,expected49)
				);
	}
	
	public static Stream<Arguments> dataException(){
        return Stream.of(
                Arguments.of("A",0),
                Arguments.of("B",0),
                Arguments.of("N",0),
                Arguments.of("Y",0),
                Arguments.of("Z",0),
                Arguments.of("@",0),
                Arguments.of("[",0)
                );
    }
	
	public static Stream<Arguments> dataEspeciales(){
		SingleLinkedListImpl<String> expected50=new SingleLinkedListImpl<String>("A");
		SingleLinkedListImpl<String> expected51=new SingleLinkedListImpl<String>();
		SingleLinkedListImpl<String> expected52=new SingleLinkedListImpl<String>("A","B","C","D","E","F");
		SingleLinkedListImpl<String> input1=new SingleLinkedListImpl<String>();
		SingleLinkedListImpl<String> input2=new SingleLinkedListImpl<String>();
		SingleLinkedListImpl<String> input3=new SingleLinkedListImpl<String>("A","B","C","D","E","F");
		SingleLinkedListImpl<String> input4=new SingleLinkedListImpl<String>("A","B","C","D","E","F");
		
        return Stream.of(
                Arguments.of("A",1,expected50,input1),
                Arguments.of(null,1,expected51,input2),
                Arguments.of(null,1,expected52,input3),
                Arguments.of(Integer.valueOf(1),1, expected52,input4)
               
                );
    }
	
	@BeforeEach
	public void setUp()
	{
		listaBase=new SingleLinkedListImpl<String>("A","B","C","D","E","F");
		
	}
	
	@ParameterizedTest
	@MethodSource("dataNoExceptions")
	void testAddAtPosNoException(String elemento,int n,SingleLinkedListImpl<String> expected)
	{
		listaBase.addAtPos(elemento,n);
		assertEquals(expected.toString(),listaBase.toString());
	}
	
	@ParameterizedTest
    @MethodSource("dataException")
    void testAddAtPosException(String elem,int n)
    {
        Throwable exception= assertThrows(IllegalArgumentException.class,() -> listaBase.addAtPos(elem, n));
    }

	
	@ParameterizedTest
	@MethodSource("dataEspeciales")
	void testCasosEspeciales(String elemento,int p,SingleLinkedListImpl<String> expected, SingleLinkedListImpl<String> input)
	{
		input.addAtPos(elemento,p);
		assertEquals(expected.toString(),input.toString());
	}

	
}