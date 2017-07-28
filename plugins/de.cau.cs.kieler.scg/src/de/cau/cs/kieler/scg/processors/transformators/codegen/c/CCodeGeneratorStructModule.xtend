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
package de.cau.cs.kieler.scg.processors.transformators.codegen.c

import de.cau.cs.kieler.scg.codegen.SCGCodeGeneratorModule
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import com.google.inject.Inject

/**
 * C Code Generator Struct Module
 * 
 * Handles the creation of the data struct.
 * 
 * @author ssm
 * @kieler.design 2017-07-21 proposed 
 * @kieler.rating 2017-07-21 proposed yellow 
 * 
 */
class CCodeGeneratorStructModule extends SCGCodeGeneratorModule {
    
    @Inject extension CCodeSerializeHRExtensions
    
    public static val STRUCT_NAME = "TickData"
    public static val STRUCT_VARIABLE_NAME = "d"
    public static val STRUCT_PRE_PREFIX = "_p"
  
    def getName() {
        STRUCT_NAME + baseName + suffix
    }
    
    def getVariableName() {
        STRUCT_VARIABLE_NAME
    }
    
    override generateInit() {
        code.append("typedef struct {\n")
    }
    
    override generate() {
        
        // Add the declarations of the model.
        for (declaration : scg.declarations) {
            for (valuedObject : declaration.valuedObjects) {
                if (declaration instanceof VariableDeclaration) {
                    code.append(indentation + declaration.type.serializeHR + " ")
                    code.append(valuedObject.name)
                    code.append(";\n")
                }
            }
        }
    }
    
    override generateDone() {
        code.append("} ").append(getName).append(";\n")
    }
    
}