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
package de.cau.cs.kieler.kexpressions.converter

import de.cau.cs.kieler.kexpressions.KExpressionsPackage
import de.cau.cs.kieler.kexpressions.MethodDeclaration
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsOverloadingExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import javax.inject.Inject
import org.eclipse.xtext.linking.LinkingScopeProviderBinding
import org.eclipse.xtext.linking.impl.LinkingHelper
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.parser.IParseResult
import org.eclipse.xtext.scoping.IScopeProvider

/**
 * @author als
 */
class KExpressionsOverloadingConverter {

    @Inject
    @LinkingScopeProviderBinding
    extension IScopeProvider
    @Inject
    extension LinkingHelper
    @Inject
    extension IQualifiedNameConverter

    @Inject
    extension KExpressionsValuedObjectExtensions
    @Inject
    extension KExpressionsDeclarationExtensions
    @Inject
    extension KExpressionsOverloadingExtensions

    static val expPackage = KExpressionsPackage.eINSTANCE

    /**
     * Find best matched for overloaded methods.
     */
    def void fixOverloadedMethodCalls(IParseResult parseResult) {
        val model = parseResult.rootASTElement
        val methodCalls = newHashMap
        // Find all
        for (call : model.eAllContents.filter(ReferenceCall).toIterable) {
            val ref = call.lowermostReference
            if (ref.valuedObject !== null) {
                val decl = ref.valuedObject.declaration
                if (decl.isMethod) {
                    methodCalls.put(call, decl as MethodDeclaration)
                }
            }
        }
        // Check for match
        for (entry: methodCalls.entrySet) {
            val call = entry.key
            val linkedMethod = entry.value
            if (!call.matchesSignature(linkedMethod)) {
                // Find better alternative (overloading match)
                call.linkBestCandiate()
            }
        }
    }
    
    private def void linkBestCandiate(ReferenceCall call) {
        val ref = call.lowermostReference
        val candidates = getScope(ref, expPackage.valuedObjectReference_ValuedObject)
        if (candidates !== null) {
            for (candidate : candidates.getElements(ref.valuedObject.name.toQualifiedName)) {
                if (candidate !== null) {
                    val vo = candidate.EObjectOrProxy
                    if (vo instanceof ValuedObject) {
                        val method = vo.declaration
                        if (method instanceof MethodDeclaration) {
                            if (call.matchesSignature(method)) {
                                ref.valuedObject = vo
                                return // Take first match
                            }
                        }
                    }
                }
            }
        }
    }
}
