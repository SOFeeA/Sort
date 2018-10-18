package GUI.Console;

import MVC.GUI;
import Model.Model;

public class GUIConsole extends GUI {

	public GUIConsole(Model iModel) {
		super(iModel);
		mView = new ViewConsoleNice(iModel);
		mController = mView.createController();
	}

}
