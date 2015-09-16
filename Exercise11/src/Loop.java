import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Loop {
	
	public static void main(String[] args) throws IOException {
		ArrayList<Double> list = new ArrayList<>();
		try {
			while (true) {
				Double number = Double.valueOf(readValidString());
				list.add(number);
			}
		} catch (IllegalArgumentException e) {
			// do nothing
		} finally {
			Double average;
			if (list.size() == 0) {
				average = null;
			} else {
				Double sum = 0.0;
				for (Double number : list) {
					sum += number;
				}
				average = sum / list.size();
			}
			System.out.println("Average is " + average);
		}
	}
	
	private static String readValidString() throws IOException {
		System.out.println("Enter a real number:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		if (line == null || line.equals("")) {
			throw new IllegalArgumentException("The string was null/empty");
		}
		return line;
	}

}
