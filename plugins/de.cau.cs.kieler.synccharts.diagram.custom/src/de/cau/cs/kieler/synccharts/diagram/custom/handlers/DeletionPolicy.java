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
import de.cau.cs.kieler.synccharts.diagram.edit.parts.Region2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.RegionEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.State2EditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.StateEditPart;
import de.cau.cs.kieler.synccharts.diagram.edit.parts.TransitionEditPart;

/**
 * This policy prevents deletion of edit parts that should not be deleted from a
 * synccharts diagram.
 * 
 * @author soh
 * @kieler.rating 2010-03-12 proposed yellow
 */
public class DeletionPolicy extends DeletionPolicyProvider {

    @Override
    public boolean isUnremovableEditPart(final EditPart editPart) {
        if (editPart instanceof Region2EditPart) {
            return false;
        } else if (editPart instanceof RegionEditPart) {
            return false;
        } else if (editPart instanceof State2EditPart) {
            return false;
        } else if (editPart instanceof StateEditPart) {
            return false;
        } else /*if (editPart instanceof StateSignal2EditPart) {
               return false;
               } else if (editPart instanceof StateSignalEditPart) {
               return false;
               } else */if (editPart instanceof TransitionEditPart) {
            return false;
        }
        return true;
    }

}
