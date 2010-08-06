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
package de.cau.cs.kieler.synccharts.text.kits.formatting;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.util.Strings;

import de.cau.cs.kieler.synccharts.text.actions.formatting.ActionsValueConverter;

/**
 * Customized {@link IValueConverter}.
 * Realizes the mapping of special terminal symbols to model content.
 * 
 * @author chsch
 */
public class KitsValueConverter extends ActionsValueConverter {

	
    /**
     * Provides transition label converter dropping/attaching the leading/trailing character.
     * @return dedicated value converter
     */
    @ValueConverter(rule = "TRANSITION_LABEL")
	public IValueConverter<String> TransitionLabalString() {
		return new IValueConverter<String>() {

			public String toValue(String string, AbstractNode node) {
				return string.replace("%", "").trim();
			}

			public String toString(String value) {
				if (Strings.isEmpty(value)) {
					return null;
				} else {
					return "  % " + value + " %";
				}
			}
		};
    }

    
    /**
     * Provides comment annotation converter dropping/attaching the leading/trailing characters.
     * @return dedicated value converter
     */
    @ValueConverter(rule = "COMMENT_ANNOTATION")
	public IValueConverter<String> CommentAnnotation() {
		return new IValueConverter<String>() {

			public String toValue(String string, AbstractNode node) {
				return string.replace("/+","").replace("+/", "").trim();
			}

			public String toString(String value) {
				if (Strings.isEmpty(value)) {
					return null;
				} else {
					return "/+ " + value + " +/";
				}
			}
		};
    }

    
    /**
     * Provides annotation key converter dropping/attaching the leading '@'.
     * @return dedicated value converter
     */
    @ValueConverter(rule = "ANNOTATION_KEY")
	public IValueConverter<String> AnnotationKey() {
		return new IValueConverter<String>() {

			public String toValue(String string, AbstractNode node) {
				return string.replace("@","");
			}

			public String toString(String value) {
				if (Strings.isEmpty(value)) {
					return null;
				} else {
					return "@" + value;
				}
			}
		};
    }

    

}
