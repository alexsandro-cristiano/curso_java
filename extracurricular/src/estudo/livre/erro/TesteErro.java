package estudo.livre.erro;

public class TesteErro {

	public static void main(String[] args) {
		  System.out.println("inicio do main");
	      metodo1();
	      System.out.println("fim do main");
	  }

	  static void metodo1() {
	      System.out.println("inicio do metodo1");
	      metodo2();
	      System.out.println("fim do metodo1");
	  }

	  static void metodo2() {
	      System.out.println("inicio do metodo2");
	      int[] vet = new int[5];
	 //     try {
		      for(int i=0 ; i < 6 ; i++) {
		    	  vet[i] = i+2;
		      }
	   //   }
	     // catch(Exception e) {
	    //	  e.printStackTrace();
	      //}
	      System.out.println("fim do metodo2");
	  }
}
