package de.cau.cs.kieler.cview.klighd;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.Workbench;
import org.eclipse.ui.navigator.CommonNavigator;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;

import de.cau.cs.kieler.cview.model.cViewModel.Component;
import de.cau.cs.kieler.klighd.IAction;

/** 
 * A class for linking the selected element in the KLighD View with 
 * elements in the workspace/project explorer
 * 
 * @author cmot
 *
 */
public class EditorLinkageAction implements IAction {
	
	/** The action ID. */
    public static final String ID = "de.cau.cs.kieler.cview.EditorLinkageAction";
    



    // Shorten the file
	private String shortenFile(String pathString) {
        if (pathString == null) {
            return null;
        }
        int i = pathString.indexOf("/");
        int j = pathString.indexOf("\\");
        if (j > 0) {
            i = j;
        }
        if (i == -1) {
            // not found
            return null;
        } else {
            return (pathString.substring(i + 1));
        }
    }
	
	
	// Resolve the path to a resource
	private IResource resolveFile(String pathString) {
        Path path = new Path(pathString);
        IResource resource = null;
        boolean done = false;
        boolean doneAll = false;
        List<IContainer> iContainerList = new ArrayList<IContainer>();
        iContainerList.add(ResourcesPlugin.getWorkspace().getRoot());
        // Brute force search also in all projects (if renamed project)
        for (IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
            iContainerList.add(project);
        }
        for (IContainer iContainer : iContainerList) {
            if (!doneAll) {
                done = false;
                String pathStringTemp = pathString;
                while (!done && !doneAll) {
                    if (!done) {
                        try {
                        	IFile file = iContainer.getFile(path);
                        	IFolder folder = iContainer.getFolder(path);
                        	if(file != null && file.exists()) {
                        		resource = file;
                        	} else if(folder != null && folder.exists()) {
                        		resource = folder;
                        	}
                        } catch (Exception e) {
                        }
                        if (resource != null && resource.exists()) {
                            doneAll = true;
                        } else {
                            pathStringTemp = shortenFile(pathStringTemp);
                            if (pathStringTemp != null) {
                                path = new Path(pathStringTemp);
                            } else {
                                done = true;
                            }
                        }
                    }
                }
            }
        }
        return resource;
    }
	
	
	@Override
	public ActionResult execute(ActionContext context) {
	    IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
	    for (IViewPart view : page.getViews()) {
	        if (view instanceof CommonNavigator) {
	            boolean linkingEnabled = ((CommonNavigator) view).isLinkingEnabled();    
	            if (!linkingEnabled) {
	                return ActionResult.createResult(false);
	            }
	          }
	    }
	    
	    
		// Get the selected KNode and its corresponding component
        Object domainElement = context.getDomainElement(context.getKNode());
        if(domainElement instanceof Component) {
        	Component component = (Component) domainElement;
        	// Get the location of the component
        	String location = component.getLocation();
        	// Also get the parent
        	Component parent = component.getParent();
        	// If the component has no location, try and get 
        	// the location of the parent until a location is found
        	while(location == null && parent != null) {
        		location = parent.getLocation();
        		parent = parent.getParent();
        	}
        	if(location == null) {
        		return null;
        	}
        	// Resolve the location
        	IResource res = resolveFile(location);
        	if(res != null) {
        		// Find the workbench and select the selected element
        		IWorkbenchWindow window = Workbench.getInstance().getWorkbenchWindows()[0];
        		BasicNewResourceWizard.selectAndReveal(res, window);
        	}
        }
        
		return ActionResult.createResult(false);
	}

}
