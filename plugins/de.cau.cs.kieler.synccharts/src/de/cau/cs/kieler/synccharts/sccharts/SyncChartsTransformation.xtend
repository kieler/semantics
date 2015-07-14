/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
 package de.cau.cs.kieler.synccharts.sccharts

import com.google.common.collect.BiMap
import com.google.common.collect.HashBiMap
import com.google.inject.Inject
import com.google.inject.Injector
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.esterel.kexpressions.BooleanValue
import de.cau.cs.kieler.esterel.kexpressions.FloatValue
import de.cau.cs.kieler.esterel.kexpressions.IntValue
import de.cau.cs.kieler.esterel.kexpressions.OperatorExpression
import de.cau.cs.kieler.esterel.kexpressions.TextExpression
import de.cau.cs.kieler.esterel.kexpressions.ValueType
import de.cau.cs.kieler.esterel.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.sccharts.Action
import de.cau.cs.kieler.sccharts.Effect
import de.cau.cs.kieler.sccharts.Emission
import de.cau.cs.kieler.sccharts.HistoryType
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.TextEffect
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import de.cau.cs.kieler.sccharts.text.actions.ActionsStandaloneSetup
import de.cau.cs.kieler.sccharts.text.actions.scoping.ActionsScopeProvider
import de.cau.cs.kieler.synccharts.State
import de.cau.cs.kieler.synccharts.TransitionType
import de.cau.cs.kieler.sccharts.ControlflowRegion

/** 
 * Transforming SyncCharts into SCCharts.
 * 
 * @author cmot
 * @kieler.design 2014-01-21 proposed cmot
 * @kieler.rating 2014-01-21 proposed yellow
 */
class SyncChartsTransformation { 

    @Inject
    extension KExpressionsExtension

    @Inject
    extension SCChartsExtension
    
    private static val Injector i = ActionsStandaloneSetup::doSetup();
    private static val ActionsScopeProvider scopeProvider = i.getInstance(typeof(ActionsScopeProvider));
    ////private static val ISerializer serializer = i.getInstance(typeof(ISerializer));
    
    //-------------------------------------------------------------------------
    //--                         U T I L I T Y                               --
    //-------------------------------------------------------------------------
         
    // State mappings         
    BiMap<de.cau.cs.kieler.sccharts.State, State> states = HashBiMap.create();
    
    def de.cau.cs.kieler.sccharts.State getState(State syncState) {
        return states.inverse().get(syncState)
    }
    def State getSyncState(de.cau.cs.kieler.sccharts.State syncState) {
        return states.get(syncState)
    }
    def void map(de.cau.cs.kieler.sccharts.State state, State syncState) {
        states.put(state, syncState)
    }
    
    
    // Regions mapping    
    BiMap<ControlflowRegion, de.cau.cs.kieler.synccharts.Region> regions = HashBiMap.create();
    def ControlflowRegion getRegion(de.cau.cs.kieler.synccharts.Region syncRegion) {
        return regions.inverse().get(syncRegion)
    }
    def de.cau.cs.kieler.synccharts.Region getSyncRegion(Region syncRegion) {
        return regions.get(syncRegion)
    }
    def void map(ControlflowRegion region, de.cau.cs.kieler.synccharts.Region syncRegion) {
        regions.put(region, syncRegion)
    }


    // Actions mapping    
    BiMap<Action, de.cau.cs.kieler.synccharts.Action> actions = HashBiMap.create();
    def Action getAction(de.cau.cs.kieler.synccharts.Action syncAction) {
        return actions.inverse().get(syncAction)
    }
    def de.cau.cs.kieler.synccharts.Action getSyncRegion(Action syncAction) {
        return actions.get(syncAction)
    }
    def void map(Action action, de.cau.cs.kieler.synccharts.Action syncAction) {
        actions.put(action, syncAction)
    }


    // ValuedObject mapping    
    BiMap<ValuedObject, de.cau.cs.kieler.esterel.kexpressions.ValuedObject> valuedObjects = HashBiMap.create();
    def ValuedObject getValuedObject(de.cau.cs.kieler.esterel.kexpressions.ValuedObject syncValuedObject) {
        return valuedObjects.inverse().get(syncValuedObject)
    }
    def de.cau.cs.kieler.esterel.kexpressions.ValuedObject getSyncRegion(ValuedObject syncValuedObject) {
        return valuedObjects.get(syncValuedObject)
    }
    def void map(ValuedObject valuedObject, de.cau.cs.kieler.esterel.kexpressions.ValuedObject syncValuedObject) {
        valuedObjects.put(valuedObject, syncValuedObject)
    }


    
    //-------------------------------------------------------------------------
    //--             T R A N S F O R M      T O    S C C H A R T             --
    //-------------------------------------------------------------------------
    // @requires: none

    // Transforming Local ValuedObjects.
    def de.cau.cs.kieler.sccharts.State transformSyncChart(de.cau.cs.kieler.synccharts.Region syncRootRegion) {

        // Create an map root region        
//        val rootRegion = createRegion("")
//        rootRegion.map(syncRootRegion)
        val rootState = createSCChart()

        // Start transformation with the single root state (= the SyncChart)        
        val syncRootState = syncRootRegion.states.get(0)
        rootState.id = syncRootState.id.correctId
        
        
        syncRootState.transform(rootState)
        
        // Now create transitions and actions
        val syncStates = syncRootState.eAllContents.filter(typeof(State)).toList
        for (syncState : syncStates) {
            syncState.transformTransitionsAndActions()
        }

        rootState.fixAllTextualOrdersByPriorities
    }
    
   // -------------------------------------------------------------------------   

    // Transforming transitions and actions
    def void transformTransitionsAndActions(State syncState) {
        for (syncTransition : syncState.outgoingTransitions) {
            val targetState = syncTransition.targetState.state
            val sourceState = syncTransition.sourceState.state
            val transition = sourceState.createTransitionTo(targetState)
            
            transition.map(syncTransition)
            transition.setDelay(syncTransition.delay)
            transition.setImmediate(syncTransition.isImmediate)
            if (syncTransition.isHistory) {
                transition.setHistory(HistoryType::DEEP)
            }
            transition.setPriority(syncTransition.priority)
            if (syncTransition.trigger != null) {
                val synchartsTrigger = syncTransition.trigger
                val scchartsTrigger = synchartsTrigger.transformExpression;
                transition.setTrigger(scchartsTrigger)
            } else {
                if (transition.delay > 1) {
                    transition.setTrigger(TRUE)
                }
            }
            for (syncEffect : syncTransition.effects) {
                  transition.addEffect(syncEffect.transformEffect)
            }
            if (syncTransition.type == TransitionType::NORMALTERMINATION) {
                transition.setTypeTermination
            }
            else if (syncTransition.type == TransitionType::STRONGABORT) {
                transition.setTypeStrongAbort
            }
        }
        syncState.transformSuperstateActions
    }
    
    def void transformSuperstateActions(State syncState) {
        for(action : syncState.entryActions) {
            val entryAction = syncState.state.createEntryAction
            if (action.trigger != null) entryAction.trigger = action.trigger.transformExpression
            action.effects.forEach[ entryAction.effects += it.transformEffect ]
        }
        for(action : syncState.innerActions) {
            val duringAction = syncState.state.createDuringAction
            if (action.trigger != null) duringAction.trigger = action.trigger.transformExpression
            action.effects.forEach[ duringAction.effects += it.transformEffect ]
        }
        for(action : syncState.exitActions) {
            val exitAction = syncState.state.createExitAction
            if (action.trigger != null) exitAction.trigger = action.trigger.transformExpression
            action.effects.forEach[ exitAction.effects += it.transformEffect ]
        }
        if (syncState.suspensionTrigger != null) {
            val suspendAction = syncState.state.createSuspendAction
            suspendAction.trigger = syncState.suspensionTrigger.trigger.transformExpression
        }
    }

   // -------------------------------------------------------------------------
   
   def String correctId(String syncChartsId) {
        if (syncChartsId.startsWith("0")||syncChartsId.startsWith("1")||syncChartsId.startsWith("2")||syncChartsId.startsWith("3")||syncChartsId.startsWith("4")||
            syncChartsId.startsWith("5")||syncChartsId.startsWith("6")||syncChartsId.startsWith("7")||syncChartsId.startsWith("8")||syncChartsId.startsWith("9")
        ) {
            return "S" + syncChartsId
        }
        syncChartsId
   }   

   // -------------------------------------------------------------------------   

    // Transforming states
    def dispatch void transform(State syncState, Region rootRegion) {
        val parentRegion = syncState.parentRegion.region
        var syncId = syncState.id.correctId;
        val state = parentRegion.createState(syncId).uniqueName
        syncState.transform(state)
    }
        
    def dispatch void transform(State syncState, de.cau.cs.kieler.sccharts.State state) {
        state.setLabel(syncState.label); 
        state.map(syncState)
        
        state.setInitial(syncState.isInitial)
        state.setFinal(syncState.isFinal)
        
        for (syncSignal : syncState.signals) {
            val signal = state.createSignal(syncSignal.name)
            signal.map(syncSignal)
            signal.setInput(syncSignal.isInput)
            signal.setOutput(syncSignal.isOutput)
            if (syncSignal.type == ValueType::INT) {
                signal.setTypeInt
                if (!syncSignal.initialValue.nullOrEmpty) {
                    val initial = Integer.parseInt(syncSignal.initialValue.replace("\"", ""))
                    signal.setInitialValue(initial.createIntValue)
                }
            }
            else if (syncSignal.type == ValueType::BOOL) {
                signal.setTypeBool
                if (!syncSignal.initialValue.nullOrEmpty) {
                    val initial = Boolean.parseBoolean(syncSignal.initialValue.replace("\"", ""))
                    signal.setInitialValue(initial.createBoolValue)
                }
            }
            else if (syncSignal.type == ValueType::DOUBLE) {
                signal.setTypeDouble
                if (!syncSignal.initialValue.nullOrEmpty) {
                    val initial = Float.parseFloat(syncSignal.initialValue.replace("\"", ""))
                    signal.setInitialValue(initial.createFloatValue)
                }
            }
            else if (syncSignal.type == ValueType::FLOAT) {
                signal.setTypeFloat
                if (!syncSignal.initialValue.nullOrEmpty) {
                    val initial = Float.parseFloat(syncSignal.initialValue.replace("\"", ""))
                    signal.setInitialValue(initial.createFloatValue)
                }
            }
        }
        
        for (syncRegion : syncState.regions) {
            syncRegion.transform(state)
        }
        
    }
    
    // Transforming regions
    def dispatch void transform(de.cau.cs.kieler.synccharts.Region syncRegion, de.cau.cs.kieler.sccharts.State state) {
        val parentState = syncRegion.parentState.state
        val region = parentState.createControlflowRegion(syncRegion.id)
        region.map(syncRegion)
        if (syncRegion.label != null) {
            region.setLabel(syncRegion.label)
        }
        for (syncState : syncRegion.states) {
            syncState.transform(region)
        }
    }
    
   // -------------------------------------------------------------------------   
           
   def dispatch Emission transformEffect(de.cau.cs.kieler.synccharts.Emission emission) {
      val scchartValuedObject = emission.signal.valuedObject
      if (emission.newValue == null) {
          val scchartEmission = scchartValuedObject.emit
          return scchartEmission
      }
      else {
          val scchartValue = emission.newValue.transformExpression
          val scchartEmission = scchartValuedObject.emit(scchartValue)
          return scchartEmission
      }
   }           

   def dispatch TextEffect transformEffect(de.cau.cs.kieler.synccharts.TextEffect textEffect) {
      val text = textEffect.code
      text.createTextEffect
   }

   def dispatch Effect transformEffect(de.cau.cs.kieler.synccharts.Effect effect) {
       null;
   }
   
    //-------------------------------------------------------------------------
    //--              C O N V E R T   E X P R E S S I O N S                  --
    //-------------------------------------------------------------------------

    // Create a new reference Expression to the corresponding sValuedObject of the expression
    def dispatch Expression transformExpression(ValuedObjectReference expression) {
        val syncchartValuedObject = expression.valuedObject
        val scchartValuedObject = syncchartValuedObject.valuedObject
        scchartValuedObject.reference
    }
    
    
    def OperatorType transformOperator(de.cau.cs.kieler.esterel.kexpressions.OperatorType operatorType) {
        if (operatorType == de.cau.cs.kieler.esterel.kexpressions.OperatorType::ADD) {
            return OperatorType::ADD
        }
        else if (operatorType == de.cau.cs.kieler.esterel.kexpressions.OperatorType::AND) {
            return OperatorType::AND
        }
        else if (operatorType == de.cau.cs.kieler.esterel.kexpressions.OperatorType::DIV) {
            return OperatorType::DIV
        }
        else if (operatorType == de.cau.cs.kieler.esterel.kexpressions.OperatorType::EQ) {
            return OperatorType::EQ
        }
        else if (operatorType == de.cau.cs.kieler.esterel.kexpressions.OperatorType::GEQ) {
            return OperatorType::GEQ
        }
        else if (operatorType == de.cau.cs.kieler.esterel.kexpressions.OperatorType::GT) {
            return OperatorType::GT
        }
        else if (operatorType == de.cau.cs.kieler.esterel.kexpressions.OperatorType::LEQ) {
            return OperatorType::LEQ
        }
        else if (operatorType == de.cau.cs.kieler.esterel.kexpressions.OperatorType::LT) {
            return OperatorType::LT
        }
        else if (operatorType == de.cau.cs.kieler.esterel.kexpressions.OperatorType::MOD) {
            return OperatorType::MOD
        }
        else if (operatorType == de.cau.cs.kieler.esterel.kexpressions.OperatorType::MULT) {
            return OperatorType::MULT
        }
        else if (operatorType == de.cau.cs.kieler.esterel.kexpressions.OperatorType::NE) {
            return OperatorType::NE
        }
        else if (operatorType == de.cau.cs.kieler.esterel.kexpressions.OperatorType::NOT) {
            return OperatorType::NOT
        }
        else if (operatorType == de.cau.cs.kieler.esterel.kexpressions.OperatorType::OR) {
            return OperatorType::OR
        }
        else if (operatorType == de.cau.cs.kieler.esterel.kexpressions.OperatorType::PRE) {
            return OperatorType::PRE
        }
        else if (operatorType == de.cau.cs.kieler.esterel.kexpressions.OperatorType::SUB) {
            return OperatorType::SUB
        }
        else if (operatorType == de.cau.cs.kieler.esterel.kexpressions.OperatorType::VAL) {
            return OperatorType::VAL
        }
    }

    // Apply conversion to operator expressions like and, equals, not, greater, val, pre, add, etc.
    def dispatch Expression transformExpression(OperatorExpression expression) {
        val newExpression = createOperatorExpression(expression.operator.transformOperator)
        for (subExpression : expression.subExpressions) {
            newExpression.subExpressions.add(subExpression.transformExpression)
        }
        return newExpression;
    }

    // Apply conversion to integer values
    def dispatch Expression transformExpression(IntValue expression) {
        createIntValue(expression.value)
    }

    // Apply conversion to float values
    def dispatch Expression transformExpression(FloatValue expression) {
        createFloatValue(expression.value)
    }

    // Apply conversion to boolean values
    def dispatch Expression transformExpression(BooleanValue expression) {
        createBoolValue(expression.value)
    }    

    // Apply conversion to textual host code 
    def dispatch Expression transformExpression(TextExpression expression) {
        var code = expression.code;
        val textExpression = createTextExpression
        textExpression.setText(code);
        textExpression
    }    
    
    // Apply conversion to the default case
    def dispatch Expression transformExpression(de.cau.cs.kieler.esterel.kexpressions.Expression expression) {
        createExpression
    }

   // -------------------------------------------------------------------------   
}
