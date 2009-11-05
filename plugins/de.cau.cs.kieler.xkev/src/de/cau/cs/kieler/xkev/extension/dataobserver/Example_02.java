package de.cau.cs.kieler.xkev.extension.dataobserver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;

import org.apache.batik.swing.JSVGCanvas;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.views.IViewDescriptor;
import org.osgi.framework.Bundle;
import org.w3c.dom.DocumentFragment;
import org.w3c.dom.svg.SVGDocument;

import de.cau.cs.kieler.sim.kiem.extension.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.extension.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.json.JSONException;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;
import de.cau.cs.kieler.xkev.Activator;
import de.cau.cs.kieler.xkev.helpers.Tools;
import de.cau.cs.kieler.xkev.mapping.SVGDocumentParser;
import de.cau.cs.kieler.xkev.mapping.animations.Animations;
import de.cau.cs.kieler.xkev.views.EnvironmentView;

public class Example_02 extends JSONObjectDataComponent implements
		IJSONObjectDataComponent {

	private int personCounterGreenphase = 5;
	private boolean button = false;
	private int stepCounter = 6;
	private int last = 0;
	
	public Example_02() {
		// TODO Auto-generated method stu
	}

	@Override
	public JSONObject step(JSONObject JSONobject) throws KiemExecutionException {
		// TODO The new JSON Data must be connected with
		// the old SVG-Graphic and updated afterwards

		if (JSONobject.has("Ampelknopf"))
			try {
				button = Boolean.parseBoolean(JSONobject.getString("Ampelknopf"));
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		last = stepCounter;
		Animations animation = new Animations();
		if (stepCounter == 3) {
			if (personCounterGreenphase == 0) stepCounter++;
			else personCounterGreenphase--;
		} else if (stepCounter <= 5) stepCounter++;
		if (button && stepCounter == 6) {
			stepCounter = 0;
			if (JSONobject.has("Gruenphase_Person")) {
				try {
					//System.out.println(JSONobject.toString());
					personCounterGreenphase = Integer.parseInt(JSONobject.getString("Gruenphase_Person"));
				} catch (JSONException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (NumberFormatException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			} else personCounterGreenphase = 5;
		}
		if (last != stepCounter) switchTrafficLight(stepCounter%6, animation);
		//System.out.println(stepCounter+" "+button+" "+personCounterGreenphase);
		return null;//Because it's only an Observer right now
	}
	
	private void switchTrafficLight(int status, Animations animation) {
		switch (status) {
		case 0:
			//Autos Grün, Fussgänger Rot
			animation.changeColor("cRed", "none");
			animation.changeColor("cYellow", "none");
			animation.changeColor("cGreen", "#00FF00");
			animation.changeColor("pRed", "#FF0000");
			animation.changeColor("pGreen", "#626262");
			animation.applyAnimation();
			break;
		case 1: 
			//Autos Gelb, Fussgänger Rot
			animation.changeColor("cRed", "none");
			animation.changeColor("cYellow", "#FFFF00");
			animation.changeColor("cGreen", "none");
			animation.changeColor("pRed", "#FF0000");
			animation.changeColor("pGreen", "#626262");
			animation.applyAnimation();
			break;
		case 2: 
			//Autos Rot, Fussgänger Rot
			animation.changeColor("cRed", "#FF0000");
			animation.changeColor("cYellow", "none");
			animation.changeColor("cGreen", "none");
			animation.changeColor("pRed", "#FF0000");
			animation.changeColor("pGreen", "#626262");
			animation.applyAnimation();
			break;
		case 3: 
			//Autos Rot, Fussgänger Grün
			animation.changeColor("cRed", "#FF0000");
			animation.changeColor("cYellow", "none");
			animation.changeColor("cGreen", "none");
			animation.changeColor("pRed", "#626262");
			animation.changeColor("pGreen", "#00FF00");
			animation.applyAnimation();
			break;
		case 4: 
			//Autos Rot, Fussgänger Rot
			animation.changeColor("cRed", "#FF0000");
			animation.changeColor("cYellow", "none");
			animation.changeColor("cGreen", "none");
			animation.changeColor("pRed", "#FF0000");
			animation.changeColor("pGreen", "#626262");
			animation.applyAnimation();
			break;			
		case 5: 
			//Autos Gelb, Fussgänger Rot
			animation.changeColor("cRed", "#FF0000");
			animation.changeColor("cYellow", "#FFFF00");
			animation.changeColor("cGreen", "none");
			animation.changeColor("pRed", "#FF0000");
			animation.changeColor("pGreen", "#626262");
			animation.applyAnimation();
			break;
		}
	}
	
	
	@Override
	public void initialize() throws KiemInitializationException {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isObserver() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isProducer() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void wrapup() throws KiemInitializationException {
		// TODO Auto-generated method stub
		stepCounter = 0;
		personCounterGreenphase = 5;
	}


//	@Override
//	public boolean isMaster() {
//		return true;
//	}

}
