package Algorithm;

import java.util.List;

import Algorithm.SortAlgorithm; 

public class BubbleSort extends SortAlgorithm {

	private Integer mPosLeft=-1;
	private Integer mCurrI = -1;

	public BubbleSort(List<Integer> iList) {
		super(iList);
		initNewList();
	}

	@Override
	public Integer[] executeNextSwap() throws exIsSorted {
		mCurrI++;
		// for (mCurrN=mList.size(); mCurrN>1; --mCurrN){
		// for (mCurrI=0; mCurrI<mCurrN-1; ++mCurrI){
		if (mCurrI == mList.size()-1) {
			mCurrI = 0;
			mPosLeft--;
			if (mPosLeft == 0)
				throw new exIsSorted();
		}
		Integer rPosSwap = mCurrI;

		if (mList.get(mCurrI) > mList.get(mCurrI + 1)) {
			Integer lSwap = mList.get(mCurrI + 1);
			rPosSwap = mCurrI + 1;
			mList.set(mCurrI + 1, mList.get(mCurrI));
			mList.set(mCurrI, lSwap);

		} // Ende if
		// } // Ende innere for-Schleife
		// } // Ende ‰uﬂere for-Schleife
		return new Integer[] { mCurrI, rPosSwap };
	}

	@Override
	protected void initNewList() {
		mPosLeft = mList.size() + 1;
	}
}
