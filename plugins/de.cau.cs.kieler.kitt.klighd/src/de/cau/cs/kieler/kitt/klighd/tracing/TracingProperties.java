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
package de.cau.cs.kieler.kitt.klighd.tracing;

import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Predicate;

import de.cau.cs.kieler.core.kgraph.KGraphElement;
import de.cau.cs.kieler.core.properties.IProperty;
import de.cau.cs.kieler.core.properties.Property;
import de.cau.cs.kieler.kiml.klayoutdata.KLayoutData;

/**
 * Contains Properties for marking elements in tracing diagrams or related ViewContext.
 * 
 * @author als
 * @kieler.design 2014-08-19 proposedw
 * @kieler.rating 2014-08-19 proposed yellow
 * 
 */
public final class TracingProperties {

    /**
     * Privates constructor to prevent instantiation.
     */
    private TracingProperties() {
    }

    // -- ViewContext Properties --
    // ----------------------------
    // These Properties are added to / used in the ViewContext

    /**
     * Indicates Tracing visualization mode of a diagram in its ViewContext.
     */
    public static final IProperty<Predicate<EObject>> VISUALIZATION_PREDICATE =
            new Property<Predicate<EObject>>("de.cau.cs.kieler.kitt.klighd.tracing.predicate",
                    new Predicate<EObject>() {

                        public boolean apply(EObject eObject) {
                            // visualize all KGraphElements but not TRACED_MODEL_ROOT_NODEs
                            if (eObject instanceof KGraphElement) {
                                return !((KGraphElement) eObject).getData(KLayoutData.class)
                                        .getProperty(TracingProperties.TRACED_MODEL_ROOT_NODE);
                            }
                            return false;
                        }

                    });

    /**
     * Source model elements which have no associated graph element will be associated with a graph
     * element of the container element. This property defines the maximum search depth of
     * eContainer relation. A larger value will associates more source model elements with graph
     * elements (which have no explicit association).
     */
    public static final IProperty<Integer> VISUALIZATION_EQUIVALENCE_CLASS_DEPTH =
            new Property<Integer>("de.cau.cs.kieler.kitt.klighd.tracing.equivalence.depth", 0);

    // -- KGraph Properties --
    // ----------------------------
    // These Properties are added to / used in KGraph including Renderings

    /**
     * Marks an element in a KGraph (KGraphElement or KRending) as an explicit tracing node which
     * always should be visualized in an appropiate mode, ignoring the
     * TRACING_VISUALIZATION_PREDICATE.
     */
    public static final IProperty<Boolean> TRACING_NODE = new Property<Boolean>(
            "de.cau.cs.kieler.kitt.klighd.tracing.node", false);

    /**
     * Marks an node as an element associated with the root element of a traced model.
     */
    public static final IProperty<Boolean> TRACED_MODEL_ROOT_NODE = new Property<Boolean>(
            "de.cau.cs.kieler.kitt.klighd.tracing.modelRootNode", false);

}
