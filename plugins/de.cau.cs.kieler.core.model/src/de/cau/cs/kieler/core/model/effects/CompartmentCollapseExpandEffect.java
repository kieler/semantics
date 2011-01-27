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
package de.cau.cs.kieler.core.model.effects;

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
import de.cau.cs.kieler.core.ui.GraphicalFrameworkService;
import de.cau.cs.kieler.core.ui.IGraphicalFrameworkBridge;

/**
 * This Effect collapses or expands compartments. The execute() method expands while the undo method
 * collapses.
 * 
 * @deprecated in some parts this effect is still specific to GMF only, see FIXMEs
 * @author haf, mmu
 */
public class CompartmentCollapseExpandEffect extends AbstractEffect {

    private int compartmentLevel = 0; // TODO implement compartment levels
    private IResizableCompartmentEditPart targetEditPart;
    private EObject targetNode;
    private boolean doCollapse;
    private boolean originalCollapseState;
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
     * @param featureToCollapse
     *            the feature of the EObject to doCollapse/expand
     * @param theCompartmentLevel
     *            hierarchy level. 0 means only exactly the given EditPart. Not implemented.
     * @param collapse
     *            true if collapsing, false if expanding
     */
    public CompartmentCollapseExpandEffect(final IWorkbenchPart editor, final EObject node,
            final EStructuralFeature featureToCollapse, final int theCompartmentLevel,
            final boolean collapse) {
        this.compartmentLevel = theCompartmentLevel;
        this.doCollapse = collapse;
        this.targetEditor = editor;
        this.targetNode = node;
        this.bridge = GraphicalFrameworkService.getInstance().getBridge(targetEditor);
        EditPart parentPart = bridge.getEditPart(targetEditor);
        if (parentPart != null) {
            outer: for (Object child : parentPart.getChildren()) {
                if (child instanceof IResizableCompartmentEditPart) {
                    for (Object grandChild : ((IResizableCompartmentEditPart) child).getChildren()) {
                        if (grandChild instanceof EditPart) {
                            EObject grandChildSemantic = bridge.getElement(grandChild);
                            if (featureToCollapse == null
                                    || grandChildSemantic.eContainingFeature() == featureToCollapse) {
                                targetEditPart = (IResizableCompartmentEditPart) child;
                                break outer;
                            }
                        }
                    }
                }
            }
        }
        originalCollapseState = isCollapsed();
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
        if (targetEditPart != null
                && targetEditPart.getFigure() instanceof ResizableCompartmentFigure) {
            ResizableCompartmentFigure f = (ResizableCompartmentFigure) targetEditPart.getFigure();
            if (f.isExpanded() == collapse) {
                if (collapse) {
                    System.out.println("Collapsing "+targetEditPart);
                    f.setCollapsed();
                } else {
                    System.out.println("Expanding "+targetEditPart);
                    f.setExpanded();
                }
                return true;
            }
        }
        return false;
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
        if (otherEffect instanceof CompartmentCollapseExpandEffect) {
            CompartmentCollapseExpandEffect other = (CompartmentCollapseExpandEffect) otherEffect;
            if (other.targetEditor == targetEditor && other.targetEditPart == targetEditPart) {
                originalCollapseState = other.originalCollapseState;
                return this;
            }
        } else if (otherEffect instanceof UndoEffect) {
            IEffect undo = ((UndoEffect) otherEffect).getEffect();
            if (undo instanceof CompartmentCollapseExpandEffect) {
                CompartmentCollapseExpandEffect other = (CompartmentCollapseExpandEffect) undo;
                if (other.targetEditor == targetEditor && other.targetEditPart == targetEditPart) {
                    originalCollapseState = other.originalCollapseState;
                    return this;
                }
            }
        }

        return null;
    }

    private boolean isCollapsed() {
        if (targetEditPart != null && targetEditPart.getModel() instanceof DrawerStyle) {
            // FIXME: This is specific to GMF notation model
            return ((DrawerStyle) targetEditPart.getModel()).isCollapsed();
        } else {
            return !doCollapse;
        }
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
}
