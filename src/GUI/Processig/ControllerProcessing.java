package GUI.Processig;

import MVC.Controller;
import MVC.eSortAlgorithm;
import MVC.iController;

public class ControllerProcessing extends Controller {

	public ControllerProcessing(iController iModel) {
		super(iModel); 
	}
	
	public void sort() {
		System.out.println("Start"); 
		mModel.shuffle();
		mModel.sort();
		System.out.println("End");
	}

	public void setSortAlgorithm(eSortAlgorithm esortinsert) {
mModel.setSortAlgorithm(esortinsert);
	}

}
