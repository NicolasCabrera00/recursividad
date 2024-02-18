package conArray;

public class cantApariciones {
	
		public static int cantAp(int[] arr, int n) {
			if (arr.length == 0) { //arr ingresado ya quedo sin espacios. 
				return arr.length;
			}
			if (arr[0] == n) {
				return 1 +cantAp(resto.resto(arr), n);
			}
			return cantAp(resto.resto(arr), n);
		}
}
//RTA RECUR 1: 1 + cantAp( 4 , n )
//RTA RECUR 2:  cantAp(3, n)
//RTA RECUR 3: 1+ cantAp(2, n)
//RTA RECUR 4: 1+ cantAp(1, n)
//RTA RECUR 5: cantAP(0, n)
//
//final:  1+0+1+1+0
//MORALEJA: no pensar el caso base como la ultima recursion. si no como la primera de la pila
//que devuelve un resultado
