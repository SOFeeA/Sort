package UnitTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import Algorithm.SortAlgorithm;
import Algorithm.exIsSorted; 

class SortAlgorithmTest {

	protected SortAlgorithm mCUT;
	protected List<Integer> mExpectedSwap = new ArrayList<Integer>();
	protected Integer[] mExpectFinalList;
	protected int mLastSwap;

	protected void assertSwap(Integer[] iSwap, int iCountSwap) {
		assertEquals(mExpectedSwap.get(0).intValue(), iSwap[0].intValue(), "Swap Low  " + iCountSwap);
		assertEquals(mExpectedSwap.get(1).intValue(), iSwap[1].intValue(), "Swap High " + iCountSwap);
		mExpectedSwap.remove(0);
		mExpectedSwap.remove(0);
	}

	protected void assertFinalList() {
		for (Integer i = 0; i <= 3; i++)
			assertEquals(mExpectFinalList[i].intValue(), mCUT.mList.get(i).intValue(), "Final Index" + i);
	}

	@Test
	final void noException() throws exIsSorted {
		mCUT.executeNextSwap();
	}

	@Test
	final void return2Pos() throws exIsSorted {
		Integer[] lPos = mCUT.executeNextSwap();
		assertEquals(2, lPos.length);
	}

	@Test
	final void swap() throws exIsSorted {
		int lCountSwap = 0;
		while (!mExpectedSwap.isEmpty()) {
			lCountSwap++;
			assertSwap(mCUT.executeNextSwap(), lCountSwap);

		}
		assertFinalList();
	}

	@Test
	final void finishSwap() throws exIsSorted {
		for (int i = 1; i <= mLastSwap; i++)
			mCUT.executeNextSwap();
		try {
			mCUT.executeNextSwap();
			fail("Not Sorted");
		} catch (exIsSorted e) {
			assertFinalList();
		}
	}

}
