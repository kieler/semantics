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
package de.cau.cs.kieler.ktm.klighd.actions;

import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.cau.cs.kieler.core.kgraph.KGraphData;
import de.cau.cs.kieler.core.kgraph.KGraphElement;
import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.krendering.KColor;
import de.cau.cs.kieler.core.krendering.KColoring;
import de.cau.cs.kieler.core.krendering.KForeground;
import de.cau.cs.kieler.core.krendering.KInvisibility;
import de.cau.cs.kieler.core.krendering.KRectangle;
import de.cau.cs.kieler.core.krendering.KRendering;
import de.cau.cs.kieler.core.krendering.KRenderingFactory;
import de.cau.cs.kieler.core.krendering.KStyle;
import de.cau.cs.kieler.core.properties.IProperty;
import de.cau.cs.kieler.core.properties.MapPropertyHolder;
import de.cau.cs.kieler.core.properties.Property;
import de.cau.cs.kieler.klighd.IAction;
import de.cau.cs.kieler.klighd.LightDiagramServices;
import de.cau.cs.kieler.klighd.ViewContext;
import de.cau.cs.kieler.klighd.util.KlighdSynthesisProperties;
import de.cau.cs.kieler.ktm.klighd.TransformationTreeDiagramSynthesis;
import de.cau.cs.kieler.ktm.klighd.resolve.EObjectSynthesisModelWrapperWrapper;
import de.cau.cs.kieler.ktm.transformationtree.ModelWrapper;

/**
 * Action to select nodes in tree and display their contained model.
 * 
 * @author als
 * 
 */
public class ModelSelectionAction implements IAction {

    /** Action ID. */
    public static final String ID = "de.cau.cs.kieler.ktm.klighd.actions.ModelSelectionAction";

    // All Referenced to Objects displayed in KLighD-View are weak-references, because this action
    // is a Singleton, so diagrams can be closed and deleted even if this class holds references.
    /** Selected source node for open view context. */
    protected static final WeakHashMap<ViewContext, WeakReference<KNode>> selectedSourceNode =
            new WeakHashMap<ViewContext, WeakReference<KNode>>();
    /** Selected source node for open view context. Used in {@link ModelSelectionAction}. */
    protected static final WeakHashMap<ViewContext, WeakReference<KNode>> selectedTargetNode =
            new WeakHashMap<ViewContext, WeakReference<KNode>>();
    /** Root node of currently displayed model visualization added as submodel. */
    protected static final WeakHashMap<ViewContext, WeakReference<KNode>> displayedSubDiagram =
            new WeakHashMap<ViewContext, WeakReference<KNode>>();

    private static final IProperty<ModelSelectionAction> ADDED_HIGHLIGHTING =
            new Property<ModelSelectionAction>("de.cau.cs.kieler.ktm.klighd.ModelSelectionAction",
                    null);

    // Highlighting colors constants
    /** Color to highlight selected source nodes. */
    protected static final KColor sourceNodeHighlightingColor = KRenderingFactory.eINSTANCE
            .createKColor();
    /** Color to highlight selected target nodes. */
    protected static final KColor targetNodeHighlightingColor = KRenderingFactory.eINSTANCE
            .createKColor();
    // statically set colors
    {
        sourceNodeHighlightingColor.setBlue(255);
        targetNodeHighlightingColor.setRed(255);
    }

    /**
     * {@inheritDoc}
     */
    public ActionResult execute(final ActionContext context) {
        KNode node = context.getKNode();
        final ViewContext vc = context.getViewContext();
        Object sourceObject = vc.getSourceElement(node);

        if (node != null) {
            // get diagrams root Node
            KNode rootNode = node;
            while (rootNode.getParent() != null) {
                rootNode = rootNode.getParent();
            }

            // if clicked valid node (ModelWrapper node in TransformationTree)
            if (sourceObject != null && sourceObject instanceof ModelWrapper) {
                // if clicked an unselected node or switch from resolve to single display of models
                if (!selectedSourceNode.containsKey(vc) || selectedSourceNode.get(vc).get() != node
                        || selectedTargetNode.containsKey(vc)) {
                    ModelWrapper sourceMW = (ModelWrapper) sourceObject;

                    // clear current selection
                    clearSelectionAndSubmodel(rootNode, vc);

                    KNode subDiagram = null;
                    boolean showModel = true; // flag indicates if show_model systhesis option is
                                              // set or
                                              // true on default
                    // read out DiagramSynthesis if possible
                    if (vc.getOptionValue(TransformationTreeDiagramSynthesis.SHOW_MODELS) != null) {
                        showModel =
                                ((Boolean) (vc
                                        .getOptionValue(TransformationTreeDiagramSynthesis.SHOW_MODELS)))
                                        .booleanValue();
                    }
                    // if model is transient or should not be displayed with its own synthesis.
                    if (sourceMW.isTransient() || !showModel) {
                        subDiagram = translateEObjectWrapperColletionDiagram(sourceMW, vc);
                    } else { // show model with its own synthesis.
                        subDiagram =
                                LightDiagramServices.translateModel(sourceMW.getRootObject()
                                        .getEObject(), vc);
                        // if no synthesis is available fall back to EObjectWrapperColletionDiagram
                        if (subDiagram != null && subDiagram.getChildren().isEmpty()) {
                            subDiagram = translateEObjectWrapperColletionDiagram(sourceMW, vc);
                        }
                    }
                    // add generated submodel to rootNode if possible
                    if (subDiagram != null) {
                        // if a translated submodel has no KRendering on rootNode KLighD will add a
                        // black rectangle which is prevented here
                        hideSurroundingRectangle(subDiagram);

                        // add diagram
                        rootNode.getChildren().add(subDiagram);
                        displayedSubDiagram.put(vc, new WeakReference<KNode>(subDiagram));

                        // highlight selected node
                        selectedSourceNode.put(vc, new WeakReference<KNode>(node));
                        highlightNode(node, sourceNodeHighlightingColor);

                        return ActionResult.createResult(true);
                    }
                }
            } else {// else deselect and remove submodel
                clearSelectionAndSubmodel(rootNode, vc);
                return ActionResult.createResult(true);
            }
        }

        return ActionResult.createResult(false);
    }

    /**
     * Removed added submodel from node and resets highlighting of selected nodes.
     * 
     * @param rootNode
     *            node containing submodel to remove.
     * @param vc
     *            ViewContext
     */
    protected void clearSelectionAndSubmodel(final KNode rootNode, final ViewContext vc) {
        // remove source highlighting
        if (selectedSourceNode.containsKey(vc)) {
            KNode sourceNode = selectedSourceNode.get(vc).get();
            if (sourceNode != null) {
                resetHighlightedNode(sourceNode);
                selectedSourceNode.remove(vc);
            } else {
                selectedSourceNode.remove(vc);
            }
        }

        // remove target highlighting
        if (selectedTargetNode.containsKey(vc)) {
            KNode targetNode = selectedTargetNode.get(vc).get();
            if (targetNode != null) {
                resetHighlightedNode(targetNode);
                selectedTargetNode.remove(vc);
            } else {
                selectedTargetNode.remove(vc);
            }
        }

        // remove submodel
        if (displayedSubDiagram.containsKey(vc)) {
            rootNode.getChildren().remove(displayedSubDiagram.get(vc).get());
            displayedSubDiagram.remove(vc);
        }
    }

    /**
     * Creates a diagram for a ModelWrapper in form a a collection of all contained EObjectWrappers.
     * 
     * @param model
     *            ModelWrapper to show
     * @param vc
     *            ViewContext
     * @return diagram as KNode or null
     */
    private KNode translateEObjectWrapperColletionDiagram(final ModelWrapper model,
            final ViewContext vc) {
        MapPropertyHolder systhesisProperty = new MapPropertyHolder();
        systhesisProperty.setProperty(KlighdSynthesisProperties.REQUESTED_DIAGRAM_SYNTHESIS,
                "de.cau.cs.kieler.ktm.klighd.TransformationTreeDiagramSynthesis");
        // create a diagram with ModelWrapperSysthesis to show all contained EObject
        // in a abstract way with or without their attributes
        // (reusage of ModelWrapperSysthesis not displaying a tree)
        return LightDiagramServices.translateModel(new EObjectSynthesisModelWrapperWrapper(model),
                vc, systhesisProperty);
    }

    /**
     * Adds highlighting color to a node.
     * 
     * @param node
     *            node to highlight
     * @param color
     *            color to set on node foreground
     */
    protected void highlightNode(final KNode node, final KColor color) {
        KForeground fg = KRenderingFactory.eINSTANCE.createKForeground();
        // fg.setPropagateToChildren(true);
        fg.setColor(EcoreUtil.copy(color));
        fg.setProperty(ADDED_HIGHLIGHTING, this);
        node.getData(KRendering.class).getStyles().add(fg);
    }

    /**
     * removed added highlighting form a node.
     * 
     * @param node
     *            node to reset highlight
     */
    protected void resetHighlightedNode(final KNode node) {
        for (KGraphData data : node.getData()) {
            if (data instanceof KRendering) {
                EList<KStyle> styles = ((KRendering) data).getStyles();
                KStyle removeStyle = null;
                for (KStyle style : styles) {
                    // Check if this style is added by this action
                    if (style.getProperty(ADDED_HIGHLIGHTING) == this) {
                        removeStyle = style;
                        break;
                    }
                }
                styles.remove(removeStyle);
            }
        }

    }

    /**
     * Hides a rectangle added to a KNode.
     * 
     * @param node
     *            node to removes rectangle
     */
    protected void hideSurroundingRectangle(final KNode node) {
        // preventing adding of rectangle by adding an invisible own one.
        KRectangle rootRectangle = KRenderingFactory.eINSTANCE.createKRectangle();
        KInvisibility invisibility = KRenderingFactory.eINSTANCE.createKInvisibility();
        invisibility.setInvisible(true);
        rootRectangle.getStyles().add(invisibility);
        node.getData().add(rootRectangle);
    }
}
