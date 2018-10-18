package Model;

import java.util.ArrayList;
import java.util.List;

import Algorithm.BubbleSort;
import Algorithm.InsertionSort;
import Algorithm.SortAlgorithm;
import MVC.iModelPresent;
import MVC.iObserver;
import MVC.eSortAlgorithm;
import MVC.iController; 

public class Model implements iController, iModelPresent {
	private SortAlgorithm mSortAlgorithm = null;
	private iObserver mObserver = null;
	private Integer[] mLastSwap = new Integer[] {};
	private List<Integer> mList = new ArrayList<Integer>();

	public Model() {
		mSortAlgorithm = new BubbleSort(mList);
	}
	@Override
	public Integer[] getLastSwapPos() {
		return mLastSwap;
	}

	@Override
	public List<Integer> getList() {
		return mList;
	}

	@Override
	public Integer getElement(Integer iPos) {
		return mList.get(iPos);
	}

	@Override
	public void sort() {
		try {
			while (true) {
				mLastSwap = mSortAlgorithm.executeNextSwap(); 
				mObserver.update();
			}
		} catch (Algorithm.exIsSorted e) {  }
	}

	@Override
	public void setSortAlgorithm(eSortAlgorithm iAlgorithm) {
		switch (iAlgorithm) {
		case eSortBubble:
			mSortAlgorithm = new BubbleSort(mList);
			break;
		case eSortInsert:
			mSortAlgorithm = new InsertionSort(mList);
			break; 
		}
		mSortAlgorithm.setList(mList);
	}
	@Override
	public void shuffle() { 
		mList = new ArrayList<Integer>();
		mList.add(88);
		mList.add(10);
		mList.add(99);
		mList.add(72);
		mList.add(50);
		mObserver.update();
		mSortAlgorithm.setList(mList);
	}
	@Override
	public void registerView(iObserver iView) {
		mObserver = iView;
	}
}
