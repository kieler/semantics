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
 * 
 */
package de.cau.cs.kieler.synccharts.labelparser.bridge;

import org.eclipse.emf.common.command.AbstractCommand;

import de.cau.cs.kieler.synccharts.Action;

public class ActionLabelSerializeCommand extends AbstractCommand {

    private Action action;
    private String oldLabel;

    public ActionLabelSerializeCommand(final Action theAction) {
        this.action = theAction;
    }

    @Override
    protected boolean prepare() {
        return true;
    }

    public void execute() {
        String newLabel = null;
        if (action.getTrigger() != null || !action.getEffects().isEmpty()
                || action.isIsImmediate()) {
            newLabel = ActionLabelSerializer.toString(action);
        }
        if (newLabel == null) {
            // if there is no new valid value, set the old value so that there
            // will be set
            // notifications in any case (required to trigger the parser again)
            newLabel = action.getTriggersAndEffects();
        }
        oldLabel = action.getTriggersAndEffects();
        action.setTriggersAndEffects(newLabel);
    }

    public void redo() {
        execute();
    }

    @Override
    public void undo() {
        action.setTriggersAndEffects(oldLabel);
    }

}
