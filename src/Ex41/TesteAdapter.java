package Ex41;

import java.util.HashMap;

public class TesteAdapter {
	public static void main(String[] args) {
		int i[][] = {{7,8},{9,10},{11,12}};
		HashMap<Integer, Integer> m = HashMapAdapter.matrixToHashMap(i);

		System.out.println(m.toString());
	}

}
