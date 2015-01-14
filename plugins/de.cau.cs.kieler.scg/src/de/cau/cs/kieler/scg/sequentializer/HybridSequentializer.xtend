/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.sequentializer

import com.google.inject.Guice
import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.Schedule
import de.cau.cs.kieler.scg.SchedulingBlock
import de.cau.cs.kieler.scg.synchronizer.HybridSynchronizer
import de.cau.cs.kieler.scg.synchronizer.SynchronizerData
import java.util.HashMap

/** 
 * This class is part of the SCG transformation chain. The chain is used to gather information 
 * about the schedulability of a given SCG. This is done in several key steps. Contrary to the first 
 * version of SCGs, there is only one SCG meta-model. In each step the gathered data will be added to 
 * the model. 
 * You can either call the transformation manually or use KiCo to perform a series of transformations.
 * <pre>
 * SCG 
 *   |-- Dependency Analysis                        
 *   |-- Basic Block Analysis               
 *   |-- Scheduler
 *   |-- Sequentialization (new SCG)    <== YOU ARE HERE
 * </pre>
 * 
 * @author ssm
 * @kieler.design 2014-01-23 proposed 
 * @kieler.rating 2014-01-23 proposed yellow
 */
 
// -------------------------------------------------------------------------
// -- DEFUNC!
// -------------------------------------------------------------------------    
 

class HybridSequentializer extends SimpleSequentializer {
    
    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------

    @Inject
    extension KExpressionsExtension


    // -------------------------------------------------------------------------
    // -- Globals
    // -------------------------------------------------------------------------
    
    private val HashMap<Node, ValuedObject> threadMapping = new HashMap<Node, ValuedObject>
    
    
    // -------------------------------------------------------------------------
    // -- Sequentializer
    // -------------------------------------------------------------------------    
    

	protected override GuardExpression createSynchronizerBlockGuardExpression(SchedulingBlock schedulingBlock, Schedule schedule, SCGraph scg) {
		// The simple scheduler uses the SurfaceSynchronizer. 
		// The result of the synchronizer is stored in the synchronizerData class joinData.
		val HybridSynchronizer synchronizer = Guice.createInjector().getInstance(typeof(HybridSynchronizer))
		val joinData = synchronizer.synchronize(schedulingBlock.nodes.head as Join, null, null)

		// Add additional valued objects to the SCG and use the guard expression of the synchronizer as it is.
        for (valuedObject : joinData.valuedObjects) {
            scg.addValuedObject(valuedObject.setTypeBool)
        }
		
		joinData.threadMapping.keySet.forEach[
		    this.threadMapping.put(it, joinData.threadMapping.get(it))
		]
		
		joinData.createSynchronizerAlteration(scg).guardExpression
    }
    
    protected def SynchronizerData createSynchronizerAlteration(SynchronizerData synchronizerData, SCGraph scg) {
//    	synchronizerData => [ data |
//    		data.additionalAssignmentBlocks.forEach [ block |
//				data.getAdditionalAssignments(block).forEach[ dataPair |
//		    		ScgschedFactory::eINSTANCE.createAssignmentAddition => [
//    					valuedObject = dataPair.first
//    					expression = dataPair.second
//    					
//    					if (block.nodes.head instanceof Join) {
//    						position = (block.nodes.head as Join) 	
//    					} else {
//    						position = block.nodes.last
//    					}
//    					
//    					scg.alterations.add(it)
//    				]
//    			]
//    		]
//    	]
    }
    
    protected def Schedule createConditionalAlteration(Schedule schedule, SCGraph scg) {
//        var Node actualThreadEntry = null
//        val accList = <SchedulingBlock> newArrayList 
//        
//        for(s : schedule.schedulingBlocks) {
//            var threadEntry = s.nodes.head.threadEntryNode 
//            if (threadEntry != actualThreadEntry) {
//                if (actualThreadEntry != null) {
//                    val conditionNode = actualThreadEntry
//                    ScgschedFactory::eINSTANCE.createConditionalAddition => [
//                        beforeNode = accList.head.nodes.head
//                        untilNode = accList.last.nodes.last
//                        condition = threadMapping.get(conditionNode).reference
//                        
//                        scg.alterations.add(it)
//                    ]                    
//                }
//                accList.clear
//                actualThreadEntry = threadEntry
//                accList.add(s)
//            } 
//            else {
//                accList.add(s)    
//            }
//        }
//        schedule
    }
	
}