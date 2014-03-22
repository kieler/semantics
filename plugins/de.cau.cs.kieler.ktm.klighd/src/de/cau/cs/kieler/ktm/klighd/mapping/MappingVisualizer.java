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
package de.cau.cs.kieler.ktm.klighd.mapping;

import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.WeakHashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.base.Preconditions;
import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Key;
import com.google.inject.Module;
import com.google.inject.Provider;
import com.google.inject.Scope;

import de.cau.cs.kieler.core.kgraph.KEdge;
import de.cau.cs.kieler.core.kgraph.KGraphData;
import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.krendering.KColor;
import de.cau.cs.kieler.core.krendering.KForeground;
import de.cau.cs.kieler.core.krendering.KRendering;
import de.cau.cs.kieler.core.krendering.KRenderingFactory;
import de.cau.cs.kieler.core.krendering.KStyle;
import de.cau.cs.kieler.core.krendering.ViewSynthesisShared;
import de.cau.cs.kieler.klighd.ViewContext;

/**
 * This class maintains all mapping edges in diagrams.
 * 
 * @author als
 * 
 */
public final class MappingVisualizer {

    /** instances with their view contexts. will exist as long as the view context exists */
    private static WeakHashMap<ViewContext, MappingVisualizer> instances =
            new WeakHashMap<ViewContext, MappingVisualizer>(2);

    // Highlighting colors constants
    /** Color to highlight selected source nodes. */
    private static final KColor sourceNodeHighlightingColor = KRenderingFactory.eINSTANCE
            .createKColor();
    /** Color to highlight selected target nodes. */
    private static final KColor targetNodeHighlightingColor = KRenderingFactory.eINSTANCE
            .createKColor();
    // statically set colors
    {
        sourceNodeHighlightingColor.setBlue(255);
        targetNodeHighlightingColor.setRed(255);
    }

    /**
     * Return the existing instance for given view context or crates a new one.
     * 
     * @param vc
     *            view context
     * @return MappingVisualizer of view context.
     * @throws NullPointerException
     *             if view context is null
     */
    public static MappingVisualizer getMappingVisualizer(final ViewContext vc) {
        Preconditions.checkNotNull(vc);
        // get instance
        if (instances.containsKey(vc)) {
            MappingVisualizer mv = instances.get(vc);
            if (mv != null) {
                return mv;
            }
        }
        // if no instance exists create a new one for this ViewContext
        return new MappingVisualizer(vc);
    }

    // NON STATIC PART

    /** Synthesis to create mapping with edges and adding them to diagram. */
    private MappingSynthesis mappingSynthesis = Guice.createInjector(new Module() {
        // This Module is created to satisfy ViewSynthesisShared scope of used synthesis-extensions
        public void configure(Binder binder) {
            binder.bindScope(ViewSynthesisShared.class, new Scope() {

                public <T> Provider<T> scope(Key<T> key, final Provider<T> unscoped) {

                    return new Provider<T>() {
                        public T get() {
                            return unscoped.get();
                        }
                    };
                }
            });
        }
    }).getInstance(MappingSynthesis.class);

    // All References to Objects displayed in KLighD-View are weak-references, because this class
    // is saved statically, so diagrams can be closed and deleted by GC even if this class holds
    // references.
    /** Selected source node. */
    private WeakReference<KNode> selectedSourceNode = null;
    /** Selected target node. */
    private WeakReference<KNode> selectedTargetNode = null;
    /** Selected target node. */
    private final WeakReference<ViewContext> viewContext;
    /** List of currently displayed mapping edges. */
    private final LinkedList<WeakReference<KEdge>> mappingEdges =
            new LinkedList<WeakReference<KEdge>>();

    /**
     * Private constructor.
     * <p>
     * Instantiation with {@link MappingVisualizer.getMappingVisualizer}
     */
    private MappingVisualizer(final ViewContext vc) {
        instances.put(vc, this);
        viewContext = new WeakReference<ViewContext>(vc);
    }

    /**
     * Selects given node as source.
     * 
     * @param sourceNode source node
     * @return true if selection changed
     */
    public boolean setSelectedSourceNode(final KNode sourceNode) {
        Preconditions.checkNotNull(sourceNode);

        // do not select if already selected
        if (selectedSourceNode != null) {
            KNode currentSelectedSourceNode = selectedSourceNode.get();
            if (currentSelectedSourceNode == sourceNode) {
                return false;
            }
        }

        // if target node is selected as source deselect target
        if (selectedTargetNode != null) {
            KNode currentSelectedTargetNode = selectedTargetNode.get();
            if (currentSelectedTargetNode == sourceNode) {
                deselectedTargetNode();
            }
        }

        deselectedSourceNode();

        // select
        selectedSourceNode = new WeakReference<KNode>(sourceNode);
        highlightNode(sourceNode, sourceNodeHighlightingColor);

        updateMapping();

        return true;
    }

    /**
     * Selects given node as target.
     * 
     * @param targetNode target node
     * @return true if selection changed
     */
    public boolean setSelectedTargetNode(final KNode targetNode) {
        Preconditions.checkNotNull(targetNode);

        // do not select if already selected
        if (selectedTargetNode != null) {
            KNode currentSelectedTargetNode = selectedTargetNode.get();
            if (currentSelectedTargetNode == targetNode) {
                return false;
            }
        }

        // if source node is selected as target deselect source
        if (selectedSourceNode != null) {
            KNode currentSelectedSourceNode = selectedSourceNode.get();
            if (currentSelectedSourceNode == targetNode) {
                deselectedSourceNode();
            }
        }

        deselectedTargetNode();

        selectedTargetNode = new WeakReference<KNode>(targetNode);
        highlightNode(targetNode, targetNodeHighlightingColor);

        updateMapping();

        return true;
    }

    /**
     * Clears selection of all nodes.
     */
    public void clearSelectedNodes() {
        deselectedSourceNode();
        deselectedTargetNode();
        updateMapping();
    }

    /**
     * Updates mapping and displayed mapping edges
     */
    public void updateMapping() {
        //remove currently displayed mapping edges
        for (WeakReference<KEdge> edgeRef : mappingEdges) {
            KEdge edge = edgeRef.get();
            if (edge != null) {
                edge.setSource(null);
                edge.setTarget(null);
            }
        }
        mappingEdges.clear();

        //create new mapping edges if source and target is selected
        if (selectedSourceNode != null && selectedTargetNode != null) {
            KNode sourceNode = selectedSourceNode.get();
            KNode targetNode = selectedTargetNode.get();
            ViewContext vc = viewContext.get();
            if (sourceNode != null && targetNode != null && vc != null) {
                mappingSynthesis.createMappingEdges(sourceNode, targetNode, mappingEdges, vc);
            }
        }
    }

    /**
     * Removes selection of source node.
     */
    public void deselectedSourceNode() {
        if (selectedSourceNode != null) {
            KNode sourceNode = selectedSourceNode.get();
            if (sourceNode != null) {
                resetHighlightedNode(sourceNode);
            }
        }
        selectedSourceNode = null;
    }

    /**
     * Removes selection of target node.
     */
    public void deselectedTargetNode() {
        if (selectedTargetNode != null) {
            KNode targetNode = selectedTargetNode.get();
            if (targetNode != null) {
                resetHighlightedNode(targetNode);
            }
        }
        selectedTargetNode = null;
    }

    /**
     * Adds highlighting color to a node.
     * 
     * @param node
     *            node to highlight
     * @param color
     *            color to set on node foreground
     */
    private void highlightNode(final KNode node, final KColor color) {
        KForeground fg = KRenderingFactory.eINSTANCE.createKForeground();
        // fg.setPropagateToChildren(true);
        fg.setColor(EcoreUtil.copy(color));
        fg.setProperty(MappingProperties.SELECTED_NODE_HIGHLIGHTING, true);
        node.getData(KRendering.class).getStyles().add(fg);
    }

    /**
     * Removes added highlighting form a node.
     * 
     * @param node
     *            node to reset highlight
     */
    private void resetHighlightedNode(final KNode node) {
        for (KGraphData data : node.getData()) {
            if (data instanceof KRendering) {
                EList<KStyle> styles = ((KRendering) data).getStyles();
                KStyle removeStyle = null;
                for (KStyle style : styles) {
                    // Check if this style is added by this action
                    if (style.getProperty(MappingProperties.SELECTED_NODE_HIGHLIGHTING)) {
                        removeStyle = style;
                        break;
                    }
                }
                styles.remove(removeStyle);
            }
        }

    }

}
