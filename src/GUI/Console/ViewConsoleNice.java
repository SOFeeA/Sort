package GUI.Console;

import java.util.ArrayList;
import java.util.List;

import MVC.Controller;
import MVC.View;
import MVC.iController;
import Model.Model;

public class ViewConsoleNice extends View {

	public ViewConsoleNice(Model iModel) {
		super(iModel);
	}

	@Override
	public void update() {
		Integer[] lLastSwap = mModel.getLastSwapPos();

		if (lLastSwap.length == 0) {
			printResult();
		} else if (lLastSwap[0] != lLastSwap[1]) {
			printDiff(lLastSwap);
			printResult();
		}
	}

	private void printResult() {
		System.out.println(mModel.getList());
	}

	private void printDiff(Integer[] lLastSwap) {
		List<String> lListString = new ArrayList<String>();
		List<Integer> lList = mModel.getList();
		for (int i = 0; i < lList.size(); i++) {
			lListString.add("  ");
		}
		lListString.set(lLastSwap[0], ">>");
		lListString.set(lLastSwap[1], "<<");
		System.out.println(lListString);
	}

	@Override
	public Controller createController() {
		return new ControllerConsole((iController) mModel);
	}

}
