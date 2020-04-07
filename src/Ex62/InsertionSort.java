package Ex62;

import java.util.Arrays;

public class InsertionSort implements Sort{

	@Override
	public void sort(int[] v) {
		insertionSort(v);
		System.out.println("Metodo escolhido para ordenação Insertion Sort: " + Arrays.toString(v));
		
	}

	public void insertionSort(int v[]) {
		int i, j, x;
		for (j = 1; j < v.length; ++j) {
			x = v[j];
			for (i = j - 1; i >= 0 && v[i] > x; --i) {
				v[i + 1] = v[i];
			}
			v[i + 1] = x;
		}
	}
}
