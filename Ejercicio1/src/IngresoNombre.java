import javax.swing.JOptionPane;

public class IngresoNombre {
	public void imprimirNombre(){
		String nombre = JOptionPane.showInputDialog("ingrese su nombre completo");
		System.out.println("hola " + nombre);
	}
}
