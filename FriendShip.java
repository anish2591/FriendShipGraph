import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class FriendShip {

	private static HashSet<Person> nodes;

	/* Initialize the graph */
	public FriendShip() {
		nodes = new HashSet<Person>();
	}

	/* Add a vertex to the graph */
	public static int addVertex(Person name) {
		if (name == null)
			return -1;

		nodes.add(name);

		return 1;
	}

	/* Add a connection between two nodes in the graph */
	public static int addEdge(Person person1, Person person2) {
		if (person1 == null || person2 == null)
			return -1;

		person1.friends.add(person2);

		return 1;
	}

	/*
	 * Get the distance between two nodes in the graph by performing a BFS on
	 * the nodes
	 */
	public static int getDistance(Person person1, Person person2) {
		if (person1 == null || person2 == null)
			return -1;

		int distance = 0;

		if (person1.name.equalsIgnoreCase(person2.name))
			return distance;

		Queue<ArrayList<Person>> queue = new LinkedList<ArrayList<Person>>();

		queue.offer(person1.friends);

		while (!queue.isEmpty()) {
			distance++;

			int size = queue.size();

			for (int i = 0; i < size; i++) {
				ArrayList<Person> node = queue.poll();
				for (int j = 0; j < node.size(); j++) {

					if (node.get(j).name.equalsIgnoreCase(person2.name))
						return distance;

					if (!node.get(j).visited
							&& (!node.get(j).friends.isEmpty()))
						queue.offer(node.get(j).friends);

					node.get(j).visited = true;
				}
			}

		}

		return -1;
	}

}
