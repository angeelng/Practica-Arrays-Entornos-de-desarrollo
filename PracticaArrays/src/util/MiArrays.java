package util;

import java.util.Arrays;

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
	
	public static float medianaNotas (int numeros []) {
		Arrays.sort(numeros);
		float resultado=0;	
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]>10 || numeros[i]<0) {
				throw new IllegalArgumentException("Los numeros deben estar entre 0 y 10");
			}
		}
		if(numeros.length%2==0) {
			resultado=numeros[(numeros.length/2)-1]+ numeros[numeros.length/2];
			resultado/=2;
		} else {
			resultado=numeros[(numeros.length-1)/2];
		}
		return resultado;
		}
	
	

	
}
