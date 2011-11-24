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
package de.cau.cs.kieler.core.annotations.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import com.google.inject.Inject;

import de.cau.cs.kieler.core.annotations.services.AnnotationsGrammarAccess;

/**
 * Custom {@link ISemanticHighlightingCalculator} contributing to the Kits editor.
 * 
 * @author chsch
 */
public class AnnotationsSemanticHighlightingCalculator implements ISemanticHighlightingCalculator {

    @Inject
    private AnnotationsGrammarAccess g;

    public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
        Iterable<INode> allNodes = resource.getParseResult().getRootNode().getAsTreeIterable();
                //NodeUtil.getAllContents(resource.getParseResult().getRootNode());
        for (INode node : allNodes) {
            provideHighlightingFor(node, acceptor);
        }
    }

    public void provideHighlightingFor(INode node, IHighlightedPositionAcceptor acceptor) {
        EObject grammarElement = node.getGrammarElement();

        // colorize the whole annotations like '(@bool true)' or '/** comment */'
        if (grammarElement == g.getAnnotationAccess().getTagAnnotationParserRuleCall_1()
                || grammarElement == g.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_2()
                || grammarElement == g.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_3()
                || grammarElement == g.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_4()
                || grammarElement == g.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_5()
                || grammarElement == g.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_6()) {
            acceptor.addPosition(node.getOffset(), node.getLength(),
                    AnnotationsHighlightingConfiguration.COMMENT_ANNOTATION);
        }
        
        // overpaint the '@' keywords and annotation keys (names) like 'layouter' config
        if (grammarElement == g.getTagAnnotationAccess().getCommercialAtKeyword_0()
                || grammarElement == g.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()
                || grammarElement == g.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()
                || grammarElement == g.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0()
                || grammarElement == g.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0()
                || grammarElement == g.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0()
                || grammarElement == g.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()
                || grammarElement == g.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()
                || grammarElement == g.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()
                || grammarElement == g.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()
                || grammarElement == g.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()
                || grammarElement == g.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()) {
            acceptor.addPosition(node.getOffset(), node.getLength(),
                    AnnotationsHighlightingConfiguration.ANNOTATION_KEY);
        }

    }
}
