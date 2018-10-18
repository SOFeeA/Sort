package MVC; 

public abstract class Controller { 
	protected iController mModel = null; 
	public Controller(iController iModel) { 
		mModel = iModel;
	} 
}
