package de.cau.cs.kieler.synccharts.labelparser.bridge;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.core.KielerException;
import de.cau.cs.kieler.synccharts.Region;

/**
 * A command handler that looks for an SyncCharts graphical GMF editor and
 * parses all action labels again and then serializes all again.
 * @author haf
 */
public class ActionLabelParseHandler extends AbstractHandler {

    public Object execute(ExecutionEvent event) throws ExecutionException {
        String msg;
        Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "");
        try{
        IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
        EditPart rootEditPart = ((DiagramEditor)editor).getDiagramEditPart();
        Object rootView = rootEditPart.getModel();
        EObject rootModel = ((View)rootView).getElement();
        if(rootModel instanceof Region){
            ActionLabelProcessorWrapper.processActionLabels(rootModel, ActionLabelProcessorWrapper.SERIALIZE);
            ActionLabelProcessorWrapper.processActionLabels(rootModel, ActionLabelProcessorWrapper.PARSE);
        }
        else
            throw new KielerException("Root model element is no Region");
       
        myStatus = new Status(IStatus.OK, Activator.PLUGIN_ID, "Parsing and re-serialization of action strings done.");
        }
        catch (NullPointerException e) {
            myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "No SyncChart Editor open. ", e);
        }
        catch (ClassCastException e) {
            myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Not a SyncChart Editor open. ", e);
        } catch(Exception e){
            myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error parsing an action label. ", e);
        }
        finally{
               StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
        }
        return null;
    }

  
}
