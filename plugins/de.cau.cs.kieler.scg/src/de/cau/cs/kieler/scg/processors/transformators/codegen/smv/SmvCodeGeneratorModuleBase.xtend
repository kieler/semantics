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
package de.cau.cs.kieler.scg.processors.transformators.codegen.smv

import de.cau.cs.kieler.scg.processors.transformators.codegen.CodeGeneratorModuleBase

/** 
 * @author aas
 */
abstract class SmvCodeGeneratorModuleBase extends CodeGeneratorModuleBase {
    
    override String getLineCommentToken() {
        return "--";
    }
}
