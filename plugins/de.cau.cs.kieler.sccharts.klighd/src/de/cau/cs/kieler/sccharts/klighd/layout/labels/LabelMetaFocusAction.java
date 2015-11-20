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
package de.cau.cs.kieler.sccharts.klighd.layout.labels;

import java.util.ArrayList;
import java.util.Iterator;

import com.google.common.collect.Iterators;

import de.cau.cs.kieler.core.kgraph.KLabel;
import de.cau.cs.kieler.core.krendering.KRendering;
import de.cau.cs.kieler.core.krendering.KText;
import de.cau.cs.kieler.kiml.klayoutdata.KLayoutData;
import de.cau.cs.kieler.klighd.IAction;
import de.cau.cs.kieler.klighd.labels.KlighdLabelProperties;

/**
 * Moves labels into focus that contain a selected signal name.
 * 
 * @author ybl
 */
public class LabelMetaFocusAction implements IAction {

    /** This action's ID as registered with KLighD. */
    public static final String ID = "de.cau.cs.kieler.sccharts.klighd.layout.labels.LabelMetaFocusAction";
    
    
    private ArrayList<KLabel> lastSelectedLabels = new ArrayList<KLabel>();

    /**
     * {@inheritDoc}
     */
    public ActionResult execute(final ActionContext context) {
        KRendering elem = context.getKRendering();

        // We're only interested in KTexts
        if (elem instanceof KText) {
            String selectedSignal = ((KText) elem).getText().trim();
            
            // Check if this KText contains the signal's name rather than a value or whatever horrible
            // thing people can conceive of
            if (!selectedSignal.contains("=")) {
                // Unfocussed our hitherto focussed elements
                for (KLabel lastSelectedLabel : lastSelectedLabels) {
                    lastSelectedLabel.getData(KLayoutData.class).setProperty(
                            KlighdLabelProperties.ELEMENT_IN_FOCUS, false);
                }
                lastSelectedLabels.clear();
                
                // Iterate through labels and set focus
                Iterator<KLabel> graphLabelsIterator = Iterators.filter(
                        context.getViewContext().getViewModel().eAllContents(),
                        KLabel.class);
                
                while (graphLabelsIterator.hasNext()) {
                    KLabel currentLabel = graphLabelsIterator.next();
                    String labelText = currentLabel.getText();
                    
                    // TODO Labels that only consist of a single letter are not okay yet
                    if (labelText.contains(selectedSignal)) {
                        currentLabel.getData(KLayoutData.class).setProperty(
                                KlighdLabelProperties.ELEMENT_IN_FOCUS, true);
                        lastSelectedLabels.add(currentLabel);

                    }
                }

            }
        }
        
        return ActionResult.createResult(true);
    }

}
