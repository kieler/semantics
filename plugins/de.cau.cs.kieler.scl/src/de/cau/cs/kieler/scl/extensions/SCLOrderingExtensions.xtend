package de.cau.cs.kieler.scl.extensions

import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncState

class SCLOrderingExtensions {
        // ======================================================================================================
    // ==                       O R D E R I N G   M E T A M O D E L   E X T E N S I O N                    ==
    // ======================================================================================================
    
    /*
     * Methods used in the xtend.sort scheme
     */
    
    // Order states according to their type.
    // initial < normal < final
    def int compareSCLRegionStateOrder(SyncState e1, SyncState e2) {
        var order = 1;
        if (e1.isInitial) {order = -1}
        if (e2.isFinal) {order = -1}
        order;
    }
    
}