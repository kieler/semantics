package de.cau.cs.kieler.kev.application;

import org.apache.batik.swing.JSVGCanvas;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

import de.cau.cs.kieler.kev.views.EnvironmentComposite;
import de.cau.cs.kieler.kev.views.EnvironmentView;


public class ApplicationWorkbenchAdvisor extends WorkbenchAdvisor {

	private static final String PERSPECTIVE_ID = "de.cau.cs.kieler.kev.application.perspective";

    public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        return new ApplicationWorkbenchWindowAdvisor(configurer);
    }

	public String getInitialWindowPerspectiveId() {
		return PERSPECTIVE_ID;
	}
	
	@Override
	public void postStartup() {
		super.postStartup();
		// register KEV Listener at JSVG Canvas to resize window if image changed
		// first search KEV view
		IViewReference[] views = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getViewReferences();
		for (int i = 0; i < views.length; i++) {
			IViewPart view = views[i].getView(false);
			if(view.getViewSite().getId().equals(EnvironmentView.ID)){
				EnvironmentComposite comp = ((EnvironmentView)view).getComposite();
				JSVGCanvas canvas = comp.getSvgCanvas(); 
				canvas.addGVTTreeRendererListener(new KevListener(canvas));
			}
		}
	}
}
