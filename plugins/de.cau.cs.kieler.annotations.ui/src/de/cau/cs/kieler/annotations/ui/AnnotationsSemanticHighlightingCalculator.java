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
package de.cau.cs.kieler.annotations.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import com.google.inject.Inject;

import de.cau.cs.kieler.annotations.services.AnnotationsGrammarAccess;

/**
 * Custom {@link ISemanticHighlightingCalculator} contributed to Xtext editors encompassing Annotations.
 * Must be registered in their «LanguageName»UiModules.
 * 
 * @author chsch
 */
public class AnnotationsSemanticHighlightingCalculator implements ISemanticHighlightingCalculator {

    @Inject
    private AnnotationsGrammarAccess g;

    /**
     * {@inheritDoc}
     */
    public void provideHighlightingFor(final XtextResource resource,
            final IHighlightedPositionAcceptor acceptor) {
    	if (resource != null)
    		if (resource.getParseResult() != null)
    			if (resource.getParseResult().getRootNode() != null) {
    				Iterable<INode> allNodes = resource.getParseResult().getRootNode().getAsTreeIterable();
    				for (INode node : allNodes) {
    					provideHighlightingFor(node, acceptor);
    				}
    			}
    }

    /**
     * A custom method to be specialized by clients that is called for each node.
     * It has been introduced in order to reduce avoidable iterations on the {@link INode} tree.

     * @param node the concrete syntax node to be examined for some special highlighting.
     * @param acceptor used to announce the mapping from text-range to the style's id. The acceptor will never be <code>null</code>.
     */
    public void provideHighlightingFor(final INode node, final IHighlightedPositionAcceptor acceptor) {
        EObject grammarElement = node.getGrammarElement();

        // CHECKSTYLEOFF LineLength
        
        // highlight the annotation keys (names) like 'layouter' according to
        //   AnnotationsHighlightingConfiguration.ANNOTATION_KEY
        if (grammarElement == g.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()
                || grammarElement == g.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()
                || grammarElement == g.getQuotedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()
                || grammarElement == g.getQuotedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_2_0()
                || grammarElement == g.getQuotedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_3_1_0()
                || grammarElement == g.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()
                || grammarElement == g.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_5_0()
                || grammarElement == g.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_6_1_0()
                || grammarElement == g.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()
                || grammarElement == g.getQuotedTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()
                || grammarElement == g.getQuotedTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()
                || grammarElement == g.getQuotedTypedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_5_0()
                || grammarElement == g.getQuotedTypedKeyStringValueAnnotationAccess().getValuesSTRINGTerminalRuleCall_6_1_0()) {
            acceptor.addPosition(node.getOffset(), node.getLength(),
                    AnnotationsHighlightingConfiguration.ANNOTATION_KEY);
        }
        
        // highlight the annotation value according to
        //   AnnotationsHighlightingConfiguration.COMMENT_ANNOTATION
        if (grammarElement == g.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_2_0()
                || grammarElement == g.getKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_3_1_0()
                || grammarElement == g.getTypedKeyStringValueAnnotationAccess().getValuesEStringAllTypesParserRuleCall_5_0()) {
            acceptor.addPosition(node.getOffset(), node.getLength(),
                    AnnotationsHighlightingConfiguration.COMMENT_ANNOTATION);
        }

        // CHECKSTYLEON LineLength
    }
}
