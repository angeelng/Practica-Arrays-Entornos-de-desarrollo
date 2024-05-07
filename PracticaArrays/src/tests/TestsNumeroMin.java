package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MiArrays;

class TestsNumeroMin {
	private static int[] numMin1;
	private static int[] numMin2;
	private static int[] numMin3;

	@BeforeAll
	static void setup() {
	numMin1 = new int[]{0,0,6,2,8,1,2,8,5,4};
	numMin2 = new int[]{6,8,3,1,4,10,8,4,2,1};
	numMin3 = new int[]{9,-1,3,3,7,6,6,8,5,0};
	}
	
	@Test
	void testNumeroMinBien1() {
	 
	double numObtenido=MiArrays.minimaNota(numMin1);
	double numEsperado=0;

	assertEquals(numEsperado,numObtenido);
	}
	
	@Test
	void testNumeroMinBien2() {
	 
	double numObtenido=MiArrays.minimaNota(numMin2);
	double numEsperado=1;

	assertEquals(numEsperado,numObtenido);
	}

	@Test
	void testNumeroMinMal() {
	Exception e = assertThrows(IllegalArgumentException.class,
	() -> MiArrays.minimaNota(numMin3));

	String esperado = "Los numeros deben estar entre 0 y 10";
	String obtenido = e.getMessage();
	assertEquals(esperado, obtenido);
	}

}
