package de.cau.cs.kieler.yakindu.sccharts.importer.xtend

import de.cau.cs.kieler.core.kexpressions.CombineOperator
import de.cau.cs.kieler.core.kexpressions.Signal
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.synccharts.Region
import de.cau.cs.kieler.synccharts.State
import de.cau.cs.kieler.synccharts.Transition
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncState
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncgraphFactory
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.TransitionType
import java.util.HashMap
import org.yakindu.sct.model.sgraph.SGraphFactory
import org.yakindu.sct.model.sgraph.Statechart
import de.cau.cs.kieler.synccharts.Action

/**
 * Transformation from original KIELER (ThinkCHartsEditor) SyncCharts to the newer
 * KIELER Yakindu based SSCCharts.
 * 
 * In this transformation implementation transition labels of original KIELER SyncCharts are
 * just serialized (using functions like serializeInterface(), serializeTransitionLabel()) 
 * and NOT build using the Yakindu SText (Synctext.xtext) grammar. When using the model the
 * Xtext parsers automatically process the labels (this also holds for the interfaces of states).
 * 
 * @author cmot
 * @kieler.design 2013-06-06 proposed cmot
 * @kieler.rating 2013-06-06 proposed *
 * 
 */
class KIXS2SCC { 
    
    // The following HashMaps are used to remember the mapping between
    // original SyncCharts (S) and new Yakindu based SyncCharts (Y) in
    // both directions S to Y (S2Y) and Y to S (Y2S).
    private var HashMap<Region, org.yakindu.sct.model.sgraph.Region>RegionS2Y;
    private var HashMap<org.yakindu.sct.model.sgraph.Region, Region>RegionY2S;
    private var HashMap<State, SyncState>StateS2Y;
    private var HashMap<SyncState, State>StateY2S;
    
    //---------------------------------------------------------------------------------------------
    
    /**
     * Transform the S SyncChart (kixs) to a Y SCChart (scc).
     */
    def Statechart transform(Region rootRegion) {
        // Initialize mapping
        RegionS2Y = new HashMap<Region, org.yakindu.sct.model.sgraph.Region>;
        RegionY2S = new HashMap<org.yakindu.sct.model.sgraph.Region, Region>;
        StateS2Y = new HashMap<State, SyncState>;
        StateY2S = new HashMap<SyncState, State>;
        
        // Create a new Yakindu (Y) Statechart (the SCChart) and a main region and a main state
        val targetStatechart = SGraphFactory::eINSTANCE.createStatechart();
        val mainRegion = SGraphFactory::eINSTANCE.createRegion();
        val mainState = SyncgraphFactory::eINSTANCE.createSyncState();
        targetStatechart.regions.add(mainRegion);
        mainRegion.vertices.add(mainState);
        
        // Get a handle to the main/root state of the SyncChart (S)
        val rootState = rootRegion.states.get(0);

        // Name the Y Statechart, get the name from the S root state
        mainState.setName(rootState.label);
        
        val interfaceSpecification = rootState.serializeInterface;
        mainState.setSpecification(interfaceSpecification);
        
        // First create all states
        for (region : rootState.regions) {
            region.transform(mainState);
        }
        
        // Then create all transitions
        val allTransitions = rootState.eAllContents.filter(typeof(Transition)).toIterable;
        for (transition : allTransitions) {
            transition.transform;
        }
        
        // After all return the new created Y Statechart (SCChart)
        targetStatechart
    }
    
    //---------------------------------------------------------------------------------------------
    
    /**
     * Transform a S state and put it into a target Y region. Also fill the mappings of states here.
     */
    def void transform(State state, org.yakindu.sct.model.sgraph.Region target) {
        
        val newState = SyncgraphFactory::eINSTANCE.createSyncState();
        StateY2S.put(newState, state);
        StateS2Y.put(state, newState);
        target.vertices.add(newState);
        newState.setName(state.label);
        
        newState.setIsFinal(state.isFinal);
        newState.setIsInitial(state.isInitial);
        
        newState.setSpecification(state.serializeInterface);
        
        // Convert suspend, during, entry and exit actions
        var localReactions = "";
        if (state.suspensionTrigger != null) {
               localReactions = localReactions.concat("Suspend: ").concat(state.suspensionTrigger.serializeActionLabel).concat(";\n");
        }
        if (!state.entryActions.nullOrEmpty) {
            for (action : state.entryActions) {
               localReactions = localReactions.concat("Entry: ").concat(action.serializeActionLabel).concat(";\n");
            }
        }
        if (!state.innerActions.nullOrEmpty) {
            for (action : state.innerActions) {
               localReactions = localReactions.concat("During: ").concat(action.serializeActionLabel).concat(";\n");
            }
        }
        if (!state.exitActions.nullOrEmpty) {
            for (action : state.exitActions) {
               localReactions = localReactions.concat("Exit: ").concat(action.serializeActionLabel).concat(";\n");
            }
        }
        newState.setSpecification(newState.specification + "\n" + localReactions);

        for (region : state.regions) {
            region.transform(newState);
        }
        
    }

    //---------------------------------------------------------------------------------------------
    
    /**
     * Transform a S region and put it into a target Y state. Also fill the mappings of regions here.
     */
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
    
    //---------------------------------------------------------------------------------------------

    /**
     * Transform a S transition and connect the transformation result, a Y transition accordingly
     * using the mapping (transformedState()).
     */
    def void transform(Transition transition) {
        
        val newTransition = SyncgraphFactory::eINSTANCE.createSyncTransition();
        
        val source = transition.sourceState.transformedState;
        val target = transition.targetState.transformedState;
        
        source.outgoingTransitions.add(newTransition);
        newTransition.setTarget(target);
        
        newTransition.setIsHistory(transition.isHistory);
        newTransition.setIsImmediate(transition.isImmediate);
        newTransition.setPriority(transition.priority);
        
        switch (transition.type.literal) {
            case "WEAKABORT": newTransition.setType(TransitionType::WEAKABORT)
            case "STRONGABORT": newTransition.setType(TransitionType::STRONGABORT)
            case "NORMALTERMINATION": newTransition.setType(TransitionType::NORMALTERMINATION)
        }
        
        // Transition serialization
        newTransition.setSpecification(transition.serializeActionLabel(""));                          
    }
    
    //---------------------------------------------------------------------------------------------

    /**
     * Interface serialization.
     */
    def String serializeInterface(State state) {
        '''
    «FOR signal : state.signals SEPARATOR ""»
        «IF (signal.isInput)»input «ENDIF»«IF (signal.isOutput)»output «ENDIF»signal «signal.name»«IF (signal.type != ValueType::PURE)»:«signal.serializeSignalType»«ENDIF»«IF (!signal.initialValue.nullOrEmpty)» = «signal.initialValue»«ENDIF»«IF (signal.combineOperator != CombineOperator::NONE)» with «signal.serializeCombineOperator»«ENDIF»;
    «ENDFOR»
        '''
    }
    
 
   //---------------------------------------------------------------------------------------------
   //---------------------------------------------------------------------------------------------
     
    /**
     * Combine operator function serialization.
     */
    def String serializeCombineOperator(Signal signal) {
        if (signal.combineOperator == CombineOperator::ADD) return {"'+'"}
        if (signal.combineOperator == CombineOperator::MULT) return {"'*'"}
        if (signal.combineOperator == CombineOperator::MAX) return {"'max'"}
        if (signal.combineOperator == CombineOperator::MIN) return {"'min'"}
        if (signal.combineOperator == CombineOperator::OR) return {"'or'"}
        if (signal.combineOperator == CombineOperator::AND) return {"'and'"}
        if (signal.combineOperator == CombineOperator::HOST) return {"'host'"}
        // Not supported
        return null;
    }

    //---------------------------------------------------------------------------------------------
    
    /**
     * Signal type serialization.
     */
    def String serializeSignalType(Signal signal) {
        if (signal.type == ValueType::INT) return {"integer"}
        if (signal.type == ValueType::BOOL) return {"boolean"}
        if (signal.type == ValueType::STRING) return {"string"}
        //if (signal.type == ValueType::FLOAT) return {"real"}
        //if (signal.type == ValueType::DOUBLE) return {"real"}
        // Not supported
        return null;
    }
    
    //---------------------------------------------------------------------------------------------

    /**
     * Action/Transition label serialization.
     */
    def String serializeActionLabel(Action action) {
        return action.serializeActionLabel("");
    }
    def String serializeActionLabel(Action action, String prefix) {
        if (action.label.nullOrEmpty) {
            return "";
        }
        var newLabel = prefix + action.label.replace("(not ", "(! ").replace(" not ", " ! ").replace(" and ", " && ").replace(" or ", " || ").replace(" = ", " == ").replace("#", "").replace(",", ";");
        if (!(action.trigger instanceof ValuedObjectReference)) {
            if (newLabel.contains("/")) {
                // Effect
                if (newLabel.trim.indexOf("/") == 0) {
                    // No trigger but effect
                    // Nothing to change to newLabel                         
                }
                else {
                    // Trigger and effect
                    newLabel = newLabel.substring(0, newLabel.indexOf("/")) + newLabel.substring(newLabel.indexOf("/"));
                }
            }
            else {
                // No effect
                newLabel = newLabel.substring(0);
            }
        }
        newLabel = newLabel.replace("not ", "! ").replace("(not ", "(! ").replace(" not ", " ! ");
        newLabel = newLabel.convertValueOf;
        return newLabel;
    }

    //---------------------------------------------------------------------------------------------
    
    /**
     *  Convert serialization of a label containing ?-Function to valueof-Function.
     */
    def String convertValueOf(String label) {
        var returnLabel = "";
        if (!label.contains("?")) {
            // end recursion
            return label;
        }
        else {
            returnLabel = label.substring(0, label.indexOf("?")) + "val(";
            val subString = label.substring(label.indexOf("?") + 1);
            val separationIndex = subString.indexOfSeparator;
            returnLabel = returnLabel.concat(subString.substring(0, separationIndex) + ")" + subString.substring(separationIndex)); 
        }
        return returnLabel
    }
    
    //---------------------------------------------------------------------------------------------
    
    /**
     * Helper function that returns the next of the tests characters that should indicate that
     * an signal/variable name has ended (because these characters are forbidden inside
     * signal/variable names).
     */
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
        val i11 = text.indexOf(",");
        val i12 = text.indexOf("}");
        val i13 = text.indexOf("\\");
        val i14 = text.indexOf("=");
        val i15 = text.indexOf(":");
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
        if (i11 > 0) {returnIndex = returnIndex.min(i11);}
        if (i12 > 0) {returnIndex = returnIndex.min(i12);}
        if (i13 > 0) {returnIndex = returnIndex.min(i13);}
        if (i14 > 0) {returnIndex = returnIndex.min(i14);}
        if (i15 > 0) {returnIndex = returnIndex.min(i15);}
        return returnIndex;
    }
    
    //---------------------------------------------------------------------------------------------

    /**
     *  Helper function to realize a minimum function for two integer values.
     */
    def int min(int first, int second) {
        if (second < first) {
            return second
        }
        return first;
    }
        
    //---------------------------------------------------------------------------------------------

    /**
     *  Helper function that searches for a test string inside a text string.
     */
    def boolean contains(String text, String test) {
        if (text.nullOrEmpty) {
            return false;
        }
        return (text.indexOf(test) != -1)
    }
        
    //---------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------
    
    /**
     *  Return a SyncChart state from a Yakindu SCChart state.
     */
    def State getOriginalState(SyncState state) {
        StateY2S.get(state);
    }

    /**
     *  Return a Yakindu SCChart state from a SyncChart state.
     */
    def SyncState getTransformedState(State state) {
        StateS2Y.get(state);
    }
    
    /**
     *  Return a SyncChart region from a Yakindu SCChart region.
     */
    def Region getOriginalRegion(org.yakindu.sct.model.sgraph.Region region) {
        RegionY2S.get(region);
    }

    /**
     *  Return a Yakindu SCChart region from a SyncChart region.
     */
    def org.yakindu.sct.model.sgraph.Region getTransformedRegion(Region region) {
        RegionS2Y.get(region);
    }

    //---------------------------------------------------------------------------------------------

}