package recursividad;

public class Ejer6 {
	public static boolean esAbecedaria(String s) {
		if (s.length() <= 1) {
			return true;
		}
		if (s.charAt(0) > s.charAt(1)) {
			return false;
		}
		return esAbecedaria(s.substring(1));
	}

}
