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
package de.cau.cs.kieler.scg.processors.transformators.codegen.java

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kicool.compilation.CodeContainer
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.codegen.SCGCodeGeneratorModule
import de.cau.cs.kieler.scg.processors.transformators.codegen.c.CCodeGeneratorStructModule
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kicool.compilation.Processor
import java.util.Map
import de.cau.cs.kieler.kexpressions.ValuedObject

/**
 * Java Code Generator Struct Module
 * 
 * Handles the creation of the data struct.
 * 
 * @author ssm
 * @kieler.design 2017-10-04 proposed 
 * @kieler.rating 2017-10-04 proposed yellow 
 * 
 */
class JavaCodeGeneratorStructModule extends CCodeGeneratorStructModule {
    
    @Inject extension JavaCodeSerializeHRExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    
    @Accessors String className
    
    var hasArrays = false
    
    override configure(String baseName, SCGraphs sCGraphs, SCGraph scg, Processor<SCGraphs, CodeContainer> processorInstance, 
        Map<SCGraph, SCGCodeGeneratorModule> codeGeneratorModuleMap, String codeFilename, SCGCodeGeneratorModule parent
    ) {
        super.configure(baseName, sCGraphs, scg, processorInstance, codeGeneratorModuleMap, codeFilename, parent)
        
        className = codeFilename.substring(0, codeFilename.length - 5)
        
        return this
    }     
    
    override getName() {
        return className
    }
    
    override getVariableName() {
        ""
    }
    
    override protected separator() {
        ""
    }    
    
    override generateInit() {
    }
    
    override generate() {
        
        // Add the declarations of the model.
        for (declaration : scg.declarations.filter(VariableDeclaration)) {
            for (valuedObject : declaration.valuedObjects) {
                indent
                code.append("public ")
                code.append(declaration.type.serializeHR)
                if (valuedObject.isArray) {
                    for (cardinality : valuedObject.cardinalities) {
                        code.append("[]")
                    }
                    hasArrays = true
                }
                code.append(" ")
                code.append(valuedObject.name)
                code.append(";\n")
            }
        }
    }
    
    override generateDone() {
        if (hasArrays) createConstructor
    }
    
    protected def createConstructor() {
        code.append("\n" + indentation)
        code.append(className + "() {\n")
        
        for (declaration : scg.declarations.filter(VariableDeclaration)) {
            for (valuedObject : declaration.valuedObjects.filter[ isArray ]) {
                valuedObject.createArrayForCardinalityIndex(0)
            }
        }
        
        code.append(indentation + "}\n")
    }
    
    protected def createArrayForCardinalityIndex(ValuedObject valuedObject, int index) {
        val declaration = valuedObject.variableDeclaration

        valuedObject.createArrayForCardinalityIndexHelper(index, valuedObject.name, " = new " + declaration.type.serializeHR)
    }
    
    protected def void createArrayForCardinalityIndexHelper(ValuedObject valuedObject, int index, String assignmentPart, String expressionPart) {
        val declaration = valuedObject.variableDeclaration
        val cardinality = valuedObject.cardinalities.get(index)
        
        indent(2 + index)
        code.append(assignmentPart)
        code.append(expressionPart)
        code.append("[" + cardinality.serializeHR + "]")
        code.append(";\n")        

        val i = "_i" + index
        if (valuedObject.cardinalities.size > index + 1) {
            indent(2 + index)
            code.append("for (int " + i + " = 0; " + i + " < " + cardinality.serializeHR + "; " + i + "++) {\n")
            valuedObject.createArrayForCardinalityIndexHelper(index + 1, 
                assignmentPart + "[" + i + "]",
                " = new " + declaration.type.serializeHR 
            )
            indent(2 + index)
            code.append("}\n")
        }                
    }
    
}