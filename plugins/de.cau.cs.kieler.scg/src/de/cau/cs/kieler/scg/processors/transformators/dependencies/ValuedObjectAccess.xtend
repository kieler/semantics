/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.transformators.dependencies

import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.scg.Node
import java.util.Deque
import de.cau.cs.kieler.scg.Fork

/**
 * @author ssm
 * @kieler.design 2017-08-21 proposed 
 * @kieler.rating 2017-08-21 proposed yellow
 */

class ValuedObjectAccess {
    
    // Hard-coded IUR protocol
    public static val EObject GLOBAL_SCHEDULE = null
    public static val GLOBAL_WRITE = 0
    public static val GLOBAL_RELATIVE_WRITE = 1
    public static val GLOBAL_READ = 2
    
    @Accessors Node node
    @Accessors EObject schedule
    @Accessors int priority 
    @Accessors ForkStack forkStack
    
    new(Node node, EObject schedule, int priority, ForkStack forkStack) {
        this.node = node
        this.schedule = schedule
        this.priority = priority
        this.forkStack = new ForkStack(forkStack)
    }
}