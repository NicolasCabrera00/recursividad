package recursividad;

public class Ejer2 {
	
//	for (int i = 0; i < palabra.length(); i++) {
//		System.out.print(palabra.charAt(i) + " ");		
//		}
	public static String  Espaciado(String s) {
			if (s.length() <= 1) {//que tiene un char o ningun char
				return s;
			}
			
			return s.charAt(0) + " "  + Espaciado(s.substring(1)); 
// uso substring(1) y no subtring(0) porque el char 0 ya lo use en la concatenacion
	}
	
	
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println("String: " + s);
//		if (s.length() <= 1) {
//			System.out.println("String dentro del if: "+ s);
//			return s;
//		}
//		
//		return s.charAt(0) + "." + Espaciado(s.substring(1));

