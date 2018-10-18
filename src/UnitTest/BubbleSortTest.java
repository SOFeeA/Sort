package UnitTest;

import java.util.ArrayList;
import java.util.List;
 
import org.junit.jupiter.api.BeforeEach;

import Algorithm.BubbleSort; 

class BubbleSortTest extends SortAlgorithmTest {
 
	@BeforeEach
	void setUp() throws Exception {
		List<Integer> lList = new ArrayList<Integer>();
		lList.add(88);
		lList.add(10);
		lList.add(99);
		lList.add(50);
		mCUT = new BubbleSort(lList);

		mExpectedSwap.clear();
		// >88 10 99 50
		mExpectedSwap.add(0);// 88
		mExpectedSwap.add(1);// 10

		// 10>88 99 50
		mExpectedSwap.add(1);// 88
		mExpectedSwap.add(1);// 88

		// 10 88>99 50
		mExpectedSwap.add(2);// 99
		mExpectedSwap.add(3);// 50

		// >10 88 50|99
		mExpectedSwap.add(0);// 10
		mExpectedSwap.add(0);// 10
		// mFinalList = new Integer[] { 10, 88, 50, 99 };

		// 10>88 50|99
		mExpectedSwap.add(1);// 88
		mExpectedSwap.add(2);// 50
		// mFinalList = new Integer[] { 10, 50, 88, 99 };

		// >10 50|88 99
		mExpectedSwap.add(2);// 88
		mExpectedSwap.add(2);// 50 
		
		mLastSwap = 15;
		mExpectFinalList = new Integer[] { 10, 50, 88, 99 };;
	}
}
