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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.SetPropertyCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IResizableCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.internal.properties.Properties;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.BasicCompartment;
import org.eclipse.gmf.runtime.notation.DrawerStyle;
import org.eclipse.gmf.runtime.notation.View;

import de.cau.cs.kieler.core.kivi.AbstractEffect;
import de.cau.cs.kieler.core.kivi.IEffect;
import de.cau.cs.kieler.core.kivi.UndoEffect;
import de.cau.cs.kieler.core.model.util.ModelingUtil;

/**
 * This Effect collapses or expands compartments. The execute() method expands while the undo method
 * collapses.
 * 
 * @author haf, mmu
 */
public class CompartmentCollapseExpandEffect extends AbstractEffect {

    private int compartmentLevel = 0; // TODO implement compartment levels
    private IResizableCompartmentEditPart targetEditPart;
    private EObject targetNode;
    private boolean doCollapse;
    private boolean originalCollapseState;
    private DiagramEditor targetEditor;
    private boolean justExecuted;

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
    public CompartmentCollapseExpandEffect(final DiagramEditor editor, final EObject node,
            final EStructuralFeature featureToCollapse, final int theCompartmentLevel,
            final boolean collapse) {
        this.compartmentLevel = theCompartmentLevel;
        this.doCollapse = collapse;
        this.targetEditor = editor;
        this.targetNode = node;
        EditPart parentPart = ModelingUtil.getEditPart(editor.getDiagramEditPart(), node);
        if (parentPart != null) {
            outer: for (Object child : parentPart.getChildren()) {
                if (child instanceof IResizableCompartmentEditPart) {
                    for (Object grandChild : ((IResizableCompartmentEditPart) child).getChildren()) {
                        if (grandChild instanceof EditPart) {
                            EObject grandChildSemantic = ((View) ((EditPart) grandChild).getModel())
                                    .getElement();
                            if (grandChildSemantic.eContainingFeature() == featureToCollapse) {
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
        if (targetEditPart != null && doCollapse != isCollapsed()) {
            getCollapseCommand(doCollapse).execute();
            justExecuted = true;
        } else {
            justExecuted = false;
        }
    }

    /**
     * Undo the effect, i.e. expand a collapsed compartment.
     */
    public void undo() {
        if (targetEditPart != null && originalCollapseState != isCollapsed()) {
            getCollapseCommand(originalCollapseState).execute();
            justExecuted = true;
        } else {
            justExecuted = false;
        }
    }

    private Command getCollapseCommand(final boolean collapse) {
        DrawerStyle style = (DrawerStyle) targetEditPart.getModel();
        SetPropertyCommand spc = new SetPropertyCommand(targetEditPart.getEditingDomain(),
                new EObjectAdapter(style), Properties.ID_COLLAPSED,
                DiagramUIMessages.PropertyDescriptorFactory_CollapseCompartment, collapse);
        return new ICommandProxy(spc);
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
            return ((DrawerStyle) targetEditPart.getModel()).isCollapsed();
        } else {
            return !doCollapse;
        }
    }

    /**
     * Give all compartments of a view. The list will also contain the input view itself if it is a
     * compartment. Additionally it traverses the whole child tree and also returns all nested child
     * compartments. The list is ordered from root following a dfs.
     * 
     * @param view
     *            input view where search is started
     * @param level
     *            how deep to go into hierarchy: 0 will return only the view itself if it is a
     *            compartment
     * @return a List of all compartments of the view
     */
    private static List<BasicCompartment> getNestedCompartments(final View view, final int level) {
        List<BasicCompartment> compartments = new ArrayList<BasicCompartment>();
        if (view instanceof BasicCompartment) {
            compartments.add((BasicCompartment) view);
        }
        // recursively call method for all children
        if (level > 0) {
            List<?> childViews = view.getChildren();
            for (Object child : childViews) {
                if (child instanceof View) {
                    compartments.addAll(getNestedCompartments((View) child, (level - 1)));
                }
            }
        }
        return compartments;
    }

    /**
     * Get the editor the effect is performed on.
     * 
     * @return the target editor
     */
    public DiagramEditor getTargetEditor() {
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
