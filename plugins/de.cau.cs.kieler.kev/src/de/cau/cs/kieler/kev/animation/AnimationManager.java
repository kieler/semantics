package de.cau.cs.kieler.kev.animation;

import org.apache.batik.swing.gvt.GVTTreeRendererAdapter;
import org.apache.batik.swing.gvt.GVTTreeRendererEvent;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

import de.cau.cs.kieler.kev.KevPlugin;
import de.cau.cs.kieler.kev.Messages;
import de.cau.cs.kieler.kev.animation.mapping.AnimationMapping;
import de.cau.cs.kieler.kev.extension.AnimationData;
import de.cau.cs.kieler.kev.extension.AnimationDataController;
import de.cau.cs.kieler.kev.extension.ControlFlowChangeEvent;
import de.cau.cs.kieler.kev.extension.ControlFlowEventSource;
import de.cau.cs.kieler.kev.extension.DataChangeEvent;
import de.cau.cs.kieler.kev.extension.DataChangeListener;
import de.cau.cs.kieler.kev.helpers.Tools;
import de.cau.cs.kieler.kev.ui.KevPreferencePage;
import de.cau.cs.kieler.kev.views.EnvironmentView;


public class AnimationManager extends GVTTreeRendererAdapter implements DataChangeListener{

	//AnimationJob animationJob;
	AnimationMapping animationMapping;
	EnvironmentView view;
	
	// remember the current controller, so for next init you can check
	// if it needs to be reset
	AnimationDataController currentController;
	
	//DataChangeEventSource dataChangeEventSource;
	ControlFlowEventSource controlFlowEventSource;
	
	int delay = 0;
	// true if it is already initialized, false if not
	boolean initialized = false;
	
	/** Implementing singleton pattern */
	private static AnimationManager instance;
	
	public AnimationManager(EnvironmentView view) {
		this.view = view;
		//dataChangeEventSource = new DataChangeEventSource();
		controlFlowEventSource = new ControlFlowEventSource();
		instance = this;
	}
	
	/** Implementing singleton pattern */
	public static AnimationManager getInstance(){
		return instance;
	}
	
	public void init() {
		initialized = false;
		animationMapping = new AnimationMapping(view);
		//System.out.println("DisplayPortSize: "+animationMapping.getDisplayPortSize()+" ControlPortSize: "+animationMapping.getControlPortsize());
		//controlFlowEventSource = new ControlFlowEventSource();
		String controllerString = KevPlugin.getDefault().getPreferenceStore().getString(KevPreferencePage.CONTROLLER);
		registerController(controllerString);
		initialized = true;
		Tools.setStatusLine("Ready.");
	}
	
    public void start() {
		Tools.setStatusLine("Init animation manager...");
    	init(); // reload preferences (might have been changed)
    	if(initialized){
    		Tools.setStatusLine("play.");
			controlFlowEventSource.fireControlFlowChangeEvent(ControlFlowChangeEvent.Type.START, null);
    	}
	}
	public void stop() {
		if(initialized){
			Tools.setStatusLine("stop.");
			controlFlowEventSource.fireControlFlowChangeEvent(ControlFlowChangeEvent.Type.STOP, null);
		}
	}
	public void step(){
		if(initialized){
			Tools.setStatusLine("step.");
			controlFlowEventSource.fireControlFlowChangeEvent(ControlFlowChangeEvent.Type.STEP, null);
		}
	}

	public void setDelay(int delay){
		this.delay = delay; // need to store the state of the delay, because Job might be instantiated later
		// this shall also be done during initialization
		controlFlowEventSource.fireControlFlowChangeEvent(ControlFlowChangeEvent.Type.DELAY, new Integer(delay));
	}
	
	public void error(){
		if(initialized){
			Tools.setStatusLine("paused.");
			controlFlowEventSource.fireControlFlowChangeEvent(ControlFlowChangeEvent.Type.ERROR, null);
		}
	}

	/**
	 * Callback called when rendering of image has finished. Means a new image was
	 * successfully loaded.
	 */
	public void gvtRenderingCompleted(GVTTreeRendererEvent e) {
		// when a new image was loaded, reinit the animation manager
		// done in extra job to get better visible status information
		final AnimationManager am = this;
		Job delayedJob = new Job("Init animation manager"){
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				am.init();
				return Status.OK_STATUS;
			}
		};
		delayedJob.schedule();
	}

	/**
	 * Listens to DataChangeEvents that are supposed to indicate that input data
	 * has changed, that should be animated in the graphical representation.
	 */
	public void dataChanged(DataChangeEvent e) {
		//System.out.println("Input Data has changed: "+e.getData());
		try {
			view.getComposite().getSvgCanvas().getUpdateManager().getUpdateRunnableQueue()
					.invokeLater(new AnimationRunner(e.getData()));
		} catch(Exception exc){
			/* do nothing */
		}
	}

	public void setDataSize(int size) {
		System.out.println("Control data size: "+size);
	}
	
	public AnimationMapping getAnimationMapping() {
		return animationMapping;
	}

	/**
	 * registers a new controller from the list of available controllers in the
	 * plugin registry by a controllerName. Old controllers will be unregistered and
	 * the new one if it matches the controllerName will be registered.
	 * @param controllerName
	 */
	public void registerController(String controllerName) {
				
		// get the available interfaces
		IConfigurationElement[] configElements = Platform.getExtensionRegistry().getConfigurationElementsFor(Messages.extensionPointID);
		for (int i = 0; i < configElements.length; i++) {
			try{
				AnimationDataController animationController = (AnimationDataController)configElements[i].createExecutableExtension("class"); //$NON-NLS-1$
				animationController.removeDataChangeListeners();
				if(animationController.getName().equals(controllerName)){
					// if we already have the right controller, do not create it again!
					if(currentController != null && currentController.getClass() == animationController.getClass())
						break; 
					// now start actual creation of the new controller (which begins with stopping the old one)
					this.stop(); 
					currentController = animationController; // remember the new for next time
					// deregister old controllers
					this.controlFlowEventSource.removeControlFlowChangeListeners();
					this.getAnimationMapping().unregisterControlListeners();
					// now add listeners to selected controller
					animationController.addDataChangeListener(this);
					this.getAnimationMapping().registerControlListeners(animationController);
					this.controlFlowEventSource.addControlFlowChangeListener(animationController);
					// set size of data
					animationController.setSize(animationMapping.getDisplayPortSize());
				}
			}catch(Exception e){Tools.showDialog("Error at loading a KEV data interface plugin",e);} 
		}
		// set initial delay (will be fired to listeners now they are added)
		this.setDelay(delay);
	}

	
	/**
	 * Very simple runnable that takes data and calls all animations of
	 * the animations stored in the animationMapping.
	 * This is required to do the task asynchronously the Batik way.
	 */
	private class AnimationRunner implements Runnable{
		AnimationData data;
		public AnimationRunner(AnimationData data) {
			this.data = data;
		}
		public void run() {
			for (int i = 0; i < animationMapping.getAnimationList().size(); i++) {
				animationMapping.getAnimationList().get(i).doAnimation(data);
			}
		}
	}
	
}
