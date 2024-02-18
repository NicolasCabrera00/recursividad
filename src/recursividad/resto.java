package recursividad;

public class resto {
	
	public static String resto(String s) {
		String Salida = "";
		for (int i = 0; i < s.length(); i++) {

			Salida =  Salida + s.charAt(i);

		}
		return Salida;
	}
	
}
