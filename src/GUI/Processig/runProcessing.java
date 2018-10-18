package GUI.Processig;

import GUI.Processig.ControllerProcessing; 
import GUI.Processig.ViewProcessing;
import MVC.eSortAlgorithm;
import Model.Model;
import processing.core.PApplet;
@SuppressWarnings("serial")
public class runProcessing extends PApplet{ 
	protected ViewProcessing mView = null ;
	public ControllerProcessing mController = null;

	public static void main(String[] args) {
        PApplet.main( new String[] { "runProcessing" } ); 
	}
    public void settings(){
        size(300,1000);
    }

    public void setup(){
    	System.out.println("setup");
		Model lModel = new Model(); 
		mView = new ViewProcessing(this, lModel);
		mController = (ControllerProcessing) mView.createController();
		lModel.registerView(mView); 
		frameRate(2);
        size(300,300); 
    }

    public void draw(){  
    	System.out.println("draw");
    	mView.display();
    }
    
    public void mouseClicked() { 
    	mController.sort();
    }
    @Override
    public void keyPressed() {
    	mController.setSortAlgorithm(eSortAlgorithm.eSortInsert);
    }

}
