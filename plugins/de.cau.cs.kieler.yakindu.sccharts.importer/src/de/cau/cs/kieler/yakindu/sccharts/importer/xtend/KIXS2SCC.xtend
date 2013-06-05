package de.cau.cs.kieler.yakindu.sccharts.importer.xtend

import de.cau.cs.kieler.synccharts.Region
import de.cau.cs.kieler.synccharts.State
import de.cau.cs.kieler.synccharts.SyncchartsFactory
//import de.cau.cs.kieler.yakindu.sgraph.syncgraph.SyncState
//import de.cau.cs.kieler.yakindu.sgraph.syncgraph.SyncTransition
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.yakindu.sct.model.sgraph.Choice
import org.yakindu.sct.model.sgraph.Statechart
//import org.yakindu.sct.model.sgraph.Transition
import de.cau.cs.kieler.synccharts.StateType
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncState
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncTransition
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncgraphFactory
import org.yakindu.sct.model.sgraph.SGraphFactory
import java.util.HashMap
import de.cau.cs.kieler.synccharts.Transition
import de.cau.cs.kieler.core.kexpressions.ComplexExpression
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.Signal
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.CombineOperator
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.TransitionType
//import de.cau.cs.kieler.synccharts.TransitionType

//import org.yakindu.sct.model.sgrap.Region


class KIXS2SCC {
	
    private var HashMap<Region, org.yakindu.sct.model.sgraph.Region>RegionS2Y;
    private var HashMap<org.yakindu.sct.model.sgraph.Region, Region>RegionY2S;
    private var HashMap<State, SyncState>StateS2Y;
    private var HashMap<SyncState, State>StateY2S;
    //private var HashMap<Entity, Instruction>TransitionS2Y;
    //private var HashMap<Entity, Instruction>TransitionY2S;
    
    
    /**
     *  Transform the scc SyncChart to a kixs SyncCharts
     */
    def Statechart transform(Region rootRegion) {
        // initialize mapping
        RegionS2Y = new HashMap<Region, org.yakindu.sct.model.sgraph.Region>;
        RegionY2S = new HashMap<org.yakindu.sct.model.sgraph.Region, Region>;
        StateS2Y = new HashMap<State, SyncState>;
        StateY2S = new HashMap<SyncState, State>;
        
        val targetStatechart = SGraphFactory::eINSTANCE.createStatechart();
        val mainRegion = SGraphFactory::eINSTANCE.createRegion();
        val mainState = SyncgraphFactory::eINSTANCE.createSyncState();
        val rootState = rootRegion.states.get(0);
        targetStatechart.regions.add(mainRegion);
        mainRegion.vertices.add(mainState);
        mainState.setName(rootState.label);
        
        val interface = rootState.interface;
        mainState.setSpecification(interface);
        
        // First create all states
        for (region : rootState.regions) {
            region.transform(mainState);
        }
        
        // Now create all transitions
        val allTransitions = rootState.eAllContents.filter(typeof(Transition)).toIterable;
        for (transition : allTransitions) {
            transition.transform;
        }
        
        targetStatechart
    }
    
    
    def void transform(State state, org.yakindu.sct.model.sgraph.Region target) {
        
        val newState = SyncgraphFactory::eINSTANCE.createSyncState();
        StateY2S.put(newState, state);
        StateS2Y.put(state, newState);
        target.vertices.add(newState);
        newState.setName(state.label);
        
        newState.setIsFinal(state.isFinal);
        newState.setIsInitial(state.isInitial);
        
        newState.setSpecification(state.interface);

        for (region : state.regions) {
            region.transform(newState);
        }
        
    }
    
    def void transform(Region region, SyncState target) {
        val newRegion = SGraphFactory::eINSTANCE.createRegion();
        RegionY2S.put(newRegion, region);
        RegionS2Y.put(region, newRegion);
        target.regions.add(newRegion);
        newRegion.setName(region.label);
        
        for (state : region.states) {
            state.transform(newRegion);
        }
    }
    
    
    def void transform(Transition transition) {
        
        val newTransition = SyncgraphFactory::eINSTANCE.createSyncTransition();
        
        val source = transition.sourceState.transformedState;
        val target = transition.targetState.transformedState;
        
        source.outgoingTransitions.add(newTransition);
        newTransition.setTarget(target);
        
        newTransition.setIsHistory(transition.isHistory);
        newTransition.setPriority(transition.priority);
        
        switch (transition.type.literal) {
            case "WEAKABORT": newTransition.setType(TransitionType::WEAKABORT)
            case "STRONGABORT": newTransition.setType(TransitionType::STRONGABORT)
            case "NORMALTERMINATION": newTransition.setType(TransitionType::NORMALTERMINATION)
        }
        
        // Transition serialization
        newTransition.setSpecification(transition.transitionLabel);                          
    }
    
    
    // Interface serialization
    def String getInterface(State state) {
        '''
    «FOR signal : state.signals SEPARATOR ""»
        «IF (signal.isInput)»input «ENDIF»«IF (signal.isOutput)»output «ENDIF»signal «signal.name»«IF (signal.type != ValueType::PURE)»:«signal.transformSignalType»«ENDIF»«IF (!signal.initialValue.nullOrEmpty)» = «signal.initialValue»«ENDIF»«IF (signal.combineOperator != CombineOperator::NONE)» with «signal.transformCombineOperator»«ENDIF»;
    «ENDFOR»
        '''
    }
    
 
   //---------------------------------------------------------------------------------------------
     
    
    def String transformCombineOperator(Signal signal) {
        if (signal.combineOperator == CombineOperator::ADD) return {"'+'"}
        if (signal.combineOperator == CombineOperator::MULT) return {"'*'"}
        if (signal.combineOperator == CombineOperator::MAX) return {"'max'"}
        if (signal.combineOperator == CombineOperator::MIN) return {"'min'"}
        if (signal.combineOperator == CombineOperator::OR) return {"'or'"}
        if (signal.combineOperator == CombineOperator::AND) return {"'and'"}
        if (signal.combineOperator == CombineOperator::HOST) return {"'host'"}
        // not supported
        return null;
    }

    
    def String transformSignalType(Signal signal) {
        if (signal.type == ValueType::INT) return {"integer"}
        if (signal.type == ValueType::BOOL) return {"boolean"}
        if (signal.type == ValueType::STRING) return {"string"}
        //if (signal.type == ValueType::FLOAT) return {"real"}
        //if (signal.type == ValueType::DOUBLE) return {"real"}
        // not supported
        return null;
    }
    
    // Transition serialization
    def String getTransitionLabel(Transition transition) {
        if (transition.label.nullOrEmpty) {
            return "";
        }
        val immediate = transition.label.contains("#");
        var newLabel = transition.label.replaceAll(" and ", " && ").replace(" or ", " || ").replace(" = ", " == ").replace("#", "");
        if (!(transition.trigger instanceof ValuedObjectReference)) {
            if (newLabel.contains("/")) {
                // effect
                if (newLabel.trim.indexOf("/") == 0) {
                    // no trigger but effect
                    // nothing to change to newLabel                         
                }
                else {
                    // trigger and effect
                    newLabel = "[" + newLabel.substring(0, newLabel.indexOf("/")) + "] " + newLabel.substring(newLabel.indexOf("/"));
                }
            }
            else {
                // no effect
                newLabel = "[" + newLabel.substring(0) + "]";
            }
        }
        newLabel = newLabel.convertValueOf;
        if (immediate) {
            newLabel = "# " + newLabel;
        }
        return newLabel;
    }
    
    def String convertValueOf(String label) {
        var returnLabel = "";
        if (!label.contains("?")) {
            // end recursion
            return label;
        }
        else {
            returnLabel = label.substring(0, label.indexOf("?")) + "valueof(";
            val subString = label.substring(label.indexOf("?") + 1);
            val separationIndex = subString.indexOfSeparator;
            returnLabel = returnLabel.concat(subString.substring(0, separationIndex) + ")" + subString.substring(separationIndex)); 
        }
        return returnLabel
    }
    
    
    def int getIndexOfSeparator(String text) {
        val i1 = text.indexOf(" ");
        val i2 = text.indexOf(")");
        val i3 = text.indexOf("]");
        val i4 = text.indexOf("\n");
        val i5 = text.indexOf("+");
        val i6 = text.indexOf("-");
        val i7 = text.indexOf("/");
        val i8 = text.indexOf("&");
        val i9 = text.indexOf("|");
        val i10 = text.indexOf("*");
        var returnIndex = text.length;
        if (i1 > 0) {returnIndex = returnIndex.min(i1);}
        if (i2 > 0) {returnIndex = returnIndex.min(i2);}
        if (i3 > 0) {returnIndex = returnIndex.min(i3);}
        if (i4 > 0) {returnIndex = returnIndex.min(i4);}
        if (i5 > 0) {returnIndex = returnIndex.min(i5);}
        if (i6 > 0) {returnIndex = returnIndex.min(i6);}
        if (i7 > 0) {returnIndex = returnIndex.min(i7);}
        if (i8 > 0) {returnIndex = returnIndex.min(i8);}
        if (i9 > 0) {returnIndex = returnIndex.min(i9);}
        if (i10 > 0) {returnIndex = returnIndex.min(i10);}
        return returnIndex;
    }
    
    def int min(int first, int second) {
        if (second < first) {
            return second
        }
        return first;
    }
        
    def boolean contains(String text, String test) {
        if (text.nullOrEmpty) {
            return false;
        }
        return (text.indexOf(test) != -1)
    }
        
    //---------------------------------------------------------------------------------------------
    
    def State getOriginalState(SyncState state) {
        StateY2S.get(state);
    }

    def SyncState getTransformedState(State state) {
        StateS2Y.get(state);
    }
    
    def Region getOriginalRegion(org.yakindu.sct.model.sgraph.Region region) {
        RegionY2S.get(region);
    }

    def org.yakindu.sct.model.sgraph.Region getTransformedRegion(Region region) {
        RegionS2Y.get(region);
    }

    //---------------------------------------------------------------------------------------------

}