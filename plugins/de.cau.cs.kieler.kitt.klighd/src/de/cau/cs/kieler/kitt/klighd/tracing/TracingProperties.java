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

import java.util.List;

import de.cau.cs.kieler.core.krendering.KStyle;
import de.cau.cs.kieler.core.properties.IProperty;
import de.cau.cs.kieler.core.properties.Property;
import de.cau.cs.kieler.core.util.Pair;
import de.cau.cs.kieler.kitt.klighd.tracing.TracingSynthesisOption.TracingMode;
import de.cau.cs.kieler.kitt.klighd.tracing.internal.InternalTraceMap;

/**
 * Contains Properties for marking tracing diagrams.
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

    /**
     * Marks an node as an element associated with the root element of a traced model.
     */
    public static final IProperty<Boolean> TRACED_MODEL_ROOT_NODE = new Property<Boolean>(
            "de.cau.cs.kieler.kitt.klighd.tracing.model_root_node", false);

    /**
     * Indicates Tracing visualization mode of a diagram in its ViewContext.
     */
    public static final IProperty<TracingMode> TRACING_VISUALAIZATION_MODE =
            new Property<TracingMode>("de.cau.cs.kieler.kitt.klighd.tracing.mode",
                    TracingMode.NO_TRACING);

    /**
     * Marks an edge as a tracing edge when object is not null. Object indicates the origin object
     * pair in source model which is the source and target element of this edge.
     */
    public static final IProperty<Pair<Object, Object>> TRACING_EDGE =
            new Property<Pair<Object, Object>>("de.cau.cs.kieler.kitt.klighd.tracing.edge", null);

    /**
     * Marks an node as selected as source in a tracing resolve selection.
     */
    public static final IProperty<Boolean> TRACING_SOURCE_SELECTION = new Property<Boolean>(
            "de.cau.cs.kieler.kitt.klighd.tracing.selection.source", false);

    /**
     * Marks an node as selected as target in a tracing resolve selection.
     */
    public static final IProperty<Boolean> TRACING_TARGET_SELECTION = new Property<Boolean>(
            "de.cau.cs.kieler.kitt.klighd.tracing.selection.target", false);

    /**
     * Holds the highlighting styles for an diagram element.
     */
    public static final IProperty<List<? extends KStyle>> TRACING_SELECTION_HIGHLIGHTING =
            new Property<List<? extends KStyle>>(
                    "de.cau.cs.kieler.kitt.klighd.tracing.selection.highlighting", null);

    /**
     * Contains applied mappings.
     */
    public static final IProperty<InternalTraceMap> TRACING_MAP = new Property<InternalTraceMap>(
            "de.cau.cs.kieler.kitt.klighd.tracing.map", null);
    
    /**
     * Marks an internal tracing style.
     */
    public static final IProperty<Boolean> TRACING_INTERNAL_STYLE = new Property<Boolean>(
            "de.cau.cs.kieler.kitt.klighd.tracing.internal_style", false);

}
