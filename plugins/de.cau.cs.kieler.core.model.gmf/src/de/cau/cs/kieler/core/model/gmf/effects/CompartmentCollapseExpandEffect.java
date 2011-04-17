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
package de.cau.cs.kieler.core.model.gmf.effects;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IResizableCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.notation.DrawerStyle;
import org.eclipse.ui.IWorkbenchPart;

import de.cau.cs.kieler.core.kivi.AbstractEffect;
import de.cau.cs.kieler.core.kivi.IEffect;
import de.cau.cs.kieler.core.kivi.UndoEffect;
import de.cau.cs.kieler.core.model.GraphicalFrameworkService;
import de.cau.cs.kieler.core.model.IGraphicalFrameworkBridge;

/**
 * This Effect collapses or expands compartments. The execute() method expands while the undo method
 * collapses.
 * 
 * @deprecated in some parts this effect is still specific to GMF only, see FIXMEs
 * @author haf, mmu
 */
public class CompartmentCollapseExpandEffect extends AbstractEffect {

    private int compartmentLevel = 0; // TODO implement compartment levels
    private List<IResizableCompartmentEditPart> targetEditParts;
    private final EStructuralFeature featureToCollapse;
    private EObject targetNode;
    private boolean doCollapse;
    private boolean originalCollapseState;

    private boolean initialized = false;

    private IWorkbenchPart targetEditor;
    private boolean justExecuted;
    private IGraphicalFrameworkBridge bridge;

    /**
     * The compartment level gives the hierarchy to which to search for compartments to doCollapse.
     * 
     * @param editor
     *            the DiagramEditor containing the EObject
     * @param node
     *            the EObject to doCollapse/expand
     * @param thefeatureToCollapse
     *            the feature of the EObject to doCollapse/expand
     * @param theCompartmentLevel
     *            hierarchy level. 0 means only exactly the given EditPart. Not implemented.
     * @param collapse
     *            true if collapsing, false if expanding
     */
    public CompartmentCollapseExpandEffect(final IWorkbenchPart editor, final EObject node,
            final EStructuralFeature thefeatureToCollapse, final int theCompartmentLevel,
            final boolean collapse) {
        this.compartmentLevel = theCompartmentLevel;
        this.doCollapse = collapse;
        this.targetEditor = editor;
        this.targetNode = node;
        this.targetEditParts = new ArrayList<IResizableCompartmentEditPart>();
        this.featureToCollapse = thefeatureToCollapse;
        this.bridge = GraphicalFrameworkService.getInstance().getBridge(targetEditor);
    }

    /**
     * Extracted the initialization into extra method that is NOT called in the constructor, because
     * it accesses the EditParts (bridge.getEditPart), which runs in the UI thread. This could cause
     * deadlocks if called outside the EffectsWorker Thread (in which the execute method gets
     * called).
     */
    private void init() {
        if (!initialized) {
            this.initialized = true;
            EditPart parentPart = bridge.getEditPart(this.targetNode);
            if (parentPart != null) {
                outer: for (Object child : parentPart.getChildren()) {
                    if (child instanceof IResizableCompartmentEditPart) {
                        // if no feature is given, collapse all child compartments
                        if (featureToCollapse == null) {
                            targetEditParts.add((IResizableCompartmentEditPart) child);
                        } else {
                            // search for a specific feature
                            for (Object grandChild : ((IResizableCompartmentEditPart) child)
                                    .getChildren()) {
                                if (grandChild instanceof EditPart) {
                                    EObject grandChildSemantic = bridge.getElement(grandChild);
                                    if (grandChildSemantic.eContainingFeature() == featureToCollapse) {
                                        targetEditParts.add((IResizableCompartmentEditPart) child);
                                        break outer;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            originalCollapseState = isCollapsed();
        }
    }

    /**
     * {@inheritDoc}
     */
    public void execute() {
        justExecuted = apply(doCollapse);
    }

    /**
     * Undo the effect, i.e. expand a collapsed compartment.
     */
    public void undo() {
        justExecuted = apply(originalCollapseState);
    }

    private boolean apply(final boolean collapse) {
        init();
        boolean changed = false;
        for (IResizableCompartmentEditPart targetEditPart : targetEditParts) {
            if (targetEditPart != null
                    && targetEditPart.getFigure() instanceof ResizableCompartmentFigure) {
                ResizableCompartmentFigure f = (ResizableCompartmentFigure) targetEditPart
                        .getFigure();
                // only do something if necessary
                if (f.isExpanded() == collapse) {
                    if (collapse) {
                        System.out.println("Collapsing " + targetEditPart);
                        f.setCollapsed();
                    } else {
                        System.out.println("Expanding " + targetEditPart);
                        f.setExpanded();
                    }
                    changed = true;
                }
            }
        }
        return changed;
    }

    /**
     * Determines whether the last call to execute() or undo() actually performed any changes.
     * 
     * @return true if changes were performed
     */
    public boolean hasJustExecuted() {
        return justExecuted;
    }

    /**
     * Set whether this effect should collapse or expand on the next execute().
     * 
     * @param collapsed
     *            true if collapsing
     */
    public void setCollapsed(final boolean collapsed) {
        doCollapse = collapsed;
    }

    @Override
    public boolean isMergeable() {
        return true;
    }

    @Override
    public IEffect merge(final IEffect otherEffect) {
        init();
// FIXME: this merging does not work. You cannot merge hierarchical expand effects for example
//        if (otherEffect instanceof CompartmentCollapseExpandEffect) {
//            CompartmentCollapseExpandEffect other = (CompartmentCollapseExpandEffect) otherEffect;
//            if (other.targetEditor == targetEditor && other.targetEditParts.equals(targetEditParts)) {
//                originalCollapseState = other.originalCollapseState;
//                System.out.println("Merging 1 "+this+" >===> "+other);
//                return this;
//            }
//        } else 
        if (otherEffect instanceof UndoEffect) {
            IEffect undo = ((UndoEffect) otherEffect).getEffect();
            if (undo instanceof CompartmentCollapseExpandEffect) {
                CompartmentCollapseExpandEffect other = (CompartmentCollapseExpandEffect) undo;
                if (other.targetEditor == targetEditor
                        && other.targetEditParts.equals(targetEditParts)) {
                    originalCollapseState = other.originalCollapseState;
                    System.out.println("Merging 2 "+this+" >===> "+other);
                    return this;
                }
            }
        }
        return null;
    }

    private boolean isCollapsed() {
        boolean allCollapsed = true;
        for (IResizableCompartmentEditPart targetEditPart : targetEditParts) {
            if (targetEditPart != null && targetEditPart.getModel() instanceof DrawerStyle) {
                // FIXME: This is specific to GMF notation model
                allCollapsed &= ((DrawerStyle) targetEditPart.getModel()).isCollapsed();
            } else {
                allCollapsed &= !doCollapse;
            }
        }
        return allCollapsed;
    }

    /**
     * Get the editor the effect is performed on.
     * 
     * @return the target editor
     */
    public IWorkbenchPart getTargetEditor() {
        return targetEditor;
    }

    /**
     * Get the node the effect is performed on.
     * 
     * @return the target node
     */
    public EObject getTargetNode() {
        return targetNode;
    }

    public String toString() {
        StringBuffer b = new StringBuffer();
        b.append(super.toString());
        if (this.doCollapse) {
            b.append("Collapse ");
        } else {
            b.append("Expand ");
        }
        b.append(targetNode);
        return b.toString();
    }
}
