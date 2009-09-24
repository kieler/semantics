package de.cau.cs.kieler.krep.evalbench.application;


import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

import de.cau.cs.kieler.krep.evalbench.application.actions.ApplicationActionBarAdvisor;

/**
 * Configures this application's workbench window.
 * 
 * @author msp
 */
public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

    /**
     * Creates the workbench window advisor.
     * 
     * @param configurer
     *            the workbench window configurer
     */
    public ApplicationWorkbenchWindowAdvisor(
	    IWorkbenchWindowConfigurer configurer) {
	super(configurer);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.ui.application.WorkbenchWindowAdvisor#createActionBarAdvisor
     * (org.eclipse.ui.application.IActionBarConfigurer)
     */
    @Override
    public ActionBarAdvisor createActionBarAdvisor(
	    IActionBarConfigurer configurer) {
	return new ApplicationActionBarAdvisor(configurer);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.application.WorkbenchWindowAdvisor#preWindowOpen()
     */
    @Override
    public void preWindowOpen() {
	IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
	configurer.setShowCoolBar(true);
	configurer.setShowStatusLine(true);
	configurer.setShowProgressIndicator(true);
	configurer.setShowPerspectiveBar(true);
    }

}
