/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.debug;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.core.resources.IMarkerDelta;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.IBreakpointListener;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.LineBreakpoint;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;

import de.cau.cs.kieler.core.kgraph.KEdge;
import de.cau.cs.kieler.core.kgraph.KLabel;
import de.cau.cs.kieler.core.kgraph.KNode;
import de.cau.cs.kieler.core.krendering.Colors;
import de.cau.cs.kieler.core.krendering.KBackground;
import de.cau.cs.kieler.core.krendering.KColor;
import de.cau.cs.kieler.core.krendering.KContainerRendering;
import de.cau.cs.kieler.core.krendering.KForeground;
import de.cau.cs.kieler.core.krendering.KRendering;
import de.cau.cs.kieler.core.krendering.KRenderingFactory;
import de.cau.cs.kieler.core.krendering.KStyle;
import de.cau.cs.kieler.core.krendering.KText;
import de.cau.cs.kieler.core.properties.IProperty;
import de.cau.cs.kieler.core.properties.Property;
import de.cau.cs.kieler.klighd.ViewContext;
import de.cau.cs.kieler.klighd.ui.view.DiagramView;
import de.cau.cs.kieler.klighd.util.Iterables2;
import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.sccharts.Transition;
import de.cau.cs.kieler.sccharts.debug.ui.breakpoints.SCChartsBreakpointTargetAdapter;

/**
 * @author lgr
 *
 */
public class BreakpointListener implements IBreakpointListener {

    private ViewContext viewContext;

    IEditorPart editor = null;

    public static IProperty<Object> BREAKPOINT_HIGHLIGHTING_MARKER =
            new Property<Object>("breakpoint_highlight");

    private Predicate<KStyle> filter = new Predicate<KStyle>() {
        public boolean apply(final KStyle style) {
            return style.getProperty(BREAKPOINT_HIGHLIGHTING_MARKER) == BreakpointListener.this;
        }
    };

    private Predicate<KStyle> blueFilter = new Predicate<KStyle>() {
        public boolean apply(final KStyle style) {
            boolean isKForeground = (style instanceof KForeground);
            Object property = style.getProperty(BREAKPOINT_HIGHLIGHTING_MARKER);
            boolean hasBreakpointProperty = property == BreakpointListener.this;
            return isKForeground && hasBreakpointProperty;
        }
    };

    private static KColor SCCHARTSBLUE1 =
            KRenderingFactory.eINSTANCE.createKColor().setColor(215, 255, 215);
    private static KColor SCCHARTSBLUE2 =
            KRenderingFactory.eINSTANCE.createKColor().setColor(158, 255, 158);

    private static KBackground STYLE1 = KRenderingFactory.eINSTANCE.createKBackground()
            .setColors(SCCHARTSBLUE1, SCCHARTSBLUE2).setGradientAngle2(90);

    private ArrayList<KNode> expanded = new ArrayList<KNode>();

    /**
     * {@inheritDoc}
     */
    @Override
    public void breakpointAdded(IBreakpoint breakpoint) {
        try {
            if (breakpoint.isEnabled()) {
                int line = ((LineBreakpoint) breakpoint).getLineNumber();
                EObject obj = SCChartsBreakpointTargetAdapter.lineToModelElement.get(line);
                handleHighlight(obj, true);
            }
        } catch (CoreException e) {
            e.printStackTrace();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void breakpointRemoved(IBreakpoint breakpoint, IMarkerDelta delta) {
        try {
            int line = ((LineBreakpoint) breakpoint).getLineNumber();
            EObject obj = SCChartsBreakpointTargetAdapter.lineToModelElement.get(line);
            handleHighlight(obj, false);
        } catch (CoreException e) {
            e.printStackTrace();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void breakpointChanged(IBreakpoint breakpoint, IMarkerDelta delta) {
        try {
            if (delta != null) {
                int line = ((LineBreakpoint) breakpoint).getLineNumber();
                EObject obj = SCChartsBreakpointTargetAdapter.lineToModelElement.get(line);
                if (breakpoint.isEnabled()) {
                    handleHighlight(obj, true);
                } else {
                    handleHighlight(obj, false);
                }
            }

        } catch (CoreException e) {
            e.printStackTrace();
        }
    }

    private void handleHighlight(EObject obj, boolean highlighting) {
        if (obj instanceof State) {
            handleStateHighlight((State) obj, highlighting);
        } else if (obj instanceof Transition) {
            handleTransitionHighlight((Transition) obj, highlighting);
        }
    }

    private void handleTransitionHighlight(Transition obj, boolean highlighting) {
        updateViewContext();
        final KEdge viewElementTransition = viewContext.getTargetElement(obj, KEdge.class);

        List<KEdge> currentTransitions = Lists.newArrayList();
        if (viewElementTransition != null) {
            currentTransitions.add(viewElementTransition);
        }

        if (highlighting) {

            // Add highlighting for NEW highlighted elements
            KRenderingFactory factory = KRenderingFactory.eINSTANCE;

            final KStyle kEdgeStyle = factory.createKForeground().setColor(Colors.STEEL_BLUE_3);
            kEdgeStyle.setProperty(BREAKPOINT_HIGHLIGHTING_MARKER, BreakpointListener.this);
            kEdgeStyle.setPropagateToChildren(true);

            final KStyle labelStyle = factory.createKForeground().setColor(Colors.STEEL_BLUE_3);
            labelStyle.setProperty(BREAKPOINT_HIGHLIGHTING_MARKER, BreakpointListener.this);

            final List<KEdge> currentTransitionsCopy = currentTransitions;

            Display.getDefault().syncExec(new Runnable() {
                public void run() {
                    for (final KEdge viewElementTransition : currentTransitionsCopy) {
                        final KContainerRendering ren =
                                viewElementTransition.getData(KContainerRendering.class);
                        final boolean flagged = Iterables.any(ren.getStyles(), filter);
                        if (!flagged) {
                            ren.getStyles().add(EcoreUtil.copy(kEdgeStyle));
                            List<KLabel> labels = viewElementTransition.getLabels();
                            if (labels != null && labels.size() > 0) {
                                final KLabel label = labels.get(0);
                                if (label != null) {
                                    final KText ren2 = label.getData(KText.class);
                                    ren2.getStyles().add(EcoreUtil.copy(labelStyle));
                                }
                            }
                        }
                    }
                }
            });
        } else {
            final List<KEdge> notHighlightedEdges = new ArrayList<KEdge>();
            notHighlightedEdges.add(viewElementTransition);

            // Remove highlighting for NOT highlighted elements
            Display.getDefault().syncExec(new Runnable() {
                public void run() {
                    for (KEdge k : notHighlightedEdges) {
                        KRendering ren = k.getData(KRendering.class);
                        if (Iterables.any(ren.getStyles(), filter)) {
                            Iterables.removeIf(ren.getStyles(), filter);
                            if (k.getLabels().size() > 0) {
                                KLabel label = k.getLabels().get(0);
                                KText ren2 = label.getData(KText.class);
                                Iterables.removeIf(ren2.getStyles(), blueFilter);
                            }
                        }
                    }
                }
            });

        }

    }

    private void handleStateHighlight(State obj, boolean highlighting) {
        updateViewContext();
        final KNode viewElement = viewContext.getTargetElement(obj, KNode.class);

        List<KNode> currentStates = Lists.newArrayList();

        if (viewElement != null) {
            currentStates.add(viewElement);
        }

        if (highlighting) {
            // Add highlighting for NEW highlighted elements
            final KBackground nodeStyle = KRenderingFactory.eINSTANCE.createKBackground()
                    .setColorsAlphasGradientAngleCopiedFrom(STYLE1);
            nodeStyle.setProperty(BREAKPOINT_HIGHLIGHTING_MARKER, BreakpointListener.this);
            nodeStyle.setPropagateToChildren(true);

            final KStyle labelStyle =
                    KRenderingFactory.eINSTANCE.createKForeground().setColor(Colors.BLACK);
            labelStyle.setProperty(BREAKPOINT_HIGHLIGHTING_MARKER, BreakpointListener.this);

            for (final KNode viewElementState : currentStates) {
                final KContainerRendering ren = viewElementState.getData(KContainerRendering.class);
                final boolean flagged = Iterables.any(ren.getStyles(), filter);
                if (!flagged) {

                    Display.getDefault().syncExec(new Runnable() {
                        public void run() {
                            for (KText viewElementStateLabel : Iterables2.toIterable(
                                    Iterators.filter(ren.eAllContents(), KText.class))) {
                                viewElementStateLabel.getStyles().add(EcoreUtil.copy(labelStyle));

                            }
                            ren.getStyles().add(EcoreUtil.copy(nodeStyle));

                            viewContext.getViewer().scale(viewElementState, 1.0f);
                            for (KNode r : viewElementState.getChildren()) {
                                if (!viewContext.getViewer().isExpanded(r)) {
                                    viewContext.getViewer().expand(r);
                                    expanded.add(r);
                                }
                            }

                        }
                    });
                }
            }

        } else {
            // Remove new highlighted from ALL elements to get NOT highlighted
            final List<KNode> notHighlightedStates = new ArrayList<KNode>();
            notHighlightedStates.add(viewElement);

            // Remove highlighting for NOT highlighted elements
            Display.getDefault().syncExec(new Runnable() {
                public void run() {
                    for (KNode k : notHighlightedStates) {
                        viewContext.getViewer().scale(k, 1f);
                        KRendering ren = k.getData(KRendering.class);
                        if (Iterables.any(ren.getStyles(), filter)) {
                            Iterables.removeIf(ren.getStyles(), filter);
                            for (KText t : Iterables2.toIterable(
                                    Iterators.filter(ren.eAllContents(), KText.class))) {
                                Iterables.removeIf(t.getStyles(), blueFilter);
                            }
                        }
                        if (expanded.contains(k)) {
                            viewContext.getViewer().collapse(k);
                            expanded.remove(k);
                        }
                    }
                }
            });
        }
    }

    private void updateViewContext() {
        IWorkbenchWindow workbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
        if (workbenchWindow != null) {
            IEditorPart diagramEditor = workbenchWindow.getActivePage().getActiveEditor();
            List<DiagramView> diagramViews = DiagramView.getDiagramViews(diagramEditor);
            DiagramView viewPart = diagramViews.get(0);
            viewContext = viewPart.getViewer().getViewContext();
        }
    }
}
