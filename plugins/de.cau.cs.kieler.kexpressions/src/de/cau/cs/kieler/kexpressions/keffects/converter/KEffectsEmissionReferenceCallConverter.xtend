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
package de.cau.cs.kieler.kexpressions.keffects.converter

import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.kexpressions.KExpressionsPackage
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.keffects.Emission
import de.cau.cs.kieler.kexpressions.keffects.KEffectsFactory
import javax.inject.Inject
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.linking.LinkingScopeProviderBinding
import org.eclipse.xtext.linking.impl.LinkingHelper
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElement
import org.eclipse.xtext.parser.IParseResult
import org.eclipse.xtext.scoping.IScopeProvider

import static extension org.eclipse.emf.ecore.util.EcoreUtil.replace
import de.cau.cs.kieler.kexpressions.MethodDeclaration

/**
 * @author als
 */
class KEffectsEmissionReferenceCallConverter {
    
    public static val ANNOTATION = "KEffectsEmissionReferenceCallConverter.CONVERTED"

    @Inject
    @LinkingScopeProviderBinding
    extension IScopeProvider

    @Inject
    extension LinkingHelper

    @Inject
    extension IQualifiedNameConverter
    
    @Inject
    extension AnnotationsExtensions

    static val expPackage = KExpressionsPackage.eINSTANCE
    static val effFactory = KEffectsFactory.eINSTANCE
    static val expFactory = KExpressionsFactory.eINSTANCE

    /**
     * Replaces all Emission by ReferenceCallEffects if the are incorrectly detected by the grammar.
     */
    def void fixEmissionReferenceCallEffectDuality(IParseResult parseResult) {
        var root = parseResult.getRootNode
        val toConvert = <Emission, ValuedObject>newHashMap
        for (node : root.getAsTreeIterable) {
            if (node instanceof CompositeNodeWithSemanticElement) {
                val emission = node.semanticElement
                if (emission instanceof Emission) {
                    if (emission.newValue !== null) {
                        var voNameNode = node.firstChild
                        while (voNameNode !== null && !(voNameNode.grammarElement instanceof RuleCall)) {
                            voNameNode = voNameNode.nextSibling
                        }
                        if (voNameNode !== null) {
                            val candidates = getScope(emission.reference, expPackage.valuedObjectReference_ValuedObject)
                            if (candidates !== null) {
                                val name = voNameNode.getCrossRefNodeAsString(true)
                                val qualifiedName = name.toQualifiedName
                                val candidate = candidates.getSingleElement(qualifiedName)
                                if (candidate !== null) {
                                    val vo = candidate.EObjectOrProxy
                                    if (vo instanceof ValuedObject) {
                                        if (vo.eContainer instanceof ReferenceDeclaration || vo.eContainer instanceof MethodDeclaration) {
                                            toConvert.put(emission, vo)
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (entry : toConvert.entrySet) {
            val emission = entry.key
            val vo = entry.value
            val refCall = effFactory.createReferenceCallEffect
            refCall.annotations.addAll(emission.annotations)
            refCall.valuedObject = vo
            refCall.parameters.add(expFactory.createParameter => [
                expression = emission.newValue
            ])
            emission.replace(refCall)
            emission.addTagAnnotation(ANNOTATION)
        }
    }
}
