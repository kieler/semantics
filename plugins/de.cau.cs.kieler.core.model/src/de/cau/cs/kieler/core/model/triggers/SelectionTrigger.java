/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model.triggers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.core.kivi.AbstractTrigger;
import de.cau.cs.kieler.core.kivi.AbstractTriggerState;
import de.cau.cs.kieler.core.kivi.ITrigger;
import de.cau.cs.kieler.core.model.GraphicalFrameworkService;
import de.cau.cs.kieler.core.model.IGraphicalFrameworkBridge;
import de.cau.cs.kieler.core.ui.UnsupportedPartException;
import de.cau.cs.kieler.core.ui.util.EditorUtils;
import de.cau.cs.kieler.core.ui.util.MonitoredOperation;

/**
 * Listens for selection and deselection of graphical elements.
 * 
 * @author mmu, haf
 * 
 */
public class SelectionTrigger extends AbstractTrigger implements ISelectionListener {

    /**
     * Remember old selection to avoid triggering KiVi every time the user clicks on the same
     * element.
     */
    private List<EObject> oldSelection;

    /**
     * Create a new SelectionTrigger.
     */
    public SelectionTrigger() {

    }

    /**
     * {@inheritDoc}
     */
    public void register() {
        final ISelectionListener isl = this;
        MonitoredOperation.runInUI(new Runnable() {
            public void run() {
                PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService()
                        .addSelectionListener(isl);
            }
        }, false);
    }

    /**
     * {@inheritDoc}
     */
    public void unregister() {
        final ISelectionListener isl = this;
        MonitoredOperation.runInUI(new Runnable() {
            public void run() {
                PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService()
                        .removeSelectionListener(isl);
            }
        }, false);
    }

    /**
     * {@inheritDoc}
     */
    public void selectionChanged(final IWorkbenchPart p, final ISelection s) {
    	List<EObject> list = new ArrayList<EObject>();
    	// first try selection of a standard EMF tree editor (haf)
        try {
	    	if(s instanceof TreeSelection){
	        	TreeSelection ts = (TreeSelection)s;
	        	for(Object o: ts.toList()){
	        		if(o instanceof EObject){
	        			list.add((EObject)o);
	        		}
	        	}
	        }else{
	        	// else try a graphical editor 
		    	if (s instanceof IStructuredSelection) {
		                IGraphicalFrameworkBridge bridge = GraphicalFrameworkService.getInstance().getBridge(p);
		                IStructuredSelection selection = (IStructuredSelection) s;
		                for (Object o : selection.toList()) {
		                    EObject element = bridge.getElement(o);
		                    if (element != null) {
		                        list.add(element);
		                    }
		                }
		    	}
	        }
	        // make sure to trigger only if selection has changed
	        if (!list.equals(oldSelection)) {
	            oldSelection = list;
	            trigger(new SelectionState(list, p));
	        }
	    } catch (UnsupportedPartException exception) {
        // ignore exception
	    }
    }

    /**
     * Contains the currently selected EObjects.
     * 
     * @author mmu
     * 
     */
    public static final class SelectionState extends AbstractTriggerState {

        private List<EObject> objects;

        private IWorkbenchPart editor;

        /**
         * Default constructor.
         */
        public SelectionState() {

        }

        /**
         * Create a new selection state.
         * 
         * @param list
         *            the selected objects
         * @param e
         *            the diagram editor
         */
        private SelectionState(final List<EObject> list, final IWorkbenchPart e) {
            objects = list;
            editor = e;
        }

        /**
         * {@inheritDoc}
         */
        public Class<? extends ITrigger> getTriggerClass() {
            return SelectionTrigger.class;
        }

        /**
         * Get the selected EObjects.
         * 
         * @return the EObjects
         */
        public List<EObject> getSelectedEObjects() {
            if (objects != null) {
                return objects;
            } else {
                return new ArrayList<EObject>();
            }
        }

        /**
         * Get the editor that contains the selection.
         * 
         * @return the DiagramEditor
         * @deprecated use getWorkbenchPart instead
         */
        public IEditorPart getDiagramEditor() {
            if (editor == null) {
                editor = EditorUtils.getLastActiveEditor();
            }
            return (IEditorPart)editor;
        }
        
        /**
         * Get the editor that contains the selection.
         * 
         * @return the DiagramEditor
         */
        public IWorkbenchPart getWorkbenchPart() {
            if (editor == null) {
                editor = EditorUtils.getLastActiveEditor();
            }
            return editor;
        }
        
    }

}
