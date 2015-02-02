/*
 * Some test cases for testing the graph
 */
public class Test {

	public static void main(String[] args) {

		FriendShip graph = new FriendShip();

		Person alice = new Person("Alice");
		Person bob = new Person("Bob");
		Person charlie = new Person("Charlie");
		Person david = new Person("David");

		graph.addVertex(alice);
		graph.addVertex(bob);
		graph.addVertex(charlie);
		graph.addVertex(david);

		graph.addEdge(alice, bob);
		graph.addEdge(bob, alice);
		graph.addEdge(bob, charlie);
		graph.addEdge(charlie, bob);

		System.out.println(graph.getDistance(alice, bob)); // should print 1
		System.out.println(graph.getDistance(alice, charlie)); // should print 2
		System.out.println(graph.getDistance(alice, alice)); // should print 0
		System.out.println(graph.getDistance(alice, david)); // should print -1
	}

}
