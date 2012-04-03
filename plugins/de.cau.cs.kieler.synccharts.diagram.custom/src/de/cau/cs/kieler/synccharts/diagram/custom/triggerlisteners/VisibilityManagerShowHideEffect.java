/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.diagram.custom.triggerlisteners;

import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;

import de.cau.cs.kieler.core.model.effects.ShowHideEffect;

/**
 * Uses the {@link VisibilityManager} to show or hide edit parts. Doing it this way ensures that
 * this modification survives a layout effect. Beware, however: this is pretty much a hack that
 * will become obsolete once KLighD arrives. All hail KLighD!
 * 
 * @author cds
 */
public class VisibilityManagerShowHideEffect extends ShowHideEffect {
    
    /**
     * The editor this effect is invoked on.
     */
    private IDiagramWorkbenchPart editor;
    
    
    /**
     * Creates a new instance to show or hide a given edit part inside a given editor.
     * 
     * @param editor the editor containing the edit part.
     * @param editPart the edit part to show or hide.
     * @param hide {@code true} if the edit part should be hidden.
     */
    public VisibilityManagerShowHideEffect(final IDiagramWorkbenchPart editor,
            final GraphicalEditPart editPart, final boolean hide) {
        
        super(editor, null, hide);
        this.editor = editor;
        this.editPart = editPart;
    }
    
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void execute() {
        // Remember if the edit part is currently visible
        originalVisible = editPart.getFigure().isVisible();
        
        if (hide) {
            VisibilityManager.hide(editor, editPart);
        } else {
            VisibilityManager.reset(editor, editPart);
        }
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public void undo() {
        if (originalVisible) {
            VisibilityManager.reset(editor, editPart);
        } else {
            VisibilityManager.hide(editor, editPart);
        }
    }
}
