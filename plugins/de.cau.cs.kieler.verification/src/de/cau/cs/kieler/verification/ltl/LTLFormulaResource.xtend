/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2023 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.verification.ltl

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.keffects.Assignment
import de.cau.cs.kieler.kexpressions.keffects.Emission
import de.cau.cs.kieler.kexpressions.keffects.extensions.KEffectsExtensions
import de.cau.cs.kieler.verification.ltl.lTLFormula.LTLExpression
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.CrossReference
import org.eclipse.xtext.linking.lazy.LazyLinkingResource
import org.eclipse.xtext.parser.IParseResult
import java.util.ArrayList
import java.util.HashSet

/**
 * @author jep
 * 
 */
class LTLFormulaResource extends LazyLinkingResource {

    @Accessors
    var boolean standaloneParse = false;

    extension KExpressionsFactory kExpressionsFactory = KExpressionsFactory.eINSTANCE
    @Inject extension KEffectsExtensions

    override updateInternalState(IParseResult newParseResult) {
        if (standaloneParse) {
            val voMap = <String, ValuedObject>newHashMap
            val names = new HashSet<String>()
            var enumFlag = ""
            for (node : newParseResult.rootNode.asTreeIterable.filter[grammarElement instanceof CrossReference]) {
                val elem = node.semanticElement
                val voName = node.text.trim
                if (enumFlag !== "") {
                    names.add(enumFlag + voName)
                    enumFlag = ""
                } else if (node.nextSibling !== null && node.nextSibling.text == ".") {
                    enumFlag = voName + "."
                } else {
                    names.add(voName)
                }

                if (!voMap.containsKey(voName)) {
                    voMap.put(voName, createValuedObject => [name = voName])
                }

                // Manual linking
                switch (elem) {
                    Assignment: {
                        elem.valuedObject = voMap.get(voName)
                    }
                    Emission: {
                        elem.valuedObject = voMap.get(voName)
                    }
                    ValuedObjectReference: {
                        elem.valuedObject = voMap.get(voName)
                    }
                    default:
                        throw new IllegalArgumentException("Unsupported reference type " + elem.eClass)
                }
            }

            val root = newParseResult.rootASTElement as LTLExpression
            if (root !== null) {
                root.declarations += createVariableDeclaration => [
                    type = ValueType.UNKNOWN;
                    valuedObjects.addAll(voMap.values)
                ]
                root.variableNames.addAll(names.toList)
            }
        }

        super.updateInternalState(newParseResult)
    }

    override protected doLinking() {
        if (!standaloneParse) { // Linking was already done in standalone mode
            super.doLinking
        }
    }

}
