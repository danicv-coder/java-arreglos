package helloword;
import java.util.Scanner;


public class ArreglosCombinados {

	public static void main(String[] args) {
		//
		
		int[] a,b,c;
		a = new int[10];
		b = new int[10];
		c = new int[20];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = i + 1;
			System.out.print(a[i]);;
		}
		
		for(int i = 0; i < b.length; i++) {
			b[i] = (i + 1)*5;
			System.out.print(b[i]);
		}
		int aux = 0;
		for(int i = 0; i < b.length; i++) {
			c[aux++] = a[i];
			c[aux++] = b[i];
		}
		
		for(int i = 0; i < c.length; i++) {
			System.out.println("indice: " + i + " valor: " + c[i] );
		}
		
		//Sabes cual es el numero mayor en un arreglo
		
		int[] d = new int[5];
		Scanner teclado  = new Scanner(System.in);
		
		System.out.println("Ingrese 5 enteros");
		for(int i = 0; i < d.length; i++) {
			a[i] = teclado.nextInt();
		}
		int max = 0;
		for(int i = 0; i < d.length; i++) {
			max = (a[max] > a[i])? max: i;
		}
		System.out.println("El valor maximo es: " + a[max]);
		
		//Dectectar como esta ordenado un arreglo;
		
		int[] e = new int[5];
		Scanner ss  = new Scanner(System.in);
		System.out.println("Ingrese numeros");
		
		for(int i = 0; i < e.length; i++) {
			e[i] = ss.nextByte();
		}
		
		boolean ascendente = false;
		boolean descendente = false;
		
		for(int i = 0; i < e.length - 1; i++) {
			if(e[i] > e[i + 1]) {
				descendente = true;
			}
			if(e[i] < e[i +1]) {
				ascendente = true;
			}
		}
		
		if(ascendente == true && descendente == true) {
			System.out.println("Arreglo desordenado");
		}
		
		if(ascendente == false && descendente == false) {
			System.out.println("Arreglo = todos son iguales");
		}
		
		if(ascendente == true && descendente == false) {
			System.out.println("Arreglo ordenado de forma descendente");
		}
		
		if(ascendente == false  && descendente == true) {
			System.out.println("Arreglo ordenado de forma ascendente");
		}
		
	}
	

}
