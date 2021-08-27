/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scl.ui;

import de.cau.cs.kieler.kexpressions.ui.KExpressionsSemanticHighlightingCalculator;

/**
 * @author krat
 * 
 */
public class SclSemanticHighlightingCalculator extends KExpressionsSemanticHighlightingCalculator {
    
//    Semantic highlighting causes a crash on large files

//    /**
//     * {@inheritDoc}
//     */
//    public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator  ) {
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
//    }
}
