package de.cau.cs.kieler.scg.test

import de.cau.cs.kieler.core.model.test.AbstractModelInformation

class SCGModelInformation extends AbstractModelInformation {

	@Property int valuedObjectCount = 0
	@Property int nodeCount = 0
	@Property int controlFlowCount = 0
	@Property int dependencyCount = 0
	@Property int basicBlockCount = 0
	@Property int schedulingBlockCount = 0
	
}