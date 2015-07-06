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
package de.cau.cs.kieler.yakindu.sccharts.coresccharts.xtend

import com.google.common.collect.ImmutableList
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncState
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncTransition
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.TransitionType
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.ReactionEffect
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.ReactionTrigger
import java.util.List
import org.yakindu.sct.model.sgraph.Effect
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
    def boolean exists(SyncTransition transition) {
        transition != null
    }   

    def boolean exists(ReactionTrigger trigger) {
        trigger != null && trigger.expression != null
    }   

    def boolean exists(Trigger trigger) {
        if (trigger instanceof ReactionTrigger) return (trigger as ReactionTrigger).exists
        trigger != null
    }   
        
    def boolean exists(ReactionEffect effect) {
        effect != null && effect.actions.size > 0
    }   
 
    def boolean exists(Effect effect) {
        if (effect instanceof ReactionEffect) return (effect as ReactionEffect).exists
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
             
}