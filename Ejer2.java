import java.util.Enumeration;
import java.util.Hashtable;
import javax.swing.JOptionPane;

public class Ejer2 {

	 public static void main(String[] args) {
	        Ejer2 ejemplo = new Ejer2();
	        ejemplo.iniciar();
	    }
	 private void iniciar() {
	        Hashtable<Integer, Double> productosPrecios = new Hashtable<Integer, Double>();

	        for (int i = 0; i < 3; i++) {
	            Integer idProducto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese ID del producto:"));
	            Double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto:"));
	            productosPrecios.put(idProducto, precio); 
	        }
	        
	        mostrarProductos(productosPrecios);
	    }

	    private void mostrarProductos(Hashtable<Integer, Double> productos) {
	        Enumeration<Integer> ids = productos.keys();
	        Enumeration<Double> precios = productos.elements();
	        while (precios.hasMoreElements()) {
	            System.out.println("Producto ID: " + ids.nextElement() + " - Precio: $" + precios.nextElement());
	        }
	    }
}
