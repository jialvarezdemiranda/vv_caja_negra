package com.practica.cajanegra;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.cajanegra.SingleLinkedListImpl;

public class TestAddNTimes {
	
private SingleLinkedListImpl<String> listaBase;
	
	public static Stream<Arguments> dataNoExceptionsValoresLimite(){
		
		
		SingleLinkedListImpl<String> noseModifica=new SingleLinkedListImpl<String>("A","B","C","D","E","F");
		SingleLinkedListImpl<String> expected2=new SingleLinkedListImpl<String>("A","B","C","D","E","F","A");
		SingleLinkedListImpl<String> expected3=new SingleLinkedListImpl<String>("A","B","C","D","E","F","A","A","A");
		SingleLinkedListImpl<String> expected4=new SingleLinkedListImpl<String>("A","B","C","D","E","F","A","A","A","A","A");
		SingleLinkedListImpl<String> expected5=new SingleLinkedListImpl<String>("A","B","C","D","E","F","A","A","A","A","A","A");

		SingleLinkedListImpl<String> expected7=new SingleLinkedListImpl<String>("A","B","C","D","E","F","A","A","A","A","A","A","A");
		
		
		SingleLinkedListImpl<String> expected9=new SingleLinkedListImpl<String>("A","B","C","D","E","F","B");
		SingleLinkedListImpl<String> expected10=new SingleLinkedListImpl<String>("A","B","C","D","E","F","B","B","B");
		SingleLinkedListImpl<String> expected11=new SingleLinkedListImpl<String>("A","B","C","D","E","F","B","B","B","B","B");
		SingleLinkedListImpl<String> expected12=new SingleLinkedListImpl<String>("A","B","C","D","E","F","B","B","B","B","B","B");
	
		SingleLinkedListImpl<String> expected14=new SingleLinkedListImpl<String>("A","B","C","D","E","F","B","B","B","B","B","B","B");
		
		
	
		SingleLinkedListImpl<String> expected16=new SingleLinkedListImpl<String>("A","B","C","D","E","F","N");
		SingleLinkedListImpl<String> expected17=new SingleLinkedListImpl<String>("A","B","C","D","E","F","N","N","N");
		SingleLinkedListImpl<String> expected18=new SingleLinkedListImpl<String>("A","B","C","D","E","F","N","N","N","N","N");
		SingleLinkedListImpl<String> expected19=new SingleLinkedListImpl<String>("A","B","C","D","E","F","N","N","N","N","N","N");
	
		SingleLinkedListImpl<String> expected21=new SingleLinkedListImpl<String>("A","B","C","D","E","F","N","N","N","N","N","N","N");
		
	
		SingleLinkedListImpl<String> expected23=new SingleLinkedListImpl<String>("A","B","C","D","E","F","Y");
		SingleLinkedListImpl<String> expected24=new SingleLinkedListImpl<String>("A","B","C","D","E","F","Y","Y","Y");
		SingleLinkedListImpl<String> expected25=new SingleLinkedListImpl<String>("A","B","C","D","E","F","Y","Y","Y","Y","Y");
		SingleLinkedListImpl<String> expected26=new SingleLinkedListImpl<String>("A","B","C","D","E","F","Y","Y","Y","Y","Y","Y");

		SingleLinkedListImpl<String> expected28=new SingleLinkedListImpl<String>("A","B","C","D","E","F","Y","Y","Y","Y","Y","Y","Y");
		
	
		SingleLinkedListImpl<String> expected30=new SingleLinkedListImpl<String>("A","B","C","D","E","F","Z");
		SingleLinkedListImpl<String> expected31=new SingleLinkedListImpl<String>("A","B","C","D","E","F","Z","Z","Z");
		SingleLinkedListImpl<String> expected32=new SingleLinkedListImpl<String>("A","B","C","D","E","F","Z","Z","Z","Z","Z");
		SingleLinkedListImpl<String> expected33=new SingleLinkedListImpl<String>("A","B","C","D","E","F","Z","Z","Z","Z","Z","Z");
	
		SingleLinkedListImpl<String> expected35=new SingleLinkedListImpl<String>("A","B","C","D","E","F","Z","Z","Z","Z","Z","Z","Z");
		
	
		SingleLinkedListImpl<String> expected37=new SingleLinkedListImpl<String>("A","B","C","D","E","F","@");
		SingleLinkedListImpl<String> expected38=new SingleLinkedListImpl<String>("A","B","C","D","E","F","@","@","@");
		SingleLinkedListImpl<String> expected39=new SingleLinkedListImpl<String>("A","B","C","D","E","F","@","@","@","@","@");
		SingleLinkedListImpl<String> expected40=new SingleLinkedListImpl<String>("A","B","C","D","E","F","@","@","@","@","@","@");
	
		SingleLinkedListImpl<String> expected42=new SingleLinkedListImpl<String>("A","B","C","D","E","F","@","@","@","@","@","@","@");
		
	
		SingleLinkedListImpl<String> expected44=new SingleLinkedListImpl<String>("A","B","C","D","E","F","[");
		SingleLinkedListImpl<String> expected45=new SingleLinkedListImpl<String>("A","B","C","D","E","F","[","[","[");
		SingleLinkedListImpl<String> expected46=new SingleLinkedListImpl<String>("A","B","C","D","E","F","[","[","[","[","[");
		SingleLinkedListImpl<String> expected47=new SingleLinkedListImpl<String>("A","B","C","D","E","F","[","[","[","[","[","[");
	
		SingleLinkedListImpl<String> expected49=new SingleLinkedListImpl<String>("A","B","C","D","E","F","[","[","[","[","[","[","[");
		
		return Stream.of(
				Arguments.of("A",0,noseModifica),
				Arguments.of("A",1 ,expected2),
				Arguments.of("A",3,expected3),
				Arguments.of("A", 5,expected4),
				Arguments.of("A",6,expected5),
		
				Arguments.of("A", 7,expected7),
				
				Arguments.of("B",0,noseModifica),
				Arguments.of("B", 1,expected9),
				Arguments.of("B",3,expected10),
				Arguments.of("B", 5,expected11),
				Arguments.of("B",6,expected12),
				
				Arguments.of("B", 7,expected14),
				
				Arguments.of("N",0,noseModifica),
				Arguments.of("N", 1,expected16),
				Arguments.of("N",3,expected17),
				Arguments.of("N", 5,expected18),
				Arguments.of("N",6,expected19),
				
				Arguments.of("N",7, expected21),
				
				Arguments.of("Y",0,noseModifica),
				Arguments.of("Y", 1,expected23),
				Arguments.of("Y",3,expected24),
				Arguments.of("Y", 5,expected25),
				Arguments.of("Y",6,expected26),
				
				Arguments.of("Y",7 ,expected28),
				
				Arguments.of("Z",0,noseModifica),
				Arguments.of("Z", 1,expected30),
				Arguments.of("Z",3,expected31),
				Arguments.of("Z", 5,expected32),
				Arguments.of("Z",6,expected33),
				
				Arguments.of("Z", 7,expected35),
				
				Arguments.of("@",0,noseModifica),
				Arguments.of("@", 1,expected37),
				Arguments.of("@",3,expected38),
				Arguments.of("@", 5,expected39),
				Arguments.of("@",6,expected40),
				
				Arguments.of("@", 7,expected42),
				
				Arguments.of("[",0,noseModifica),
				Arguments.of("[", 1,expected44),
				Arguments.of("[",3,expected45),
				Arguments.of("[", 5,expected46),
				Arguments.of("[",6,expected47),
				
				Arguments.of("[", 7,expected49)
				);
	}
	
	public static Stream<Arguments> dataExceptionValoresLimite(){
        return Stream.of(
                Arguments.of("A",-1),
                Arguments.of("B",-1),
                Arguments.of("N",-1),
                Arguments.of("Y",-1),
                Arguments.of("Z",-1),
                Arguments.of("@",-1),
                Arguments.of("[",-1)
                );
    }
	
	public static Stream<Arguments> dataEspeciales(){
		SingleLinkedListImpl<String> expected50=new SingleLinkedListImpl<String>("A","A");
		SingleLinkedListImpl<String> expected51=new SingleLinkedListImpl<String>();
		SingleLinkedListImpl<String> expected52=new SingleLinkedListImpl<String>("A","B","C","D","E","F");
		SingleLinkedListImpl<String> input50=new SingleLinkedListImpl<String>();
		SingleLinkedListImpl<String> input51=new SingleLinkedListImpl<String>();
		SingleLinkedListImpl<String> input52=new SingleLinkedListImpl<String>("A","B","C","D","E","F");
		SingleLinkedListImpl<String> input53=new SingleLinkedListImpl<String>("A","B","C","D","E","F");
		
        return Stream.of(
                Arguments.of("A",2,expected50,input50),
                Arguments.of(null,2,expected51,input51),
                Arguments.of(null,2,expected52,input52),
                Arguments.of(Integer.valueOf(1),2, expected52,input53)
               
                );
    }
	
	@BeforeEach
	public void setUp()
	{
		listaBase=new SingleLinkedListImpl<String>("A","B","C","D","E","F");
	}
	
	@ParameterizedTest
	@MethodSource("dataNoExceptionsValoresLimite")
	void testAddNTimesNoException(String elemento,int n,SingleLinkedListImpl<String> expected)
	{
		listaBase.addNTimes(elemento,n);
		assertEquals(expected.toString(),listaBase.toString());
	}
	
	@ParameterizedTest
    @MethodSource("dataExceptionValoresLimite")
    void testAddNTimesException(String elem,int n)
    {
        Throwable exception= assertThrows(IllegalArgumentException.class,() -> listaBase.addNTimes(elem,n));
    }
	
	@ParameterizedTest
	@MethodSource("dataEspeciales")
	void testCasosEspeciales(String elemento,int n,SingleLinkedListImpl<String> expected, SingleLinkedListImpl<String> input)
	{
		input.addNTimes(elemento,n);
		assertEquals(expected.toString(),input.toString());
	}

}
