/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.ui.structuredProgramming

import java.util.function.Consumer
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.EqualsHashCode
import org.eclipse.xtend.lib.annotations.ToString
import de.cau.cs.kieler.klighd.structuredEditMsg.InputType
import de.cau.cs.kieler.klighd.structuredEditMsg.StructuredEditMsg
import org.eclipse.sprotty.Action

/**
 * Action received from client to rename a region.
 * Given information is the regions id and the new name of the region.
 * @author fjo
 */
@Accessors
@EqualsHashCode
@ToString(skipNulls=true)
class RenameRegionAction implements Action {
    public static val LABEL = "Rename region"
    public static val KIND = 'SCChart_graph_RenameRegion'
    String kind = KIND

    public String id
    public String region_name

    new() {
    }

    new(Consumer<RenameRegionAction> initializer) {
        initializer.accept(this)
    }

    /* Returns the array of inputs requested from the user to perform the action. */
    def static InputType[] getInputs() {
        val input1 = new InputType("region_name", "String", "New Name");
        return #[input1];
    }

    /* Used in the synthesis to append the supported actions to the root node for the use on the client. */
    def static StructuredEditMsg getMsg() {
        return new StructuredEditMsg(
            RenameRegionAction.LABEL,
            RenameRegionAction.KIND,
            false,
            RenameRegionAction.getInputs()
        )
    }
}

/**
 * Action received from client to add concurrent behavior.
 * Given information is the new concurrent regions name and the name of the initial state in it.
 * @author fjo
 */
@Accessors
@EqualsHashCode
@ToString(skipNulls=true)
class AddConcurrentRegionAction implements Action {
    public static val LABEL = "Add concurrent region"
    public static val KIND = 'SCChart_graph_AddConcurrentRegion'
    String kind = KIND

    public String id
    public String region_name
    public String state_name

    new() {
    }

    new(Consumer<AddConcurrentRegionAction> initializer) {
        initializer.accept(this)
    }

    /* Returns the array of inputs requested from the user to perform the action. */
    def static InputType[] getInputs() {
        val input1 = new InputType("state_name", "String", "New initial state name");
        val input2 = new InputType("region_name", "String", "New Region Name");
        return #[input1, input2];
    }

    /* Used in the synthesis to append the supported actions to the root node for the use on the client. */
    def static StructuredEditMsg getMsg() {
        return new StructuredEditMsg(
            AddConcurrentRegionAction.LABEL,
            AddConcurrentRegionAction.KIND,
            false,
            AddConcurrentRegionAction.getInputs()
        )
    }
}