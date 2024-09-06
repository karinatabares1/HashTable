import java.util.Enumeration;
import java.util.Hashtable;
import javax.swing.JOptionPane;
public class Ejer3 {

	 public static void main(String[] args) {
	        Ejer3 ejemplo = new Ejer3();
	        ejemplo.iniciar();
	    }
	 private void iniciar() {
	        Hashtable<String, Integer> nombresEdades = new Hashtable<String, Integer>();

	        for (int i = 0; i < 4; i++) {
	            String nombre = JOptionPane.showInputDialog("Ingrese el nombre:");
	            Integer edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de " + nombre + ":"));
	            nombresEdades.put(nombre, edad);
	        }

	        mostrarNombresEdades(nombresEdades);
	    }

	    private void mostrarNombresEdades(Hashtable<String, Integer> nombres) {
	        Enumeration<String> keys = nombres.keys();
	        Enumeration<Integer> values = nombres.elements();
	        while (values.hasMoreElements()) {
	            System.out.println("Nombre: " + keys.nextElement() + " - Edad: " + values.nextElement());
	        }
	    }
}
