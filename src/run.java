import GUI.Console.GUIConsole; 
import Model.Model; 
import MVC.eSortAlgorithm;

public class run {

	public static void main(String[] args) {
		Model lModel = new Model();
		new GUIConsole(lModel);
		
		//lModel.setSortAlgorithm(eSortAlgorithm.eSortInsert);
		lModel.shuffle();
		lModel.sort();
	}

}
