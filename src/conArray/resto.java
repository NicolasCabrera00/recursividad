package conArray;

public class resto {
		
	public static int[] resto(int[] ar) {
		int[] res = new int[ar.length-1];//pq va tener el tamaño del ingresado menos 1
			//incio    //condicion   //iteracion 
		for (int i = 1; i < ar.length; i++) { //para indexar fuera de rango i=1
			res[i-1] = ar[i];
		}
		return res;
	}
	
}
