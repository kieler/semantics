package de.cau.cs.kieler.xkev.mapping.animations;

import org.apache.batik.swing.JSVGCanvas;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.w3c.dom.Element;
import org.w3c.dom.svg.SVGDocument;

import de.cau.cs.kieler.xkev.views.EnvironmentView;

public class Animations {

	private SVGDocument svgDocument = null;
	private JSVGCanvas svgCanvas = null;
	
	public Animations() {
		isReady();
	}

	public boolean isReady() {
		IWorkbenchWindow window = PlatformUI.getWorkbench().getWorkbenchWindows()[0];
		IViewPart view = window.getActivePage().findView(EnvironmentView.ID);
		if (view != null) {
			if (svgCanvas == null) {
				svgCanvas = ((EnvironmentView) view).getSVGCanvas();
				if (svgCanvas != null) svgDocument = svgCanvas.getSVGDocument();
			}
			if (svgDocument != null) return true;
			else return false;
		} else return false;
	}
	
	public void applyAnimation() {
		svgCanvas.setSVGDocument(svgDocument);
	}
	
	public JSVGCanvas getSVGCanvas() {
		return svgCanvas; 
	}
	
	public SVGDocument getSVGDocument() {
		return svgDocument; 
	}
	
//	private boolean viewIsStillAlive() {
//		IWorkbenchWindow window = PlatformUI.getWorkbench().getWorkbenchWindows()[0];
//		IViewPart view = window.getActivePage().findView(EnvironmentView.ID);
//		if (view != null) return true;
//		else return false;
//	}
	
	//ChangeColor Animation	
	public void changeColor(String elementid, String value) {
		Element e = svgDocument.getElementById(elementid);
		String old_str, new_str, s;
		int start, end;
		
		s = e.getAttribute("style");
		start = s.indexOf("fill:");//+"fill:".length();
		end = s.substring(start).indexOf(";")+1;
		old_str = s.substring(start,start+end);
		new_str = "fill:"+value+";";
		e.setAttribute("style", s.replace(old_str, new_str));
//		
//		System.out.println(s);
//		System.out.println(old_string);
//		System.out.println(new_string);
//		System.out.println(s.replace(old_string, new_string));
	
	}	
}
