package MVC;

import java.util.List;

public interface iModelPresent {
	public Integer[] getLastSwapPos();
	public List<Integer> getList();
	public Integer getElement(Integer iPos);
	public void registerView(iObserver iView);
	public int getSize();
	public String getSortAlgorithm();  
}
