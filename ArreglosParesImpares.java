package helloword;

import java.util.Scanner;

public class ArreglosParesImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] caja,pares,impares;
		caja = new int[8];
		int totalPares = 0;
		int totalImpares = 0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese 5 numeros");
		for(int i = 0; i < caja.length; i++) {
			caja[i] = teclado.nextInt();
		}
		
		for(int i = 0; i < caja.length; i ++) {
			if(caja[i] % 2 == 0) {
				totalPares++;
			}
			else {
				totalImpares++;
			}
		}
		
		pares = new int[totalPares];
		impares = new int[totalImpares];
		int auxPar = 0;
		int auxImpar = 0;
		for(int i = 0; i < caja.length; i++) {
			if(caja[i] % 2 == 0) {
				pares[auxPar++] = caja[i];
			}
			else {
				impares[auxImpar++] = caja[i];
			}
		}
		
		System.out.println("pares");
		
		for(int i = 0; i < pares.length; i++) {
			System.out.println(pares[i] + "");
		}
		
		System.out.println("Impares");
		
		for(int i = 0; i < impares.length; i++) {
			System.out.println(impares[i] + "" );
		}
		
		
	}

}
