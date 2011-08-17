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

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;

/**
 * Custom {@link AbstractAntlrTokenToAttributeIdMapper} contributing to the Kits editor.
 * Defines custom mappings of keywords and terminals to highlighting configurations.  
 * 
 * The Actions specific stuff is used in the KITS-View, a plain actions editor is not provided.
 * 
 * @author chsch
 */
public class ActionsAntlrTokenToAttributeIdMapper extends
		DefaultAntlrTokenToAttributeIdMapper {
	
	protected String calculateId(String tokenName, int tokenType) {
		if ("RULE_TRANSITION_LABEL".equals(tokenName)) {
			return DefaultHighlightingConfiguration.COMMENT_ID;
		}
		if ("RULE_COMMENT_ANNOTATION".equals(tokenName)) {
			return ActionsHighlightingConfiguration.COMMENT_ANNOTATION;
		}
		if ("RULE_ANNOTATION_KEY".equals(tokenName)) {
			return ActionsHighlightingConfiguration.ANNOTATION_KEY;
		}
		
		return super.calculateId(tokenName, tokenType);
	}

}
