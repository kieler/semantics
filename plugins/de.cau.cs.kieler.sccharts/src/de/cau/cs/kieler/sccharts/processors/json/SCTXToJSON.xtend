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

import java.util.Map;

import de.cau.cs.kieler.kicool.compilation.CodeContainer;
import de.cau.cs.kieler.kicool.compilation.Processor;
import de.cau.cs.kieler.kicool.compilation.ProcessorType;
import de.cau.cs.kieler.sccharts.SCCharts;
import de.cau.cs.kieler.sccharts.State;
import com.google.gson.GsonBuilder
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsSerializeExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsSerializeExtensions
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.DelayType
import de.cau.cs.kieler.sccharts.PreemptionType
import java.util.Optional
import java.util.List
import java.util.LinkedList
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValueType

/**
 * 
 */
public class SCTXToJSON extends Processor<SCCharts, CodeContainer> {
    
    @Inject
    private KEffectsSerializeExtensions effect_serializer;
    @Inject
    private KExpressionsSerializeExtensions expr_serializer;


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
        
        val gson = new GsonBuilder().setPrettyPrinting().create();
        val transformedRoots = this.sourceModel.rootStates.map[transformState];
        val fileName = this.sourceModel.name?.hostcodeSafeName ?: "scchart"
        
        cc.add(fileName + ".json", gson.toJson(transformedRoots));
        this.setModel(cc);
        
    }
    
    def de.cau.cs.kieler.sccharts.processors.json.Region transformRegion(de.cau.cs.kieler.sccharts.Region region) {
        
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
    
    
    def de.cau.cs.kieler.sccharts.processors.json.State transformState(de.cau.cs.kieler.sccharts.State state) {
        
        val transformed = new de.cau.cs.kieler.sccharts.processors.json.State();
        
        transformed.id = state.name
        transformed.label = state.label
        transformed.actions = state.actions.map[transformAction]
        transformed.transitions = state.outgoingTransitions.map[transformTransition]
        transformed.variables = state.declarations.flatMap[transformDeclaration].toList
        transformed.isInitial = state.isInitial()
        transformed.isFinal = state.isFinal()
        transformed.regions = state.regions.map[transformRegion]
        
        return transformed
    }
    
    def de.cau.cs.kieler.sccharts.processors.json.Action transformAction(de.cau.cs.kieler.sccharts.LocalAction action) {
        val transformed = new de.cau.cs.kieler.sccharts.processors.json.Action()
        
        transformed.label = action.label
        transformed.type = switch (action) {
            de.cau.cs.kieler.sccharts.DuringAction: Action.Type.DURING
            de.cau.cs.kieler.sccharts.EntryAction:  Action.Type.ENTRY
            de.cau.cs.kieler.sccharts.ExitAction:   Action.Type.EXIT
            default: {
                environment.errors.add("Cannot handle action %s of type %s.".format(action.label, action.class.name))
                
                null
            }
        }
        
        transformed.isImmediate = action.delay.equals(DelayType.IMMEDIATE)
        transformed.guard = Optional.ofNullable(action.trigger).map[expr_serializer.serialize(it)].map[toString].orElse(null)
        transformed.action = String.valueOf(effect_serializer.serialize(action.effects))
        
        return transformed
    }
    
    def de.cau.cs.kieler.sccharts.processors.json.Transition transformTransition(de.cau.cs.kieler.sccharts.Transition transition) {
        val transformed = new de.cau.cs.kieler.sccharts.processors.json.Transition()
        
        transformed.label = transition.label
        transformed.targetID = transition.targetState.name
        transformed.isImmediate = transition.delay.equals(DelayType.IMMEDIATE)
        transformed.preemption = switch(transition.preemption) {
            case PreemptionType.TERMINATION:    de.cau.cs.kieler.sccharts.processors.json.Transition.Preemption.TERMINATION
            case PreemptionType.STRONG:    de.cau.cs.kieler.sccharts.processors.json.Transition.Preemption.STRONG
            case PreemptionType.WEAK:    de.cau.cs.kieler.sccharts.processors.json.Transition.Preemption.WEAK
            case PreemptionType.UNDEFINED:    de.cau.cs.kieler.sccharts.processors.json.Transition.Preemption.WEAK
        }
        transformed.guard = Optional.ofNullable(transition.trigger).map[expr_serializer.serialize(it)].map[toString].orElse(null)
        transformed.action = String.valueOf(effect_serializer.serialize(transition.effects))       
        
        return transformed
    }
    
    def List<de.cau.cs.kieler.sccharts.processors.json.Variable> transformDeclaration(Declaration declaration) {
        switch (declaration) {
            VariableDeclaration: declaration.valuedObjects.map[
                transformVariable(it, declaration.type, declaration.input, declaration.output)
            ]
            default: {
                environment.errors.add("Cannot handle declaration %s of type %s.".format(declaration.toString(), declaration.class.name))
                new LinkedList()
            }
        }
        
    }
    
    def de.cau.cs.kieler.sccharts.processors.json.Variable transformVariable(ValuedObject v, ValueType t, boolean isInput, boolean isOutput) {
        val transformed = new de.cau.cs.kieler.sccharts.processors.json.Variable()
        
        transformed.id = v.name
        transformed.type = t.literal
        transformed.initialValue = Optional.ofNullable(v.initialValue).map[expr_serializer.serialize(it)].map[toString].orElse(null)
        transformed.isInput = isInput
        transformed.isOutput = isOutput
        
        return transformed
    }
    
    protected def hostcodeSafeName(String string) {
        if (string === null) return ""
        string.replaceAll("[\\s-]","_")
    }
}
