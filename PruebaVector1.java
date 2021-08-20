package helloword;

public class PruebaVector1 {

    private String[] nombres = {"Daniel", "Alexander", "Andres", "Juan" , "José"};
    
    public void imprimir()
    {
    	//for(int f=0; f < nombres.length; f++) {
      //      System.out.print("Nombre:" + nombres[f] + " ");

 
      //  }	
    	
    	for(String nom : nombres) {
    		System.out.println("Nombre:" + nom);
    	}
    }
    
    
    public static void main(String[] ar) {
    	PruebaVector1 vector = new PruebaVector1();
    	vector.imprimir();
    }
}
