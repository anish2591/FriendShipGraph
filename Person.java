 /*
  * A class which creates a Person object for each individual 
  * node in the graph. The object contains the name of the person
  * and a list of the friends that he/she is directly connected
  * to in the graph
  */
import java.util.ArrayList;

public class Person {

	String name;
	boolean visited;
	ArrayList<Person> friends;
	
	public Person(String name)
	{
		this.name = name;
		this.visited = false;
		this.friends = new ArrayList<Person>();
	}
	
}
