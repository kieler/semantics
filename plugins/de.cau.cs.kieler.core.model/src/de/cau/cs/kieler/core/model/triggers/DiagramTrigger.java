/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model.triggers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;

import de.cau.cs.kieler.core.kivi.AbstractTrigger;
import de.cau.cs.kieler.core.kivi.AbstractTriggerState;
import de.cau.cs.kieler.core.kivi.ITrigger;
import de.cau.cs.kieler.core.model.GraphicalFrameworkService;
import de.cau.cs.kieler.core.model.IGraphicalFrameworkBridge;
import de.cau.cs.kieler.core.ui.UnsupportedPartException;
import de.cau.cs.kieler.core.ui.util.CombinedWorkbenchListener;
import de.cau.cs.kieler.core.ui.util.EditorUtils;

/**
 * A Trigger for supported diagrams. It will fire a DiagramState to the KIELER View Management if an
 * Eclipse Editor or View has been activated that contains a diagram for which a compatible
 * IGraphicalFrameworkBridge is available.
 * 
 * @author haf
 */
public class DiagramTrigger extends AbstractTrigger implements IPartListener {

    private IWorkbenchPart currentEditor;

    /**
     * {@inheritDoc}
     */
    @Override
    public void register() {
        CombinedWorkbenchListener.addPartListener(this);
        // test the active editor
        // else the initially open editor will not send events until the editor changes
        currentEditor = EditorUtils.getLastActiveEditor();
        tryTrigger(currentEditor);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void unregister() {
        CombinedWorkbenchListener.removePartListener(this);
    }

    /**
     * {@inheritDoc}
     */
    public void partActivated(final IWorkbenchPart part) {
        // Eclipse might activate the same part multiple times
        if (part != currentEditor) {
            currentEditor = part;
            tryTrigger(currentEditor);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void partBroughtToTop(final IWorkbenchPart part) {
        // TODO Auto-generated method stub

    }

    /**
     * {@inheritDoc}
     */
    public void partClosed(final IWorkbenchPart part) {
        // TODO Auto-generated method stub

    }

    /**
     * {@inheritDoc}
     */
    public void partDeactivated(final IWorkbenchPart part) {
        // TODO Auto-generated method stub

    }

    /**
     * {@inheritDoc}
     */
    public void partOpened(final IWorkbenchPart part) {
        // TODO Auto-generated method stub

    }

    private void tryTrigger(final IWorkbenchPart part) {
        try {
            DiagramState state = new DiagramState(part);
            this.trigger(state);
        } catch (UnsupportedPartException e) {
            /* nothing, ignore if the part is not supported */
        }
    }

    /**
     * A TriggerState that contains a diagram that can be processed with the KIELER View Management.
     * Currently the diagram will be represented by an IWorkBenchPart (i.e. an Eclipse Editor or
     * View). From this the corresponding information can be obtained by registered
     * IGraphicalFrameworkBridge instances.
     * <p>
     * If you want to support another diagram or workbench part type, a new framework bridge has to
     * be implemented for that part.
     * 
     * @author haf
     */
    public static class DiagramState extends AbstractTriggerState {

        // the Eclipse editor or view that contains a diagram
        private IWorkbenchPart diagramPart;
        // a cache for the bridge
        private IGraphicalFrameworkBridge bridge;

        /**
         * Default constructor creating an invalid DiagramState.
         */
        public DiagramState() {
        }

        /**
         * Constructor taking the corresponding {@link IWorkbenchPart} that contains the diagram.
         * 
         * @param diagram a diagram editor part
         */
        public DiagramState(final IWorkbenchPart diagram) {
            this.diagramPart = diagram;
            // initialize framework bridge. Will throw UnsupportedPartException if no bridge
            // for this part is available. This guarantees that there is always a valid bridge
            bridge = GraphicalFrameworkService.getInstance().getBridge(diagram);
        }

        /**
         * Get the WorkBenchPart (Editor/View) that contains a diagram. It was already checked that
         * a GraphicalFrameworkBridge is available for this part, so this is guaranteed here.
         * 
         * @return an Eclipse WorkBenchPart containing a diagram.
         */
        public IWorkbenchPart getDiagramPart() {
            return diagramPart;
        }

        /**
         * Get the GraphicalFrameworkBridge corresponding to the current diagram. This should be
         * used to obtain model or diagram information in a generic fashion.
         * 
         * @return the registered IGraphicalFrameworkBridge for this diagram
         */
        public IGraphicalFrameworkBridge getGraphicalFrameworkBridge() {
            return bridge;
        }

        /**
         * Get the semantic model in shape of the root EObject that corresponds to the diagram. May
         * throw an {@link UnsupportedPartException} if no semantic model can be found. So this method
         * never returns {@code null}.
         * 
         * @return EObject model corresponding to the diagram
         */
        public EObject getSemanticModel() {
            EditPart rootEditPart = bridge.getEditPart(diagramPart);
            EObject model = bridge.getElement(rootEditPart);
            if (model == null) {
                throw new UnsupportedPartException("getSemanticModel",
                        "For the active diagram workbench part no semantic model can be found.",
                        diagramPart);
            }
            return model;
        }

        /**
         * Get the type ID of the diagram. I.e. in an editor it is the same as the Editor ID. TODO:
         * should be adopted to views if views get supported
         * 
         * @return String ID of the diagram type
         */
        public String getDiagramType() {
            try {
                return diagramPart.getSite().getId();
            } catch (NullPointerException e) {
                return "";
            }
        }

        /**
         * {@inheritDoc}
         */
        public Class<? extends ITrigger> getTriggerClass() {
            return DiagramTrigger.class;
        }

    }
}
