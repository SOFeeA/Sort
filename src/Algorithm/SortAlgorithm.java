package Algorithm;

import java.util.ArrayList;
import java.util.List;
import exception.exIsSorted;

public abstract class SortAlgorithm {
	private List<Integer> mList = new ArrayList<Integer>();
	public abstract Integer executeNextSwap() throws exIsSorted;
}
