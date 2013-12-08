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
 package de.cau.cs.kieler.scg.synchronizer

import de.cau.cs.kieler.scg.schedulers.AbstractSCGScheduler
import de.cau.cs.kieler.scg.extensions.SCGExtensions
import com.google.inject.Inject
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.OperatorType
import de.cau.cs.kieler.scg.Fork
import java.util.ArrayList
import de.cau.cs.kieler.scgbb.BasicBlock
import de.cau.cs.kieler.core.kexpressions.Expression

/** 
 * ExitSCGSynchronizer
 * 
 * @author ssm
 * @kieler.design 2013-11-28 proposed 
 * @kieler.rating 2013-11-28 proposed yellow
 */
 // The Exit Synchronizer builds the synchronizer in relation to the exit nodes in the different threads.
class ExitSurfaceSynchronizer extends AbstractSCGSynchronizer {
 
     @Inject
    extension SCGExtensions
  
    override protected SynchronizerData build(Fork originFork) {
        var data = new SynchronizerData()

        val scg = originFork.graph
        val exitNodes = <Exit> newLinkedList
        originFork.getAllNext.forEach[exitNodes.add((it.target as Entry).exit)]
        
        for(exit:exitNodes){
            val exitBB = exit.basicBlock
            data.predecessors.add(exitBB)
            
            // TODO: create expressions
//            val emptyExpression = KExpressionsFactory::eINSTANCE.createOperatorExpression
//            emptyExpression.setOperator(OperatorType::NOT)
//            emptyExpression.subExpressions.add(exitBB.)
        }
        data 
    }
    
}