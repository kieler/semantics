/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.annotations.text.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import com.google.inject.Inject;

import de.cau.cs.kieler.core.annotations.text.services.AnnotationsGrammarAccess;

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
        Iterable<INode> allNodes = resource.getParseResult().getRootNode().getAsTreeIterable();
        for (INode node : allNodes) {
            provideHighlightingFor(node, acceptor);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void provideHighlightingFor(final INode node, final IHighlightedPositionAcceptor acceptor) {
        EObject grammarElement = node.getGrammarElement();

        // CHECKSTYLEOFF LineLength
        
        // highlight the annotation keys (names) like 'layouter' according to
        //   AnnotationsHighlightingConfiguration.ANNOTATION_KEY
        if (grammarElement == g.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()
                || grammarElement == g.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()
                || grammarElement == g.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()
                || grammarElement == g.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()
                || grammarElement == g.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()
                || grammarElement == g.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()) {
            acceptor.addPosition(node.getOffset(), node.getLength(),
                    AnnotationsHighlightingConfiguration.ANNOTATION_KEY);
        }
        
        // highlight the annotation value according to
        //   AnnotationsHighlightingConfiguration.COMMENT_ANNOTATION
        if (grammarElement == g.getKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_2_0()
                || grammarElement == g.getTypedKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_5_0()
                || grammarElement == g.getKeyBooleanValueAnnotationAccess().getValueBOOLEANTerminalRuleCall_2_0()
                || grammarElement == g.getKeyIntValueAnnotationAccess().getValueINTTerminalRuleCall_2_0()
                || grammarElement == g.getKeyFloatValueAnnotationAccess().getValueFLOATTerminalRuleCall_2_0()) {
            acceptor.addPosition(node.getOffset(), node.getLength(),
                    AnnotationsHighlightingConfiguration.COMMENT_ANNOTATION);
        }

        // CHECKSTYLEON LineLength
    }
}
