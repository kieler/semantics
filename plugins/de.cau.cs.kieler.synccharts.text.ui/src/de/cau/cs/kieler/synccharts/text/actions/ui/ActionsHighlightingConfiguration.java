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
package de.cau.cs.kieler.synccharts.text.actions.ui;

import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;

import de.cau.cs.kieler.core.annotations.text.ui.AnnotationsHighlightingConfiguration;

/**
 * Custom {@link IHighlightingConfiguration} contributing to the Actions editor. The required method
 * {@link IHighlightingConfiguration#configure(org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor)}
 * will be provided by the {@link AnnotationsHighlightingConfiguration} and can be specialized in
 * order to add Actions specific highlighting profiles.
 * 
 * The Actions specific stuff is used in the KITS-View, a plain actions editor is not provided.
 * 
 * @author chsch
 */
public class ActionsHighlightingConfiguration extends
		AnnotationsHighlightingConfiguration {

//	public void configure(IHighlightingConfigurationAcceptor acceptor) {
//		super.configure(acceptor);
//	}		
}
