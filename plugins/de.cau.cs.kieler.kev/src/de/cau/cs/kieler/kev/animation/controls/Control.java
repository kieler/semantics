package de.cau.cs.kieler.kev.animation.controls;

import java.util.Observable;
import java.util.Observer;

import org.apache.batik.dom.svg.SVGOMElement;

import de.cau.cs.kieler.kev.animation.mapping.AnimationMapping;
import de.cau.cs.kieler.kev.extension.AnimationData;
import de.cau.cs.kieler.kev.extension.DataChangeEvent;
import de.cau.cs.kieler.kev.extension.DataChangeEventSource;


/**
 * This class helps to implement SVG user input controls. A {@link Control} is
 * needed for sending data to a programming environment client. Every new input
 * control element should extend this class to assure a correct data sending
 * mechanism. The common way to construct a user control is to add
 * {@link org.w3c.dom.events.EventListener}s and use a special {@code status}
 * object to get the possibility to distinguish between different (user
 * definable) control states. The main task for {@link Control} is to offer a
 * setStatus(Object o) and a getStatus() method, which must(!) be used by
 * extending objects to set their current status correctly.
 * 
 * @author sja
 */
public abstract class Control extends DataChangeEventSource implements Observer {

	private String id;
	private int port;
	private SVGOMElement element;
	private static AnimationData dataToSend;
	private Object status;
	private Boolean isPaused = false;
	private boolean dataSent = true;
	private boolean isEnabled = true;
	private boolean hasChanged = false;

	/**
	 * Construcor. Only for initializing purposes. Class must be extended by a
	 * special control object (slider, button, textinput, etc.).
	 * 
	 * @param port
	 *            output port specified in map file (actually, the position in
	 *            output data structure {@link JavaStringData})
	 * @param element
	 *            The graphical representation of the user control
	 * @param dataToSend
	 *            data structure to send/receive data to/from a programming
	 *            environment client
	 * @param status
	 *            internal status object for distinguishing different control
	 *            states. Data type should be specified individually (e.g. for
	 *            buttons, status is only boolean: true/false)
	 */
	public Control(int port, SVGOMElement element, AnimationData dataToSend,
			Object status) {
		this.element = element;
		this.id = element.getAttribute(AnimationMapping.ID_ATTR);
		this.port = port;
		// setStatus needs a dataToSend object, so for the next two lines order
		// is important
		Control.dataToSend = dataToSend;
		this.setStatus(status);
		// this.dataToSend.getData().set(port, this.getStatus());
		// if(dataToSend.getData().size()-1 < port){
		// dataToSend.getData().setSize(port+1);
		// dataToSend.getData().add(port, status);
		// }

	}

	/**
	 * @return element in svg document
	 */
	public SVGOMElement getElement() {
		return element;
	}

	/**
	 * @return port (array index) of Control object
	 */
	public int getPort() {
		return port;
	}

	/**
	 * @return element's ID string in svg file
	 */
	public String getID() {
		return id;
	}

	private AnimationData getDataToSend() {
		return dataToSend;
	}

	/**
	 * @return current status
	 */
	public Object getStatus() {
		return status;
	}

	/**
	 * sets a private status variable. Additionally, this method sets a value in
	 * a{@link JavaStringData} data structure which is then sent to a connected
	 * client application. A status can be anything a control element is
	 * intended to be in an abstract manner. E.g. a button can be simplified to
	 * be only a boolean value while a slide bar state can be described as an
	 * integer value representing the slider's current slide position.
	 * 
	 * @param value
	 */
	public void setStatus(Object value) {		
		status = value;
		setEnabled(false);
		if (hasChanged == true){
			this.getDataToSend().setData(this.getPort(), this.getStatus());
			hasChanged = false;
			this.fireDataChangeEvent(this.getPort(), this.dataToSend);
		}
	}
	
	public void setEnabled(boolean flag){
		if (isEnabled() != flag){
			isEnabled = flag;
			if (isEnabled())
				setEnabledLayout();
			else
				setDisabledLayout();
		}
	}
	
	public void setChanged(){
		this.hasChanged = true;
	}
		
	public abstract void setEnabledLayout();
	
	public abstract void setDisabledLayout();
	
	public boolean isEnabled(){
		return isEnabled;
	}

	public boolean isDataSent() {
		return dataSent;
	}

	// TODO: if Application is in pause mode a control must 'save' its current
	// state and send it when simulation is running again
	public void update(Observable o, Object arg) {
		if (/*TODO: repair update o instanceof SVGApplication &&*/ arg instanceof Boolean) {
			isPaused = (Boolean) arg;

			if (!isPaused) {
				// we are back in play mode, so send current data now.
				this.getDataToSend().setData(this.getPort(), this.getStatus());
				dataSent = true;
			}
			else {
				//simulation is paused
				//System.out.println("Control received: simulation paused");
			}
		}
	}
}
