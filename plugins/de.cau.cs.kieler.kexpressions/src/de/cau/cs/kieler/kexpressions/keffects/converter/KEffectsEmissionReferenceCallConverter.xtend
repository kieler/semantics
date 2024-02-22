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
import de.cau.cs.kieler.kexpressions.MethodDeclaration
import de.cau.cs.kieler.kexpressions.ReferenceDeclaration
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
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
    @Inject
    extension KExpressionsValuedObjectExtensions

    static val expPackage = KExpressionsPackage.eINSTANCE
    static val effFactory = KEffectsFactory.eINSTANCE
    static val expFactory = KExpressionsFactory.eINSTANCE

    /**
     * Replaces all Emission by ReferenceCallEffects if the are incorrectly detected by the grammar.
     */
    def void fixEmissionReferenceCallEffectDuality(IParseResult parseResult) {
        var root = parseResult.getRootNode
        val toConvert = <Emission>newHashSet
        for (node : root.getAsTreeIterable) {
            if (node instanceof CompositeNodeWithSemanticElement) {
                val emission = node.semanticElement
                if (emission instanceof Emission) {
                    //print("Emission " + node.text)
                    if (emission.hasAnnotation(ANNOTATION)) {
                        if (emission.eContainer !== null) {
                            System.err.println("KEffectsEmissionReferenceCallConverter: Replaced emission reappeared!")
                        }
                    } else if (emission.newValue !== null) {
                        var voNameNode = node.firstChild
                        while (voNameNode !== null && !(voNameNode.grammarElement instanceof RuleCall)) {
                            voNameNode = voNameNode.nextSibling
                        }
                        if (voNameNode !== null) {
                            emission.reference.link((voNameNode.getCrossRefNodeAsString(true)?:"").split("\\.").map[
                                // Name might include array or binding brackets -> drop
                                it.replaceAll("\\s|\\[.*\\]|<.*>|\\(.*\\)","").trim()
                            ])
                            val vo = emission.reference.lowermostReference.valuedObject
                            if (vo !== null && (vo.eContainer instanceof ReferenceDeclaration || vo.eContainer instanceof MethodDeclaration)) {
                                toConvert += emission
                            }
                        }
                    }
                    //println(" is " + (toConvert.contains(emission) ? "VOR" : "Emit"))
                }
            }
        }
        for (emission : toConvert) {
            val refCall = effFactory.createReferenceCallEffect
            refCall.annotations.addAll(emission.annotations)
            refCall.valuedObject = emission.reference.valuedObject
            refCall.indices += emission.reference.indices
            refCall.subReference = emission.reference.subReference
            
            refCall.parameters.add(expFactory.createParameter => [
                expression = emission.newValue
            ])
            emission.replace(refCall)
            emission.addTagAnnotation(ANNOTATION)
        }
    }
    
    private def void link(ValuedObjectReference ref, Iterable<String> names) {
        val candidates = getScope(ref, expPackage.valuedObjectReference_ValuedObject)
        if (candidates !== null) {
            var name = names.head
            if (!name.nullOrEmpty) {
                val candidate = candidates.getSingleElement(name.toQualifiedName)
                if (candidate !== null) {
                    val vo = candidate.EObjectOrProxy
                    if (vo instanceof ValuedObject) {
                        ref.valuedObject = vo
                    }
                }
            }
        }
        if (ref.subReference !== null) {
            ref.subReference.link(names.drop(1))
        }
    }
}
