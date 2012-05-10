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

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;

import de.cau.cs.kieler.synccharts.text.actions.ui.ActionsAntlrTokenToAttributeIdMapper;

/**
 * Custom {@link AbstractAntlrTokenToAttributeIdMapper} contributing to the Kits editor. Defines
 * custom mappings of keywords and terminals to highlighting configurations.
 * 
 * @author chsch
 */
public class KitsAntlrTokenToAttributeIdMapper extends ActionsAntlrTokenToAttributeIdMapper {

    protected String calculateId(String tokenName, int tokenType) {
        if ("'-->'".equals(tokenName)) {
            return DefaultHighlightingConfiguration.KEYWORD_ID;
        }
        if ("'>->'".equals(tokenName)) {
            return DefaultHighlightingConfiguration.KEYWORD_ID;
        }

        return super.calculateId(tokenName, tokenType);
    }
}
