package de.cau.cs.kieler.krep.evalbench.application;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.application.IWorkbenchConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

/**
 * Configures this application's workbench.
 * 
 * @author msp
 */
public class ApplicationWorkbenchAdvisor extends WorkbenchAdvisor {

    /** Perspective identifier for the initial perspective */
    private static final String PERSPECTIVE_ID = "de.cau.cs.kieler.krep.evalbench.ui.perspective";
                                           
    /** Key for storing user folder information */
    private final static String USER_FOLDER_KEY = "EvalBench.user_folder";

    /** The workbench window advisor */
    private ApplicationWorkbenchWindowAdvisor workbenchWindowAdvisor;

    
     /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.ui.application.WorkbenchAdvisor#initialize(org.eclipse.ui
     * .application.IWorkbenchConfigurer)
     */
    @Override
    public void initialize(IWorkbenchConfigurer configurer) {
	configurer.setSaveAndRestore(true);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.ui.application.WorkbenchAdvisor#createWorkbenchWindowAdvisor
     * (org.eclipse.ui.application.IWorkbenchWindowConfigurer)
     */
    @Override
    public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(
	    IWorkbenchWindowConfigurer configurer) {
	workbenchWindowAdvisor = new ApplicationWorkbenchWindowAdvisor(
		configurer);
	return workbenchWindowAdvisor;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.ui.application.WorkbenchAdvisor#getInitialWindowPerspectiveId
     * ()
     */
    @Override
    public String getInitialWindowPerspectiveId() {
	return PERSPECTIVE_ID;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.application.WorkbenchAdvisor#postStartup()
     */
    @Override
    public void postStartup() {
	// restore application preferences
	IPreferenceStore preferenceStore = Activator.getDefault()
		.getPreferenceStore();
	// read the user folder
	Activator.userFolder = preferenceStore.getString(USER_FOLDER_KEY);
	if (Activator.userFolder.length() == 0) {
	    Activator.userFolder = null;
	}
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.application.WorkbenchAdvisor#preShutdown()
     */
    @Override
    public boolean preShutdown() {
	// store application preferences
	IPreferenceStore preferenceStore = Activator.getDefault()
		.getPreferenceStore();
	// store the user folder
	if (Activator.userFolder != null) {
	    preferenceStore.setValue(USER_FOLDER_KEY, Activator.userFolder);
	}
	return true;
    }

}
