/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.codegen.promela

import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.scg.processors.codegen.CodeGeneratorModuleBase
import de.cau.cs.kieler.scg.processors.codegen.smv.ScgConditionalAssignmentAnalyzer

/** 
 * @author aas
 */
abstract class PromelaCodeGeneratorModuleBase extends CodeGeneratorModuleBase {
    public static val TICK_END_FLAG_NAME = "pmltickend"
    public static val GUARD_PREFIX = "_g"
    public static val PRE_GUARD_PREFIX = "_p"
    public static val CONDITIONAL_GUARD_PREFIX = "_cg"
    public static val GO_GUARD = "_GO"
    
    override getLineCommentToken() {
        return "//";
    }
    
    protected def boolean isGuard(ValuedObject vo) {
        return vo.name.startsWith("_g") || vo.name.startsWith("_cg")
    }
    
    protected def boolean canBeDeclaredLocally(ValuedObject valuedObject) {
        if(valuedObject.isGuard) {
            return true
        }
        return false
    }
}
