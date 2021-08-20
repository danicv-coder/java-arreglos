package helloword;

import java.util.Arrays;
import java.util.Collections;

public class Arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] productos = new String[8];
		int total = productos.length;
		productos[0] = "Samsung s21Plus";
		productos[1] = "Tablet";
		productos[2] = "SmarTv";
		productos[3] = "Nevera";
		productos[4] = "Lavadora";
		productos[5] = "Mouse";
		productos[6] = "Notebook";
		productos[7] = "Audifonos";
		
		
		String prod1 = productos[0];
		String prod2 = productos[1];
		String prod3 = productos[2];
		String prod4 = productos[3];
		String prod5 = productos[4];
		String prod6 = productos[5];
		String prod7 = productos[6];
		String prod8 = productos[7];
		
		//Arrays es una clase que contiene distintos metodos de ayudas para los arreglos  con sort se puede ordenar de forma alfabetica y numerica
		Arrays.sort(productos);
		
		for(String pro : productos) {
			System.out.println("Productos:" + pro);
		}
		
		//Mostrar los elementos de manera descendente 
		Collections.reverse(Arrays.asList(productos)); // Colletions solo acepta arregos de tipos list y con Arrays.asList() convierto el arrego de productos es un arreglos de tipo list
		for(int i = 0; i < total; i++) {
			System.out.println("indice: " + (total - 1 - i) + " Productos: " + productos[total - 1 - i] );
		}
		
		int[] numeros = new int[5];
		numeros[0] = 45;
		numeros[1] = 20;
		numeros[2] = 3;
		numeros[3] = -5;
		numeros[4] = 5;
		
		int j = numeros[0];
		int k = numeros[1];
		int l = numeros[2];
		int m = numeros[3];
		int n = numeros[4];
		
		Arrays.sort(numeros);
		
		for(int num : numeros) {
		System.out.println("Numero:" + num);
		}
		
		//imprimir el primer numero con el utlimo 
		
		int[] num = new int[10];
		
		for(int i = 0; i < num.length; i++) {
			num[i] = i + 1;
			System.out.println(num[i]);
		}
		
		for(int i = 0; i < num.length - 1; i++) {
			System.out.print(num[i] + " ");
			System.out.println(num[num.length -1 -i]);
		}
	}

}
