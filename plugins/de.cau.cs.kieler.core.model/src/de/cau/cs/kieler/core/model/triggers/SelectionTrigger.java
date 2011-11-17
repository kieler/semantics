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
 * @author mmu
 * 
 */
public class SelectionTrigger extends AbstractTrigger implements ISelectionListener {

    /**
     * Remember old selection to avoid triggering KiVi every time the user clicks on the same
     * element.
     */
    private List<?> oldSelection;

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
        if (s instanceof IStructuredSelection) {
            IStructuredSelection selection = (IStructuredSelection) s;
            List<Object> newSelection = new ArrayList<Object>((List<?>) selection.toList());

            // make sure to trigger only if selection has changed
            if (!newSelection.equals(oldSelection)) {
                oldSelection = newSelection;
                IGraphicalFrameworkBridge bridge = null;
                try {
                    bridge = GraphicalFrameworkService.getInstance().getBridge(p);
                } catch (UnsupportedPartException exception) {
                    // nothing
                }
                if (bridge != null) {
                    List<EObject> list = null;
                    list = new ArrayList<EObject>();
                    for (Object o : selection.toList()) {
                        EObject element = bridge.getElement(o);
                        if (element != null) {
                            list.add(element);
                        }
                    }
                    trigger(new DiagramSelectionState(list, p));
                    // chsch: I'm not sure whether this is a good
                    //  idea but I want combinations sensitive to
                    //  SelectionStates be invoked in this case, too!
                    trigger(new SelectionState<EObject>(list));
                } else {
                    trigger(new SelectionState<Object>(newSelection));
                }
            }
        }
    }
    
    /**
     * A general selection trigger state.
     *  
     * @author chsch
     */
    public static class SelectionState<T> extends AbstractTriggerState {

        /** The list of selected objects. */
        protected List<T> objects; // SUPPRESS CHECKSTYLE VisibilityModifier

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
        private SelectionState(final List<T> list) {
            objects = list;
        }

        /**
         * Get the selected EObjects.
         * 
         * @return the EObjects
         */
        public List<T> getSelectedObjects() {
            if (objects != null) {
                return objects;
            } else {
                return new ArrayList<T>();
            }
        }

        /**
         * {@inheritDoc}
         */
        public Class<? extends ITrigger> getTriggerClass() {            
            return SelectionTrigger.class;
        }
    }


    /**
     * Contains the currently selected EObjects.
     * 
     * 
     * @author mmu, chsch (renamed to DiagramSelectionState)
     * 
     */
    public static class DiagramSelectionState extends SelectionState<EObject> {
        
        private IWorkbenchPart editor;

        /**
         * Default constructor.
         */
        public DiagramSelectionState() {

        }

        /**
         * Create a new selection state.
         * 
         * @param list
         *            the selected objects
         * @param e
         *            the diagram editor
         */
        private DiagramSelectionState(final List<EObject> list, final IWorkbenchPart e) {
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
         * Get the editor that contains the selection.
         * 
         * @return the DiagramEditor
         * @deprecated use getWorkbenchPart instead (haf)
         */
        public IEditorPart getDiagramEditor() {
            if (editor == null) {
                editor = EditorUtils.getLastActiveEditor();
            }
            return (IEditorPart) editor;
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
