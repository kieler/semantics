/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
 package de.cau.cs.kieler.sccharts.s

import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsExtension
import java.util.ArrayList
import java.util.List
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.sccharts.Action
import de.cau.cs.kieler.core.kexpressions.ValuedObject

/** 
 * SCCharts DependencyTransformation Extension builds up a sorted list of dependencies between states
 * of an SCG normalized SCChart.
 * 
 * @author cmot
 * @kieler.design 2013-09-05 proposed 
 * @kieler.rating 2013-09-05 proposed yellow
 */
class DependencyTransformation { 

    @Inject
    extension SCChartsExtension
    
    // Create an empty dependency list
    List<Dependency> dependencies = new ArrayList<Dependency>
    
    //-------------------------------------------------------------------------
    //--      T R A N S F O R M      T O      D E P E N D E N C I E S        --
    //-------------------------------------------------------------------------

    def List<Dependency> transformAllDependencies(Region rootRegion) {
        // Clear dependencies
        dependencies.clear
        
        // Go thru all regions and states recursively and build up dependencies
        for (region : rootRegion.rootState.regions) {
           region.transformDependencies
        }
        
        dependencies
    }
           
   // -------------------------------------------------------------------------   
   // -------------------------------------------------------------------------   

   // For all valued object references within a transition's trigger, find and return all states that
   // emit or write to these valued objects.   
   def List<State> statesToDependOn(Transition transition) {
       var stateList = new ArrayList<State>
       
       if (transition.trigger != null) {
           // All valuedObject references in the trigger of this transition
           val valuedObjectReferences = transition.trigger.eAllContents.filter(typeof(ValuedObjectReference)).toList
           
           for (valuedObjectReference : valuedObjectReferences) {
               // The valuedObject we search for
               val valuedObject = valuedObjectReference.valuedObject
               // Search ALL actions of the mode
               val allActions = transition.sourceState.rootState.eAllContents.filter(typeof(Action)).toList
               // Consider only those who write to the valuedObject we search for
               val actions = allActions.filter(e | e.effects.filter(typeof(ValuedObject)).
                                                             filter(ee | ee == valuedObject) .length > 0
               )
               
               for (action : actions) {
                   // We consider only SCG normalized SCCharts, hence only transitions
                   if (action.eContainer instanceof Transition) {
                       val state = (action.eContainer as Transition).sourceState
                       if (!stateList.contains(state)) {
                           stateList.add(state)
                       }
                   }
               }
           }
       }
       stateList
   }

   // -------------------------------------------------------------------------   

    def private void transformDependencies(State state) {
        for (transition : state.outgoingTransitions) {
            for (stateToDependOn : transition.statesToDependOn) {
               val newDependency = new Dependency(state, stateToDependOn)
               dependencies.add(newDependency)
            } 
        }
        // Go thru all regions and states recursively and build up dependencies
        for (region : state.regions) {
           region.transformDependencies
        }
    }

   // -------------------------------------------------------------------------   

    def private void transformDependencies(Region region) {
        // Go thru all states and states recursively and build up dependencies
        for (state : region.states) {
           state.transformDependencies()
        }
    }
           
   // -------------------------------------------------------------------------   
}
