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

		if(graph.addVertex(alice) == -1)
			System.out.println("Error in adding vertex!");
		if(graph.addVertex(bob) == -1)
			System.out.println("Error in adding vertex!");
		if(graph.addVertex(charlie) == -1)
			System.out.println("Error in adding vertex!");
		if(graph.addVertex(david) == -1)
			System.out.println("Error in adding vertex!");
		
		if(graph.addEdge(alice, bob) == -1)
			System.out.println("Error in adding edge!");
		if(graph.addEdge(bob, alice) == -1)
			System.out.println("Error in adding edge!");
		if(graph.addEdge(bob, charlie) == -1)
			System.out.println("Error in adding edge!");
		if(graph.addEdge(charlie, bob) == -1)
			System.out.println("Error in adding edge!");
		
		System.out.println(graph.getDistance(alice, bob)); // should print 1
		System.out.println(graph.getDistance(alice, charlie)); // should print 2
		System.out.println(graph.getDistance(alice, alice)); // should print 0
		System.out.println(graph.getDistance(alice, david)); // should print -1
	}

}
