import java.util.ArrayList;
import java.util.Iterator;


public class Test {
	
	private String value;
	
	private int other;
	
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("Hello");
		arr.add("World");
		arr.add("Remi");
		Iterator<String> it = arr.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
		System.out.println(arr.size());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + other;
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		if (this.other != other.other)
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

}
