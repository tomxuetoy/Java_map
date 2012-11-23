// The code is from link: 
// http://www.blogjava.net/coderdream/archive/2007/10/31/157202.html
package tom;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * MapTest.java
 *
 * Provider: CoderDream's Studio
 *
 * History
 *    Date(DD/MM/YYYY)    Author          Description
 * ----------------------
 *    Oct 31, 2007        CoderDream        Created
 */

/**
 * @author CoderDream
 */
public class MapTest {

	/**
	 * <pre>
	 *         使用HashMap使用1：
	 *             用迭代器得到map.entrySet(),
	 *             然后通过迭代得到Map.Entry对象，最后打印。
	 *             打印结果未排序
	 * </pre>
	 * 
	 */
	public void f1() {
		Map map = new HashMap();
		map.put("1", "Level 1");
		map.put("2", "Level 2");
		map.put("3", "Level 3");
		map.put("4", "Level 4");
		map.put("F", "Level F");
		map.put("Q", "Level Q");
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();
			System.out.println("Key: " + e.getKey() + "; Value: "
					+ e.getValue());
		}
	}

	/**
	 * <pre>
	 * 使用泛型模式说明Map中存储的对象类型
	 * </pre>
	 */
	public void f2() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "Mon.");
		map.put("1", "Monday");
		map.put("one", "Monday");
		Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry entry = it.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

	/**
	 * <pre>
	 * 通过集合Set来得到HashMap中的对象
	 * </pre>
	 * 
	 */
	public void f3() {
		Map map = new HashMap();
		map.put("1", "Mon.");
		map.put("1", "Monday");
		map.put("one", "Monday");
		Iterator it = map.keySet().iterator();
		String tmpKey = null;
		while (it.hasNext()) {
			tmpKey = (String) it.next();
			System.out
					.println("Key: " + tmpKey + "; Value: " + map.get(tmpKey));
		}
	}

	/**
	 * <pre>
	 *     使用TreeMap代替HashMap，取得结果是排序后的结果
	 * </pre>
	 */
	public void f4() {
		Map map = new TreeMap();
		map.put("1", "Level 1");
		map.put("2", "Level 2");
		map.put("3", "Level 3");
		map.put("4", "Level 4");
		map.put("F", "Level F");
		map.put("Q", "Level Q");
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();
			System.out.println("Key: " + e.getKey() + "; Value: "
					+ e.getValue());
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MapTest mt = new MapTest();
		System.out.println("----------f1()----------");
		mt.f1();
		System.out.println("----------f2()----------");
		mt.f2();
		System.out.println("----------f3()----------");
		mt.f3();
		System.out.println("----------f4()----------");
		mt.f4();
	}
}