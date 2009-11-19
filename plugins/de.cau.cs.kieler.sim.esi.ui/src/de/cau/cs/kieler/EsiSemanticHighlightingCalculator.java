package de.cau.cs.kieler;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.common.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import de.cau.cs.kieler.esi.signal;

public class EsiSemanticHighlightingCalculator implements
		ISemanticHighlightingCalculator {

	// Dummy-Highlighting
	// of each block of 10 characters the last 5 are to be highlighted
	// this is not semantic but very briefly illustrates what kind of
	// information is processed
	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		Iterable<AbstractNode> allNodes = NodeUtil.getAllContents(resource
				.getParseResult().getRootNode());
		for (AbstractNode abstractNode : allNodes) {
			if (abstractNode.getGrammarElement() instanceof signal) {
				acceptor.addPosition(abstractNode.getOffset(), abstractNode
						.getLength(),
						EsiSemanticHighlightingConfiguration.DUMMYHL);
			}
			/*
			 * if (resource.getContents().size() > 0) { // fetch the model
			 * EObject m = (EObject) resource.getContents().get(0); // fetch the
			 * length of the input file int l =
			 * NodeUtil.getNodeAdapter(m).getParserNode().getLength();
			 * 
			 * for (int i = 10; i < l; i = i + 5) { // parameters: offset to
			 * begin highlighting, lenght, style id // the TextAttributeProvider
			 * can handle acceptor.addPosition(i - 2, 2,
			 * EsiSemanticHighlightingConfiguration.DUMMYHL); } }
			 */

		}
	}
}
