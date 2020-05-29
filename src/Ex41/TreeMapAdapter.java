package Ex41;

import java.util.TreeMap;

public class TreeMapAdapter extends TreeMap <Integer , Integer> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static TreeMap<String, String> treeMap(String[][] mat) {
		TreeMap<String, String> map = new TreeMap<String, String>();
		for (int i = 0; i < mat[0].length; i++) {
			map.put(mat[0][i], mat[1][i]);
		}
		return map;
	}

}