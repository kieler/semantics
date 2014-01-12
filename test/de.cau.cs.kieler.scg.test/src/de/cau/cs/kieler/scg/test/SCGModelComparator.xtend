package de.cau.cs.kieler.scg.test

import de.cau.cs.kieler.core.model.test.AbstractModelComparator
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scgdep.Dependency
import de.cau.cs.kieler.scgbb.BasicBlock
import de.cau.cs.kieler.scgbb.SchedulingBlock
import de.cau.cs.kieler.scgsched.Schedule

class SCGModelComparator extends AbstractModelComparator {
	
	override protected compareInformation(EObject eObject1, EObject eObject2) {
		val modelInfo1 = eObject1.gatherInformation as SCGModelInformation
		val modelInfo2 = eObject2.gatherInformation as SCGModelInformation
		
		(modelInfo1.valuedObjectCount == modelInfo2.valuedObjectCount) && 
		(modelInfo1.nodeCount == modelInfo2.nodeCount) && 
		(modelInfo1.controlFlowCount == modelInfo2.controlFlowCount) && 
		(modelInfo1.dependencyCount == modelInfo2.dependencyCount) &&
		(modelInfo1.basicBlockCount == modelInfo2.basicBlockCount)
	}
	
	override protected gatherInformation(EObject eObject) {
		val SCGModelInformation modelInfo = new SCGModelInformation();
		if (eObject instanceof SCGraph) {
			val scg = eObject as SCGraph
		
			modelInfo.valuedObjectCount = scg.valuedObjects.size
			modelInfo.nodeCount = scg.nodes.size
			modelInfo.controlFlowCount = scg.eAllContents.filter(typeof(ControlFlow)).size
			modelInfo.dependencyCount = scg.eAllContents.filter(typeof(Dependency)).size
			modelInfo.basicBlockCount = scg.eAllContents.filter(typeof(BasicBlock)).size
			modelInfo.schedulingBlockCount = scg.eAllContents.filter(typeof(SchedulingBlock)).size
		}
		return modelInfo;
	}
	
}