package Algorithm;

import java.util.List; 

public class SortInsert extends SortAlgorithm {
 

	public SortInsert(List<Integer> iList) {
		super(iList);
	}

	@Override
	public Integer[] executeNextSwap() throws exIsSorted { 
		int i = 1;
		while (i < mList.size() ) {		
		    int j = i;
		    while ( j > 0 && mList.get(j-1) > mList.get(j)) {
		        int h = mList.get(j);
		        mList.set(j, mList.get(j-1));
		        mList.set(j-1, h);
		        return new Integer[] {j-1, j};
		        //j--;
		    }
		    i++;	
		}
		throw new exIsSorted();
	} 

	@Override
	protected void initNewList() { 
	}

	@Override
	public String getName() { 
		return "Insertion Sort";
	}
}
