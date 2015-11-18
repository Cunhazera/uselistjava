package challenge.job;

import static challenge.job.Items.itemsList;

import java.util.ArrayList;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {

		TreeMap<Character, String> map = new TreeMap<Character, String>();

		ArrayList<String> itemsList = itemsList();
		
		for (int i = 0; i < itemsList.size(); i++) {
			char key = itemsList.get(i).charAt(0);
			map.put(key, itemsList.get(i));
		}

		System.out.println(map);

	}

}
