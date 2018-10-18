package GUI.Console;

import MVC.Controller;
import MVC.iController;

public class ControllerConsole extends Controller {

	public ControllerConsole(iController iModel) {
		super(iModel);
	}
	public void push() {
		mModel.sort();
	}

}
