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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

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
import de.cau.cs.kieler.core.krendering.KDecoratorPlacementData;
import de.cau.cs.kieler.core.krendering.KEllipse;
import de.cau.cs.kieler.core.krendering.KForeground;
import de.cau.cs.kieler.core.krendering.KPolyline;
import de.cau.cs.kieler.core.krendering.KRendering;
import de.cau.cs.kieler.core.krendering.KRenderingFactory;
import de.cau.cs.kieler.core.krendering.KStyle;
import de.cau.cs.kieler.core.krendering.KText;
import de.cau.cs.kieler.core.krendering.extensions.KContainerRenderingExtensions;
import de.cau.cs.kieler.core.krendering.extensions.KRenderingExtensions;
import de.cau.cs.kieler.core.properties.IProperty;
import de.cau.cs.kieler.core.properties.Property;
import de.cau.cs.kieler.klighd.ViewContext;
import de.cau.cs.kieler.klighd.ui.view.DiagramView;
import de.cau.cs.kieler.klighd.util.Iterables2;
import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.sccharts.Transition;
import de.cau.cs.kieler.sccharts.debug.ui.breakpoints.SCChartsBreakpointTargetAdapter;
import de.cau.cs.kieler.sccharts.debug.ui.breakpoints.SCChartsBreakpointTargetAdapterFactory;
import de.cau.cs.kieler.sccharts.klighd.synthesis.styles.ColorStore;

/**
 * This class handles the highlighting of the graphical elements of SCCharts. Thus on a add event,
 * the breakpoint is highlighted, on a change event checked on possible disabled breakpoint and on a
 * remove event the highlighting is removed.
 * 
 * @author lgr
 *
 */
public class BreakpointListener implements IBreakpointListener {

    private String ellipseId = "breakpoint";

    private ViewContext viewContext;

    private static KRenderingFactory factory = KRenderingFactory.eINSTANCE;

    private ArrayList<KNode> kNodesExpanded = new ArrayList<KNode>();

    // --------------------------------------------------------------------------------------------
    private static IProperty<Object> BREAKPOINT_HIGHLIGHTING_MARKER =
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

    private static KColor SCCHARTSBLUE1 = factory.createKColor().setColor(60, 150, 60);
    private static KColor SCCHARTSBLUE2 = factory.createKColor().setColor(0, 150, 0);

    private static KBackground STYLE1 = factory.createKBackground()
            .setColors(SCCHARTSBLUE1, SCCHARTSBLUE2).setGradientAngle2(90);

    private KRenderingExtensions _kRenderingExtensions = new KRenderingExtensions();
    private KContainerRenderingExtensions _kContainerRenderingExtensions =
            new KContainerRenderingExtensions();

    // --------------------------------------------------------------------------------------------
    /**
     * When a breakpoint is added and enabled, it will get highlighted.
     * 
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
     * When a breakpoint is removed, its highlighting will be removed.
     * 
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
     * When a breakpoint is changed, its checked on whether it is still enabled or not. The
     * highlighting will be changed accordingly. 
     * 
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

    // ---------------------------- TRANSITION HIGHLIGHTING ---------------------------------------

    private void handleTransitionHighlight(Transition obj, boolean highlighting) {
        updateViewContext();
        final KEdge viewElementTransition = viewContext.getTargetElement(obj, KEdge.class);

        if (highlighting) {
            addBreakpointDecorator(viewElementTransition);
        } else {
            removeBreakpointDecorator(viewElementTransition);
        }
    }

    private KEllipse addBreakpointDecorator(final KEdge edge) {

        KPolyline _line = this.line(edge);
        KEllipse _addEllipse = _kContainerRenderingExtensions.addEllipse(_line);
        _addEllipse.setId(ellipseId);

        final Procedure1<KEllipse> _function = (KEllipse it) -> {
            _kRenderingExtensions.<KEllipse> setDecoratorPlacementData(it, 8, 8, -4, 0.5f, false);
            _kRenderingExtensions.setLineWidth(it, 1);
            _kRenderingExtensions.setBackground(it, factory.createKColor().setColor(60, 60, 150));
        };
        return ObjectExtensions.<KEllipse> operator_doubleArrow(_addEllipse, _function);
    }

    private KEllipse removeBreakpointDecorator(final KEdge edge) {
        KPolyline _line = this.line(edge);
        EList<KRendering> children = _line.getChildren();
        for (KRendering ren : children) {
            if (ren.getId() == ellipseId) {
                children.remove(ren);
                break;
            }
        }
        return null;
    }

    private KPolyline line(final KEdge edge) {
        KContainerRendering _kContainerRendering =
                _kRenderingExtensions.getKContainerRendering(edge);
        return ((KPolyline) _kContainerRendering);
    }

    // ---------------------------- STATE HIGHLIGHTING --------------------------------------------
    private void handleStateHighlight(State obj, boolean highlighting) {
        updateViewContext();
        final KNode viewElement = viewContext.getTargetElement(obj, KNode.class);

        List<KNode> currentStates = Lists.newArrayList();

        if (viewElement != null) {
            currentStates.add(viewElement);
        }

        if (highlighting) {
            // Add highlighting for NEW highlighted elements
            final KBackground nodeStyle =
                    factory.createKBackground().setColorsAlphasGradientAngleCopiedFrom(STYLE1);
            nodeStyle.setProperty(BREAKPOINT_HIGHLIGHTING_MARKER, BreakpointListener.this);
            nodeStyle.setPropagateToChildren(true);

            final KStyle labelStyle = factory.createKForeground().setColor(Colors.WHITE);
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
                                    kNodesExpanded.add(r);
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
                        if (kNodesExpanded.contains(k)) {
                            viewContext.getViewer().collapse(k);
                            kNodesExpanded.remove(k);
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
