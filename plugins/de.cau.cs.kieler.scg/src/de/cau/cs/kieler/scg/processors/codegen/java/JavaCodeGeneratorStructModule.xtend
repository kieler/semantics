/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.processors.codegen.java

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.MethodDeclaration
import de.cau.cs.kieler.kexpressions.TextExpression
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGMethodExtensions
import de.cau.cs.kieler.scg.processors.codegen.c.CCodeGeneratorStructModule
import de.cau.cs.kieler.scg.processors.codegen.c.CCodeSerializeHRExtensions
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

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
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension SCGMethodExtensions
    @Inject extension SCGControlFlowExtensions
    @Inject extension AnnotationsExtensions
    @Accessors @Inject JavaCodeSerializeHRExtensions javaSerializer
    @Accessors var JavaCodeGeneratorLogicModule logic
    
    @Accessors String className
    
    var hasArrays = false
    var hasClasses = false
    
    override configure() {
        logic = (parent as JavaCodeGeneratorModule).logic as JavaCodeGeneratorLogicModule
        className = codeFilename.substring(0, codeFilename.length - 5)
        serializer = javaSerializer
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
        // Add classes
        scg.declarations.generateClassDeclarations(0, serializer)
        
        // Add the declarations of the model.
        scg.declarations.generateDeclarations(0, serializer)
        
        code.globalObjectAdditions(serializer)
        
        addRootConstructor()  
        
        // Add methods
        if (scg.declarations.exists[it instanceof MethodDeclaration]) {
            code.append("\n")
            scg.declarations.generateMethodDeclarations(0, serializer)
        }
    }
    
    override generateDone() {
        // empty
    }
    
    def addRootConstructor() {
        if (hasArrays || hasClasses) {
            code.append("\n")
            scg.declarations.createConstructor(className, null, 0, serializer)
        }
    }
    
    override void generateDeclarations(List<Declaration> declarations, int depth, extension CCodeSerializeHRExtensions serializer) {
        for (declaration : declarations.filter(VariableDeclaration).filter[!it.isEnum]) {
            for (valuedObject : declaration.valuedObjects) {
                indent(depth+1)
                if (!valuedObject.localVariable) code.append("public ")
                val declarationType = if (declaration instanceof ClassDeclaration) {
                    declaration.name
                } else if (declaration.type != ValueType.HOST || declaration.hostType.nullOrEmpty) {
                    declaration.type.serializeHR
                } else {
                    declaration.hostType
                }
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
    }
    
    protected def void generateClassDeclarations(List<Declaration> declarations, int depth, extension CCodeSerializeHRExtensions serializer) {
        for (declaration : declarations.filter(ClassDeclaration).filter[!it.isEnum]) {
            if (!declaration.host) {
                hasClasses = true
                indent(depth+1)
                code.append("public class ")
                code.append(declaration.name)
                code.append(" {\n")
                declaration.declarations.generateClassDeclarations(depth + 1, serializer)
                declaration.declarations.generateDeclarations(depth + 1, serializer)
                if (declaration.declarations.exists[it instanceof ClassDeclaration || valuedObjects.exists[!cardinalities.nullOrEmpty]]) {
                    code.append("\n")
                    declaration.declarations.createConstructor(declaration.name, null, depth+1, serializer)
                }
                if (declaration.declarations.exists[it instanceof MethodDeclaration]) {
                    code.append("\n")
                    declaration.declarations.generateMethodDeclarations(depth + 1, serializer)
                }
                indent(depth+1)
                code.append("}\n\n")
            } else if (declaration.valuedObjects.exists[!it.hasAnnotation("skipClassInit")]) {
                hasClasses = true // create constructor for class init
            }
        }
    }
    
    protected def void generateMethodDeclarations(List<Declaration> declarations, int depth, extension CCodeSerializeHRExtensions serializer) {
        for (method : declarations.filter(MethodDeclaration)) {
            val methodSCG = getSCGraphs.scgs.findFirst[isMethod && methodDeclaration === method]
            if (methodSCG === null) {
                throw new NullPointerException("Could not find SCG for method")
            }
            
            if (method.hasSelfInParameter) {
                // rename self to this
                methodSCG.declarations.findFirst[selfVO]?.valuedObjects?.head?.setName("this")
            }
            
            indent(depth+1)
            code.append(method.returnType.serialize)
            code.append(" ").append(method.valuedObjects.head.name)
            code.append("(")
            val params = methodSCG.declarations.filter[parameter].map[it as VariableDeclaration].sortBy[valuedObjects.head.parameterIndex].toList
            for (param : params) {
                if (param.type === ValueType.HOST) {
                    code.append(param.hostType)
                } else {
                    code.append(param.type.serializeHR)
                }
                code.append(" ")
                code.append(param.valuedObjects.head.name)
                if (params.last !== param) code.append(", ")
            }
            code.append(") {\n")
            
            methodSCG.declarations.filter[!isParameter && !isExplicitLoop && !isReturn && !selfVO].toList.generateDeclarations(depth + 1, serializer)
            
            // Temporarily redirect logic module output to this module and generate body
            val logicCode = logic.code
            val logicSCG = logic.moduleObject
            val logicIndt = logic.indentationModifier
            logic.newCodeStringBuilder = code
            logic.moduleObject = methodSCG
            logic.indentationModifier = depth + 1
            logic.generate()
            logic.moduleObject = logicSCG
            logic.newCodeStringBuilder = (logicCode)
            logic.indentationModifier = (logicIndt)
            

            indent(depth+1)
            code.append("}\n\n")
        }
    }
    
    protected def createConstructor(List<Declaration> declarations, String contructorName, String additionalCode, int depth, extension CCodeSerializeHRExtensions serializer) {
        indent(depth+1)
        code.append("public " + contructorName + "() {\n")
        if (!additionalCode.nullOrEmpty) {
            code.append("  " + additionalCode)
        }
        for (declaration : declarations.filter(VariableDeclaration)) {
            for (valuedObject : declaration.valuedObjects) {
                if (valuedObject.isArray) {
                    valuedObject.createArrayForCardinalityIndex(0, serializer)
                } else if (declaration.isClass && !valuedObject.hasAnnotation("skipClassInit")) {
                    indent(depth+2)
                    if (valuedObject.initialValue instanceof TextExpression) {
                        code.append(valuedObject.name + " = " + (valuedObject.initialValue as TextExpression).text + ";\n")
                    } else {
                        code.append(valuedObject.name + " = new " + (declaration as ClassDeclaration).name + "();\n")
                    }
                }
            }
        }
        indent(depth+1)
        code.append("}\n")
    }
    
    protected def createArrayForCardinalityIndex(ValuedObject valuedObject, int index, extension CCodeSerializeHRExtensions serializer) {
        val declaration = valuedObject.variableDeclaration

        switch(declaration.type) {
        case BOOL,
        case FLOAT,
        case INT: {            
            indent(2)
            code.append(valuedObject.name + " = new " + declaration.type.serializeHR)
            for (c : valuedObject.cardinalities) {
                code.append("[" + c.serializeHR + "]")
            }
            code.append(";\n")
        }
        default:
            valuedObject.createArrayForCardinalityIndexHelper(index, valuedObject.name, " = new " + if (declaration instanceof ClassDeclaration) (declaration as ClassDeclaration).name else declaration.type.serializeHR, serializer)
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
                " = new " + if (declaration instanceof ClassDeclaration) (declaration as ClassDeclaration).name + "()" else declaration.type.serializeHR,
                serializer
            )
            indent(2 + index)
            code.append("}\n")
        } else if (declaration instanceof ClassDeclaration) {
            indent(2 + index)
            code.append("for (int " + i + " = 0; " + i + " < " + cardinality.serializeHR + "; " + i + "++) {\n")
            indent(2 + index + 1)
            code.append(assignmentPart + "[" + i + "]")
            code.append(" = new ")
            code.append(declaration.name)
            code.append("();\n") 
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
