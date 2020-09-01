/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kexpressions.kext.converter

import de.cau.cs.kieler.annotations.NamedObject
import de.cau.cs.kieler.kexpressions.GenericTypeReference
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.kexpressions.KExpressionsPackage
import de.cau.cs.kieler.kexpressions.ValuedObject
import javax.inject.Inject
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.linking.LinkingScopeProviderBinding
import org.eclipse.xtext.linking.impl.LinkingHelper
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElement
import org.eclipse.xtext.parser.IParseResult
import org.eclipse.xtext.scoping.IScopeProvider

import static extension org.eclipse.emf.ecore.util.EcoreUtil.replace
import org.eclipse.xtext.CrossReference
import org.eclipse.xtext.nodemodel.INode

/**
 * @author als
 */
class KExtGenericParamterConverter {

    public static val ANNOTATION = "KExtGenericParamterConverter.CONVERTED"

    @Inject
    @LinkingScopeProviderBinding
    extension IScopeProvider

    @Inject
    extension LinkingHelper

    @Inject
    extension IQualifiedNameConverter

    static val expPackage = KExpressionsPackage.eINSTANCE
    static val expFactory = KExpressionsFactory.eINSTANCE

    /**
     * Replaces GenericTypeReference with ValuedObjectReferences if the reference a valued object because the parser cannot these.
     */
    def void fixValuedObjectReferenceDetectionInGenericParamter(IParseResult parseResult) {
        var root = parseResult.getRootNode
        val toConvert = <GenericTypeReference>newHashSet
        for (node : root.getAsTreeIterable) {
            if (node instanceof CompositeNodeWithSemanticElement) {
                val typeRef = node.semanticElement
                if (typeRef instanceof GenericTypeReference) {
                    var INode nameNode = node
                    if (!(nameNode instanceof CrossReference)) {
                        nameNode = node.firstChild
                        while (nameNode !== null && !(nameNode.grammarElement instanceof CrossReference)) {
                            nameNode = nameNode.nextSibling
                        }
                    }
                    if (nameNode !== null) {
                        typeRef.link((nameNode.getCrossRefNodeAsString(true) ?: ""))
                        if (typeRef.type instanceof ValuedObject) {
                            toConvert += typeRef
                        }
                    }
                }
            }
        }
        for (typeRef : toConvert) {
            val vor = expFactory.createValuedObjectReference
            vor.valuedObject = typeRef.type as ValuedObject
            typeRef.replace(vor)
        }
    }

    private def void link(GenericTypeReference ref, String name) {
        val candidates = getScope(ref, expPackage.genericTypeReference_Type)
        if (candidates !== null) {
            if (!name.nullOrEmpty) {
                val candidate = candidates.getSingleElement(name.toQualifiedName)
                if (candidate !== null) {
                    val objRef = candidate.EObjectOrProxy
                    if (objRef instanceof NamedObject) {
                        ref.type = objRef
                    }
                }
            }
        }
    }
}
