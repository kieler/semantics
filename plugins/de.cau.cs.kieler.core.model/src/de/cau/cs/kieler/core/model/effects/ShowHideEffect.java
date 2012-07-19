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
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.ui.IWorkbenchPart;

import de.cau.cs.kieler.core.kivi.AbstractEffect;
import de.cau.cs.kieler.core.kivi.IEffect;
import de.cau.cs.kieler.core.kivi.UndoEffect;
import de.cau.cs.kieler.core.model.GraphicalFrameworkService;

/**
 * KiviEffect that hides or reveals an element by modifying the visibility of its figure.
 * 
 * @author ckru
 * @author msp
 */
public class ShowHideEffect extends AbstractEffect {

    // CHECKSTYLEOFF VisibilityModifier
    // Subclasses shall be able to access the effect parameters.
    
    /** the edit part of the element to hide or reveal. */
    protected GraphicalEditPart editPart;
    /** if true the target will be hidden, if false target will be visible again. */
    protected boolean hide;
    /** the original visibility status. */
    protected boolean originalVisible = true;

    // CHECKSTYLEON VisibilityModifier

    /**
     * Create a show / hide effect from an editor and a target object.
     * 
     * @param editor the editor in which to hide in
     * @param target the object to hide or reveal
     * @param hide if true the target will be hidden, if false target will be visible again
     */
    public ShowHideEffect(final IWorkbenchPart editor, final EObject target, final boolean hide) {
        EditPart part = GraphicalFrameworkService.getInstance().getBridge(editor)
                        .getEditPart(editor, target);
        if (part instanceof GraphicalEditPart) {
            this.editPart = (GraphicalEditPart) part;
        }
        this.hide = hide;
    }
    
    /**
     * {@inheritDoc}
     */
    public void execute() {
        if (editPart != null) {
            originalVisible = editPart.getFigure().isVisible();
            editPart.getFigure().setVisible(!hide);
        }
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void undo() {
        if (editPart != null) {
            editPart.getFigure().setVisible(originalVisible);
        }
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isMergeable() {
        return true;
    }
    
    /**
     * {@inheritDoc}
     */
    public IEffect merge(final IEffect other) {
        if (other instanceof ShowHideEffect) {
            ShowHideEffect otherEffect = (ShowHideEffect) other;
            if (otherEffect.editPart == this.editPart) {
                return this;
            }
        } else if (other instanceof UndoEffect) {
            IEffect undo = ((UndoEffect) other).getEffect();
            if (undo instanceof ShowHideEffect) {
                ShowHideEffect otherEffect = (ShowHideEffect) undo;
                if (otherEffect.editPart == this.editPart) {
                    return this;
                }
            }
        }
        return null;
    }

    @Override
    public String getName() {
        if (hide) {
            return "HideEffect";
        } else {
            return "ShowEffect";
        }
            
    }
    
}
