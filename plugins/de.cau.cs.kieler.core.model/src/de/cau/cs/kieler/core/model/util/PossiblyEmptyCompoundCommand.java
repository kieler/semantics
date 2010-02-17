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
package de.cau.cs.kieler.core.model.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;

/**
 * A CompoundCommand that may be empty. Even when the list of commands stored
 * within is empty, the prepare() method will return true and hence the command
 * is marked as executable. Can be used to create an empty executable command.
 * 
 * @author haf
 */
public class PossiblyEmptyCompoundCommand extends CompoundCommand {

    /**
     * Returns whether all the commands can execute so that
     * {@link #isExecutable} can be cached. An empty command list causes
     * <code>true</code> to be returned.
     * 
     * @return whether all the commands can execute.
     */
    @Override
    protected boolean prepare() {
        if (commandList.isEmpty()) {
            return true;
        } else {
            return super.prepare();
        }
    }

    /**
     * Return one of three commands: If the command list is empty, return null;
     * if there is exactly one command in the list, return that command;
     * otherwise return this PossiblyEmptyCompoundCommand. Can be used to remove
     * unnecessary hierarchy levels of commands.
     * 
     * @returns the resulting Command, maybe null
     */
    @Override
    public Command unwrap() {
        switch (commandList.size()) {
        case 0: {
            dispose();
            // null behaves like the neutral element of commands
            return null;
        }
        case 1: {
            Command result = commandList.remove(0);
            dispose();
            return result;
        }
        default: {
            return this;
        }
        }
    }

    /**
     * Flatten all PossiblyEmptyCompoundCommands recursively. Go recursively
     * through all PossiblEmptyCompoundCommand children and unwrap them all. If
     * a result is still a PossiblyEmptyCompoundCommand, all of its children are
     * moved one level up and the compound command gets removed.
     * 
     * @return Either a flat PossiblyEmptyCompoundCommand or one single other
     *         Command or maybe null.
     */
    public Command unwrapAll() {
        return this;
        // FIXME: this is buggy code
//    	List<Command> tempCmds = new ArrayList<Command>();
//        for (Command cmd : commandList) {
//            if (cmd instanceof PossiblyEmptyCompoundCommand) {
//                Command cmd2 = ((PossiblyEmptyCompoundCommand) cmd).unwrapAll();
//                if (cmd2 instanceof PossiblyEmptyCompoundCommand) {
//                    for (Command cmd3 : ((PossiblyEmptyCompoundCommand) cmd2).getCommandList()) {
//                        tempCmds.add(cmd3);
//                    }
//                } else {
//                    tempCmds.add(cmd2);
//                }
//            } else {
//                tempCmds.add(cmd);
//            }
//        }
//        this.commandList = tempCmds;
//        return this.unwrap();
    }

}
