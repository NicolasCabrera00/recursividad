package recursividad;

public class Ejer3 {
	
	public static String aterisco(String s) {
		if (s.length() <= 1) {//q tiene un char o 0 char
			return s;
		}
		return s.charAt(0) + "*" + aterisco(s.substring(1));
	}	
	
}
