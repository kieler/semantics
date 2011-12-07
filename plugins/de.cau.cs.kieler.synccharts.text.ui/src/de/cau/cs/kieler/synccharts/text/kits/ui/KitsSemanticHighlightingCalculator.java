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

import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import de.cau.cs.kieler.core.annotations.text.ui.AnnotationsSemanticHighlightingCalculator;
import de.cau.cs.kieler.synccharts.text.actions.ui.ActionsSemanticHighlightingCalculator;

/**
 * Custom {@link ISemanticHighlightingCalculator} contributing to the Kits editor.
 * The required method {@link ISemanticHighlightingCalculator#provideHighlightingFor(XtextResource, IHighlightedPositionAcceptor)}
 * will be provided by the {@link AnnotationsSemanticHighlightingCalculator} for efficiency purposes
 * and delegates to {@link AnnotationsSemanticHighlightingCalculator#provideHighlightingFor(AbstractNode, IHighlightedPositionAcceptor)}
 * that can be specialized in order to added KITS specific highlighting configurations. 
 * 
 * @author chsch
 */
public class KitsSemanticHighlightingCalculator extends ActionsSemanticHighlightingCalculator {

//    @Inject
//    private KitsGrammarAccess g;
//
//    public void provideHighlightingFor(AbstractNode node, IHighlightedPositionAcceptor acceptor) {
//       // EObject grammarElement = node.getGrammarElement();
//       super.provideHighlightingFor(node, acceptor);
//    }
    
}
