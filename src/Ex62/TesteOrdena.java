package Ex62;

import java.util.Random;

public abstract class TesteOrdena {

	public static void main(String[] args) {

		int v[] = {5, 3 , 1 , 4 , 2 , 7 , 8 , 10 , 6 , 9 };
		Random random =  new Random();
		int numero = random.nextInt(4);
		
		
		if(numero == 0) {
			BubbleSort sorte = new BubbleSort();
			sorte.sort(v);
		}
		if(numero == 1) {
			SelectionSort sorte = new SelectionSort();
			sorte.sort(v);
		}
		if(numero == 2) {
			InsertionSort sorte = new InsertionSort();
			sorte.sort(v);
		}
		if(numero == 3) {
			QuickSort sorte = new QuickSort();
			sorte.sort(v);
		
		}
		
		System.out.println("\n " + numero);

	}

}
