/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time & Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.test

import de.cau.cs.kieler.core.model.test.AbstractModelInformation

/**
 * Xtend class that defines SCG elements that may be compared with each other.
 * Of course, if an SCG does not contain the queried information, the count of the appropriate 
 * property is zero.
 * 
 * @author ssm
 * @kieler.design 2014-01-14 proposed 
 * @kieler.rating 2014-01-14 proposed yellow
 */
class SCGModelInformation extends AbstractModelInformation {

    /** Count of type groups */
	@Property 
	int typeGroupCount = 0
	
    /** Count of valued objects */
	@Property 
	int valuedObjectCount = 0
	
	/** Count of nodes */
	@Property 
	int nodeCount = 0
	
	/** Count of control flows */
	@Property 
	int controlFlowCount = 0
	
	/** Count of dependencies */
	@Property 
	int dependencyCount = 0
	
	/** Count of basic blocks */
	@Property 
	int basicBlockCount = 0
	
	/** Count of scheduling blocks */
	@Property 
	int schedulingBlockCount = 0
	
}