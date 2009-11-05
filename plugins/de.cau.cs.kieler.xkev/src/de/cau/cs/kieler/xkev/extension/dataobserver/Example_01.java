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

public class Example_01 extends JSONObjectDataComponent implements
		IJSONObjectDataComponent {

	private int counter = 0;
	private String cRed = "none", cYellow = "none", cGreen = "none";
	public Example_01() {
		// TODO Auto-generated method stu
	}

	@Override
	public JSONObject step(JSONObject JSONobject) throws KiemExecutionException {
		// TODO The new JSON Data must be connected with
		// the old SVG-Graphic and updated afterwards

		Animations animation = new Animations();
		try {
			if (JSONobject.has("Ampel_Licht_1")) cRed = JSONobject.getString("Ampel_Licht_1"); 
			if (JSONobject.has("Ampel_Licht_2")) cYellow = JSONobject.getString("Ampel_Licht_2");
			if (JSONobject.has("Ampel_Licht_3")) cGreen = JSONobject.getString("Ampel_Licht_3");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		synchronized (animation) {
			if (animation.isReady()) {
				animation.changeColor("cRed", cRed);
				animation.changeColor("cYellow", cYellow);
				animation.changeColor("cGreen", cGreen);
				//Only if the Animation does change anything apply the Animation to the SVGDocument
				if (animation.hasChanged()) animation.applyAnimation();
			}
		}
		
//		counter++;
//		if (animation.isReady()) {
//			switch (counter % 4) {
//				case 0:animation.changeColor("cRed", "#FF0000");animation.changeColor("cYellow", "none");animation.changeColor("cGreen", "none");break;
//				case 1:animation.changeColor("cRed", "none");animation.changeColor("cYellow", "#FFFF00");animation.changeColor("cGreen", "none");break;
//				case 2:animation.changeColor("cRed", "none");animation.changeColor("cYellow", "none");animation.changeColor("cGreen", "#00FF00");break;
//				case 3:animation.changeColor("cRed", "none");animation.changeColor("cYellow", "#FFFF00");animation.changeColor("cGreen", "none");break;
//			}
//		animation.applyAnimation();
//		}

//		Bundle b = Platform.getBundle(Activator.PLUGIN_ID);
//		Enumeration e = b.findEntries("examples", "Test.svg", false);
//		URL url = null;
//		if (e.hasMoreElements()) {
//			url = (URL) e.nextElement();
//		}
//		SVGDocumentParser p = new SVGDocumentParser(url.toString());
//		
//		counter++;
//		switch (counter % 4) {
//		case 0:p.changeColor("cRed", "#FF0000");p.changeColor("cYellow", "none");p.changeColor("cGreen", "none");break;
//		case 1:p.changeColor("cRed", "none");p.changeColor("cYellow", "#FFFF00");p.changeColor("cGreen", "none");break;
//		case 2:p.changeColor("cRed", "none");p.changeColor("cYellow", "none");p.changeColor("cGreen", "#00FF00");break;
//		case 3:p.changeColor("cRed", "none");p.changeColor("cYellow", "#FFFF00");p.changeColor("cGreen", "none");break;
//		}
		
		
		//For now the easiest way to get Access to KEV view
//		IWorkbenchWindow window = PlatformUI.getWorkbench().getWorkbenchWindows()[0];
//		IViewPart view = window.getActivePage().findView(EnvironmentView.ID);
//
//		//PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();//.findView(EnvironmentView.ID);
//		if (view == null) System.out.println("Can't find KEV View!");
//		else ((EnvironmentView) view).getComposite().getSvgCanvas().setDocument(p.getSVGDocument());

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
		return false;
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
