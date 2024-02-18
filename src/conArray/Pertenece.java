package conArray;

public class Pertenece {
	public static boolean pertenece(int[] a, int n) {
		if (a.length == 1) {
			return false;
		}
		if(a[0] != n) {
		return pertenece(resto.resto(a), n);
		}
		return true;
	}
}
