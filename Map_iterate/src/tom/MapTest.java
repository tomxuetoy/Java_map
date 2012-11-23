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
	 *         ʹ��HashMapʹ��1��
	 *             �õ������õ�map.entrySet(),
	 *             Ȼ��ͨ�������õ�Map.Entry��������ӡ��
	 *             ��ӡ���δ����
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
	 * ʹ�÷���ģʽ˵��Map�д洢�Ķ�������
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
	 * ͨ������Set���õ�HashMap�еĶ���
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
	 *     ʹ��TreeMap����HashMap��ȡ�ý���������Ľ��
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