import javax.swing.JOptionPane;
import java.util.ArrayList;
public class UD7_Ej1_App {

	public static void main(String[] args) {
		ArrayList<String> Alumnos=new ArrayList<>();
	
		
		ArrayList<String> notasAlumnos=new ArrayList<>();
		int contF = 0;
		int alumnosT = 4;
		while (contF < alumnosT) {
			String nom = JOptionPane.showInputDialog("NOMBRE DEL ALUMNO");
			Alumnos.add(nom);
			int cont = 0;
			int todasnotas = 4;
			int operacion = 1;
			while (cont < todasnotas) {
				String num = JOptionPane.showInputDialog("NOTAS DE " + Alumnos.get(contF) );
				Integer notas = Integer.parseInt(num);
				operacion = operacion + notas;
				cont++;
				
			}
			operacion = operacion / todasnotas;
			String cadenaOperacion = operacion+"";
			notasAlumnos.add(cadenaOperacion);
			JOptionPane.showMessageDialog(null,"LA NOTA FINAL DE "+ Alumnos.get(contF)+ " es: " + notasAlumnos.get(contF));
			contF++;
		}
		
	}
	
	
	

}
