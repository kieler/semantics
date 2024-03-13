/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2024 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.language.server.sccharts.structurebasedediting

import de.cau.cs.kieler.klighd.structurebasedediting.InputType
import de.cau.cs.kieler.klighd.structurebasedediting.StructureBasedEditingMessage
import java.util.function.Consumer
import org.eclipse.sprotty.Action
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.EqualsHashCode
import org.eclipse.xtend.lib.annotations.ToString

/**
 * The delete action is supported by all selectable elements. 
 * The given information are one or many nodes ids seperated by :
 */
@Accessors
@EqualsHashCode
@ToString(skipNulls=true)
class DeleteAction implements Action {
    public static val LABEL = "Delete"
    public static val KIND = 'SCChart_graph_Delete'
    String kind = KIND

    public String id
    public Boolean mergable = true

    new() {
    }

    new(Consumer<DeleteAction> initializer) {
        initializer.accept(this)
    }

    /* Returns the array of inputs requested from the user to perform the action. */
    def static InputType[] getInputs() {
        return #[];
    }

    /* Used in the synthesis to append the supported actions to the root node for the use on the client. */
    def static StructureBasedEditingMessage getMsg() {
        return new StructureBasedEditingMessage(
            DeleteAction.LABEL,
            DeleteAction.KIND,
            true,
            DeleteAction.getInputs()
        )
    }
}
