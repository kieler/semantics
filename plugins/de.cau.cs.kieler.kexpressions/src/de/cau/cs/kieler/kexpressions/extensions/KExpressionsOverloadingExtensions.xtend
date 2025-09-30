/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2022 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kexpressions.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.Call
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.MethodDeclaration
import de.cau.cs.kieler.kexpressions.Parameter
import de.cau.cs.kieler.kexpressions.ReferenceCall
import java.util.List

/**
 * @author als
 */
class KExpressionsOverloadingExtensions {
    
    static def getMethodSignatureID(MethodDeclaration method) {
        if (method === null) return "null"
        
        var id = new StringBuilder()
        // TODO Implement overloading based on types
//        id.append(getName).append("_")
//        for (para : decl?.parameterDeclarations) {
//            if (para instanceof VariableDeclaration) {
//                id.append(para.type).append("_")
//            } else if (para instanceof ReferenceDeclaration) {
//                id.append((para.reference as NamedObject).name).append("_")
//            }
//        }
//        id.length = id.length - 1 // remove last underscore

        // Currently signature is based in number of arguments
        id.append(method.valuedObjects?.head?.name).append("#")
        id.append((method.parameterDeclarations?:emptyList).size)
        
        return id.toString
    }

    @Inject extension KExpressionsTypeExtensions

    def String getMethodSignatureError(MethodDeclaration method, Call call, boolean strict) {
        return getMethodSignatureError(method.parameterDeclarations, call.parameters, strict)
    }
    
    def String getMethodSignatureError(List<Declaration> params, List<Parameter> args, boolean strict) {
        if (params.size != args.size) {
            return "Number of arguments does not match required parameters in definition."
        } else {
            // TODO Implement overloading based on types
//            val errors = newArrayList
//            for (i : 0..<params.size) {
//                val p = params.get(i)
//                val a = args.get(i).expression
//                val aType = a.inferType
//                
//                if (aType.key == UNKNOWN) {
//                    if (strict) {
//                        return "Cannot infer type of argument of %d".format(i)
//                    }
//                } else {
//                    if (p instanceof VariableDeclaration) {
//                        
//                    } else if (p instanceof ReferenceDeclaration) {
//                        if (p.simple) {
//                            if (!PRIMITIVES.contains(aType)) {
//                                errors += "Argument %d is not of primitive type (instead: %s)".format(i, aType.key.literal)
//                            }
//                        } else if (p.reference instanceof ClassDeclaration && (p.reference as ClassDeclaration).type == ENUM) {
//                            if (p.reference === aType.value) {
//                                errors += "Argument %d is not of type enum %s".format(i, (p.reference as NamedObject).name)
//                            }
//                        } else {
//                            errors += "Object reference parameters are not yet supported"
//                        }
//                    } else {
//                        throw new UnsupportedOperationException("Unexpected parameter declaration")
//                    }
//                }
//            }
//            if (!errors.empty) {
//                return errors.join(", ")
//            }
        }
        return null
    }
    
    def boolean matchesSignature(ReferenceCall call, MethodDeclaration method) {
        // TODO Implement overloading based on types
        // Assumes same method name
        return (call.parameters?:emptyList).size == (method.parameterDeclarations?:emptyList).size
    }
    
}