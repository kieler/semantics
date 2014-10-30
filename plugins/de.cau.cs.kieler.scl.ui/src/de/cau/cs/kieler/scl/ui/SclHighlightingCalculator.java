package de.cau.cs.kieler.scl.ui;

import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import de.cau.cs.kieler.scl.scl.Assignment;
import de.cau.cs.kieler.scl.scl.EmptyStatement;

public class SclHighlightingCalculator implements ISemanticHighlightingCalculator {
    
    // Keywords that should not be highlighted
    private static final String IGNOREKEYWORD = ",;!=:{}|";

    /**
     * {@inheritDoc}
     */
    public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
        if (resource == null || resource.getParseResult() == null)
            return;

        INode root = resource.getParseResult().getRootNode();
      
        for (INode node : root.getAsTreeIterable()) {
            // highlighting for declaration
            if (node.getGrammarElement() instanceof EnumLiteralDeclaration) {
                acceptor.addPosition(node.getOffset(), node.getLength(),
                        SclHighlightingConfiguration.KEYWORD);
            }
            // highlighting for keywords
            else if (node.getGrammarElement() instanceof Keyword &&
                    !(IGNOREKEYWORD.contains(((Keyword) node.getGrammarElement()).getValue()))) {
                    System.out.println("Keyword: " + (Keyword)node.getGrammarElement());
                    acceptor.addPosition(node.getOffset(), node.getLength(),
                            SclHighlightingConfiguration.KEYWORD);
                }
            // highlighting for labels
            else if (node.getSemanticElement() instanceof EmptyStatement) {
                acceptor.addPosition(node.getOffset(), node.getLength(),
                        SclHighlightingConfiguration.LABEL);
            }
            // default
            else {
                acceptor.addPosition(node.getOffset(), node.getLength(),
                        SclHighlightingConfiguration.DEFAULT);
            }

        }
    }
}
