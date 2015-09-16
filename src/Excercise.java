import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Excercise {

	public static void main(String[] args) throws IOException {
		ArrayList<Double> dList = new ArrayList<>();

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			double d = Integer.parseInt(br.readLine());
			while (d!= 0 ){
				dList.add(d);
			} 
				return;
			
			
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			double sum = 0;
			if (!dList.isEmpty()) {
				for (double i : dList) {
					sum += i;
				}
				System.out.println("Your input average is: " + sum / dList.size());
			}
		}

	}

}
