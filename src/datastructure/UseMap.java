package datastructure;

import java.util.HashMap;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {

		Map<String,String> map = new HashMap<String, String>();
		map.put("USA", " New York ");
		map.put("UK", " London" );
		map.put("India", " Kalkata");
		map.put("Bangladesh", " Dhaka");

		System.out.println(map.get("USA"));
		System.out.println(map.get("UK"));
		System.out.println(map.get("India"));
		System.out.println(map.get("Bangladesh"));



		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

	}
}
