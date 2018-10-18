package GUI.Console;   
import MVC.View;
import MVC.eSortAlgorithm;
import Model.Model; 

public class runConsole {

	public static void main(String[] args) {
		
		Model lModel = new Model(); 
		View mView = new ViewConsoleNicer(lModel) ;
		ControllerConsole mController = (ControllerConsole) mView.createController();
		lModel.registerView(mView);
		lModel.setSortAlgorithm(eSortAlgorithm.eSortInsert);
		mController.push();
	}

}
