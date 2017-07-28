/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.transformations.synchronizer

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsSerializeExtensions
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.SchedulingBlock
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.Guard

/**
 * @author ssm
 *
 */
class MasterSlaveSynchronizer extends DepthSynchronizer {
    
    @Inject
    extension KExpressionsValuedObjectExtensions
    
    @Inject
    extension KExpressionsDeclarationExtensions
    
    @Inject
    extension SCGCoreExtensions
    
    @Inject
    extension SCGControlFlowExtensions
    
    @Inject
    extension SCGThreadExtensions

    @Inject
    extension AnnotationsExtensions
    
    @Inject
    extension KEffectsSerializeExtensions    
    
    public static val SYNCHRONIZER_ID = "de.cau.cs.kieler.scg.synchronizer.masterSlave"
    
    override build(Join join, Guard guard, SchedulingBlock schedulingBlock, SCGraph scg) {
        
    }    
}