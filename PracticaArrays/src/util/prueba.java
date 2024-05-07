package util;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mediana1[] = new int[]{0,0,6,2,8,1,2,8,5,4};
		int mediana2 [] = new int[]{6,8,3,1,0,8,8,4,2,1};
		System.out.println(MiArrays.medianaNotas(mediana1));
		System.out.println(MiArrays.medianaNotas(mediana2));
		System.out.println(MiArrays.maximaNota(mediana1));
	}

}
