import java.util.HashMap;


public class HashMapKey {
	
	private String value;
	
	public HashMapKey(String value) {this.value = value;}
	
	public static void main(String[] args) {
		HashMap<HashMapKey, Object> map = new HashMap<>();
		HashMapKey one = new HashMapKey("Hello");
		HashMapKey two = new HashMapKey("Hello");
		map.put(one, "Some string");
		map.put(two, "Some other String");
		System.out.println(map.size());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashMapKey other = (HashMapKey) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

}
