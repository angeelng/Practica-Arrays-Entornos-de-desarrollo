package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MiArrays;

class TestsNumeroMax {
	private static int[] numMayor1;
	private static int[] numMayor2;
	private static int[] numMayor3;

	@BeforeAll
	static void setup() {
	numMayor1 = new int[]{0,0,6,2,8,1,2,8,5,4};
	numMayor2 = new int[]{6,8,3,1,0,10,8,4,2,1};
	numMayor3 = new int[]{9,-1,3,3,7,6,6,8,5,0};
	}
	
	@Test
	void testNumeroMaxBien1() {
	 
	double numObtenido=MiArrays.maximaNota(numMayor1);
	double numEsperado=8;

	assertEquals(numEsperado,numObtenido);
	}
	
	@Test
	void testNumeroMaxBien2() {
	 
	double numObtenido=MiArrays.maximaNota(numMayor2);
	double numEsperado=10;

	assertEquals(numEsperado,numObtenido);
	}

	@Test
	void testNumeroMaxMal() {
	Exception e = assertThrows(IllegalArgumentException.class,
	() -> MiArrays.maximaNota(numMayor3));

	String esperado = "Los numeros deben estar entre 0 y 10";
	String obtenido = e.getMessage();
	assertEquals(esperado, obtenido);
	}

}
