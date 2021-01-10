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
 package de.cau.cs.kieler.scg.processors.synchronizer

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsComplexCreateExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Guard
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SchedulingBlock
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.ThreadPathType
import java.util.Map

/** 
 * Synchronizer for par-or semantics => join as soon any thread terminates.
 * 
 * @author als
 * 
 * @extends AbstractSCGSynchronizer
 */

class ParOrSynchronizer extends AbstractSynchronizer {
 
    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
    
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsComplexCreateExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension KEffectsExtensions

    public static val SYNCHRONIZER_ID = "de.cau.cs.kieler.scg.synchronizer.any"

    // -------------------------------------------------------------------------
    // -- Synchronizer
    // -------------------------------------------------------------------------
 
    override protected build(Join join, Guard guard, SchedulingBlock schedulingBlock, SCGraph scg) {
        var data = new SynchronizerData()=> [ 
            setJoin(join)
            setGuard(guard)
        ]
		
		val joinSB = join.getCachedSchedulingBlock
        val exitNodes = join.allPrevious.map[ eContainer as Exit ]
        data.guardExpression.valuedObject = joinSB.guards.head.valuedObject
        data.guardExpression.expression = or(exitNodes.map[getCachedSchedulingBlock.guards.head.valuedObject.reference].toList)
        
        guard.expression = data.guardExpression.expression
    }
       
    override getId() {
        return SYNCHRONIZER_ID
    }
    
    override isSynchronizable(Fork fork, Map<Entry, ThreadPathType> threadPathTypes, boolean instantaneousFeedback) {
        return fork.join.any
    }
    
}