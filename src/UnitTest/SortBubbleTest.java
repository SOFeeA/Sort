package UnitTest;
 

import java.util.ArrayList;
import java.util.List;
 
 
import Algorithm.SortBubble;

class SortBubbleTest extends SortAlgorithmTest {

	protected void initCUT() {
		List<Integer> lList = new ArrayList<Integer>();
		lList.add(88);
		lList.add(10);
		lList.add(1);
		lList.add(50);
		mCUT = new SortBubble(lList);
	}

	@Override
	protected void initSwaps() {
		mExpectedSwap.clear();
		// 88 10 1 50
		mExpectedSwap.add(0);// 88
		mExpectedSwap.add(1);// 10

		// 10 88 1 50
		mExpectedSwap.add(1);
		mExpectedSwap.add(2);

		// 10 1 88 50
		mExpectedSwap.add(2);
		mExpectedSwap.add(3);

		// 10 1 50 88
		mExpectedSwap.add(0);
		mExpectedSwap.add(1);
		
		mLastSwap = 4;
		mExpectFinalList = new Integer[] { 1, 10, 50, 88 };;
	}

}
