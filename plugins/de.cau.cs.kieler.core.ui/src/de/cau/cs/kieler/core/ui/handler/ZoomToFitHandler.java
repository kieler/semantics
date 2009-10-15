package de.cau.cs.kieler.core.ui.handler;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.diagram.ui.render.editparts.RenderedDiagramRootEditPart;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

public class ZoomToFitHandler extends AbstractHandler {

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.
     * ExecutionEvent)
     */
    public Object execute(ExecutionEvent event) throws ExecutionException {
        IEditorPart editor = PlatformUI.getWorkbench()
                .getActiveWorkbenchWindow().getActivePage().getActiveEditor();
        if (editor instanceof DiagramEditor) {
            DiagramEditPart diagramEdit = ((DiagramEditor) editor)
                    .getDiagramEditPart();
            ZoomManager zoomManager = ((RenderedDiagramRootEditPart) diagramEdit.getRoot())
                    .getZoomManager();
            zoomManager.setZoomAsText(ZoomManager.FIT_ALL);
        }
        return null;
    }

}
