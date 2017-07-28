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
 package de.cau.cs.kieler.sccharts.legacy.sccharts.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.legacy.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.sccharts.legacy.kexpressions.ValueType
import de.cau.cs.kieler.sccharts.legacy.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.sccharts.legacy.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.sccharts.legacy.kexpressions.keffects.KEffectsFactory
import de.cau.cs.kieler.sccharts.legacy.sccharts.SCChartsFactory
import de.cau.cs.kieler.sccharts.legacy.sccharts.State
import de.cau.cs.kieler.sccharts.legacy.sccharts.Transition

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * SCCharts Extensions.
 * 
 * @author cmot ssm
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class SCChartsSimulation { 

    @Inject
    extension KExpressionsDeclarationExtensions

    @Inject
    extension KExpressionsValuedObjectExtensions
        
    //-------------------------------------------------------------------------
    //--         S I M U L A T I O N    V I S U A L I Z A T I O N            --
    //-------------------------------------------------------------------------
    def State transform2Simulation (State rootState) {
          // Transformation of a SyncChart to another SyncChart
          // enriched with additional valuedObjects for each state and
          // each transition.
          // 
          // These valuedObjects are HS for auxiliary state valuedObjects
          // and HT for auxiliary transition valuedObjects.
          // 
          // ValuedObjects HS are generated in the following fashion for a 
          // state S:
          // 
          // 1. For every incoming transition, add an output-emit action for HS
          // 2. Create an auxiliary region that has one state and a self-loop 
          //    emitting HS.
          // 3. Initial states need new initial states connected with an
          //    immediate transition that emits the valuedObject HS.
          // 
          // ATTENTION: Iff the state is a final state, then do not emit the
          // in-state-auxiliary valuedObject inside (2.) because the thread in this case
          // cannot terminate! (This would change the semantics)
          // 
          // ATTENTION: Iff the state has an outgoing normal termination then
          // we cannot do (2.) because this would also corrupt the semantics
          // The normal termination is transformed into a weak abort - this is the
          // best approximation 
          // 
          // ValuedObject HT are generated in the following fashion for a
          // transition T:
          // 
          // As names for the valuedObjects are randomly generated and must be unique
          // there must be a mapping that keeps track which valuedObject (name) belongs to
          // which original S statement.
          // General method to create the enriched SyncCharts simulation models.
          var AUXILIARY_VARIABLE_TAG_STATE =  ""//SCChartsPlugin::AUXILIARY_VARIABLE_TAG_STATE
          var AUXILIARY_VARIABLE_TAG_TRANSITION = ""//SCChartsPlugin::AUXILIARY_VARIABLE_TAG_TRANSITION

          // Clone the complete SyncCharts region 
          var targetRootRegion = rootState.copy;

          var originalStates = rootState.eAllContents().toIterable().filter(typeof(State));
          var targetStates = targetRootRegion.eAllContents().toIterable().filter(typeof(State)).toList();

          var originalTransitions = rootState.eAllContents().toIterable().filter(typeof(Transition));
          var targetTransitions = targetRootRegion.eAllContents().toIterable().filter(typeof(Transition)).toList();

          // For every state in the SyncChart do the transformation
          // Iterate over a copy of the list     
          var i = 0;     
          val originalTransitionList = originalTransitions.toList;
          for(targetTransition : targetTransitions) {
               val originalTransition = originalTransitionList.get(i);
               i = i + 1;
               val originalTransitionURIFragment = originalTransition.eResource.getURIFragment(originalTransition);
               val transitionUID = AUXILIARY_VARIABLE_TAG_TRANSITION + originalTransitionURIFragment.hashCode.toString().replace("-","M");
               // This statement we want to modify
               targetTransition.transformTransition(targetRootRegion, transitionUID);
          }
          

          // For every state in the SyncChart do the transformation
          // Iterate over a copy of the list     
          i = 0;     
          val originalStatesList = originalStates.toList;
          for(targetState : targetStates) {
               val originalState = originalStatesList.get(i);
               i = i + 1;
               val originalStateURIFragment = originalState.eResource.getURIFragment(originalState);
               val stateUID = AUXILIARY_VARIABLE_TAG_STATE + originalStateURIFragment.hashCode.toString().replace("-","M");
               // This statement we want to modify
               targetState.transformState(targetRootRegion, stateUID);
          }

          targetRootRegion;
     }     
     
     // Transform a transition as described in 1.
     def void transformTransition(Transition transition, State targetRootState, String UID) {
          // auxiliary valuedObject
          val auxiliaryValuedObject = KExpressionsFactory::eINSTANCE.createValuedObject();
          val auxiliaryEmission = KEffectsFactory::eINSTANCE.createEmission();
          
          // Setup the auxiliaryValuedObject as an OUTPUT to the module
          auxiliaryValuedObject.setName(UID);
          createDeclaration(ValueType::PURE) => [
              signal = true
              input = false
              output = true
              attach(auxiliaryValuedObject)
              targetRootState.declarations += it
          ]
          // Set the auxliiaryValuedObject for emission 
          auxiliaryEmission.setValuedObject(auxiliaryValuedObject);
          
          // Add emission of auxiliary ValuedObject to tansition
          transition.effects.add(auxiliaryEmission);
     }

    
     // New visualization of active states with immediate during actions
     def void transformState(State state, State targetRootState, String UID) {
//          if (state.isFinal) {
//               state.setIsFinal(false);
//               // Final states will be transformed if there is a normal termination with a self loop
//               // so we do not want to add a superfluous self loop and return here.
////               return;
//          }

          // Do the following only for NON-final states
          // Do the following only for NON-top-most-states
          if (!state.isFinal && state.parentRegion != targetRootState) {
               // auxiliary valuedObject
               val auxiliaryValuedObject = KExpressionsFactory::eINSTANCE.createValuedObject();
          
               // Setup the auxiliaryValuedObject as an OUTPUT to the module
               auxiliaryValuedObject.setName(UID);
               createDeclaration(ValueType::PURE) => [
                   signal = true
                   input = false
                   output = true
                   attach(auxiliaryValuedObject)
                   targetRootState.declarations += it
               ]

               // Add emission of auxiliary ValuedObject as an immediate during action for this state
               val immediateDuringAction = SCChartsFactory::eINSTANCE.createDuringAction();
               immediateDuringAction.setImmediate(true);
               val auxiliaryEmission = KEffectsFactory::eINSTANCE.createEmission();
                   auxiliaryEmission.setValuedObject(auxiliaryValuedObject);
               immediateDuringAction.effects.add(auxiliaryEmission);
               
               // Add during action to state
               state.localActions.add(immediateDuringAction);
          }
          
     }     

      
}
