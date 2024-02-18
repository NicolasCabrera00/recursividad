package conArray;

public class estaOrdenado {
		public static boolean estaOrdenado(int[] arr) {
			if (arr.length == 1) {
				return true;
			}
			if (arr[0] >= arr[1]) {
				return false;
			}
			return estaOrdenado(resto.resto(arr));
			
		}
	
}
