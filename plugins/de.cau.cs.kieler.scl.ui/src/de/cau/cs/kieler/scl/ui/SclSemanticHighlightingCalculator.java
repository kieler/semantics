/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scl.ui;

import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;

import de.cau.cs.kieler.core.kexpressions.ui.KExpressionsSemanticHighlightingCalculator;
import de.cau.cs.kieler.scl.scl.EmptyStatement;

/**
 * @author krat
 * 
 */
public class SclSemanticHighlightingCalculator extends KExpressionsSemanticHighlightingCalculator {
    

    /**
     * {@inheritDoc}
     */
    public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
        super.provideHighlightingFor(resource, acceptor);
        // Semantic highlighting causes a crash on large files
//        if (resource == null || resource.getParseResult() == null)
//            return;
//
//        INode root = resource.getParseResult().getRootNode();
//      
//        for (INode node : root.getAsTreeIterable()) {
//            // highlighting for labels
//            if (node.getSemanticElement() instanceof EmptyStatement) {
//                acceptor.addPosition(node.getOffset(), node.getLength(),
//                        SclHighlightingConfiguration.LABEL);
//            } else {
//                super.provideHighlightingFor(resource, acceptor);
//            }
//        }
    }
}
