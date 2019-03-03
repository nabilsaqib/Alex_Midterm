package datastructure;

import java.util.ArrayList;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(20);
		list.add(25);
		list.add(295);

		for (Integer data : list) {
			System.out.println(data);

		}

	}
}

/*
 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
 * Use For Each loop and while loop with Iterator to retrieve data.
 * Store all the sorted data into one of the databases.
 *
 */