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
package de.cau.cs.kieler.sccharts.ui.debug.highlighting
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.CoreException
import org.eclipse.debug.core.DebugPlugin
import org.eclipse.debug.core.model.LineBreakpoint
import org.eclipse.elk.graph.properties.IProperty
import org.eclipse.elk.graph.properties.Property
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.swt.widgets.Display
import org.eclipse.ui.PlatformUI
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.xtext.xbase.lib.ObjectExtensions
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1
import com.google.common.collect.Iterables
import com.google.common.collect.Iterators
import de.cau.cs.kieler.klighd.ViewContext
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.Colors
import de.cau.cs.kieler.klighd.krendering.KBackground
import de.cau.cs.kieler.klighd.krendering.KColor
import de.cau.cs.kieler.klighd.krendering.KContainerRendering
import de.cau.cs.kieler.klighd.krendering.KEllipse
import de.cau.cs.kieler.klighd.krendering.KForeground
import de.cau.cs.kieler.klighd.krendering.KPolyline
import de.cau.cs.kieler.klighd.krendering.KRendering
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.klighd.krendering.KStyle
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.krendering.extensions.KContainerRenderingExtensions
import de.cau.cs.kieler.klighd.krendering.extensions.KRenderingExtensions
import de.cau.cs.kieler.klighd.ui.view.DiagramView
import de.cau.cs.kieler.klighd.util.Iterables2
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.ui.synthesis.hooks.SynthesisHook
import de.cau.cs.kieler.sccharts.ui.debug.breakpoints.BreakpointUtility
import de.cau.cs.kieler.sccharts.ui.debug.breakpoints.SCChartsBreakpointTargetAdapter

/** 
 * This class handles the highlighting. The methods that handle highlighting are implemented here
 * and during model synthesis it is check on possible breakpoints in the model so after a save
 * operation the highlighting is still enabled.
 * @author lgr
 * 
 */
@Deprecated
class BreakpointVisualizationHook extends SynthesisHook {
    
	static HashMap<State, KNode> states = new HashMap()
	static HashMap<Transition, KEdge> transitions = new HashMap()
	
	static BreakpointVisualizationHook instance
	
	ViewContext viewContext
	String ellipseId="breakpoint"
	static KRenderingFactory factory = KRenderingFactory.eINSTANCE
	val kNodesExpanded = new ArrayList<KNode>
	
	static IProperty<Object> BREAKPOINT_HIGHLIGHTING_MARKER = 
	   new Property<Object>("breakpoint_highlight")
	val filter = [KStyle style | 
	       var boolean isProperty = style.getProperty(BREAKPOINT_HIGHLIGHTING_MARKER) instanceof BreakpointVisualizationHook 
	       return isProperty
	   ]
	val blueFilter = [KStyle style | 
	    var boolean isKForeground = (style instanceof KForeground) 
	    var Object property = style.getProperty(BREAKPOINT_HIGHLIGHTING_MARKER) 
	    var boolean hasBreakpointProperty = property instanceof BreakpointVisualizationHook 
	    return isKForeground && hasBreakpointProperty
	]
	
	static KColor SCCHARTSBLUE1 = factory.createKColor.setColor(60, 150, 60)
	static KColor SCCHARTSBLUE2 = factory.createKColor.setColor(0, 150, 0)
	
	static KBackground STYLE1 = factory.createKBackground.setColors(SCCHARTSBLUE1, SCCHARTSBLUE2).setGradientAngle2(90)
	val _kRenderingExtensions = new KRenderingExtensions
	val _kContainerRenderingExtensions = new KContainerRenderingExtensions
	
	val BreakpointUtility breakpointUtility
	// --------------------------------------------------------------------------------------------
	/** 
	 * Constructor that also sets the instance variable.
	 */
	 new() {
		super()
		instance = this 
		breakpointUtility = BreakpointUtility.instance
	}
	
	/** 
	 * Makes sure that there is an instance to return. In case it does not exist, it will be
	 * created.
	 * @return The instance of this class.
	 */
	def static BreakpointVisualizationHook getInstance() {
		if (instance === null) {
			instance = new BreakpointVisualizationHook() 
		}
		return instance 
	}
	
	// --------------------------------------------------------------------------------------------
	/** 
	 * {@inheritDoc}
	 */
	override void start(Scope scope, KNode node) {
		if (scope instanceof State) {
			SCChartsBreakpointTargetAdapter.instance.updateLineEObjectMap(scope as EObject) 
		}
		viewContext = usedContext;
		states.clear 
		transitions.clear 
	}
	/** 
	 * {@inheritDoc}
	 */
	override void processState(State state, KNode node) {
		val editor = PlatformUI.workbench.activeWorkbenchWindow.activePage.activeEditor
		val editorPart = editor as XtextEditor
		val IResource resource = editorPart.editorInput.getAdapter(IResource) as IResource
		if (breakpointUtility.isEObjectInLine(state, resource)) {
		  states.put(state, node);
		}
		
	}
	/** 
	 * {@inheritDoc}
	 */
	override void processTransition(Transition transition, KEdge edge) {
		val editor = PlatformUI.workbench.activeWorkbenchWindow.activePage.activeEditor
		val editorPart = editor as XtextEditor
		val resource = editorPart.editorInput.getAdapter(IResource) as IResource
        if (breakpointUtility.isEObjectInLine(transition, resource)) {
            transitions.put(transition, edge);
        }
		
	}
	
	/** 
	 * {@inheritDoc}
	 */
	override ViewContext getUsedContext() {
		return super.usedContext
	}
	
	/** 
	 * {@inheritDoc}
	 */
	override void finish(Scope scope, KNode node) {
		if (scope instanceof State) {
			val bs = DebugPlugin.^default.breakpointManager.breakpoints 
			for (b : bs) {
				val bResource = b.marker.resource 
				val editor = PlatformUI.workbench.activeWorkbenchWindow.activePage.activeEditor
				val editorPart = editor as XtextEditor 
				val resource = editorPart.editorInput.getAdapter(IResource) as IResource 
				if (b instanceof LineBreakpoint && resource.equals(bResource)) {
					try {
						val lb = b as LineBreakpoint 
						var obj = SCChartsBreakpointTargetAdapter.lineToModelElement.get(lb.lineNumber) 
						handleHighlight(obj, true) 
					} catch (CoreException e) {
						e.printStackTrace 
					}
					
				}
			}
			states.clear 
			transitions.clear 
		}
	}
	/***********************************************************************************************
     * HIGHLIGHTING *
     ***********************************************************************************************/
	/** 
	 * {@inheritDoc}
	 */
	def void handleHighlight(EObject obj, boolean highlighting) {
		if (obj instanceof State) {
			handleStateHighlight(obj as State, highlighting) 
		} else if (obj instanceof Transition) {
			handleTransitionHighlight(obj as Transition, highlighting) 
		}
	}
	
	// ---------------------------- TRANSITION HIGHLIGHTING ---------------------------------------
	def private void handleTransitionHighlight(Transition obj, boolean highlighting) {
		var viewElementTransition = transitions.get(obj) 
		if (viewElementTransition === null) {
			updateViewContext
			viewElementTransition = viewContext.getTargetElement(obj, KEdge) 
		}
		handleTransitionHighlight(obj, highlighting, viewElementTransition) 
	}
	
	def private void handleTransitionHighlight(Transition obj, boolean highlighting, KEdge viewElementTransition) {
		if (highlighting) {
			if (viewElementTransition !== null) {
				addBreakpointDecorator(viewElementTransition) 
			}
		} else {
			if (viewElementTransition !== null) {
				removeBreakpointDecorator(viewElementTransition) 
			}
		}
	}
	
	def private KEllipse addBreakpointDecorator(KEdge edge) {
		val _line = this.line(edge) 
		val _addEllipse = _kContainerRenderingExtensions.addEllipse(_line) 
		_addEllipse.id = ellipseId 
		val Procedure1<KEllipse> _function = [KEllipse it | {
			_kRenderingExtensions.<KEllipse>setDecoratorPlacementData(it, 8, 8, -4, 0.5f, false) 
			_kRenderingExtensions.setLineWidth(it, 1) 
			_kRenderingExtensions.setBackground(it, factory.createKColor.setColor(60, 60, 150)) 
		}] 
		return ObjectExtensions.<KEllipse>operator_doubleArrow(_addEllipse, _function) 
	}
	
	def private KEllipse removeBreakpointDecorator(KEdge edge) {
		val _line = this.line(edge) 
		val children = _line.children.iterator
		var found = false
		var KRendering ren
		while(!found && children.hasNext) {
		    ren = children.next
			if (ren.id === ellipseId) {
				found = true // fix for missing break
			}
		}
		_line.children.remove(ren)
		return null // TODO why return anything here?
	}
	
	def private KPolyline line(KEdge edge) {
		val _kContainerRendering = _kRenderingExtensions.getKContainerRendering(edge) 
		return (_kContainerRendering as KPolyline) 
	}
	
	// ---------------------------- STATE HIGHLIGHTING --------------------------------------------
	def private void handleStateHighlight(State obj, boolean highlighting) {
		var viewElement = states.get(obj) 
		if (viewElement === null) {
			updateViewContext
			viewElement = viewContext.getTargetElement(obj, KNode) 
		}
		handleStateHighlight(obj, highlighting, viewElement) 
	}
	
	def private void handleStateHighlight(State obj, boolean highlighting, KNode viewElement) {
		val currentStates = newArrayList() 
		if (viewElement !== null) {
			currentStates.add(viewElement) 
		}
		if (highlighting) {
			addStateHighlighting(currentStates) 
		} else {
			removeStateHighlighting(viewElement) 
		}
	}
	
	def private void addStateHighlighting(List<KNode> currentStates) {
		// Add highlighting for NEW highlighted elements
		val nodeStyle = factory.createKBackground().setColorsAlphasGradientAngleCopiedFrom(STYLE1) 
		nodeStyle.setProperty(BREAKPOINT_HIGHLIGHTING_MARKER, BreakpointVisualizationHook.this) 
		nodeStyle.setPropagateToChildren(true) 
		val labelStyle = factory.createKForeground().setColor(Colors.WHITE) 
		labelStyle.setProperty(BREAKPOINT_HIGHLIGHTING_MARKER, BreakpointVisualizationHook.this) 
		for (viewElementState : currentStates) {
			val ren = viewElementState.getData(KContainerRendering) 
			val flagged = Iterables.any(ren.styles, filter) 
			if (!flagged) {
				Display.^default.syncExec([
				    for (viewElementStateLabel : Iterables2.toIterable(Iterators.filter(ren.eAllContents(), KText))) {
					   viewElementStateLabel.styles.add(EcoreUtil.copy(labelStyle)) 
				    }
				    ren.styles.add(EcoreUtil.copy(nodeStyle)) 
				    viewContext.viewer.scale(viewElementState, 1.0f) 
				    for (r : viewElementState.children) {
					   if (!viewContext.viewer.isExpanded(r)) {
					       viewContext.viewer.expand(r) 
					       kNodesExpanded.add(r) 
					   }
				    }
			    ]) 
			}
		}
	}
	
	def private void removeStateHighlighting(KNode viewElement) {
		// Remove new highlighted from ALL elements to get NOT highlighted
		val notHighlightedStates = new ArrayList<KNode>() 
		notHighlightedStates.add(viewElement) 
		// Remove highlighting for NOT highlighted elements
        Display.^default.syncExec([
	       for (k : notHighlightedStates) {
                updateViewContext() 
                viewContext.viewer.scale(k, 1f) 
                var ren = k.getData(KRendering) 
                if (Iterables.any(ren.styles, filter)) {
				    Iterables.removeIf(ren.styles, filter) 
				    var list = Iterables2.toIterable(Iterators.filter(ren.eAllContents(), KText)) 
				    for (t : list) {
					   Iterables.removeIf(t.styles, blueFilter) 
				    }
                }
                if (kNodesExpanded.contains(k)) {
				    viewContext.viewer.collapse(k) 
				    kNodesExpanded.remove(k) 
                }
		  }
        ]) 
	}
	
	def private void updateViewContext() {
		val workbenchWindow = PlatformUI.workbench.activeWorkbenchWindow 
		if (workbenchWindow !== null) {
			val diagramEditor = workbenchWindow.activePage.activeEditor 
			val diagramViews = DiagramView.getDiagramViews(diagramEditor) 
			val viewPart = diagramViews.get(0) 
			viewContext = viewPart.viewer.viewContext 
		}
	}
}
