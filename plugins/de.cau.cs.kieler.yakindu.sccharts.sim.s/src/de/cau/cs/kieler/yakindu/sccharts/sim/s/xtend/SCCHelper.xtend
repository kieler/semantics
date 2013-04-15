package de.cau.cs.kieler.yakindu.sccharts.sim.s.xtend

import com.google.common.collect.ImmutableList
import com.google.inject.Guice
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncTransition
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.TransitionType
import de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionTrigger
import de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionEffect
import org.yakindu.sct.model.sgraph.Trigger
import org.yakindu.sct.model.sgraph.Effect
import java.util.List
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncState
import java.util.ArrayList
import org.yakindu.sct.model.stext.stext.Expression
import org.yakindu.sct.model.sgraph.Statechart
import org.yakindu.sct.model.sgraph.Transition

class SCCHelper {
    
     extension de.cau.cs.kieler.yakindu.sccharts.sim.s.xtend.SCLHelper SCLHelper = 
         Guice::createInjector().getInstance(typeof(SCLHelper))
         
    
    
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
       


    def Expression negate(Expression exp) {
        var not = SText.createLogicalNotExpression();
        var par = SText.createParenthesizedExpression();
        par.setExpression(exp);
        not.setOperand(par);
        not;
    }




    def List<SyncTransition> getTransitions(SyncState state) {
        val originalOutgoingTransitions = ImmutableList::copyOf(state.outgoingTransitions);
        var List<SyncTransition> outgoingTransitions = new ArrayList();
        for (raw : originalOutgoingTransitions) {
            outgoingTransitions.add(0, raw as SyncTransition);
        }
        outgoingTransitions.sort(e1, e2 | compareSCCTransitionOrder(e1, e2));
    }
    
    def List<SyncTransition> getWeakTransitions(SyncState state) {
        ImmutableList::copyOf(state.getTransitions.filter(e | e.type == TransitionType::WEAKABORT));
    }
    
    def List<SyncTransition> getNormalterminations(SyncState state) {
        ImmutableList::copyOf(state.getTransitions.filter(e | e.type == TransitionType::NORMALTERMINATION));        
    }
    
    def boolean isImmediate(SyncTransition transition) {
        (transition.trigger != null && 
            (transition.trigger as ReactionTrigger).isImmediate
        )
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