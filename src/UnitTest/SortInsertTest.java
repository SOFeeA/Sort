package UnitTest;

import java.util.ArrayList;
import java.util.List;

import Algorithm.SortInsert; 

class SortInsertTest extends SortAlgorithmTest {
 
/*
	@Test
	final void swap1_01() throws exIsSorted {
		Integer[] lPos = mCUT.executeNextSwap(); 
		assertEquals(0, lPos[0].intValue());
		assertEquals(1, lPos[1].intValue());
	}
	@Test
	final void swap2_12() throws exIsSorted {
		mCUT.executeNextSwap();
		Integer[] lPos = mCUT.executeNextSwap(); 
		assertEquals(1, lPos[0].intValue());
		assertEquals(2, lPos[1].intValue());
	}
	@Test
	final void swap3_33() throws exIsSorted {
		mCUT.executeNextSwap();
		Integer[] lPos = mCUT.executeNextSwap(); 
		assertEquals(1, lPos[0].intValue());
		assertEquals(2, lPos[1].intValue());
	}
	@Test
	final void swap4_ex() throws exIsSorted  {
		mCUT.executeNextSwap();
		mCUT.executeNextSwap();
		mCUT.executeNextSwap();
		try {
			mCUT.executeNextSwap();
			fail();
		} catch (exIsSorted e) {
		} 
	}*/

	@Override
	protected void initSwaps() {
		

		mExpectedSwap.clear();
		
		//88 10 5 99
		mExpectedSwap.add(0);
		mExpectedSwap.add(1);
		
		//10 88 5 99
		mExpectedSwap.add(1);
		mExpectedSwap.add(2);

		//10 5 80 99
		mExpectedSwap.add(0);
		mExpectedSwap.add(1);

		//5 10 80 99

		mLastSwap = 3;
		mExpectFinalList = new Integer[] { 5, 10, 88, 99 };;
	}

	@Override
	protected void initCUT() {
		List<Integer> lList = new ArrayList<Integer>();
		lList.add(88);
		lList.add(10);
		lList.add(5);
		lList.add(99);
		mCUT = new SortInsert( lList );
	}

}
