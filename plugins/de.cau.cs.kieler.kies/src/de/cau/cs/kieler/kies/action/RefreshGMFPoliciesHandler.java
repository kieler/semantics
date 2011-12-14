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
package de.cau.cs.kieler.kies.action;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.ui.IEditorPart;

import de.cau.cs.kieler.core.model.gmf.effects.RefreshGMFEditPoliciesEffect;
import de.cau.cs.kieler.core.ui.util.EditorUtils;

/**
 * An abstract handler for testing purposes only.
 * 
 * @author uru
 * 
 */
public class RefreshGMFPoliciesHandler extends AbstractHandler {

    /**
     * {@inheritDoc}
     */
    public Object execute(final ExecutionEvent event) throws ExecutionException {
        IEditorPart editorPart = EditorUtils.getLastActiveEditor();
        if (editorPart instanceof DiagramEditor) {
            RefreshGMFEditPoliciesEffect gmf = new RefreshGMFEditPoliciesEffect(
                    (DiagramEditor) editorPart, false);
            gmf.execute();
        }
        return null;
    }
    
}
