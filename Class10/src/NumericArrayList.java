import java.util.ArrayList;
import java.util.List;

public class NumericArrayList {
	public static void main(String[] args) {
        List<Integer> iList = new ArrayList<>();
        iList.add(30);
        iList.add(-20);
        iList.add(-15);
        iList.add(10);
        int sum = 0;
        for ( Integer num : iList )
            sum += num.intValue();
        System.out.println( sum );
    }
}
