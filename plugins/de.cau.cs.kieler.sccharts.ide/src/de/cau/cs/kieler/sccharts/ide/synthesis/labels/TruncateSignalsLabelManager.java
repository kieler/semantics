/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.ide.synthesis.labels;

import java.util.Arrays;
import java.util.List;

import de.cau.cs.kieler.klighd.labels.management.IdentLabelManager;

/**
 * Label manager that shortens every Signal a bit, instead cutting of the end of the whole
 * transition label.
 * 
 * @author ybl
 */
public class TruncateSignalsLabelManager extends IdentLabelManager { // AbstractKlighdLabelManager {

    /** Operators used in transition labels. */
    private final static List<String> OPERATORS = Arrays.asList(new String[] { "<<", ">>", ">>>",
            "<=", ">=", "==", "!=", "&", "^", "|", "&&", "||", "?", "=", "+=", "-=", "*=", "/=",
            "%=", "&=", "^=", "|=", "<<=", ">>=", ">>>=", ";", "~", "!", "*", "/", "%", "+", "-",
            "<", ">" });

    /**
     * {@inheritDoc}
     */
//    @Override
//    public String resizeLabel(ElkLabel label, double targetWidth) {
//        FontData fontData = LabelManagementUtil.fontDataFor(label);
//        int numOperators = countOperators(label.getText());
//        targetWidth = targetWidth / (numOperators + 2);
//        String result = "";
//        String[] labelParts = label.getText().split(" ");
//        String nextToShorten = "";
//
//        for (String labelPart : labelParts) {
//            if (!OPERATORS.contains(labelPart)) {
//                nextToShorten += labelPart + " ";
//            } else {
//                result += LabelManagementUtil.findFittingString(nextToShorten, fontData, targetWidth)
//                        + "... ";
//                result += labelPart + " ";
//                nextToShorten = "";
//            }
//        }
//
//        result += LabelManagementUtil.findFittingString(nextToShorten, fontData, targetWidth) + "... ";
//        
//        return result;
//    }

    /**
     * Counts the number of operators in the given string.
     * 
     * @param text
     *            the label text.
     * @return number of operators.
     */
//    private int countOperators(final String text) {
//        String[] labelParts = text.split(" ");
//        int cnt = 0;
//
//        for (String labelPart : labelParts) {
//            if (OPERATORS.contains(labelPart)) {
//                cnt++;
//            }
//        }
//
//        return cnt;
//    }
}
