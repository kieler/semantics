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
package de.cau.cs.kieler.yakindu.sccharts.kivi.xtend

import com.google.common.collect.ImmutableList
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncState
import org.yakindu.sct.model.sgraph.Statechart
import org.yakindu.sct.model.sgraph.Transition

/**
 * Fixed the priorities of all transitions of an Yakindu SCChart.
 * 
 * @author cmot
 *
 */
class SCCFixPriorities {
    
    
    def void fixPriorities(Statechart statechart) {
        
        val allStates = statechart.eAllContents.filter(typeof(SyncState)).toList;
        
        for (state : allStates) {
            state.fixPriorities;    
        }
    }
    
    
    def int getLabelPriority(Transition transition) {
        val label = transition.specification;
        if (label == null) {
            return -1;
        }
        if (label.indexOf(":") > 0) {
             val prio = label.substring(0, label.indexOf(":"));
             return Integer::parseInt(prio);
        }
        return -1;
    }
    
    
    def void fixPriorities(SyncState state) {

        var prio = state.outgoingTransitions.size + 1;
        val allTransitions = state.outgoingTransitions.toList;
        val allTransitionsCopy = ImmutableList::copyOf(allTransitions);        
//        val EList<Transition> list = new BasicEList<Transition>();        
//        val EList<Transition> notFoundList = new BasicEList<Transition>();        
        for (transitionNotUsed : allTransitionsCopy) {
            prio = prio - 1;
            for (transition : allTransitionsCopy) {
                val i = transition.labelPriority;

                if (i > -1) {
                    if (i == prio) {
                        allTransitions.remove(transition);
                        allTransitions.add(0, transition);
                    }
                }
            }
        }
        
        // Remove all priorities
        for (transition : allTransitions) {
          var label = transition.specification;
          if (label == null) {
              label = "";
          }
          var index = label.indexOf(":") + 1;
          if (index > -1) {
              label = label.substring(index);
          }
          transition.specification = label;
        }
        
        // Now assure the priorities in the labels
        if (allTransitions.size > 1) {
            // Possibly add/update priorities
            prio = 0;
            for (transition : allTransitions) {
                prio = prio + 1;
                var label = transition.specification;
                label = prio + ":" + label;
                transition.specification = label;
            }
        } 
    }
    

//    // Common exists methods for transition, trigger and effect model instances.
//    def boolean exists(SyncTransition transition) {
//        transition != null
//    }   
//
//    def boolean exists(ReactionTrigger trigger) {
//        trigger != null
//    }   
//
//    def boolean exists(Trigger trigger) {
//        trigger != null
//    }   
//        
//    def boolean exists(ReactionEffect effect) {
//        effect != null
//    }   
// 
//    def boolean exists(Effect effect) {
//        effect != null
//    }
//       
//    // Retrieves all transitions as SyncTransitions.
//    def getTransitions(SyncState state) {
//        state.outgoingTransitions.filter(typeof(SyncTransition))
//    }
//    
//    // Retrieves all weak transitions as SyncTransitions.
//    def List<SyncTransition> getWeakTransitions(SyncState state) {
//        ImmutableList::copyOf(state.getTransitions.filter(e | e.type == TransitionType::WEAKABORT));
//    }
//    
//    // Retrieves all normal terminations as SyncTransitions.
//    def List<SyncTransition> getNormalterminations(SyncState state) {
//        ImmutableList::copyOf(state.getTransitions.filter(e | e.type == TransitionType::NORMALTERMINATION));        
//    }
//    
//    /* Checks whether or not a transition is immediate.
//     * Since the flag of an immediate transition is stored in the trigger, trigger-less immediate
//     * transitions can not be identified in the way they should be.
//     * To check for these, a workaround tests the specification of the transition. 
//     * TODO: This meta-model problem should be evaluated soon. 
//     */ 
//    def boolean isImmediate(SyncTransition transition) {
//        // Check the transition trigger for the immediate flag.
//        var ret = (transition.trigger != null && 
//            (transition.trigger as ReactionTrigger).isImmediate)
//        
//        // Workaround for trigger-less immediate transitions
//        if (transition.trigger == null) {
//            ret = transition.specification.contains('#');
//        }
//        
//        ret
//    }        
             
}