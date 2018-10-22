package GUI.Processig;

import MVC.Controller;
import MVC.eSortAlgorithm;
import MVC.iController;

public class ControllerProcessing extends Controller {

	public ControllerProcessing(iController iModel) {
		super(iModel);
	}

	public void sort() { 
		mModel.shuffle();
		mModel.sort();
	}

	public void setSortAlgorithm(eSortAlgorithm esortinsert) {
		mModel.setSortAlgorithm(esortinsert);
	}

}
