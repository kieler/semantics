package de.cau.cs.kieler.cview.klighd;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.Workbench;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.texteditor.ITextEditor;

import de.cau.cs.kieler.cview.CViewPlugin;
import de.cau.cs.kieler.cview.model.cViewModel.Connection;
import de.cau.cs.kieler.klighd.IAction;
import de.cau.cs.kieler.klighd.kgraph.KEdge;
import de.cau.cs.kieler.klighd.kgraph.KGraphElement;


/** 
 * Opens the editor on a double click of a connection.
 * 
 * @author cmot
 *
 */
public class OpenEditorForConnectionAction implements IAction {

	/** The action ID. */
    public static final String ID = "de.cau.cs.kieler.cview.OpenEditorForConnectionAction";
	
	// Shorten the path of a file
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
    
    // Resolve the path to a file
    private IFile resolveFile(String pathString) {
        Path path = new Path(pathString);
        IFile file = null;
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
                            file = iContainer.getFile(path);
                        } catch (Exception e) {
                        }
                        if (file.exists()) {
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
        return file;
    }
    
    

    /**
     * {@inheritDoc}
     */
    public ActionResult execute(final ActionContext context) {
    	// Get the selected element (a KEdge as only KEdges will receive this listener)
        KGraphElement element = context.getKGraphElement();
        if(element instanceof KEdge) {
        	KEdge edge = (KEdge) element;
        	// Get the connection corresponding to the edge
    		Object obj = context.getViewContext().getSourceElement(edge);
    		if(obj instanceof Connection) {
    			Connection con = (Connection) obj;
    			
    			// Get the location of the connection
    			String pathString = con.getLocation();
    			if (pathString != null) {
    				// Resolve the location to a file
    				IFile file = resolveFile(pathString);
    				
    				// Try and open the file
    				IWorkbenchPage page = Workbench.getInstance().getWorkbenchWindows()[0].getActivePage();
    				IEditorDescriptor desc =
    						PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor(file.getName());
    				try {
    					IEditorPart editorPart = page.openEditor(new FileEditorInput(file), desc.getId());
    					
    					int line = con.getReferenceLine();
    					goToLine(editorPart, line);
    					
    				} catch (PartInitException e) {
    					e.printStackTrace();
    				}
    			}
    		}
        	
        	// -------------------------------------------------------------------------
        	
        }

        return ActionResult.createResult(false);
    }

    // -------------------------------------------------------------------------

    /**
     * 
     * @param editorPart
     * @param lineNumber
     */
    private static void goToLine(IEditorPart editorPart, int lineNumber) {
        if (!(editorPart instanceof ITextEditor) || lineNumber <= 0) {
            return;
        }
        ITextEditor editor = (ITextEditor) editorPart;
        IDocument document = editor.getDocumentProvider().getDocument(editor.getEditorInput());
        if (document != null) {
            IRegion lineInfo = null;
            try {
                // line count internally starts with 0, and not with 1 like in
                // GUI
                lineInfo = document.getLineInformation(lineNumber - 1);
            } catch (BadLocationException e) {
                // ignored because line number may not really exist in document,
                // we guess this...
            }
            if (lineInfo != null) {
                editor.selectAndReveal(lineInfo.getOffset(), lineInfo.getLength());
            }
        }
    }

}
