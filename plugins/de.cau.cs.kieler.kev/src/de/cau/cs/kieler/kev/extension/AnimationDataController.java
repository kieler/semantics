package de.cau.cs.kieler.kev.extension;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;

/**
 * <p>Abstract base class of an application controller that passes data to a KEV animation
 * and vice versa.</p> 
 * 
 * <p>
 * To inform KEV about new data to be displayed at the image, it extends
 * the DataChangeEventSource where the appropriate fireDataChangeEvent(data) can be called
 * to notify KEV.
 * </p>
 * 
 * <p>
 * To be informed about user interaction with the image (press of buttons, ...), it implements
 * the DataChangeListener interface. The corresponding controlFlowChanged(ControlFlowChangeEvent e)
 * method will be called by KEV.
 * </p>
 * 
 * <p>
 * The same holds for control flow events induced by the widgets of KEV (stop, start, step,
 * delay time,...). As KEV primarily does not take care about the control flow (e.g. how
 * much time passes between two steps), this has to be handled at the controllers. Hence
 * they get informed by the implementation of the ControlFlowChangeListener interface about
 * what the user wants to do. Therefore this application is responsible of the execution thread
 * and its controls.
 * </p>
 *
 * @author haf
 *
 * @see DataChangeEventSource
 * @see ControlFlowChangeListener
 * @see DataChangeListener
 */
public abstract class AnimationDataController extends DataChangeEventSource implements IExecutableExtension, ControlFlowChangeListener, DataChangeListener{

	private String name;
	
	public void setInitializationData(IConfigurationElement config,
			String propertyName, Object data) throws CoreException {
		this.name = config.getAttribute("name");
	}

	public String getName() {
		return name;
	}
	
	

}
