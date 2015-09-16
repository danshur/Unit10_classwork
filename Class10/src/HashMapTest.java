import java.util.HashMap;

public class HashMapTest {

	private HashMap<String, FullName> fullNameMap = new HashMap<>();

	// Adds name to the map with the last name as the key.
	public void add(FullName name) throws Exception {
		String last = name.getLastName();
		if (getFullName(last) != null)
			throw new Exception("Duplicate key");
		fullNameMap.put(last, name);
	}

	// Returns null if lastName is not in the map.
	public FullName getFullName(String lastName) {
		FullName name = fullNameMap.get(lastName);
		return name;
	}
}
