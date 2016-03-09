/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.klighd.synthesis.labels;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.common.base.Joiner;

import de.cau.cs.kieler.core.kgraph.KLabel;
import de.cau.cs.kieler.klighd.labels.AbstractKlighdLabelManager;

/**
 * Label manager that shortens transition labels to the list of signals they contain.
 * 
 * @author ybl
 */
public class ShortenToSignalsLabelManager extends AbstractKlighdLabelManager {

    /** The operators recognized by transition labels. */
    private final static String[] OPERATORS = new String[] { "<<", ">>", ">>>",
            "<=", ">=", "==", "!=", "&", "^", "|", "&&", "||", "?", "=", "+=", "-=", "*=", "/=",
            "%=", "&=", "^=", "|=", "<<=", ">>=", ">>>=", ";", "~", "!", "*", "/", "%", "+", "-",
            "<", ">", "[", "]", "(", ")" };

    /**
     * {@inheritDoc}
     */
    @Override
    public String resizeLabel(KLabel label, double targetWidth) {
    	// Put together a regular expression to identify things that are not operands, but operators
    	StringBuilder regexp = new StringBuilder(OPERATORS.length * 3);
    	regexp.append("\\s+");
    	
    	for (String operator : OPERATORS) {
    		regexp.append("|").append(Pattern.quote(operator));
    	}
    	
    	// We'll leave the priority untouched
    	String priorityPrefix = extractPriority(label.getText());
    	
    	// This is going to become our set of used signal names
    	Set<String> signals = new LinkedHashSet<>();
    	
    	// Iterate over each operand and check what it is (we remove the priority prefix)
    	String[] operands = label.getText().substring(priorityPrefix.length()).split(regexp.toString());
    	boolean inHostCode = false;
    	for (String operand : operands) {
    		String trimmedOperand = operand.trim();
    		
    		// Empty operands are bad operands
    		if (trimmedOperand.isEmpty()) {
    			continue;
    		}
    		
    		// Check if the current operand starts a host code call
    		if (trimmedOperand.startsWith("'")) {
    			inHostCode = true;
    			continue;
    		}
    		
    		// If we're currently in host code, we wait for it to be over...
    		if (inHostCode) {
    			if (trimmedOperand.endsWith("'")) {
    				inHostCode = false;
    				continue;
    			}
    		} else {
    			// true and false are not signals
    			if ("true".equals(trimmedOperand) || "false".equals(trimmedOperand)) {
    				continue;
    			}
    			
    			// Check if it's a number
    			try {
    				Double.valueOf(trimmedOperand);
    				continue;
    			} catch (NumberFormatException e) {
    				// It's not a number, so continue
    			}
    			
    			signals.add(trimmedOperand);
    		}
    	}
    	
    	return priorityPrefix + " " + Joiner.on(", ").join(signals);
    }
    
    /**
     * Returns the priority part of the given label text, if any.
     * 
     * @param labelText the label text.
     * @return the priority portion of the label text, without any surrounding whitespace. Can be empty.
     */
	private String extractPriority(String labelText) {
		Pattern pattern = Pattern.compile("\\d+:");
		Matcher matcher = pattern.matcher(labelText);
		
		if (matcher.find()) {
			// Make sure the label text starts with the pattern
			if (matcher.start() == 0) {
				return labelText.substring(0, matcher.end());
			}
		}
		
		return "";
	}
}
