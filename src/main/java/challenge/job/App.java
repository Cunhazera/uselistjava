package challenge.job;

import java.util.ArrayList;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {

		TreeMap<Character, ArrayList<String>> map = new TreeMap<Character, ArrayList<String>>();

		ArrayList<String> itemsList = Items.itemsList();

		for (int i = 0; i < itemsList.size(); i++) {
			char key = itemsList.get(i).charAt(0);
			ArrayList<String> col = null;
			if(map.containsKey(key)){
				col = map.get(key);
			}else{
				col = new ArrayList<String>();
				map.put(key, col);
			}
			col.add(itemsList.get(i));
		}

		System.out.println(map);

	}

}
