package challenge.job;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {

		TreeMap<Character, ArrayList<String>> map = new TreeMap<Character, ArrayList<String>>();

		ArrayList<String> itemsList = Items.itemsList();
		sortList(itemsList);

		for (int i = 0; i < itemsList.size(); i++) {
			char key = itemsList.get(i).charAt(0);
			ArrayList<String> collectionList = null;

			if (map.containsKey(key))
				collectionList = map.get(key);

			else {
				collectionList = new ArrayList<String>();
				map.put(key, collectionList);
			}
			collectionList.add(itemsList.get(i));
		}

		System.out.println(map);

	}

	private static <T> List<String> sortList(List<String> list) {
		list.sort((String o1, String o2) -> o1.compareToIgnoreCase(o2));
		return list;
	}

}
