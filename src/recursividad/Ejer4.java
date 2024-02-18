package recursividad;

public class Ejer4 {
	public static String reverso(String s) {
		if (s.length() <= 1) { 
			return s;
		}
		return reverso(s.substring(1))   +  s.charAt(0);
	}
}
