package ejercicio6;

public class Principal {
	public static void main(String[] args) {
		int arreglo1[] = new int[10];
		int arreglo2[] = new int[arreglo1.length];
		for (int i = 0; i < arreglo1.length; i++) {
			arreglo1[i] = i+1;
		}
		for (int i = 0; i < arreglo2.length; i++) {
			arreglo2[i] = i+1;
		}
		SumaArreglos procesos = new SumaArreglos();
		int [] suma = procesos.sumarArreglos(arreglo1, arreglo2);
		for (int i = 0; i < suma.length; i++) {
			System.out.println("la suma de los dos arreglos es: " + suma[i]);
		}
	}
}
