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
import de.cau.cs.kieler.scg.processors.transformators.codegen.c.CCodeSerializeHRExtensions
import de.cau.cs.kieler.kexpressions.ValueType

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
    
    @Inject extension KExpressionsValuedObjectExtensions
    @Accessors @Inject JavaCodeSerializeHRExtensions javaSerializer
    
    @Accessors String className
    
    var hasArrays = false
    
    override configure(String baseName, SCGraphs sCGraphs, SCGraph scg, Processor<SCGraphs, CodeContainer> processorInstance, 
        Map<SCGraph, SCGCodeGeneratorModule> codeGeneratorModuleMap, String codeFilename, SCGCodeGeneratorModule parent
    ) {
        super.configure(baseName, sCGraphs, scg, processorInstance, codeGeneratorModuleMap, codeFilename, parent)
        
        className = codeFilename.substring(0, codeFilename.length - 5)
        serializer = javaSerializer
        
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
    
    override generate(extension CCodeSerializeHRExtensions serializer) {
        
        // Add the declarations of the model.
        for (declaration : scg.declarations.filter(VariableDeclaration)) {
            for (valuedObject : declaration.valuedObjects) {
                indent
                code.append("public ")
                val declarationType = if (declaration.type != ValueType.HOST || declaration.hostType.nullOrEmpty) 
                    declaration.type.serializeHR
                    else declaration.hostType
                code.append(declarationType)
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
        
        code.globalObjectAdditions(serializer)        
    }
    
    override generateDone() {
        if (hasArrays) createConstructor(serializer)
    }
    
    protected def createConstructor(extension CCodeSerializeHRExtensions serializer) {
        code.append("\n" + indentation)
        code.append("public " + className + "() {\n")
        
        for (declaration : scg.declarations.filter(VariableDeclaration)) {
            for (valuedObject : declaration.valuedObjects.filter[ isArray ]) {
                valuedObject.createArrayForCardinalityIndex(0, serializer)
            }
        }
        
        code.append(indentation + "}\n")
    }
    
    protected def createArrayForCardinalityIndex(ValuedObject valuedObject, int index, extension CCodeSerializeHRExtensions serializer) {
        val declaration = valuedObject.variableDeclaration

        switch(declaration.type) {
        case ValueType.BOOL,
        case ValueType.FLOAT,
        case ValueType.INT: {            
            indent(2)
            code.append(valuedObject.name + " = new " + declaration.type.serializeHR)
            for (c : valuedObject.cardinalities) {
                code.append("[" + c.serializeHR + "]")
            }
            code.append(";\n")
        }
        default:
            valuedObject.createArrayForCardinalityIndexHelper(index, valuedObject.name, " = new " + declaration.type.serializeHR, serializer)
        }
    }
    
    protected def void createArrayForCardinalityIndexHelper(ValuedObject valuedObject, int index, String assignmentPart, String expressionPart, extension CCodeSerializeHRExtensions serializer) {
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
                " = new " + declaration.type.serializeHR,
                serializer
            )
            indent(2 + index)
            code.append("}\n")
        }                
    }
    
    protected def void globalObjectAdditions(StringBuilder sb, extension CCodeSerializeHRExtensions serializer) {
        val globalObjects = modifications.get(JavaCodeSerializeHRExtensions.GLOBAL_OBJECTS)
        for (object : globalObjects)  {
            sb.append(indentation + object + "\n")
        }
        
    }  
        
}