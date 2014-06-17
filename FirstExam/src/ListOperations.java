import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ListOperations {

	public  List<Integer> sort(List<Integer> listInput) {
		List<Integer> listOutput = new ArrayList<Integer>(listInput);
		Collections.sort(listOutput);
		return listOutput;
	}

	public  List<Integer> reverse(List<Integer> listInput) {
		List<Integer> listOutput = new ArrayList<Integer>(listInput);
		Collections.reverse(listOutput);
		return listOutput;
	}

	public  boolean isMonotonous(List<Integer> listInput) {
		return listInput.equals(sort(listInput))
				|| reverse(listInput).equals(sort(reverse(listInput)));
	}

}
