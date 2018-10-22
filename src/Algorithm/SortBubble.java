package Algorithm;

import java.util.List;

public class SortBubble extends SortAlgorithm {
	int mCurrnN=mList.size();
	int mCurrI=0;
	public SortBubble(List<Integer> iList) {
		super(iList);
	}

	@Override
	public Integer[] executeNextSwap() throws exIsSorted {
		  for (; mCurrnN>1; --mCurrnN){
			    for (; mCurrI<mCurrnN-1; ++mCurrI){
			      if (mList.get(mCurrI) > mList.get(mCurrI+1)){
			        Integer h = mList.get(mCurrI);
			        mList.set(mCurrI,mList.get(mCurrI+1));
			        mList.set(mCurrI+1, h);
					return new Integer[] {mCurrI,mCurrI+1};
			      } // Ende if
			    } // Ende innere for-Schleife

				mCurrI=0;
			  } // Ende ‰uﬂere for-Schleife
		  throw new exIsSorted();
	}

	@Override
	protected void initNewList() {
		mCurrnN=mList.size();
	}

	@Override
	public String getName() { 
		return "Bubble Sort";
	}

}
