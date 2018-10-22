package GUI.Processig;

import java.util.ArrayList;
import java.util.List;

import MVC.Controller;
import MVC.View;
import MVC.iController;
import Model.Model;
import processing.core.PApplet;

public class ViewProcessing extends View {

	private PApplet mApplet; 
	private List<Integer> mList = new ArrayList<Integer>();
	private String mSortAlgorithm = "";

	public ViewProcessing(Model iModel) {
		super(iModel);
	}

	public ViewProcessing(PApplet iPApplet, Model iModel) {
		super(iModel);
		mApplet = iPApplet;
	}

	public void display() {
		refreshDisplay();
		if (!mList.isEmpty()) {
			printSwaps(); 
		}else {
			printInitial();
		}
	}

	protected void printSwaps() {
		printTitle();
		for (int i = 0; i < mModel.getSize(); i++) {
			mApplet.fill(120, 50, 240);
			mApplet.rect(50 + i * 12, 50, 10, mList.get(0));
			mList.remove(0);
		}
	}

	protected void refreshDisplay() {
		mApplet.background(100);
	}

	protected void printInitial() {
		printTitle();  
		for (int i = 0; i < mModel.getSize(); i++) {
			mApplet.fill(120, 50, 240);
			mApplet.rect(50 + i * 12, 50, 10, mModel.getElement(i)); 
		} 
	}

	protected void printTitle() {
		mApplet.fill(250, 250, 250);
		mApplet.text(mSortAlgorithm, 20, 20);
	}

	@Override
	public void update() {
		mSortAlgorithm = mModel.getSortAlgorithm();
		Integer[] lSwap = mModel.getLastSwapPos();
		if (lSwap.length > 0) {
			if (lSwap[0] != lSwap[1]) { 
				mList.addAll(mModel.getList());
			}
		}
		mApplet.redraw();
	}

	@Override
	public Controller createController() {
		return new ControllerProcessing((iController) mModel);
	}

	@Override
	public void init() {
	}

}
