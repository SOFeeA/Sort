package GUI.Console;

import MVC.Controller;
import MVC.View;
import MVC.iController;
import Model.Model;

public class ViewConsole extends View {

	public ViewConsole(Model iModel) {
		super(iModel);
	}

	@Override
	public void update() {
		System.out.print(mModel.getList());
		Integer[] lLastSwap = mModel.getLastSwapPos();
		System.out.print(lLastSwap[0]); 
		System.out.println();
	}

	@Override
	public Controller createController() {
		return new ControllerConsole((iController) mModel);
	}

}
