package de.cau.cs.kieler.yakindu.sccharts.sim.s.xtend

import com.google.inject.Guice
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncTransition
import de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionTrigger
import de.cau.cs.kieler.yakindu.model.stext.synctext.ReactionEffect
import org.yakindu.sct.model.sgraph.Trigger
import org.yakindu.sct.model.sgraph.Effect

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
       
}