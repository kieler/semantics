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
package de.cau.cs.kieler.scg.processors.codegen.java

import com.google.common.collect.HashMultimap
import com.google.common.collect.Multimap
import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsTypeExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.codegen.SCGCodeGeneratorModule
import java.util.List
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.annotations.StringAnnotation

/**
 * Generates a context interface that is used to perform 
 * hostcode calls on the machine.
 * 
 * @author wechselberg
 */
class JavaCodeGeneratorContextModule extends SCGCodeGeneratorModule {

    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension KExpressionsTypeExtensions
    @Inject extension de.cau.cs.kieler.scg.processors.codegen.java.JavaCodeSerializeHRExtensions

    public static val INTERFACE_PARAM_NAME = "arg"

    var boolean needsContext;

    override generateInit() {
        // We only need the context interface if we have anything tagged as context methods
        needsContext = scg.declarations.exists[annotations.exists['Context'.equalsIgnoreCase(name)]]
    }

    override generate() {
        if (needsContext) {
            code.append("\n")
            // We want to support method overloading (at least roughly)
            // So we gather all method calls and store the information of the used argument types 
            val Multimap<ReferenceDeclaration, List<CharSequence>> referenceUsages = HashMultimap.create
            // Grab all function calls to context methods
            val exprs = scg.nodes.filter(Assignment).map[
                val list = expression.eAllContents.toList
                list.add(expression)
                list
            ].flatten
            val calls = exprs.filter(ReferenceCall).filter [
                valuedObject.referenceDeclaration.annotations.exists['Context'.equalsIgnoreCase(name)]
            ]

            // Gather all different parameter lists we can find
            for (call : calls) {
                // Use the declaration as the key to map the different calls to the same object
                val decl = call.valuedObject.referenceDeclaration
                // Map the parameters to the type by using the existing type inference
                // TODO This inference might need some work to support all cases
                val params = call.parameters.map[expression.inferTypeWithHostTypes]
                if (!referenceUsages.get(decl).exists[it.typesEqual(params)]) {
                    referenceUsages.put(decl, params)
                }
            }

            // Go through all different usages and serialize a method head for each
            for (usage : referenceUsages.entries.sortBy[key.extern.head.code]) {
                generateMethod(usage.key, usage.value)
            }
        }
    }

    /**
     * Compare two lists of parameter type strings 
     */
    def Boolean typesEqual(List<CharSequence> params1, List<CharSequence> params2) {
        return params1.join(',').equals(params2.join(','))
    }

    /**
     * Try to infer the type of an expression and 
     * create the string representation of the type.
     */
    def CharSequence inferTypeWithHostTypes(Expression expression) {
        // We first try the pre-implemented inference, that is able to detect mostly primitive types
        if (expression.inferType != ValueType.UNKNOWN) {
            return expression.inferType.serialize
        } else {
            // The first try returned unknown, so we have to step in. We mostly deal with references to host calls or objects.
            if (expression instanceof ValuedObjectReference) {
                // It is some kind of Reference, it could be many things, but let's start with VOs and calls 
                if (expression instanceof ReferenceCall) {
                    // Just hand it over to the annotation detection
                    return extractContextType(expression.valuedObject.declaration.asReferenceDeclaration)
                } else {
                    // Extract the host type directly from the VO
                    expression.valuedObject.declaration.asVariableDeclaration.hostType
                }
            } else {
                return 'Object'
            }
        }
    }

    /**
     * Generates the method head with the given list of types 
     */
    def generateMethod(ReferenceDeclaration decl, List<CharSequence> types) {
        indent
        code.append(extractContextType(decl)).append(" ")
        code.append(decl.extern.head.code + "(")

        if (types.length > 1) {
            // If we have multiple parameters, we want to count them down.
            // Sadly, we have to go through the list with a loop and count them manually
            // as there is no way to get the counter through a .map[], right?
            var int i = 0
            for (type : types) {
                // Serialize the type to make sure it is matched to Java (i.e. String vs. string)
                code.append(type).append(' ').append(INTERFACE_PARAM_NAME).append(i++)
                if (i < types.length) {
                    code.append(", ")
                }
            }
        } else {
            // If we have (at most) one parameter, we just call it whatever
            code.append(types.map[it + " " + INTERFACE_PARAM_NAME].join())
        }
        code.append(");\n")
    }

    /**
     * Checks the given declaration for annotations with the return type. 
     */
    def extractContextType(ReferenceDeclaration decl) {
        val typeAnnotations = decl.annotations.filter(StringAnnotation).filter['Context'.equalsIgnoreCase(name)].filter[!values.nullOrEmpty]
        if (typeAnnotations.size == 0) {
            return "void"
        } else {
            return typeAnnotations.head.values.head
        }        
    }

    override generateDone() {}

}
