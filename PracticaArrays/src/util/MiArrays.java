package util;

public abstract class MiArrays {
	/**
	 * Este metodo realiza la media de los numeros del array pasado por parametro
	 * @param numeros array de enteros
	 * @return la media de los numeros de array
	 */
	public static float mediaNotas (int numeros []) {
		float sumaNumeros = 0;
		for (int i = 0; i < numeros.length; i++) {			
			if(numeros[i]>10 || numeros[i] < 0) { 
				throw new IllegalArgumentException("Los numeros deben estar entre 0 y 10"); 
				}
			sumaNumeros += numeros[i];
		}
		return sumaNumeros/numeros.length;
	}
	

	
}
