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
import de.cau.cs.kieler.core.model.GraphicalFrameworkService;

/**
 * KiviEffect that hides or unhides a given EObject by using the setVisibility method of its figure.
 * 
 * @author ckru
 *
 */
public class ShowHideEffect extends AbstractEffect {

    private EObject target;
    private GraphicalEditPart part;
    private boolean hide;
    
    /**
     * Create a new instance from an editor and a target object.
     * @param editor the editor in which to hide in
     * @param target the object to hide or unhide
     * @param hide if true the target will be hidden, if false target will be visible again
     */
    public ShowHideEffect(final IWorkbenchPart editor, final EObject target, final boolean hide) {
        EditPart editPart =
                GraphicalFrameworkService.getInstance().getBridge(editor)
                        .getEditPart(editor, target);
        if (editPart instanceof GraphicalEditPart) {
            this.part = (GraphicalEditPart) editPart;
        }
        this.hide = hide;
        this.target = target;
    }
    
    /**
     * {@inheritDoc}
     */
    public void execute() {
        if (part != null) {
            //part.getPrimaryView().setVisible(!hide);
            part.getFigure().setVisible(!hide);
        }
    }

}
