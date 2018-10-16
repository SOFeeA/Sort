package Algorithm.ut;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Algorithm.InsertionSort;
import exception.exIsSorted;

class InsertionSortTest {

	private InsertionSort mCUT;

	@BeforeEach
	void setUp() throws Exception {
		List<Integer> lList = new ArrayList<Integer>();
		lList.add(88);
		lList.add(10);
		lList.add(50);
		mCUT = new InsertionSort( lList  );
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
	final void returnPosValue() throws exIsSorted {
		Integer[] lPos = mCUT.executeNextSwap();
		assertNotEquals(0, lPos[0]);
		assertNotEquals(0, lPos[1]);
	}
	@Test
	final void swap1_2() throws exIsSorted {
		Integer[] lPos = mCUT.executeNextSwap(); 
		assertEquals(1, lPos[0].intValue());
		assertEquals(2, lPos[1].intValue());
	}

}
