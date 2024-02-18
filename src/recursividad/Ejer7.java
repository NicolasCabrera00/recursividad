package recursividad;

public interface Ejer7 {
		
	public static int cantAparaciones(String s, char c) {
		if (s.length() <= 0) {
			return 0;
		}
		if (s.charAt(0) == c) {
			return 1 + cantAparaciones(s.substring(1), c);
		}
		return cantAparaciones(s.substring(1), c);
	}
	
}
