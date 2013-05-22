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
package de.cau.cs.kieler.yakindu.sccharts.sccharts.xtend

import com.google.common.collect.ImmutableList
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncState
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncTransition
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.TransitionType
import de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionEffect
import de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionTrigger
import java.util.List
import org.yakindu.sct.model.sgraph.Effect
import org.yakindu.sct.model.sgraph.Statechart
import org.yakindu.sct.model.sgraph.Trigger

/**
 * @author ssm
 *
 */
 
 /* This class provides common sccharts manipulation extensions. Since there are only a few, all extensions 
  * are gathered in one class. Should be divided in several classes, if the list of methods grows.  
  */
class SCCExtensions {
    
    // ======================================================================================================
    // ==                T R A N S I T I O N    M E T A M O D E L   E X T E N S I O N S                    ==
    // ======================================================================================================

    // Common exists methods for transition, trigger and effect model instances.
    def dispatch boolean exists(SyncTransition transition) {
        transition != null
    }   

    def dispatch boolean exists(ReactionTrigger trigger) {
        trigger != null
    }   

    def dispatch boolean exists(Trigger trigger) {
        trigger != null
    }   
        
    def dispatch boolean exists(ReactionEffect effect) {
        effect != null
    }   
 
    def dispatch boolean exists(Effect effect) {
        effect != null
    }
       
    // Retrieves all transitions as SyncTransitions.
    def getTransitions(SyncState state) {
        state.outgoingTransitions.filter(typeof(SyncTransition))
    }
    
    // Retrieves all weak transitions as SyncTransitions.
    def List<SyncTransition> getWeakTransitions(SyncState state) {
        ImmutableList::copyOf(state.getTransitions.filter(e | e.type == TransitionType::WEAKABORT));
    }
    
    // Retrieves all normal terminations as SyncTransitions.
    def List<SyncTransition> getNormalterminations(SyncState state) {
        ImmutableList::copyOf(state.getTransitions.filter(e | e.type == TransitionType::NORMALTERMINATION));        
    }
    
    /* Checks whether or not a transition is immediate.
     * Since the flag of an immediate transition is stored in the trigger, trigger-less immediate
     * transitions can not be identified in the way they should be.
     * To check for these, a workaround tests the specification of the transition. 
     * TODO: This meta-model problem should be evaluated soon. 
     */ 
    def boolean isImmediate(SyncTransition transition) {
        // Check the transition trigger for the immediate flag.
        var ret = (transition.trigger != null && 
            (transition.trigger as ReactionTrigger).isImmediate)
        
        // Workaround for trigger-less immediate transitions
        if (transition.trigger == null) {
            ret = transition.specification.equals('#');
        }
        
        ret
    }        
             
}