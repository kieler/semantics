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
 * Action received from client when a change of target is requested.
 * The transmitted information is the new target state id and the id of the edge.
 */
@Accessors
@EqualsHashCode
@ToString(skipNulls=true)
class ChangeTargetStateAction implements Action {
    public static val LABEL = "Change target state"
    public static val KIND = 'SCChart_graph_changeTargetState'
    String kind = KIND

    public String id
    public String new_target

    new() {
    }

    new(Consumer<ChangeTargetStateAction> initializer) {
        initializer.accept(this)
    }

    /* Returns the array of inputs requested from the user to perform the action. */
    def static InputType[] getInputs() {
        val input1 = new InputType("new_target", "SelectTarget", "New target state");
        return #[input1];
    }

    /* Used in the synthesis to append the supported actions to the root node for the use on the client. */
    def static StructureBasedEditingMessage getMsg() {
        return new StructureBasedEditingMessage(
            ChangeTargetStateAction.LABEL,
            ChangeTargetStateAction.KIND,
            false,
            ChangeTargetStateAction.getInputs()
        )
    }
}

/**
 * Action received from client when a change of source is requested.
 * The transmitted information is the new source state id and the id of the edge.
 */
@Accessors
@EqualsHashCode
@ToString(skipNulls=true)
class ChangeSourceStateAction implements Action {
    public static val LABEL = "Change source state"
    public static val KIND = 'SCChart_graph_changeSourceState'
    String kind = KIND

    public String id
    public String new_source

    new() {
    }

    new(Consumer<ChangeSourceStateAction> initializer) {
        initializer.accept(this)
    }

    /* Returns the array of inputs requested from the user to perform the action. */
    def static InputType[] getInputs() {
        val input1 = new InputType("new_source", "SelectSource", "New source state");
        return #[input1];
    }

    /* Used in the synthesis to append the supported actions to the root node for the use on the client. */
    def static StructureBasedEditingMessage getMsg() {
        return new StructureBasedEditingMessage(
            ChangeSourceStateAction.LABEL,
            ChangeSourceStateAction.KIND,
            false,
            ChangeSourceStateAction.getInputs()
        )
    }
}

/**
 * Action received from client if a change of trigger or effect is requested.
 * The given information is the id of the edge and the new trigger and effects as string representations.
 */
@Accessors
@EqualsHashCode
@ToString(skipNulls=true)
class ChangeTriggerEffectAction implements Action {
    public static val LABEL = "Change trigger and effect"
    public static val KIND = 'SCChart_graph_changeTriggerAndEffect'
    String kind = KIND

    public String id
    public String trigger
    public String effect

    new() {
    }

    new(Consumer<ChangeTriggerEffectAction> initializer) {
        initializer.accept(this)
    }

    /* Returns the array of inputs requested from the user to perform the action. */
    def static InputType[] getInputs() {
        val input1 = new InputType("trigger", "String", "New trigger");
        val input2 = new InputType("effect", "String", "New effect");
        return #[input1, input2];
    }

    /* Used in the synthesis to append the supported actions to the root node for the use on the client. */
    def static StructureBasedEditingMessage getMsg() {
        return new StructureBasedEditingMessage(
            ChangeTriggerEffectAction.LABEL,
            ChangeTriggerEffectAction.KIND,
            false,
            ChangeTriggerEffectAction.getInputs()
        )
    }
}

/**
 * Action received from the client if a edge priority should change.
 * The given information is the new priority and the edge id.
 */
@Accessors
@EqualsHashCode
@ToString(skipNulls=true)
class ChangePriorityAction implements Action {
    public static val LABEL = "Change priority"
    public static val KIND = 'SCChart_graph_changePriorityOfEdge'
    String kind = KIND

    public String id
    public String priority

    new() {
    }

    new(Consumer<ChangePriorityAction> initializer) {
        initializer.accept(this)
    }

    /* Returns the array of inputs requested from the user to perform the action. */
    def static InputType[] getInputs() {
        val input1 = new InputType("priority", "String", "Change Priority");
        return #[input1];
    }

    /* Used in the synthesis to append the supported actions to the root node for the use on the client. */
    def static StructureBasedEditingMessage getMsg() {
        return new StructureBasedEditingMessage(
            ChangePriorityAction.LABEL,
            ChangePriorityAction.KIND,
            false,
            ChangePriorityAction.getInputs()
        )
    }
}

/**
 * Action received from the client if a transition should be weak
 * The given information is the id of the edge
 */
@Accessors
@EqualsHashCode
@ToString(skipNulls=true)
class ChangeToWeakTransitionAction implements Action {
    public static val LABEL = "Change to weak transition"
    public static val KIND = 'SCChart_graph_changeToWeakTransition'
    String kind = KIND

    public String id

    new() {
    }

    new(Consumer<ChangeToWeakTransitionAction> initializer) {
        initializer.accept(this)
    }

    /* Returns the array of inputs requested from the user to perform the action. */
    def static InputType[] getInputs() {
        return #[];
    }

    /* Used in the synthesis to append the supported actions to the root node for the use on the client. */
    def static StructureBasedEditingMessage getMsg() {
        return new StructureBasedEditingMessage(
            ChangeToWeakTransitionAction.LABEL,
            ChangeToWeakTransitionAction.KIND,
            false,
            ChangeToWeakTransitionAction.getInputs()
        )
    }
}

/**
 * Action received from the client if a transition should be aborting
 * The given information is the id of the edge
 * 
 */
@Accessors
@EqualsHashCode
@ToString(skipNulls=true)
class ChangeToAbortingTransitionAction implements Action {
    public static val LABEL = "Change to aborting transition"
    public static val KIND = 'SCChart_graph_changeToAbortTransition'
    String kind = KIND

    public String id

    new() {
    }

    new(Consumer<ChangeToAbortingTransitionAction> initializer) {
        initializer.accept(this)
    }

    /* Returns the array of inputs requested from the user to perform the action. */
    def static InputType[] getInputs() {
        return #[];
    }

    /* Used in the synthesis to append the supported actions to the root node for the use on the client. */
    def static StructureBasedEditingMessage getMsg() {
        return new StructureBasedEditingMessage(
            ChangeToAbortingTransitionAction.LABEL,
            ChangeToAbortingTransitionAction.KIND,
            false,
            ChangeToAbortingTransitionAction.getInputs()
        )
    }
}

/**
 * Action received from the client if a transition should be terminating
 * The given information is the id of the edge
 * 
 */
@Accessors
@EqualsHashCode
@ToString(skipNulls=true)
class ChangeToTerminatingTransitionAction implements Action {
    public static val LABEL = "Change to terminating transition"
    public static val KIND = 'SCChart_graph_changeToTerminatingTransition'
    String kind = KIND

    public String id

    new() {
    }

    new(Consumer<ChangeToTerminatingTransitionAction> initializer) {
        initializer.accept(this)
    }

    /* Returns the array of inputs requested from the user to perform the action. */
    def static InputType[] getInputs() {
        return #[];
    }

    /* Used in the synthesis to append the supported actions to the root node for the use on the client. */
    def static StructureBasedEditingMessage getMsg() {
        return new StructureBasedEditingMessage(
            ChangeToTerminatingTransitionAction.LABEL,
            ChangeToTerminatingTransitionAction.KIND,
            false,
            ChangeToTerminatingTransitionAction.getInputs()
        )
    }
}
