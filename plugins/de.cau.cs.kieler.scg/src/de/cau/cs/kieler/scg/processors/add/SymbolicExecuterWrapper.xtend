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
package de.cau.cs.kieler.scg.processors.add

import info.scce.cfg.transformation.SymbolicExecuter
import de.cau.cs.kieler.kicool.classes.IKiCoolCloneable
import info.scce.cfg.transformation.ExpressionDAG

/**
 * @author ssm
 *
 */
class SymbolicExecuterWrapper implements IKiCoolCloneable {
    public var SymbolicExecuter executer
    public var SymbolicExecuterStages stage
    public var ExpressionDAG expressionDAG 
    
    override isMutable() {
        true
    }
    
    override cloneObject() {
        return new SymbolicExecuterWrapper => [
            executer = this.executer
            stage = this.stage
            expressionDAG = this.expressionDAG
        ]
    }
    
}