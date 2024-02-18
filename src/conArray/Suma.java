package conArray;

public class Suma {
	  
		public static int suma(int[] arr) {
			if (arr.length == 0) {
				return 0;
			}
			return arr[0] + suma(resto.resto(arr));
		}
}
