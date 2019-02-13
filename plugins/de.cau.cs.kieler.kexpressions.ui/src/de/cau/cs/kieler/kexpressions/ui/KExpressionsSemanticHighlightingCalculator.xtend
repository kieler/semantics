/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kexpressions.ui

import de.cau.cs.kieler.annotations.ui.AnnotationsSemanticHighlightingCalculator
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElement
import de.cau.cs.kieler.kexpressions.ReferenceCall
import de.cau.cs.kieler.kexpressions.FunctionCall
import de.cau.cs.kieler.kexpressions.services.KExpressionsGrammarAccess
import com.google.inject.Inject
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.CrossReference
import de.cau.cs.kieler.kexpressions.keffects.Emission
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.keffects.converter.KEffectsEmissionReferenceCallConverter
import de.cau.cs.kieler.annotations.ui.AnnotationsHighlightingConfiguration

/** 
 * @author ssm
 */
class KExpressionsSemanticHighlightingCalculator extends AnnotationsSemanticHighlightingCalculator {

    @Inject
    extension AnnotationsExtensions
    
    @Inject
    var KExpressionsGrammarAccess g

    override void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor,
        CancelIndicator cancelIndicator) {
        if(resource === null || resource.getParseResult() === null) return;
        var INode root = resource.getParseResult().getRootNode()
        for (INode node : root.getAsTreeIterable()) {
            if (node instanceof CompositeNodeWithSemanticElement) {
                val sem = node.semanticElement
                if (sem instanceof Emission) {
                    if (sem.hasAnnotation(KEffectsEmissionReferenceCallConverter.ANNOTATION)) { // Was converted to ReferenceCall
                        var highlightNode = node.firstChild
                        while (highlightNode !== null && !(highlightNode.grammarElement instanceof RuleCall) && !(highlightNode.grammarElement instanceof CrossReference)) {
                            highlightNode = highlightNode.nextSibling
                        }
                        if (highlightNode !== null) {
                            acceptor.addPosition(highlightNode.getOffset(), highlightNode.getLength(), KExpressionsHighlightingConfiguration.CALL)
                        }
                    }
                } else if (sem instanceof ReferenceCall) {
                    if (sem.eContainer !== null) {
                        var highlightNode = node.firstChild
                        while (highlightNode !== null && !(highlightNode.grammarElement instanceof CrossReference)) {
                            highlightNode = highlightNode.nextSibling
                        }
                        if (highlightNode !== null) {
                            acceptor.addPosition(highlightNode.getOffset(), highlightNode.getLength(), KExpressionsHighlightingConfiguration.CALL)
                        }
                    }
                } else if (sem instanceof FunctionCall) {
                    var highlightNode = node.firstChild
                    while (highlightNode !== null && !(highlightNode.grammarElement instanceof RuleCall)) {
                        highlightNode = highlightNode.nextSibling
                    }
                    if (highlightNode !== null) {
                        acceptor.addPosition(highlightNode.getOffset(), highlightNode.getLength(), KExpressionsHighlightingConfiguration.CALL)
                    }
                }
            }
        }
        super.provideHighlightingFor(resource, acceptor, cancelIndicator)
    }
    
    override provideHighlightingFor(INode node, IHighlightedPositionAcceptor acceptor) {
        super.provideHighlightingFor(node, acceptor)
        
        val grammarElement = node.getGrammarElement();
        if (grammarElement == g.jsonPragmaAccess.numberSignKeyword_0 ||
            grammarElement == g.jsonPragmaAccess.nameExtendedIDParserRuleCall_1_0) {
            acceptor.addPosition(node.getOffset(), node.getLength(),
                    AnnotationsHighlightingConfiguration.PRAGMA_KEY);
        }
        if (grammarElement == g.jsonAnnotationAccess.commercialAtKeyword_0 ||
            grammarElement == g.jsonAnnotationAccess.nameExtendedIDParserRuleCall_1_0) {
            acceptor.addPosition(node.getOffset(), node.getLength(),
                    AnnotationsHighlightingConfiguration.ANNOTATION_KEY);
        }
    }
    
}
