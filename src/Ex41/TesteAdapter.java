package Ex41;

import java.util.HashMap;
import java.util.TreeMap;

public class TesteAdapter {
	public static void main(String[] args) {
		int i[][] = {{1,2},{3,4},{5,6}};
		String[][] cv = { { "ch1", "ch2", "ch3" }, { "vl1", "vl2", "vl3" } };
		HashMap<Integer, Integer> m = HashMapAdapter.matrixToHashMap(i);
		TreeMap<String, String> mat = TreeMapAdapter.treeMap(cv);
		System.out.println(m.toString());
		System.out.println(mat.toString());
	}

}
