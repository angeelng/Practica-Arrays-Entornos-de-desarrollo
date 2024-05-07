package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MiArrays;

class TestsMedia {
	private static int[] media1;
	private static int[] media2;
	private static int[] media3;

	@BeforeAll
	static void setup() {
	media1 = new int[]{3,3,6,3,8,1,2,8,5,5};
	media2 = new int[]{6,8,3,1,0,8,8,4,2,5};
	media3 = new int[]{9,-1,3,3,7,6,6,8,5,0};
	}

	@Test
	void testMediaBien1() {
	 
	double numObtenido=MiArrays.mediaNotas(media1);
	double numEsperado=4.4;

	assertEquals(numEsperado,numObtenido);
	}
	@Test
	void testMediaBien2() {
	 
	double numObtenido=MiArrays.mediaNotas(media2);
	double numEsperado=4.5;

	assertEquals(numEsperado,numObtenido);
	}

	@Test
	void testMediaMal() {
	Exception e = assertThrows(IllegalArgumentException.class,
	() -> MiArrays.mediaNotas(media3));

	String esperado = "Los numeros deben estar entre 0 y 10";
	String obtenido = e.getMessage();
	assertEquals(esperado, obtenido);
	}
}