// The code is from: http://39382728.blog.163.com/blog/static/353600692010322101021383/
package tom;

import java.util.HashMap;
import java.util.TreeMap;

public class TestTreeMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// HashMap是无序的
		prt("The following is HashMap");
		HashMap<String, Object> hashMap = new HashMap<String, Object>();
		hashMap.put("004", new Integer(40));
		hashMap.put("003", new Integer(30));
		hashMap.put("001", new Integer(10));
		hashMap.put("002", new Integer(20));

		prt(hashMap);
		// TreeMap是有序的
		prt("The following is TreeMap");
		TreeMap<String, Object> treeMap = new TreeMap<String, Object>();
		treeMap.put("004", new Integer(40));
		treeMap.put("003", new Integer(30));
		treeMap.put("001", new Integer(10));
		treeMap.put("002", new Integer(20));

		prt(treeMap);

	}

	private static void prt(Object obj) {
		System.out.println(obj);
	}

}
