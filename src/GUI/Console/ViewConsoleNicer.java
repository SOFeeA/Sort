package GUI.Console;

import java.util.ArrayList;
import java.util.List;

import MVC.Controller;
import MVC.View;
import MVC.iController;
import Model.Model;

public class ViewConsoleNicer extends View {

	public ViewConsoleNicer(Model iModel) {
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
		Integer lSwapPos1 = lLastSwap[0];
		Integer lSwapPos2 = lLastSwap[1];
		Integer lSwap1 = lList.get(lSwapPos2);
		Integer lSwap2 = lList.get(lSwapPos1);
		for (int i = 0; i < lList.size(); i++) {
			lListString.add("  ");
		}
		lListString.set(lSwapPos1, ">>");
		lListString.set(lSwapPos2, "<<");
		System.out.print(lListString);
		System.out.print(" Swap: ["+lSwap1+"], ["+lSwap2+"]");
		System.out.println();
	}

	@Override
	public Controller createController() {
		return new ControllerConsole((iController) mModel);
	}

}
