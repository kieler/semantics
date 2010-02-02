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
}
