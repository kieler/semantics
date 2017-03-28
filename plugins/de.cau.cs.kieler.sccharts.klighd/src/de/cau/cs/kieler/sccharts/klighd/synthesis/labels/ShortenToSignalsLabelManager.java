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

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import de.cau.cs.kieler.klighd.kgraph.KLabel;
import de.cau.cs.kieler.klighd.labels.AbstractKlighdLabelManager;

/**
 * Label manager that shortens transition labels to the list of signals they contain.
 * 
 * @author ybl
 */
public class ShortenToSignalsLabelManager extends AbstractKlighdLabelManager {

    /** Operators used in transition labels. */
    private final static List<String> OPERATORS = Arrays.asList(new String[] { "<<", ">>", ">>>",
            "<=", ">=", "==", "!=", "&", "^", "|", "&&", "||", "?", "=", "+=", "-=", "*=", "/=",
            "%=", "&=", "^=", "|=", "<<=", ">>=", ">>>=", ";", "~", "!", "*", "/", "%", "+", "-",
            "<", ">" });

    /**
     * {@inheritDoc}
     */
    @Override
    public String resizeLabel(KLabel label, double targetWidth) {
        LinkedList<String> deleteEntriesList = new LinkedList<String>();
        String resultText = label.getText();

        // Delete all operators
        for (String entry : OPERATORS) {
            resultText = resultText.replace(entry, "");
        }

        // Delete numbers
        LinkedList<String> textList = new LinkedList<String>(
                Arrays.asList(resultText.trim().split(" ")));
        
        for (String textPart : textList) {
            try {
                Integer.valueOf(textPart);
                deleteEntriesList.add(textPart);
            } catch (NumberFormatException e) {
                if (textPart.equals("true") || textPart.equals("false")) {
                    deleteEntriesList.add(textPart);
                }
            }
        }
        
        for (String entry : deleteEntriesList) {
            while (textList.remove(entry)) {
            }
        }

        // Retransform the list to string and add commata
        resultText = "";
        boolean hostCode = false;
        for (String textPart : textList) {
            if (textPart.contains("(")) {
                hostCode = true;
            } else if (textPart.contains(")")) {
                hostCode = false;
            }

            if (!(textPart.equals("") || resultText.contains(textPart))) {
                // no empty textpart and no doubled textParts are added
                if ((textPart.contains(":")) || hostCode) {
                    resultText += textPart + " ";
                } else {

                    resultText += textPart.trim() + ", ";
                }
            }
        }
        
        if (!textList.isEmpty() && !textList.get(0).equals("")) {
            // remove last comma
            resultText = resultText.substring(0, resultText.length() - 2);
        }
        
        return resultText;
    }
}
