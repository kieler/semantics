/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kitt.klighd.actions;

import java.util.List;

import org.eclipse.core.expressions.PropertyTester;

import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.kiml.klayoutdata.KLayoutData;
import de.cau.cs.kieler.kitt.klighd.tracing.TracingProperties;
import de.cau.cs.kieler.kitt.tracingtree.ModelWrapper;
import de.cau.cs.kieler.klighd.internal.util.KlighdInternalProperties;

/**
 * PropertyTester to check if a selected KNode contains appropriate properties for tracing actions.
 * 
 * @author als
 * @kieler.design 2014-08-26 proposed
 * @kieler.rating 2014-08-26 proposed yellow
 */
public class TracingSelectionEnablePropertyTester extends PropertyTester {

    public final String NAMESPACE = "de.cau.cs.kieler.kitt.klighd.enable.select.property";
    public final String SOURCE = "source";
    public final String TARGET = "target";
    public final String NONE = "none";

    /**
     * Standard Constructor
     */
    public TracingSelectionEnablePropertyTester() {
    }

    /**
     * {@inheritDoc}
     */
    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
        try {
            // Get KNode if menu is in KLighD context
            KNode node = (KNode) (((List) receiver).get(0));
            if (node != null) {
                KLayoutData data = node.getData(KLayoutData.class);
                if (data != null) {
                    // check click on node representing a submodel
                    if (data.getProperty(TracingProperties.TRACED_MODEL_ROOT_NODE)
                            || data.getProperty(KlighdInternalProperties.MODEL_ELEMEMT) instanceof ModelWrapper) {
                        // test source menu entry and node is not already marked as target
                        if (property.equals(NONE)) {
                            return true;
                        } else if ((property.equals(SOURCE) || property.equals(TARGET))
                                && !data.getProperty(TracingProperties.TRACING_TARGET_SELECTION)
                                && !data.getProperty(TracingProperties.TRACING_SOURCE_SELECTION)) {
                            return true;
                        }
                    }
                }
            }
        } catch (Exception e) {
            // fall-through return false
        }
        return false;
    }

}
