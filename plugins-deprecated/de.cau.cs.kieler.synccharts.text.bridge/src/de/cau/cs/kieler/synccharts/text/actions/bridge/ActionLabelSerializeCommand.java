/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 * 
 */
package de.cau.cs.kieler.synccharts.text.actions.bridge;

import org.eclipse.emf.common.command.AbstractCommand;

import de.cau.cs.kieler.synccharts.Action;

/**
 * A specialized {@link org.eclipse.emf.common.command.Command Command} that serializes action
 * labels.
 *
 * @author haf
 * 
 * @kieler.ignore (excluded from review process)
 */
public class ActionLabelSerializeCommand extends AbstractCommand {

    private Action action;
    private String oldLabel;

    /**
     * Constructor.
     * @param theAction the action to be serialized.
     */
    public ActionLabelSerializeCommand(final Action theAction) {
        this.action = theAction;
    }

    @Override
    protected boolean prepare() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    public void execute() {
        String newLabel = null;
        if (action.getTrigger() != null || !action.getEffects().isEmpty() || action.isIsImmediate()
                || action.getDelay() > 1) {
            newLabel = ActionLabelSerializer.toString(action);
        }
        if (newLabel == null) {
            // if there is no new valid value, set the old value so that there
            // will be set
            // notifications in any case (required to trigger the parser again)
            newLabel = action.getLabel();
        }
        oldLabel = action.getLabel();
        action.setLabel(newLabel);
    }

    /**
     * {@inheritDoc}
     */
    public void redo() {
        execute();
    }

    @Override
    public void undo() {
        action.setLabel(oldLabel);
    }

}
