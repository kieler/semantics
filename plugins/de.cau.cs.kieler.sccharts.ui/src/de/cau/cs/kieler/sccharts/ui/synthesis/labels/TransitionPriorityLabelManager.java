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
package de.cau.cs.kieler.sccharts.ui.synthesis.labels;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.elk.graph.ElkLabel;
import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.klighd.krendering.KRenderingOptions;
import de.cau.cs.kieler.klighd.internal.util.KlighdInternalProperties;
import de.cau.cs.kieler.klighd.kgraph.KLabel;
import de.cau.cs.kieler.klighd.krendering.KRendering;
import de.cau.cs.kieler.klighd.krendering.KRenderingRef;
import de.cau.cs.kieler.klighd.labels.decoration.LabelDecorationConfigurator;
import de.cau.cs.kieler.klighd.labels.management.AbstractKlighdLabelManager;
import de.cau.cs.kieler.sccharts.Transition;

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
    public Result doResizeLabel(ElkLabel label, double targetWidth) {

        // Find the corresponding source model element
        // Grab the rendering from the label
        KRendering rendering = label.getProperty(KRenderingOptions.K_RENDERING);
        if (rendering instanceof KRenderingRef) {
            // Evaluate the rendering reference if needed
            rendering = ((KRenderingRef) rendering).getRendering();
        }
        // Make sure we have a rendering
        if (rendering != null) {
            EObject container = rendering.eContainer();
            // Check the type of the container of the KText. This should be a KLabel.
            if (container instanceof KLabel) {
                KLabel kLabel = (KLabel) container;
                // Try to find the model element
                Object modelObject = kLabel.getProperty(KlighdInternalProperties.MODEL_ELEMEMT);
                if (modelObject instanceof Transition) {
                    // This is the case for sccharts transitions
                    Pattern pattern = Pattern.compile("(\\d+):.*");
                    Matcher matcher = pattern.matcher(label.getText().trim());
                    // Regular expression matches "<priority>: <stuff>" and extracts the 
                    // <priority> part

                    if (matcher.matches()) {
                        // The new label is the priority followed by a period
                        return Result.modified(matcher.group(1) + ".");
                    } else {
                        // If no priority available
                        kLabel.setText("");
                        LabelDecorationConfigurator.create().applyTo(kLabel);
                        return Result.modified("");
                    }
                }
            }
        }
        
        // Fallback case: Remove label completely
        return Result.modified("");
    }
}
