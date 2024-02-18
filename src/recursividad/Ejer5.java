package recursividad;

public class Ejer5 {
	public static String combinar(String s, String s2) {
		if (s.length() <= 1) {
			return s;
		}
		if (s2.length() <=1) {
			return s2;
		}
		if (s.charAt(0) < s2.charAt(0)) {
			return s.charAt(0) + combinar(s.substring(1), s2);
		}
		if (s.charAt(0) == s2.charAt(0)) {
			return s.charAt(0) + s2.charAt(0) + combinar(s.substring(1), s2.substring(1));
		}
		return s2.charAt(0) + combinar(s2.substring(1), s);
	}
}
