import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Ejer1 {
	
	  public static void main(String[] args) {
	        Ejer1 miEjer1 = new Ejer1();
	        miEjer1.iniciar();
	    }

	    private void iniciar() {
	        Hashtable<Integer, String> tablaNombres = new Hashtable<Integer, String>();

	        for (int i = 0; i < 5; i++) {
	        	Integer key=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Clave"));
	        	String nombre=JOptionPane.showInputDialog("Ingrese el nombre");
	        	tablaNombres.put(key, nombre); 
			}
	        
	        recorrerTablaHash(tablaNombres);
	        
	    }

		private void recorrerTablaHash(Hashtable<Integer, String> tabla) {
			Enumeration<Integer>enumerationKeys=tabla.keys();
			Enumeration<String>enumeration=tabla.elements();
			while (enumeration.hasMoreElements()) {
				System.out.println(enumerationKeys.nextElement()+ "-"+enumeration.nextElement());
			}
		
		}
	}

