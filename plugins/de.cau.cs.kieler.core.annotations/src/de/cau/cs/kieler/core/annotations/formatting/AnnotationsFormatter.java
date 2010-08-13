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
package de.cau.cs.kieler.core.annotations.formatting;

import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;

import de.cau.cs.kieler.core.annotations.services.AnnotationsGrammarAccess;

/**
 * This class contains custom formatting description.
 * 
 * @author chsch
 */
public class AnnotationsFormatter extends AbstractDeclarativeFormatter {
	
    /**
     * Delegates to customConfigureFormatting.
     */
	@Override
	protected void configureFormatting(FormattingConfig c) {
		customConfigureFormatting(c, (AnnotationsGrammarAccess) getGrammarAccess());
	}
	
	/**
	 * Method contains actual formatting instructions while GrammarAccess class
	 * maybe parameterized allowing the reuse within ExpressionsFormatter. 
	 * @param c FormattingConfig provided by caller
	 * @param f GrammarAccess provided by caller
	 */
	protected void customConfigureFormatting(FormattingConfig c, AnnotationsGrammarAccess f) {
            c.setLinewrap(0, 1, 2).before(f.getSL_COMMENTRule());
            c.setLinewrap(0, 1, 2).before(f.getML_COMMENTRule());
            c.setLinewrap(0, 1, 1).after(f.getML_COMMENTRule());
            
            c.setLinewrap().after(f.getStringAnnotationRule());
            c.setLinewrap().after(f.getCOMMENT_ANNOTATIONRule());
            c.setLinewrap().after(f.getKeyValueAnnotationRule());
            
            c.setNoSpace().after(f.getKeyValueAnnotationAccess().getCommercialAtKeyword_0());
            c.setLinewrap().after(f.getKeyValueAnnotationAccess().getValueEStringParserRuleCall_2_0());
            
            c.setLinewrap().after(f.getImportAnnotationRule());
	}
}
