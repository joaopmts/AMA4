package Ex62;

import java.util.Arrays;

public class SelectionSort implements Sort{
	
	@Override
	public void sort(int[] v) {
		selectionSort(v);
		System.out.println("Metodo escolhido para ordenação Insertion Sort: " + Arrays.toString(v));
		
	}

	public void selectionSort(int v[]) {
		int i, j, min, x;
		for (i = 0; i < v.length - 1; ++i) {
			min = i;
			for (j = i + 1; j < v.length; ++j) {
				if (v[j] < v[min])
					min = j;
			}
			x = v[i];
			v[i] = v[min];
			v[min] = x;
		}
	}
}
