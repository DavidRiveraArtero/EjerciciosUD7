import javax.swing.JOptionPane;
import java.util.ArrayList;

public class UD7_Ej2_App {

	public static void main(String[] args) {
		ArrayList<String> elementos = new ArrayList<>();
		ArrayList<Integer> cantidad = new ArrayList<>();
		ArrayList<Integer> Precio = new ArrayList<>();

		int contE = 0;
		String listaCompra = JOptionPane.showInputDialog("CUANTOS PRODUCTOS HAS COMPRADO: ");
		Integer Cantidad = Integer.parseInt(listaCompra);
		while (contE < Cantidad) {
			// NOMBRE DE LOS ELEMENTOS
			String listaCompra2 = JOptionPane.showInputDialog("NOMBRE DEL PRODUCTO: ");
			elementos.add(listaCompra2);

			// CANTIDAD DE CADA ELEMENTO
			String CantidadComprada = JOptionPane.showInputDialog("CUANTOS HAS COMPRADO: ");
			Integer CantidadComp = Integer.parseInt(CantidadComprada);
			cantidad.add(CantidadComp);

			// PRECIO CADA ELEMENTO CON SU IVA
			int num1 = 1;
			int num2 = 10;
			int random = (int) Math.floor(Math.random() * (num1 - (num2 + 1)) + (num2));
			double prec = random;

			int cantidadTotal = 0;
			cantidadTotal = (int) (prec * CantidadComp);

			final double IVA = 0.21;
			int resultado = 0;
			resultado = (int) (cantidadTotal + (cantidadTotal * IVA));
			Precio.add(resultado);
			contE++;
		}

		for (Object o : elementos) {
			System.out.println("Nombre: " + o);

		}
		for (Object a : cantidad) {
			System.out.println("Has comprado: " + a);
		}
		int precioF = 0;

		for (int i = 0; i < Precio.size(); i++) {
			precioF = precioF + Precio.get(i);
		}
		System.out.print("LO QUE TIENES QUE PAGAR ES: " + precioF);

		// LO QUE EL USUARIO PAGARA:
		String pagaCliente = JOptionPane.showInputDialog("CUANTO VAS A PAGAR: ");
		Integer PagaC = Integer.parseInt(pagaCliente);

		if (PagaC < precioF) {
			JOptionPane.showConfirmDialog(null, "TE FALTA POR PAGAR " + (precioF - PagaC));
		} else if (PagaC > precioF) {
			JOptionPane.showConfirmDialog(null, "LE TENEMOS QUE DAR " + (PagaC - precioF));
		} else {
			JOptionPane.showConfirmDialog(null, "TODO CORRECTO");
		}
	}

}
