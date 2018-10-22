package Algorithm;

import java.util.ArrayList;
import java.util.List;

public abstract class SortAlgorithm {
	public List<Integer> mList = new ArrayList<Integer>();

	public abstract Integer[] executeNextSwap() throws exIsSorted;

	public SortAlgorithm(List<Integer> iList) {
		mList = iList;
	}

	public void setList(List<Integer> iList) {
		mList = iList;
		initNewList();
	}

	protected abstract void initNewList();

	public abstract String getName();
}
