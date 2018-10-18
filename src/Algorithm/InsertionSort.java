package Algorithm;

import java.util.List; 

public class InsertionSort extends SortAlgorithm {

	private Integer mCurrI = 0;
	private Integer mCurrJ;
	private Integer mCurrSwap;

	public InsertionSort(List<Integer> iList) {
		super(iList);
	}

	@Override
	public Integer[] executeNextSwap() throws exIsSorted { 
		Integer[] rReturn = new Integer[] {0,0};
		initStep();
		while (mCurrJ > 0 && mList.get(mCurrJ-1) > mCurrSwap) {
			rReturn = step();
		}
		return rReturn;
	}

	private void initStep() throws exIsSorted {
		mCurrI++;
		if (mCurrI > mList.size() - 1) {
			throw new exIsSorted();
		}

		mCurrSwap = mList.get(mCurrI);
		mCurrJ = mCurrI; 
	}

	private Integer[] step() {
		Integer[] rReturn;
		Integer h = mList.get(mCurrJ);
		mList.set(mCurrJ, mList.get(mCurrJ - 1));
		mList.set(mCurrJ-1, h);
		mCurrJ--;
		rReturn = new Integer[] { mCurrJ, mCurrI};
		return rReturn;
	}

	@Override
	protected void initNewList() {
		// TODO Auto-generated method stub
		
	}
}
