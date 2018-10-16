package Algorithm;

import java.util.List;

import exception.exIsSorted;

public class InsertionSort extends SortAlgorithm {

	public InsertionSort(List<Integer> iList) {
		super(iList);
	}

	@Override
	public Integer[] executeNextSwap() throws exIsSorted {
		for(Integer i = 2; i <= mList.size();i++) {
			
		}
		Integer[] rPos = new Integer[2];
		rPos[0]=2;
		rPos[1]=2;
		return rPos ;
	}
}
