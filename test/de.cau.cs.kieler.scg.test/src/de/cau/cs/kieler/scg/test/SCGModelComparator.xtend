/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time & Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.test

import de.cau.cs.kieler.core.model.test.AbstractModelComparator
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.BasicBlock
import de.cau.cs.kieler.scg.SchedulingBlock
import de.cau.cs.kieler.scg.Dependency
import org.eclipse.emf.ecore.EObject

/**
 * Derived comparator class to compare two SCG models.
 * 
 * @author ssm
 * @kieler.design 2014-01-14 proposed 
 * @kieler.rating 2014-01-14 proposed yellow
 */

class SCGModelComparator extends AbstractModelComparator {
	
	/**
	 * Compares two models using the SCG information class.
	 * 
	 * @param eObject1
	 *         the first model
	 * @param eObject2
	 *         the second model
	 * @return Returns true if both model are identical with respect to the model information class.
	 */
	override protected compareModels(EObject eObject1, EObject eObject2) {
		val modelInfo1 = eObject1.gatherInformation as SCGModelInformation
		val modelInfo2 = eObject2.gatherInformation as SCGModelInformation
		
		(modelInfo1.typeGroupCount == modelInfo2.typeGroupCount) && 
		(modelInfo1.valuedObjectCount == modelInfo2.valuedObjectCount) && 
		(modelInfo1.nodeCount == modelInfo2.nodeCount) && 
		(modelInfo1.controlFlowCount == modelInfo2.controlFlowCount) && 
		(modelInfo1.dependencyCount == modelInfo2.dependencyCount) &&
		(modelInfo1.basicBlockCount == modelInfo2.basicBlockCount)
	}

    /**
     * Fills the model information structure with specific information about the model.
     * 
     * @param eObject
     *          the model
     * @return Returns a filled model information structure.
     */	
	override protected gatherInformation(EObject eObject) {
		val SCGModelInformation modelInfo = new SCGModelInformation();
		if (eObject instanceof SCGraph) {
			val scg = eObject as SCGraph
		
			modelInfo.typeGroupCount = scg.declarations.size
			modelInfo.valuedObjectCount = 0
			scg.declarations.forEach[ modelInfo.valuedObjectCount = modelInfo.valuedObjectCount + it.valuedObjects.size ]
			modelInfo.nodeCount = scg.nodes.size
			modelInfo.controlFlowCount = scg.eAllContents.filter(typeof(ControlFlow)).size
			modelInfo.dependencyCount = scg.eAllContents.filter(typeof(Dependency)).size
			modelInfo.basicBlockCount = scg.eAllContents.filter(typeof(BasicBlock)).size
			modelInfo.schedulingBlockCount = scg.eAllContents.filter(typeof(SchedulingBlock)).size
		}
		return modelInfo;
	}
	
}