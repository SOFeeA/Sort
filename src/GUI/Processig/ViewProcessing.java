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
	private List<Integer> mSwap = new ArrayList<Integer>();
	private List<Integer> mList = new ArrayList<Integer>();

	public ViewProcessing(Model iModel) {
		super(iModel);
	}

	public ViewProcessing(PApplet iPApplet, Model iModel) {
		super(iModel);
		mApplet = iPApplet;
	}

	public void display() {
		if (!mList.isEmpty()) { 
			mApplet.background(100);
			for(int i =0; i<mModel.getSize();i++) { 
				mApplet.fill(120,50,240);
				/*
				if(i==mSwap.get(0)) { 
					mApplet.fill(120,200,240);
				}
				if(i==mSwap.get(1)) { 
					mApplet.fill(120,200,240);
				}*/
				mApplet.rect(50+i*12, 50, 10, mList.get(0)); 
				mList.remove(0);
			}  
			mSwap.remove(0);
			mSwap.remove(0);
		}
	}

	@Override
	public void update() {
		Integer[] lSwap = mModel.getLastSwapPos();
		if (lSwap.length > 0) {
			if(lSwap[0]!=lSwap[1]) {
				mSwap.add(lSwap[0]);
				mSwap.add(lSwap[1]);
				mList.addAll(mModel.getList());
			}
		}
	}

	@Override
	public Controller createController() {
		return new ControllerProcessing((iController) mModel);
	}

}
