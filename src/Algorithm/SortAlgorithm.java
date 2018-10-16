package Algorithm;

import java.util.ArrayList;
import java.util.List;
import exception.exIsSorted;

public abstract class SortAlgorithm {
	protected List<Integer> mList = new ArrayList<Integer>();
	public abstract Integer[] executeNextSwap() throws exIsSorted;
	public SortAlgorithm( List<Integer> iList ) {
		mList = iList;
	}
}
