package de.cau.cs.kieler.kev.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import de.cau.cs.kieler.kev.KevPlugin;
import de.cau.cs.kieler.kev.Messages;
import de.cau.cs.kieler.kev.extension.AnimationDataController;
import de.cau.cs.kieler.kev.helpers.Tools;


public class KevPreferencePage extends PreferencePage implements
		IWorkbenchPreferencePage {

	/** Preference name for the type of controller */
	public final static String CONTROLLER = "controller";
	
	/** Combo for selection of controller */
	private Combo controllerCombo;
	
	/** List of available AnimationDataControllers */
	List<AnimationDataController> animationControllers;
	
	@Override
	protected Control createContents(Composite parent) {
		// create composite and set layout
		Composite container = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout(1, false);
		layout.marginLeft = 0;
		layout.marginRight = 0;
		layout.marginTop = 0;
		layout.marginBottom = 0;
		layout.verticalSpacing = 20;
		container.setLayout(layout);
		
		// create combo box for controller type
		Composite composite = new Composite(container, SWT.NONE);
		layout = new GridLayout(2, false);
		layout.horizontalSpacing = 10;
		composite.setLayout(layout);
		Label label = new Label(composite, SWT.NONE);
		label.setText("Controller:");
		controllerCombo = new Combo(composite, SWT.DROP_DOWN | SWT.READ_ONLY);
		
		int index=0;
		boolean indexSet = false;
		for (AnimationDataController controller : getControllers()) {
			controllerCombo.add(controller.getName());
			if(getPreferenceStore().getString(CONTROLLER).equals(controller.getName())){
				controllerCombo.select(index);
				indexSet = true;
			}
			index++;
		}
		if(!indexSet)
			controllerCombo.select(0);
		return container;
	}

	public void init(IWorkbench workbench) {
		// set the preference store
		IPreferenceStore preferenceStore = KevPlugin.getDefault().getPreferenceStore();
		setPreferenceStore(preferenceStore);
	}
	
	private List<AnimationDataController> getControllers(){
		if(animationControllers != null)
			return animationControllers;
				
		// get the available interfaces
		IConfigurationElement[] configElements = Platform.getExtensionRegistry().getConfigurationElementsFor(Messages.extensionPointID);
		animationControllers = new ArrayList<AnimationDataController>(configElements.length);
		System.out.println("Found Controllers for "+Messages.extensionPointID+": "+configElements.length);
		for (int i = 0; i < configElements.length; i++) {
			try{
				AnimationDataController animationController = (AnimationDataController)configElements[i].createExecutableExtension("class"); //$NON-NLS-1$
				animationControllers.add(animationController); 
			}catch(Exception e){Tools.showDialog("Error at loading a KEV data interface plugin",e);} 
		}
		
		return animationControllers;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.preference.PreferencePage#performOk()
	 */
	public boolean performOk() {
		IPreferenceStore preferenceStore = getPreferenceStore();
		try {
			int index = controllerCombo.getSelectionIndex();
			AnimationDataController controller = getControllers().get(index);
			System.out.println("Index: "+index+" Controllers: "+getControllers().size()+" con:"+controller.getName());
			getPreferenceStore().setValue(CONTROLLER, controller.getName());
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.preference.PreferencePage#performDefaults()
	 */
	protected void performDefaults() {
		super.performDefaults();
		IPreferenceStore preferenceStore = getPreferenceStore();
		String controllerName = preferenceStore.getDefaultString(CONTROLLER);
		int index = 0;
		for (AnimationDataController controller : getControllers()) {
			if ( controller.getName().equals(controllerName) )
				break;
			index++;
		}
		controllerCombo.select(index);
	}

	
}
