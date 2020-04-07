package Ex72;

import java.util.Arrays;

public class Teste {

	public static void main(String[] args) {
		
		VetorDouble[] doub = new VetorDouble[10];
		
		for(int i=0 ; i<10 ; i++) {
			doub[i] = new VetorDouble(Math.floor(10*Math.random())+ Math.random());
		}
		
		Arrays.sort(doub);
		System.out.println("Ordenando somente pelas casas decimais: ");
		System.out.println(Arrays.toString(doub));
	}

}
