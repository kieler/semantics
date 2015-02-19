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

import java.util.WeakHashMap;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;

import de.cau.cs.kieler.core.kgraph.KGraphElement;
import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.kiml.klayoutdata.KLayoutData;
import de.cau.cs.kieler.klighd.IAction;
import de.cau.cs.kieler.klighd.IViewer;
import de.cau.cs.kieler.klighd.internal.util.KlighdInternalProperties;

/**
 * @author als
 * 
 */
public class MemorizedCollapseExpandAction implements IAction {

    public static final String ID =
            "de.cau.cs.kieler.kitt.klighd.actions.MemorizedCollapseExpandAction";
    private static final WeakHashMap<KGraphElement, Boolean> expandMap =
            new WeakHashMap<KGraphElement, Boolean>();

    public static Boolean isExpanded(final Object source, final Boolean defaultValue) {
        KGraphElement oldRepresentation =
                Iterators.find(expandMap.keySet().iterator(), new Predicate<KGraphElement>() {

                    public boolean apply(KGraphElement elem) {
                        KLayoutData data = elem.getData(KLayoutData.class);
                        if (data != null) {
                            Object objectsSource =
                                    data.getProperty(KlighdInternalProperties.MODEL_ELEMEMT);
                            if (source == objectsSource) {
                                return true;
                            }
                        }
                        return false;
                    }
                }, null);
        if (oldRepresentation != null) {
            Boolean returnValue = expandMap.get(oldRepresentation);
            if(returnValue != null){
                return returnValue;
            }
        }
        return defaultValue;
    }

    /**
     * {@inheritDoc}
     */
    public ActionResult execute(ActionContext context) {
        IViewer viewer = context.getActiveViewer();
        KNode node = context.getKNode();
        
        viewer.toggleExpansion(node);
        expandMap.put(node, viewer.isExpanded(node));

        return ActionResult.createResult(true);
    }

}
