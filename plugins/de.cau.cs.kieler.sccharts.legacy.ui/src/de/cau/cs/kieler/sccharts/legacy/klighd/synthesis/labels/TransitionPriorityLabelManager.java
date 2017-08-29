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
package de.cau.cs.kieler.sccharts.legacy.klighd.synthesis.labels;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.elk.graph.ElkLabel;

import de.cau.cs.kieler.klighd.labels.AbstractKlighdLabelManager;

/**
 * A label manager that shortens transition labels to their priority, if any.
 * 
 * @author ybl
 * @author cds
 */
public class TransitionPriorityLabelManager extends AbstractKlighdLabelManager {

    /**
     * {@inheritDoc}
     */
    @Override
    public String resizeLabel(ElkLabel label, double targetWidth) {
        // Regular expression matches "<priority>: <stuff>" and extracts the <priority>" part
        Pattern pattern = Pattern.compile("(\\d+):.*");
        Matcher matcher = pattern.matcher(label.getText().trim());
        
        if (matcher.matches()) {
            // The new label is the priority followed by a period
            return matcher.group(1) + ".";
        } else {
            // The new label is the empty label
            return "/";
        }
    }

}
