package MVC;

import MVC.iModelPresent;
import MVC.iObserver;
import Model.Model; 
 
public abstract class View implements iObserver { 
	protected iModelPresent mModel = null;  
	public  Controller mController = null; 
	public View(Model iModel) {
		mModel = iModel; 
		mModel.registerView(this);
	} 
	public abstract Controller createController(); 
}
