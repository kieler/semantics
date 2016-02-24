/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.extensions

import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.ExpressionDependency
import de.cau.cs.kieler.scg.GuardDependency
import de.cau.cs.kieler.scg.ControlDependency
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.ScheduleDependency
import de.cau.cs.kieler.scg.Node

/**
 * The SCG Extensions are a collection of common methods for SCG queries and manipulation.
 * The class is separated in several categories. If a category growths too big, it may be 
 * desired to relocate its functions in a specialized extensions class. At the moment the class
 * contains functions for the following tasks.
 * <ul>
 *   <li>Valued object handling</li>
 *   <li>Control flow queries</li>
 *   <li>Thread management</li>
 *   <li>Basic block and scheduling block qeuries</li>
 *   <li>Scheduling problem management</li>
 *   <li>Expression helper</li>
 * </ul> 
 * SCG model copy functions and transformation helper are already relocated to their appropriate
 * extensions.
 * 
 * @author ssm
 * @kieler.design 2016-02-24 proposed 
 * @kieler.rating 2016-02-24 proposed yellow
 */
class SCGDependencyExtensions { 

    public def ExpressionDependency createExpressionDependency(Node source, Node target) {
    	ScgFactory::eINSTANCE.createExpressionDependency => [ 
    		source.dependencies += it
    		it.target = target
    	]
    }

    public def GuardDependency createGuardDependency(Node source, Node target) {
    	ScgFactory::eINSTANCE.createGuardDependency => [ 
    		source.dependencies += it
    		it.target = target
    	]
    }
    
    public def ControlDependency createControlDependency(Node source, Node target) {
    	ScgFactory::eINSTANCE.createControlDependency => [ 
    		source.dependencies += it
    		it.target = target
    	]
    }
    
    public def ScheduleDependency createScheduleDependency(Node source, Node target) {
    	ScgFactory::eINSTANCE.createScheduleDependency => [ 
    		source.dependencies += it
    		it.target = target
    	]
    }
	
}