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
package de.cau.cs.kieler.sccharts.klighd;

import java.util.Arrays;
import java.util.LinkedList;

import de.cau.cs.kieler.core.kgraph.KLabel;
import de.cau.cs.kieler.klighd.labels.AbstractKlighdLabelManager;

/**
 * @author ybl
 *
 */
public class TruncatingOperatorsLabelManager extends AbstractKlighdLabelManager {

    public TruncatingOperatorsLabelManager(final boolean initiallyActive) {
        super(initiallyActive);

    }

    private final static String[] OPERATORS = { "~", "!", "*", "/", "%", "+", "-", "<<", ">>",
            ">>>", "<", ">", "<=", ">=", "==", "!=", "&", "^", "|", "&&", "||", "?", "=", "+=",
            "-=", "*=", "/=", "%=", "&=", "^=", "|=", "<<=", ">>=", ">>>=", ";" };

    /**
     * {@inheritDoc}
     */
    @Override
    public String resizeLabel(KLabel label, double targetWidth) {
        LinkedList<String> deleteEntriesList = new LinkedList<String>();
        String resultText = label.getText();

        //delete all operators
        for (String entry : OPERATORS) {
            resultText= resultText.replace(entry, "");            
        }

        //delete true, false and all numbers
        LinkedList<String> textList =
                new LinkedList<String>(Arrays.asList(resultText.trim().split(" ")));
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
        
        //retransform the list to string and add commata
        resultText = "";
        for (String textPart : textList) {
            if (!(textPart.equals("") || resultText.contains(textPart))) {
                resultText += (textPart.contains(":")) ? textPart + " " : textPart.trim() + ", ";
            }
        }
        resultText = resultText.substring(0, resultText.length() - 2);
        return resultText;
    }
}
