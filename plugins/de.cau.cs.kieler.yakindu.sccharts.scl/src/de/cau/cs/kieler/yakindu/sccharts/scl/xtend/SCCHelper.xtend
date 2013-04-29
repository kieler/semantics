package de.cau.cs.kieler.yakindu.sccharts.scl.xtend

import com.google.common.collect.ImmutableList
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncState
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncTransition
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.TransitionType
import de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionEffect
import de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionTrigger
import java.util.ArrayList
import java.util.List
import org.yakindu.sct.model.sgraph.Effect
import org.yakindu.sct.model.sgraph.Statechart
import org.yakindu.sct.model.sgraph.Trigger

class SCCHelper {
    
    // ======================================================================================================
    // ==                T R A N S I T I O N    M E T A M O D E L   E X T E N S I O N                      ==
    // ======================================================================================================

    def boolean exists(SyncTransition transition) {
        if (transition != null) { return true }
        return false
    }   

    def boolean exists(ReactionTrigger trigger) {
        if (trigger != null) { return true }
        return false
    }   

    def boolean exists(Trigger trigger) {
        if (trigger != null) { return true }
        return false
    }   
        
    def boolean exists(ReactionEffect effect) {
        if (effect != null) { return true }
        return false
    }   
 
    def boolean exists(Effect effect) {
        if (effect != null) { return true }
        return false
    }
       





    def getTransitions(SyncState state) {
        val outgoingTransitions = state.outgoingTransitions.filter(typeof(SyncTransition))
//        outgoingTransitions.sort(e1, e2 | compareSCCTransitionOrderFIXME(e1, e2));
        outgoingTransitions
    }
    
    def List<SyncTransition> getWeakTransitions(SyncState state) {
        ImmutableList::copyOf(state.getTransitions.filter(e | e.type == TransitionType::WEAKABORT));
    }
    
    def List<SyncTransition> getNormalterminations(SyncState state) {
        ImmutableList::copyOf(state.getTransitions.filter(e | e.type == TransitionType::NORMALTERMINATION));        
    }
    
    def boolean isImmediate(SyncTransition transition) {
        var ret = (transition.trigger != null && 
            (transition.trigger as ReactionTrigger).isImmediate
        )
        
        /* workaround for triggerless immediate transitions */
        if (transition.trigger == null) {
            ret = transition.specification.equals('#');
        }
        
        ret
    }        


    def int compareSCCTransitionOrder(SyncTransition e1, SyncTransition e2) {
        var order = 1;
        if (e1.priority<e2.priority) { order = -1}
        order;
    }
    
    def int compareSCCTransitionOrderFIXME(SyncTransition e1, SyncTransition e2) {
        var order = 1;
        if (e2.trigger == null) { order = -1}
        order;
    }

    def void statechartDistributePriorities(Statechart statechart) {
        var states = statechart.eAllContents().toIterable().filter(typeof(SyncState)).toList();
        for (state : states) {
            var int priority = 1
            val transitions = ImmutableList::copyOf(state.outgoingTransitions.filter(typeof(SyncTransition))).
                sort(e1, e2 | compareSCCTransitionOrderFIXME(e1, e2));
            for (transition : transitions) {
              transition.priority = priority
              priority = priority + 1  
            }  
        }
    }
             
}