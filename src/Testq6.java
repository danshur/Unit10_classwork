import java.util.HashMap;
import java.util.Map;

public class Testq6 {
		  public static void main(String[] args) {
		    Map<Person, String> map = new HashMap<Person, String>();
		    addPerson(map, "John Stewart", "345-17-8935", "13 main street");
		    addPerson(map, "John Stewart", "345-17-8935", "1 wall street");
		    addPerson(map, "John Stewart", "345-17-8935", "6 1st street");
		    System.out.println(map.get(new Person("John Stewart", "345-17-8935")));
		  }

public static void addPerson(Map<Person, String> map, String firstName, String lastName, String address) {
    Person p = new Person(firstName, lastName);
    map.put(p, address);
  }
}
