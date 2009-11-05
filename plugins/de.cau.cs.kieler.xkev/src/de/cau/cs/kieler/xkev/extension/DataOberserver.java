package de.cau.cs.kieler.xkev.extension;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;

import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.views.IViewDescriptor;
import org.osgi.framework.Bundle;
import org.w3c.dom.svg.SVGDocument;

import de.cau.cs.kieler.sim.kiem.extension.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.extension.JSONSignalValues;
import de.cau.cs.kieler.sim.kiem.extension.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.extension.KiemInitializationException;
import de.cau.cs.kieler.sim.kiem.json.JSONException;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;
import de.cau.cs.kieler.xkev.Activator;
import de.cau.cs.kieler.xkev.helpers.Tools;
import de.cau.cs.kieler.xkev.mapping.SVGDocumentParser;
import de.cau.cs.kieler.xkev.mapping.animations.Animations;
import de.cau.cs.kieler.xkev.views.EnvironmentView;

public class DataOberserver extends JSONObjectDataComponent implements
		IJSONObjectDataComponent {

	private int counter = 0;
	public DataOberserver() {
		// TODO Auto-generated method stu
	}
	
	public boolean isHistoryObserver() {
		return true;
	}

	@Override
	public JSONObject step(JSONObject JSONobject) throws KiemExecutionException {
		
		Animations animation = new Animations();

		if (animation.isReady()) {
			try {
				if (JSONobject.has("cRed")
						&& (JSONSignalValues.isPresent(JSONobject.get("cRed")))) {
					animation.changeColor("cRed", "#FF0000");
				}
				else {
					animation.changeColor("cRed", "none");
				}
				
				if (JSONobject.has("cYellow")
						&& (JSONSignalValues.isPresent(JSONobject.get("cYellow")))) {
					animation.changeColor("cYellow", "#FFFF00");
				}
				else {
					animation.changeColor("cYellow", "none");
				}

				if (JSONobject.has("cGreen")
						&& (JSONSignalValues.isPresent(JSONobject.get("cGreen")))) {
					animation.changeColor("cGreen", "#00FF00");
				}
				else {
					animation.changeColor("cGreen", "none");
				}

				
				if (JSONobject.has("pRed")
						&& (JSONSignalValues.isPresent(JSONobject.get("pRed")))) {
					animation.changeColor("pRed", "#FF0000");
				}
				else {
					animation.changeColor("pRed", "#666666");
				}
				
				if (JSONobject.has("pGreen")
						&& (JSONSignalValues.isPresent(JSONobject.get("pGreen")))) {
					animation.changeColor("pGreen", "#00FF00");
				}
				else {
					animation.changeColor("pGreen", "#666666");
				}


			} catch (JSONException e) {
				e.printStackTrace();
			}
		}//if animation is ready

		animation.applyAnimation();
			
		
		return null;//Because it's only an Observer right now
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
		return true;
	}

	@Override
	public void wrapup() throws KiemInitializationException {
		// TODO Auto-generated method stub

	}
	
//	@Override
//	public boolean isMaster() {
//		return true;
//	}

}
