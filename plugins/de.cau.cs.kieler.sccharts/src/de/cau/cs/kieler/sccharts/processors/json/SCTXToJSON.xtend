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
package de.cau.cs.kieler.sccharts.processors.json;

import com.google.gson.GsonBuilder
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsSerializeExtensions
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.DelayType
import de.cau.cs.kieler.sccharts.DuringAction
import de.cau.cs.kieler.sccharts.EntryAction
import de.cau.cs.kieler.sccharts.ExitAction
import de.cau.cs.kieler.sccharts.LocalAction
import de.cau.cs.kieler.sccharts.PreemptionType
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsCoreExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsReferenceExtensions
import de.cau.cs.kieler.sccharts.extensions.SCChartsTransitionExtensions
import java.util.HashSet
import java.util.LinkedList
import java.util.List
import java.util.Set

import static extension java.lang.String.format

/**
 * 
 */
public class SCTXToJSON extends Processor<SCCharts, CodeContainer> {

    @Inject
    extension SCChartsCoreExtensions;
    @Inject
    extension SCChartsTransitionExtensions;
    @Inject
    extension KEffectsSerializeExtensions;
    @Inject
    extension SCChartsReferenceExtensions;

//    @Inject
//    extension KExpressionsSerializeExtensions;
    int regionCounter = 0;
    int stateCounter = 0;

    val String namePrefix = ""

    Set<String> scopeNames = new HashSet<String>();

    /**
     * {@inheritDoc}
     */
    override String getId() {
        return "de.cau.cs.kieler.sccharts.processors.SCTXToJSON";
    }

    /**
     * {@inheritDoc}
     */
    override String getName() {
        return "SCTX to JSON";
    }

    /**
     * {@inheritDoc}
     */
    override ProcessorType getType() {
        return ProcessorType.EXOGENOUS_TRANSFORMATOR;
    }

    /**
     * {@inheritDoc}
     */
    override void process() {

        val cc = new CodeContainer();

        val gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        this.sourceModel.rootStates.forEach[collectNames]
        this.sourceModel.rootStates.forEach[renameState]
        val transformedRoots = this.sourceModel.rootStates.map[transformState];
        val fileName = this.sourceModel.name?.hostcodeSafeName ?: "scchart"

        cc.add(fileName + ".json", gson.toJson(transformedRoots));
        this.setModel(cc);

    }

    /**
     * Pre-populate the scopeNames set with names that should not be shadowed
     * (i.e. everything that is part of the interface, like the referenced state or variable names.
     */
    def void collectNames(State state) {
        if (state.reference !== null) {
            // TODO: if the target is in the same file as the referencing statement, this causes the target to be renamed
            // in the renaming step. Not an issue, but weird.
            scopeNames.add(state.reference.target.name.hostcodeSafeName)
        }

        for (declaration : state.declarations) {
            switch (declaration) {
                VariableDeclaration:
                    declaration.valuedObjects.forEach [
                        scopeNames.add(name)
                    ]
                default: {
                    // Do nothing here
                }
            }
        }

        // iterate down the tree
        for (region : state.regions) {
            if (region instanceof ControlflowRegion) {
                region.states.forEach[collectNames]
            }
        }
    }

    def void renameState(State state) {
        val name = if (state.name.nullOrEmpty) {
                // Generate a name with a running number if no state name is set
                namePrefix + '_stateS' + (stateCounter++)
            } else {
                var new_name = namePrefix + state.name.hostcodeSafeName

                // Ensure the name is really unique
                while (scopeNames.contains(new_name)) {
                    new_name = namePrefix + state.name.hostcodeSafeName + (stateCounter++)
                }
                new_name
            }
        scopeNames.add(name);

        if (name != state.name) {
            state.label = state.name
            state.name = name
        }

        state.regions.forEach[renameRegion]
    }

    def void renameRegion(Region region) {
        val name = if (region.name.nullOrEmpty) {
                // Generate a name with a running number if no region name is set
                namePrefix + '_regionR' + (regionCounter++)
            } else {
                var new_name = namePrefix + region.name.hostcodeSafeName

                // Ensure the name is really unique
                while (scopeNames.contains(new_name)) {
                    new_name = namePrefix + region.name.hostcodeSafeName + (regionCounter++)
                }
                new_name
            }
        scopeNames.add(name)

        if (name != region.name) {
            region.label = region.name
            region.name = name
        }

        switch (region) {
            ControlflowRegion: {
                region.states.forEach[renameState]
            }
            default: {
            }
        }
    }

    def de.cau.cs.kieler.sccharts.processors.json.Region transformRegion(Region region) {

        switch (region) {
            ControlflowRegion: {
                val transformed = new de.cau.cs.kieler.sccharts.processors.json.Region()
                transformed.id = region.name;
                transformed.label = region.label;
                transformed.states = region.states.map[transformState]

                transformed
            }
            default: {
                environment.errors.add("Cannot handle region %s of type %s.".format(region.name, region.class.name))
                null
            }
        }
    }

    def de.cau.cs.kieler.sccharts.processors.json.State transformState(State state) {

        val transformed = new de.cau.cs.kieler.sccharts.processors.json.State();

        transformed.id = state.name
        transformed.label = state.label
        transformed.actions = state.actions.map[transformAction]
        transformed.transitions = state.outgoingTransitions.map[transformTransition]
        transformed.variables = state.declarations.flatMap[transformDeclaration].toList
        transformed.isInitial = state.isInitial()
        transformed.isFinal = state.isFinal()
        transformed.isConnector = state.connector
        transformed.regions = state.regions.map[transformRegion]

        if (state.reference !== null) {
            transformed.reference = new Reference();
            val bindings = state.createBindings
            transformed.reference.targetID = state.reference.target?.name
            transformed.reference.targetFile = state.reference.target?.eResource()?.URI?.toString
            // TODO: maybe add structure to the binding.
            transformed.reference.parameters = bindings.map [
                sourceExpression.serialize + " to " + targetValuedObject.serialize + targetIndices?.map [
                    "[" + it.serialize + "]"
                ].join()
            ]
        }

        return transformed
    }

    def Action transformAction(LocalAction action) {
        val transformed = new Action()

        transformed.label = action.label
        transformed.type = switch (action) {
            DuringAction:
                Action.Type.DURING
            EntryAction:
                Action.Type.ENTRY
            ExitAction:
                Action.Type.EXIT
            default: {
                environment.errors.add("Cannot handle action %s of type %s.".format(action.label, action.class.name))

                null
            }
        }

        transformed.isImmediate = action.delay.equals(DelayType.IMMEDIATE)
        transformed.guard = action.trigger?.serialize?.toString
        transformed.action = String.valueOf(action.effects.serialize())

        return transformed
    }

    def Transition transformTransition(de.cau.cs.kieler.sccharts.Transition transition) {
        val transformed = new Transition()

        transformed.label = transition.label
        transformed.targetID = transition.targetState.name
        transformed.isImmediate = transition.delay.equals(DelayType.IMMEDIATE)
        transformed.preemption = switch (transition.preemption) {
            case PreemptionType.TERMINATION: Transition.Preemption.TERMINATION
            case PreemptionType.STRONG: Transition.Preemption.STRONG
            case PreemptionType.WEAK: Transition.Preemption.WEAK
            case PreemptionType.UNDEFINED: Transition.Preemption.WEAK
        }
        transformed.history = switch (transition.history) {
            case RESET:
                false
            case DEEP:
                true
            case SHALLOW: {
                environment.errors.add(
                    "Shallow history for transition %s is not supported. Changing to deep history.".format(
                        transition.toString()));
                true
            }
        }
        transformed.guard = transition.trigger?.serialize?.toString
        transformed.action = if(!transition.effects.isEmpty()) transition.effects.serialize?.toString

        return transformed
    }

    def List<Variable> transformDeclaration(Declaration declaration) {
        switch (declaration) {
            VariableDeclaration:
                declaration.valuedObjects.map [
                    transformVariable(it, declaration.type, declaration.input, declaration.output)
                ]
            default: {
                environment.errors.add(
                    "Cannot handle declaration %s of type %s.".format(declaration.toString(), declaration.class.name))
                new LinkedList()
            }
        }

    }

    def Variable transformVariable(ValuedObject v, ValueType t, boolean isInput, boolean isOutput) {
        val transformed = new Variable()

        transformed.id = v.name
        transformed.type = t.literal
        transformed.initialValue = v.initialValue?.serialize?.toString
        transformed.isInput = isInput
        transformed.isOutput = isOutput
        transformed.cardinalities = v.cardinalities?.map[serialize]?.map[Integer.parseInt(it.toString, 10)] ?: List.of()

        return transformed
    }

    protected def hostcodeSafeName(String string) {
        if(string === null) return ""
        string.replaceAll("[\\s-]", "_")
    }
}
