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
package de.cau.cs.kieler.synccharts.text.kits.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import com.google.inject.Inject;

import de.cau.cs.kieler.synccharts.text.kits.services.KitsGrammarAccess;

/**
 * Custom {@link ISemanticHighlightingCalculator} contributing to the Kits editor.
 * 
 * @author chsch
 */
public class KitsSemanticHighlightingCalculator implements
		ISemanticHighlightingCalculator {

	@Inject
	private KitsGrammarAccess g;
	
	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		
		Iterable<AbstractNode> allNodes = NodeUtil.getAllContents(resource.getParseResult().getRootNode());
		EObject grammarElement = null;

		for (AbstractNode node : allNodes) {
			grammarElement = node.getGrammarElement();
			
			// color '@' keywords and annotation keys (names) like 'layouter' config 
			if (grammarElement == g.getTagAnnotationAccess().getCommercialAtKeyword_0()
				|| grammarElement == g.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()
                || grammarElement == g.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0()
                || grammarElement == g.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0()
                || grammarElement == g.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0()
                || grammarElement == g.getTagAnnotationAccess().getNameIDTerminalRuleCall_1_0()
                || grammarElement == g.getKeyStringValueAnnotationAccess().getNameIDTerminalRuleCall_1_0()
                || grammarElement == g.getKeyBooleanValueAnnotationAccess().getNameIDTerminalRuleCall_1_0()
                || grammarElement == g.getKeyIntValueAnnotationAccess().getNameIDTerminalRuleCall_1_0()
                || grammarElement == g.getKeyFloatValueAnnotationAccess().getNameIDTerminalRuleCall_1_0()) {
				acceptor.addPosition(node.getOffset(), node.getLength(), KitsHighlightingConfiguration.ANNOTATION_KEY);
			}
			
			// color the annotation values like 'true' or '/** comment */' 
			if (grammarElement == g.getKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_2_0()) {
				acceptor.addPosition(node.getOffset(), node.getLength(), KitsHighlightingConfiguration.COMMENT_ANNOTATION);
			}
			
		}
	}

}
