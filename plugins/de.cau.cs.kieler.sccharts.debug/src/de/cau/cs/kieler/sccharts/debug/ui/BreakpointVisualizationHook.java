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
package de.cau.cs.kieler.sccharts.debug.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.LineBreakpoint;
import org.eclipse.elk.graph.properties.IProperty;
import org.eclipse.elk.graph.properties.Property;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;

import de.cau.cs.kieler.klighd.ViewContext;
import de.cau.cs.kieler.klighd.kgraph.KEdge;
import de.cau.cs.kieler.klighd.kgraph.KNode;
import de.cau.cs.kieler.klighd.krendering.Colors;
import de.cau.cs.kieler.klighd.krendering.KBackground;
import de.cau.cs.kieler.klighd.krendering.KColor;
import de.cau.cs.kieler.klighd.krendering.KContainerRendering;
import de.cau.cs.kieler.klighd.krendering.KEllipse;
import de.cau.cs.kieler.klighd.krendering.KForeground;
import de.cau.cs.kieler.klighd.krendering.KPolyline;
import de.cau.cs.kieler.klighd.krendering.KRendering;
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory;
import de.cau.cs.kieler.klighd.krendering.KStyle;
import de.cau.cs.kieler.klighd.krendering.KText;
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions;
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions;
import de.cau.cs.kieler.klighd.ui.view.DiagramView;
import de.cau.cs.kieler.klighd.util.Iterables2;
import de.cau.cs.kieler.sccharts.Scope;
import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.sccharts.Transition;
import de.cau.cs.kieler.sccharts.debug.SCChartsDebugPlugin;
import de.cau.cs.kieler.sccharts.ui.synthesis.hooks.SynthesisHook;

/**
 * This class handles the highlighting. The methods that handle highlighting are implemented here
 * and during model synthesis it is check on possible breakpoints in the model so after a save
 * operation the highlighting is still enabled.
 * 
 * @author lgr
 *
 */
public class BreakpointVisualizationHook extends SynthesisHook {

    private static HashMap<State, KNode> states = new HashMap<>();
    private static HashMap<Transition, KEdge> transitions = new HashMap<>();

    private static BreakpointVisualizationHook instance;
 
    private ViewContext viewContext;
    private String ellipseId = "breakpoint";
    private static KRenderingFactory factory = KRenderingFactory.eINSTANCE;
    private ArrayList<KNode> kNodesExpanded = new ArrayList<KNode>();

    private static IProperty<Object> BREAKPOINT_HIGHLIGHTING_MARKER =
            new Property<Object>("breakpoint_highlight");

    private Predicate<KStyle> filter = new Predicate<KStyle>() {
        public boolean apply(final KStyle style) {
            boolean isProperty = style.getProperty(
                    BREAKPOINT_HIGHLIGHTING_MARKER) instanceof BreakpointVisualizationHook;
            return isProperty;
        }
    };

    private Predicate<KStyle> blueFilter = new Predicate<KStyle>() {
        public boolean apply(final KStyle style) {
            boolean isKForeground = (style instanceof KForeground);
            Object property = style.getProperty(BREAKPOINT_HIGHLIGHTING_MARKER);
            boolean hasBreakpointProperty = property instanceof BreakpointVisualizationHook;
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
     * Constructor that also sets the instance variable.
     */
    public BreakpointVisualizationHook() {
        super();
        instance = this;
    }

    /**
     * Makes sure that there is an instance to return. In case it does not exist, it will be
     * created.
     * 
     * @return The instance of this class.
     */
    public static BreakpointVisualizationHook getInstance() {
        if (instance == null) {
            instance = new BreakpointVisualizationHook();
        }
        return instance;
    }

    // --------------------------------------------------------------------------------------------
    /**
     * {@inheritDoc}
     */
    @Override
    public void start(Scope scope, KNode node) {
        if (scope instanceof State) {
            SCChartsBreakpointTargetAdapter.getInstance().updateLineEObjectMap((EObject) scope);
        }
        viewContext = getUsedContext();
        states.clear();
        transitions.clear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void processState(State state, KNode node) {
        IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                .getActivePage().getActiveEditor();
        XtextEditor editorPart = (XtextEditor) editor;
        IResource resource =
                (IResource) editorPart.getEditorInput().getAdapter(IResource.class);
        
        if (SCChartsDebugPlugin.getDefault().isEObjectInLine((EObject) state, resource)) {
            states.put(state, node);
        }
    }
 
    /**
     * {@inheritDoc}
     */
    @Override 
    public void processTransition(Transition transition, KEdge edge) {
        IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                .getActivePage().getActiveEditor();
        XtextEditor editorPart = (XtextEditor) editor;
        IResource resource =
                (IResource) editorPart.getEditorInput().getAdapter(IResource.class);
        
        if (SCChartsDebugPlugin.getDefault().isEObjectInLine((EObject) transition, resource)) {
            transitions.put(transition, edge);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewContext getUsedContext() {
        return super.getUsedContext();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void finish(Scope scope, KNode node) {
        if (scope instanceof State) {

            IBreakpoint[] bs = DebugPlugin.getDefault().getBreakpointManager().getBreakpoints();

            for (IBreakpoint b : bs) {
                IResource bResource = b.getMarker().getResource();
                IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                        .getActivePage().getActiveEditor();
                XtextEditor editorPart = (XtextEditor) editor;
                IResource resource =
                        (IResource) editorPart.getEditorInput().getAdapter(IResource.class);

                if (b instanceof LineBreakpoint && resource.equals(bResource)) {
                    try {
                        LineBreakpoint lb = (LineBreakpoint) b;
                        EObject obj = SCChartsBreakpointTargetAdapter.lineToModelElement
                                .get(lb.getLineNumber());
                        handleHighlight(obj, true);
                    } catch (CoreException e) { 
                        e.printStackTrace();
                    }
                }
            }
            states.clear();
            transitions.clear();
        }
    }

    /*
     **********************************************************************************************
     * HIGHLIGHTING *
     **********************************************************************************************
     */

    /**
     * {@inheritDoc}
     */
    public void handleHighlight(EObject obj, boolean highlighting) {
        if (obj instanceof State) {
            handleStateHighlight((State) obj, highlighting);
        } else if (obj instanceof Transition) {
            handleTransitionHighlight((Transition) obj, highlighting);
        }
    }

    // ---------------------------- TRANSITION HIGHLIGHTING ---------------------------------------
    private void handleTransitionHighlight(Transition obj, boolean highlighting) {
        KEdge viewElementTransition = transitions.get(obj);
        if (viewElementTransition == null) {
            updateViewContext();
            viewElementTransition = viewContext.getTargetElement(obj, KEdge.class);
        }
        handleTransitionHighlight(obj, highlighting, viewElementTransition);
    }

    private void handleTransitionHighlight(Transition obj, boolean highlighting,
            KEdge viewElementTransition) {

        if (highlighting) {
            if (viewElementTransition != null) {
                addBreakpointDecorator(viewElementTransition);
            }
        } else {
            if (viewElementTransition != null) {
                removeBreakpointDecorator(viewElementTransition);
            }
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
        KNode viewElement = states.get(obj);
        if (viewElement == null) {
            updateViewContext();
            viewElement = viewContext.getTargetElement(obj, KNode.class);
        } else {
        }
        handleStateHighlight(obj, highlighting, viewElement);
    }

    private void handleStateHighlight(State obj, boolean highlighting, KNode viewElement) {
        List<KNode> currentStates = Lists.newArrayList();
        if (viewElement != null) {
            currentStates.add(viewElement);
        }

        if (highlighting) {
            addStateHighlighting(currentStates);
        } else {
            removeStateHighlighting(viewElement);
        }
    }

    private void addStateHighlighting(List<KNode> currentStates) {
        // Add highlighting for NEW highlighted elements
        final KBackground nodeStyle =
                factory.createKBackground().setColorsAlphasGradientAngleCopiedFrom(STYLE1);
        nodeStyle.setProperty(BREAKPOINT_HIGHLIGHTING_MARKER, BreakpointVisualizationHook.this);
        nodeStyle.setPropagateToChildren(true);

        final KStyle labelStyle = factory.createKForeground().setColor(Colors.WHITE);
        labelStyle.setProperty(BREAKPOINT_HIGHLIGHTING_MARKER, BreakpointVisualizationHook.this);

        for (final KNode viewElementState : currentStates) {
            final KContainerRendering ren = viewElementState.getData(KContainerRendering.class);
            final boolean flagged = Iterables.any(ren.getStyles(), filter);
            if (!flagged) {

                Display.getDefault().syncExec(new Runnable() {
                    public void run() {
                        for (KText viewElementStateLabel : Iterables2
                                .toIterable(Iterators.filter(ren.eAllContents(), KText.class))) {
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
    }

    private void removeStateHighlighting(KNode viewElement) {
        // Remove new highlighted from ALL elements to get NOT highlighted
        final List<KNode> notHighlightedStates = new ArrayList<KNode>();
        notHighlightedStates.add(viewElement);

        // Remove highlighting for NOT highlighted elements
        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                for (KNode k : notHighlightedStates) {
                    updateViewContext();
                    viewContext.getViewer().scale(k, 1f);
                    KRendering ren = k.getData(KRendering.class);

                    if (Iterables.any(ren.getStyles(), filter)) {
                        Iterables.removeIf(ren.getStyles(), filter);
                        Iterable<KText> list = Iterables2
                                .toIterable(Iterators.filter(ren.eAllContents(), KText.class));
                        for (KText t : list) {
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
