package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MiArrays;

class TestsMediana {
	private static int[] mediana1;
	private static int[] mediana2;
	private static int[] mediana3;

	@BeforeAll
	static void setup() {
	mediana1 = new int[]{0,0,6,2,8,1,2,8,5,4};
	mediana2 = new int[]{6,8,3,1,0,8,8,4,2,1};
	mediana3 = new int[]{9,-1,3,3,7,6,6,8,5,0};
	}
	
	@Test
	void testMedianaBien1() {
	 
	double numObtenido=MiArrays.medianaNotas(mediana1);
	double numEsperado=3.0;

	assertEquals(numEsperado,numObtenido);
	}
	
	@Test
	void testMedianaBien2() {
	 
	double numObtenido=MiArrays.medianaNotas(mediana2);
	double numEsperado=3.5;

	assertEquals(numEsperado,numObtenido);
	}

	@Test
	void testMediaMal() {
	Exception e = assertThrows(IllegalArgumentException.class,
	() -> MiArrays.medianaNotas(mediana3));

	String esperado = "Los numeros deben estar entre 0 y 10";
	String obtenido = e.getMessage();
	assertEquals(esperado, obtenido);
	}

}
