/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.diagram.custom.handlers;

import org.eclipse.gef.EditPart;

import de.cau.cs.kieler.core.ui.policies.DeletionPolicyProvider;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateSignalEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionPriorityEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionTriggersAndEffectsEditPart;

/**
 * This policy prevents deletion of edit parts that should not be deleted from a
 * synccharts diagram.
 * 
 * @author soh
 */
public class DeletionPolicy extends DeletionPolicyProvider {

    @Override
    public boolean isUnremovableEditPart(final EditPart editPart) {
        boolean result = false;
        if (editPart instanceof TransitionTriggersAndEffectsEditPart) {
            result = true;
        }
        if (editPart instanceof TransitionPriorityEditPart) {
            result = true;
        }
        if (editPart instanceof StateSignalEditPart) {
            result = true;
        }
        return result;
    }

}
