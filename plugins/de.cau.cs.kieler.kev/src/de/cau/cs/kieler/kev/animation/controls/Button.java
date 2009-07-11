package de.cau.cs.kieler.kev.animation.controls;

import org.apache.batik.dom.svg.SVGOMElement;
import org.w3c.dom.events.Event;
import org.w3c.dom.events.EventListener;

import de.cau.cs.kieler.kev.animation.SimulationEvent;
import de.cau.cs.kieler.kev.animation.SimulationListener;
import de.cau.cs.kieler.kev.extension.AnimationData;


/**
 * @author sja
 * 
 */
public class Button extends Control /*implements SimulationListener*/ {

	private boolean buttonPressed = false;
	
	/**
	 * @param port
	 * @param element
	 * @param dataToSend
	 * @param status
	 */
	public Button(int port, SVGOMElement element, AnimationData dataToSend,
			Boolean status) {
		super(port, element, dataToSend, status);
		// set default value
		dataToSend.setData(port, new Boolean(false));
		element.addEventListener("mousedown", new EventListener() {
			public void handleEvent(Event evt) {
				if (getStatus().equals(Boolean.valueOf(false))) {
					setChanged();
					setStatus(Boolean.valueOf(true));
					buttonPressed = true;
					getElement().setAttribute("opacity", "1");
					System.out.println("Mouse pressed");
				}
			}
		}, false);

		element.addEventListener("mouseup", new EventListener() {
			public void handleEvent(Event evt) {
				if (getStatus().equals(Boolean.valueOf(true))) {
					setChanged();
					setStatus(Boolean.valueOf(false));
					buttonPressed = false;
					getElement().setAttribute("opacity", "0.7");
				}				
			}
		}, false);

		element.addEventListener("mouseout", new EventListener() {
			public void handleEvent(Event evt) {
				if (getStatus().equals(Boolean.valueOf(true))) {
					setChanged();
					setStatus(Boolean.valueOf(false));
					buttonPressed = false;
					getElement().setAttribute("opacity", "0.7");
				}
			}
		}, false);

		element.setAttribute("opacity", "0.7");

	}

	@Override
	public void setDisabledLayout() {
		getElement().setAttribute("opacity", "0.3");	
	}

	@Override
	public void setEnabledLayout() {
		getElement().setAttribute("opacity", "0.7");	
	}

	
	/**
	 * 
	 */
	/*public void blink() {
		if (this.getElement() instanceof SVGGraphicsElement) {
			if (this.getStatus().equals(Boolean.valueOf(true))) {
				SVGGraphicsElement element = (SVGGraphicsElement) this
						.getElement();
				CSSStyleDeclaration style = element.getStyle();
				int styleLength = style.getLength();
				if (styleLength == 0) {
					//System.out.println("Element has no style...");
					NamedNodeMap attributes = element.getAttributes();
					if (attributes.getLength() == 0) {
						//System.out.println("Element has no attribute...");
					}
					else {

					}
				}
				// System.out.println(styleLength);
			}
		}
	}*/

	
/* artifacts of old Modelgui by sja
	public void simulationStepped(SimulationEvent e) {
		if (!buttonPressed) {
			setChanged();
			setStatus(false);
			getElement().setAttribute("opacity", "0.7");
		}
		
	}

	public void simulationPaused(SimulationEvent evt) {
		// TODO Auto-generated method stub
		
	}

	public void simulationStarted(SimulationEvent evt) {
		// TODO Auto-generated method stub
		
	}

	public void simulationStopped(SimulationEvent evt) {
		// TODO Auto-generated method stub
		
	}
*/
}
