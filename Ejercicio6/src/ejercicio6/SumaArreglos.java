package ejercicio6;

public class SumaArreglos {
	int suma[];
	public int[] sumarArreglos(int[] arreglo1, int[] arreglo2) {
		suma = new int [arreglo1.length];
		for (int i = 0; i < arreglo2.length; i++) {
			suma[i] = arreglo1[i]+arreglo2[i];
		}
		return suma;
		
	}
}
