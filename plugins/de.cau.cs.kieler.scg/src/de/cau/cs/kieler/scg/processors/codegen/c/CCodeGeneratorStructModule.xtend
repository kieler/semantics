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
package de.cau.cs.kieler.scg.processors.codegen.c

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.VariableDeclaration
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kexpressions.kext.ClassDeclaration
import de.cau.cs.kieler.scg.codegen.SCGCodeGeneratorModule
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

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
    
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension AnnotationsExtensions
    @Accessors @Inject CCodeSerializeHRExtensions serializer
    
    public static val STRUCT_VARIABLE_NAME = "d"
    public static val STRUCT_PRE_PREFIX = "_p"
    
    @Accessors StringBuilder forwardDeclarations = new StringBuilder
  
    def getVariableName() {
        STRUCT_VARIABLE_NAME
    }
    
    def protected separator() {
        "->"
    }    
    
    override generateInit() {
        // Prepend all inner classes
        for (classDecl : scg.eAllContents.filter(ClassDeclaration).filter[!host].toList.reverseView) {
            classDecl.generateClassDeclaration(serializer)
        }
        code.append("\ntypedef struct {\n")
    }
    
    override generate() {
        generate(serializer)
    }
    
    protected def generate(extension CCodeSerializeHRExtensions serializer) {
        // Add the declarations of the model.
        scg.declarations.generateDeclarations(0, serializer)
    }
        
    def void generateClassDeclaration(ClassDeclaration declaration, extension CCodeSerializeHRExtensions serializer) {
        code.append("typedef struct {\n")
        declaration.declarations.generateDeclarations(0, serializer)
        code.append("} ")
        code.append(declaration.name)
        code.append(";\n")
    }
    
    def void generateDeclarations(List<Declaration> declarations, int depth, extension CCodeSerializeHRExtensions serializer) {
        for (declaration : declarations) {
            if (declaration instanceof ClassDeclaration) {
                (0..depth).forEach[code.append(indentation)]
//                if (!declaration.host || !declaration.hasAnnotation("typedef")) {
//                    code.append("struct ")
//                }
                code.append(declaration.name)
                // Disabled this code because nested structs do not allow methods with access via self paramter
//                if (!declaration.host) {
//                    code.append(" {\n")
//                    declaration.declarations.generateDeclarations(depth + 1, serializer)
//                    (0..depth).forEach[code.append(indentation)]
//                    code.append("}")
//                }
                for (valuedObject : declaration.valuedObjects) {
                    code.append(" ")
                    code.append(valuedObject.name)
                    if (valuedObject.isArray) {
                        for (cardinality : valuedObject.cardinalities) {
                            code.append("[" + cardinality.serializeHR + "]")
                        }
                    }
                    if (valuedObject !== declaration.valuedObjects.last) code.append(", ")
                }
                code.append(";\n")
            } else if (declaration instanceof VariableDeclaration) {
                for (valuedObject : declaration.valuedObjects) {
                    (0..depth).forEach[code.append(indentation)]
                    val declarationType = if (declaration.type != ValueType.HOST || declaration.hostType.nullOrEmpty) 
                        declaration.type.serializeHR
                        else declaration.hostType
                    code.append(declarationType)
                    code.append(" ")
                    code.append(valuedObject.name)
                    if (valuedObject.isArray) {
                        for (cardinality : valuedObject.cardinalities) {
                            code.append("[" + cardinality.serializeHR + "]")
                        }
                    }
                    code.append(";\n")
                }
            } else if (declaration instanceof ReferenceDeclaration) {
                for (valuedObject : declaration.valuedObjects) {
                    val myModule = parent as CCodeGeneratorModule
                    val module = codeGeneratorModuleMap.get(declaration.reference) as CCodeGeneratorModule
                    if (module !== null) {
                        code.append(indentation)
                        code.append(module.struct.name)
                        code.append(" ")
                        code.append(valuedObject.name)
                        code.append(";\n")
                        
                        myModule.reset.code.append(indentation)
                        myModule.reset.code.append(module.reset.name)
                        myModule.reset.code.append("(&")
                        myModule.reset.code.append(getVariableName).append(separator)
                        myModule.reset.code.append(valuedObject.name)
                        myModule.reset.code.append(");\n")
                    }
                
                }
            }
        }
    }
    
    override generateDone() {
        code.append("} ").append(getName).append(";\n")
        
        if (forwardDeclarations.length > 0) code.append("\n")
        code.append(forwardDeclarations)
    }
    
}
