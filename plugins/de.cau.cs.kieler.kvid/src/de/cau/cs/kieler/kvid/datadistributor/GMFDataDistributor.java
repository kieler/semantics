package de.cau.cs.kieler.kvid.datadistributor;

import java.util.Collection;
import java.util.HashMap;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.core.model.util.ModelingUtil;

public class GMFDataDistributor {
    
    private static final GMFDataDistributor instance = new GMFDataDistributor();
    
    private HashMap<String, EditPart> editPartsByURI = new HashMap<String, EditPart>();
    
    public static GMFDataDistributor getInstance() {
        return instance;
    }
    
    public void initialize() {
        IEditorPart activeEditor = getActiveEditor();
        if (activeEditor instanceof DiagramEditor) {
            DiagramEditPart dep = ((DiagramEditor)activeEditor).getDiagramEditPart();
            Collection<?> editParts = dep.getViewer().getEditPartRegistry()
                    .values();
            for (Object object : editParts) {
                EditPart part = (EditPart)object;
                if (part.getModel() instanceof EObject) {
                    EObject eObject = (EObject)part.getModel();
                    Resource resource = eObject.eResource();
                    System.out.println(eObject.toString());
                    String URI = EcoreUtil.getURI(eObject).toString();
                    editPartsByURI.put(URI, part);
                    System.out.println(URI);
                }
            }
        }
    }
    
    public void markPartByURI(String fragmentURI) {
        EditPart marked = getEditPartByURI(fragmentURI);
        if (marked instanceof GraphicalEditPart) {
            IFigure markable = ((GraphicalEditPart) marked).getFigure();
            markable.setBackgroundColor(ColorConstants.blue);
        }
    }
    
    public EditPart getEditPartByURI(String fragmentURI) {
        return editPartsByURI.get(fragmentURI);
    }
    
    private IEditorPart getActiveEditor() {
        IEditorPart editor = null;
        IWorkbenchWindow[] activeWindows = PlatformUI.getWorkbench().getWorkbenchWindows();
        for (int i = 0; i < activeWindows.length; i++) {
            IWorkbenchPage page = activeWindows[i].getActivePage();
            if (page.getActiveEditor() != null) {
                editor = page.getActiveEditor();
            }
        }
        return editor;        
    }

}
