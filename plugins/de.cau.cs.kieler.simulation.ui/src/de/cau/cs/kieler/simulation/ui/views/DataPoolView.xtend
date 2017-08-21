/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.simulation.ui.views

import com.google.common.base.Strings
import com.google.common.collect.Iterables
import de.cau.cs.kieler.klighd.ViewContext
import de.cau.cs.kieler.klighd.kgraph.KLabeledGraphElement
import de.cau.cs.kieler.klighd.krendering.Colors
import de.cau.cs.kieler.klighd.krendering.KContainerRendering
import de.cau.cs.kieler.klighd.krendering.KForeground
import de.cau.cs.kieler.klighd.krendering.KRenderingFactory
import de.cau.cs.kieler.klighd.krendering.KStyle
import de.cau.cs.kieler.klighd.krendering.KText
import de.cau.cs.kieler.klighd.ui.view.DiagramView
import de.cau.cs.kieler.prom.console.PromConsole
import de.cau.cs.kieler.prom.ui.PromUIPlugin
import de.cau.cs.kieler.prom.ui.views.LabelContribution
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.processors.transformators.TakenTransitionSignaling
import de.cau.cs.kieler.simulation.core.DataPool
import de.cau.cs.kieler.simulation.core.Model
import de.cau.cs.kieler.simulation.core.NDimensionalArray
import de.cau.cs.kieler.simulation.core.SimulationEvent
import de.cau.cs.kieler.simulation.core.SimulationEventType
import de.cau.cs.kieler.simulation.core.SimulationListener
import de.cau.cs.kieler.simulation.core.SimulationManager
import de.cau.cs.kieler.simulation.core.Variable
import de.cau.cs.kieler.simulation.handlers.TraceMismatchEvent
import de.cau.cs.kieler.simulation.ui.SimulationUiPlugin
import de.cau.cs.kieler.simulation.ui.toolbar.SubTicksEnabledPropertyTester
import java.util.ArrayList
import java.util.List
import java.util.Map
import org.eclipse.elk.graph.properties.Property
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.jface.action.Action
import org.eclipse.jface.action.Separator
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.jface.viewers.ArrayContentProvider
import org.eclipse.jface.viewers.ColumnViewerEditor
import org.eclipse.jface.viewers.ColumnViewerEditorActivationStrategy
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport
import org.eclipse.jface.viewers.FocusCellOwnerDrawHighlighter
import org.eclipse.jface.viewers.TableViewer
import org.eclipse.jface.viewers.TableViewerColumn
import org.eclipse.jface.viewers.TableViewerEditor
import org.eclipse.jface.viewers.TableViewerFocusCellManager
import org.eclipse.swt.SWT
import org.eclipse.swt.events.KeyAdapter
import org.eclipse.swt.events.KeyEvent
import org.eclipse.swt.graphics.Image
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Table
import org.eclipse.ui.IWorkbenchPart
import org.eclipse.ui.part.ViewPart
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.State
import java.util.Iterator
import de.cau.cs.kieler.sccharts.iterators.StateIterator

/**
 * @author aas
 *
 */
class DataPoolView extends ViewPart {
    
    public static val VIEW_ID = "de.cau.cs.kieler.simulation.ui.dataPoolView"
    
    public static var DataPoolView instance
    
    public static val simulationListener = createSimulationListener
    
    @Accessors(PUBLIC_GETTER)
    static var boolean subTicksEnabled
    
    @Accessors(PUBLIC_GETTER)
    private var TableViewer viewer
    
    private var TableViewerColumn variableColumn
    private var TableViewerColumn valueColumn
    private var TableViewerColumn userValueColumn
    private var TableViewerColumn historyColumn
    private var TableViewerColumn inputOutputColumn
    
    private var LabelContribution tickInfo
    
    private var DataPoolFilter filter
    
    private var Map<String, TraceMismatchEvent> traceMismatches = newHashMap
    
    // Diagram highlighting
    private val HIGHLIGHTING_MARKER = new Property<Object>("highlighting");
    private var ViewContext diagramViewContext
    private var List<KLabeledGraphElement> lastHighlighting = newArrayList
    
    private var List<Transition> traversedTransitions = <Transition> newArrayList
    private var List<State> traversedStates = <State> newArrayList
    private var List<State> currentStates = <State> newArrayList
    
    /**
     * @see IWorkbenchPart#createPartControl(Composite)
     */
     override createPartControl(Composite parent) {
        // Remember the instance
        instance = this
        SimulationManager.addListener(simulationListener)
        
        // Create viewer.
        viewer = createTable(parent);
                                         
        // Create menu and toolbars.
        createMenu
        createToolbar
        
        // Add key listeners for fast controls
        addKeyListeners()
    }
    
    /**
     * {@inheritDoc}
     */
    override setFocus() {
        viewer.refresh
        viewer.control.setFocus
    }
    
    /**
     * Dispose and clear reference to singleton instance.
     */
    override dispose() {
        super.dispose()
        instance = null
    }
    
    /**
     * Set the data pool to be displayed.
     */
    public def void setDataPool(DataPool pool) {
        // Remove all trace mismatches of last tick
        if(pool == null) {
            viewer.input = null
            traceMismatches = newHashMap
            statusLineText = ""
        } else {
            // Create a sorted list as input for the table viewer
            val List<Object> inputs = newArrayList()
            // Sort models by name
            val List<Model> sortedModels = pool.models.sortBy[it.name]
            // Add variables of models. The variables are also sorted.
            for(m : sortedModels) {
                inputs += m
                val sortedVariables = m.variables.sortWith(new VariableComparator)
                for(v : sortedVariables) {
                    inputs += v
                }
            }
            // Set input of viewer
            viewer.input = inputs
        }
    }
    
    /**
     * Create menu.
     */
    private def void createMenu() {
        val mgr = getViewSite().getActionBars().getMenuManager();
        mgr.add(new ToggleColumnVisibleAction(historyColumn));
        mgr.add(new ToggleColumnVisibleAction(inputOutputColumn));
        mgr.add(new Action("Show Internal Variables") {
            override run() {
                filter.internalVariables = !filter.internalVariables
                viewer.refresh
            }
        });
        mgr.add(new Separator())
        mgr.add(new Action("Clear Trace Mismatches") {
            override run() {
                traceMismatches = newHashMap
                viewer.refresh
            }
        });
        mgr.add(new Separator())
        mgr.add(new Action("Enable Sub Ticks") {
            override run() {
                subTicksEnabled = !subTicksEnabled
                if(subTicksEnabled) {
                    setText("Disable Sub Ticks")
                } else {
                    setText("Enable Sub Ticks")
                }
                
                // Trigger re-evaluation of the property tester
                // that controls the visibility of the toolbar button
                SubTicksEnabledPropertyTester.update
            }
        })
    }
    
    private def void createToolbar() {
        val mgr = getViewSite().getActionBars().getToolBarManager()
        tickInfo = new LabelContribution("de.cau.cs.kieler.simulation.ui.dataPoolView.tickInfo",
                                         "Tick #0000 (-000)",
                                         "Last executed macro tick")
        mgr.add(tickInfo)
        mgr.add(new Separator())
        mgr.add(new SearchFieldContribution("de.cau.cs.kieler.simulation.ui.dataPoolView.searchField"))
        mgr.add(new Separator())
        mgr.add(new SimulationDelayContribution("de.cau.cs.kieler.simulation.ui.dataPoolView.delay"))
        mgr.add(new Separator())
        mgr.add(new SaveSimulationAction("Save Data Pool History", "saveFile.png") {
            override getFileExtension() {
                return ".sim"
            }
            
            override getFileContent(List<DataPool> history) {
                // Turn models of data pool history to json objects
                var String content = ""
                for(pool : history) {
                    content += pool.models.get(0).toJson+"\n"
                }
                return content
            }
        });
        mgr.add(new SaveSimulationAction("Save Eso trace", "saveEsoFile.png") {
            override getFileExtension() {
                return ".eso"
            }
            
            override getFileContent(List<DataPool> history) {
                // Turn models of data pool history to eso file
                var String content = ""
                content += "! reset;\n"
                for(pool : history) {
                    for(v : pool.allVariables) {
                        if(v.isInput && v.isPresent) {
                            content += v.name
                            if(v.value instanceof Integer) {
                                content += "("+v.value+")"
                            }
                            content += " "
                        }
                    }
                    content += "\n"
                    content += "% Output: "
                    for(v : pool.allVariables) {
                        if(v.isOutput && v.isPresent) {
                            content += v.name
                            if(v.value instanceof Integer) {
                                content += "("+v.value+")"
                            }
                            content += " "
                        }
                    }
                    content += "\n;\n"
                }
                return content
            }
        });
        mgr.add(new Separator())
        mgr.add(new Action("Reset All"){
            override run(){
                for(i : viewer.input as ArrayList<Object>) {
                    if(i instanceof Variable) {
                        val variable = i as Variable
                        variable.userValue = null
                    } 
                }
                viewer.refresh
            }
        });
        mgr.add(new Action("Reset Selection"){
            override run(){
                val variable = viewer.structuredSelection.firstElement as Variable
                if(variable != null) {
                    variable.userValue = null
                    viewer.update(variable, null)
                } 
            }
        });
        mgr.add(new Separator())
        mgr.add(new DataPoolViewToolbarAction("Show Controls", "help.png") {
            override run() {
                val title = "Controls for the Data Pool View"
                val message = "Right Arrow : Step simulation macro tick\n"
                val dialog = new MessageDialog(viewer.control.shell, title, null, message, 0, #["OK"], 0)
                dialog.open
            }
        })
    }
    
    private def void addKeyListeners() {
        // Step through simulation via ARROW_RIGHT.
        viewer.control.addKeyListener(new KeyAdapter() {
            override keyPressed(KeyEvent e) {
                val manager = SimulationManager.instance
                if(e.keyCode == SWT.ARROW_RIGHT) {
                    if(manager != null) {
                        PromConsole.print("Step macro tick")
                        manager.stepMacroTick()
                    }
                }
            }
        })
    }
    
    private def TableViewer createTable(Composite parent) {
        val table = new Table(parent, SWT.BORDER.bitwiseOr(SWT.FULL_SELECTION))
        table.setHeaderVisible(true);
        table.setLinesVisible(true);

        // Create viewer
        val viewer = new TableViewer(table)
        // Support objects that are "equal" yet two different objects in memory.
        viewer.comparer = new IdentityComparer()
        // Add filter to viewer
        filter = new DataPoolFilter
        viewer.addFilter(filter)
        
        // Create columns
        variableColumn = createTableColumn(viewer, "Variable", 120, true)
        variableColumn.labelProvider = new DataPoolColumnLabelProvider() {
            override String getText(Object element) {
                if(element instanceof Variable) {
                    if(element.isDirty)
                        return "*"+element.name
                    else
                        return element.name
                } else if(element instanceof Model) { 
                    return "-----" + element.name + "-----"
                }
            }
        };
        valueColumn = createTableColumn(viewer, "Current Value", 100, true)
        valueColumn.labelProvider = new DataPoolColumnLabelProvider() {
            override String getToolTipText(Object element) {
                if(element instanceof Variable) {
                    // Add tooltip about trace mismatch of this value
                    val mismatch = getTraceMismatch(element)
                    if(mismatch != null) {
                        return mismatch.toString
                    }
                }
                return super.getToolTipText(element)
            }
            
            override String getText(Object element) {
                 if(element instanceof Variable) {
                    return element.value?.toString
                }
                return ""
            }
        };
        userValueColumn = createTableColumn(viewer, "User Value", 100, true)
        userValueColumn.labelProvider = new DataPoolColumnLabelProvider() {
            override String getText(Object element) {
                 if(element instanceof Variable) {
                    if(element.isDirty) {
                        return element.userValue.toString    
                    }
                }
                return ""
            }
        };
        historyColumn = createTableColumn(viewer, "History", 200, true)
        historyColumn.labelProvider = new HistoryColumnLabelProvider()
        
        inputOutputColumn = createTableColumn(viewer, "In Out", 32, false)
        inputOutputColumn.labelProvider = new DataPoolColumnLabelProvider() {
            private val inputImageDescriptor = SimulationUiPlugin.imageDescriptorFromPlugin(SimulationUiPlugin.PLUGIN_ID, "icons/input.png");
            private val outputImageDescriptor = SimulationUiPlugin.imageDescriptorFromPlugin(SimulationUiPlugin.PLUGIN_ID, "icons/output.png");
            private val inputOutputImageDescriptor = SimulationUiPlugin.imageDescriptorFromPlugin(SimulationUiPlugin.PLUGIN_ID, "icons/inputOutput.png");
            private var Image inputImage
            private var Image outputImage
            private var Image inputOutputImage
            
            override getImage(Object element) {
                if(element instanceof Variable) {
                    if(element.isInput && element.isOutput) {
                        if(inputOutputImage == null) {
                            inputOutputImage = inputOutputImageDescriptor.createImage    
                        }
                        return inputOutputImage
                    } else if (element.isInput) {
                        if(inputImage == null) {
                            inputImage = inputImageDescriptor.createImage    
                        }
                        return inputImage
                    } else if (element.isOutput) {
                        if(outputImage == null) {
                            outputImage = outputImageDescriptor.createImage    
                        }
                        return outputImage
                    }
                }
                
            }
            
            override String getToolTipText(Object element) {
                if(element instanceof Variable) {
                    if(element.isInput && element.isOutput) {
                        return "Input and output"
                    } else if (element.isInput) {
                        return "Input"
                    } else if (element.isOutput) {
                        return "Output"
                    } else {
                        return "Neither input nor output"
                    }
                }
            }
            
            override String getText(Object element) {
                return ""
            }
            
            override dispose() {
                // Dispose created images
                inputImage?.dispose()
                inputImage = null
                outputImage?.dispose()
                outputImage = null
                inputOutputImage?.dispose()
                inputOutputImage = null
            }
        };

        // Fancy tooltips
        ColumnViewerToolTipSupport.enableFor(viewer)

        // Create content
        viewer.setContentProvider(ArrayContentProvider.instance);
        viewer.input = newArrayList()
        
        // Make cells editable
        userValueColumn.editingSupport = new ValueColumnEditingSupport(viewer)
        
        // Use TAB to go to next row neighbor and activate cell editor
        val focusCellManager = new TableViewerFocusCellManager(viewer, new FocusCellOwnerDrawHighlighter(viewer));
        val activationSupport = new ColumnViewerEditorActivationStrategy(viewer)
        activationSupport.enableEditorActivationWithKeyboard = true
        TableViewerEditor.create(viewer, focusCellManager, activationSupport, ColumnViewerEditor.TABBING_HORIZONTAL.bitwiseOr(
            ColumnViewerEditor.TABBING_MOVE_TO_ROW_NEIGHBOR).bitwiseOr(
            ColumnViewerEditor.TABBING_VERTICAL).bitwiseOr(
            ColumnViewerEditor.KEYBOARD_ACTIVATION))
            
        return viewer
    }
    
    /**
     * Creates a column for a table viewer with the given title and width.
     * 
     * @param viewer The TableViewer this column is added to
     * @param title The title for this column
     * @param width The width of this column
     * @return the created column.
     */
    public static def TableViewerColumn createTableColumn(TableViewer viewer, String title, int width, boolean visible) {
        val viewerColumn = new TableViewerColumn(viewer, SWT.NONE);
        val column = viewerColumn.getColumn()
        column.setText(title);
        column.setMoveable(true);
        
        if(visible) {
            column.width = width
            column.resizable = true
        } else {
            column.width = 0
            column.resizable = false
        }
        return viewerColumn
    }
    
    public def void registerTraceMismatch(Variable variable, TraceMismatchEvent e) {
        traceMismatches.put(variable.fullyQualifiedName, e)
    }
    
    public def TraceMismatchEvent getTraceMismatch(Variable variable) {
        return traceMismatches.getOrDefault(variable.fullyQualifiedName, null)
    }
    
    private def void updateTickInfo(SimulationEvent e) {
        var String txt = null
        if(e.type != SimulationEventType.STOP) {
            val simMan = SimulationManager.instance
            val macroTick = simMan.currentMacroTickNumber
            val subTick = simMan.currentSubTickNumber
            txt = "Tick #"+macroTick
            if(subTick > 0) {
                txt += "," + subTick
            }
            if(SimulationManager.instance.positionInHistory > 0) {
                txt += " (-" + SimulationManager.instance.positionInHistory + ")"
            }
        }
        tickInfo?.setText(Strings.nullToEmpty(txt))
    }
    
    private def void setStatusLineText(String value) {
        val bars = getViewSite().getActionBars();
        if(bars != null) {
            val statusLineManager = bars.getStatusLineManager()
            statusLineManager.setMessage(value);
        }
    }
    
    public def void setFilterText(String text) {
        filter.searchString = text
        viewer.refresh
    }
    
    private static def SimulationListener createSimulationListener() {
        val listener = new SimulationListener() {
            override update(SimulationEvent e) {
                val dataPoolView = DataPoolView.instance
                if(dataPoolView == null) {
                    return;
                }
                if(e.type == SimulationEventType.ERROR) {
                    PromUIPlugin.asyncExecInUI[
                        dataPoolView.setStatusLineText(e.message)    
                    ]
                }else if(e.type == SimulationEventType.VARIABLE_CHANGE) {
                    PromUIPlugin.asyncExecInUI[
                        dataPoolView.viewer.update(e.variable, null)    
                    ]
                } else if(e.type == SimulationEventType.TRACE) {
                    if(e instanceof TraceMismatchEvent) {
                        dataPoolView.registerTraceMismatch(e.variable, e)
                        dataPoolView.viewer.update(e.variable, null)
                    }
                } else {
                    // Execute in UI thread
                    PromUIPlugin.asyncExecInUI[
                        val pool = SimulationManager.instance?.currentPool
                        // Update tick info
                        dataPoolView.updateTickInfo(e)
                        // Set pool data
                        dataPoolView.setDataPool(pool)
                        
                        // Highlight the simulation control flow in the diagram
                        dataPoolView.unhighlightDiagram
                        if(e.type != SimulationEventType.STOP) {
                            if(e.type == SimulationEventType.INITIALIZED) {
                                dataPoolView.currentStates = null
                            } else {
                                dataPoolView.highlightDiagram(pool)    
                            }    
                        }
                    ]
                }
            }
        }
        return listener
    }
    
    private def void calculateSimulationControlFlow(DataPool pool) {
        traversedTransitions.clear
        traversedStates.clear
        if(pool == null) {
            return
        }
        val transitionArrayVariable = pool.getVariable(TakenTransitionSignaling.transitionArrayName)
        if(transitionArrayVariable == null || !(transitionArrayVariable.value instanceof NDimensionalArray)) {
            return
        }
        val transitionArray = transitionArrayVariable.value as NDimensionalArray
        
        // Calculate traversed transitions
        var State rootState
        val currentDiagramModel = diagramViewContext.inputModel
        if(currentDiagramModel instanceof SCCharts) {
            if(!currentDiagramModel.rootStates.isEmpty) {
                rootState = currentDiagramModel.rootStates.get(0)
            }            
        }
        if(rootState == null) {
            return
        }
        
        val transitions = TakenTransitionSignaling.getTransitions(rootState)
        // For an emitted transition in the transition array,
        // look for the transition in the model with the corresponding index.
        var index = 0
        for(transitionArrayElement : transitionArray.elements) {
            // The array contains the number of times that the transition has been taken in this tick
            val value = transitionArrayElement.value
            if(value instanceof Integer) {
                if(value > 0) {
                    // The transition has been taken at least once
                    try {
                        val traversedTransition = transitions.get(index)
                        traversedTransitions.add(traversedTransition)
                    } catch(IndexOutOfBoundsException e) {
                        throw new Exception("IndexOutOfBoundsException in the diagram visualization. Please check that the shown diagram is for the simulated model?")
                    }
                }
            } else {
                throw new Exception("The 'taken transition array' has a incompatible type for diagram highlighting")
            }
            index++
        }
        
        // Calculate traversed states
        for(traversedTransition : traversedTransitions) {
            traversedStates.add(traversedTransition.sourceState)
        }
        
        // Calculate current states
        if(currentStates == null) {
            currentStates = getInitialStates(rootState)    
        }
        currentStates = calculateNewCurrentStates(currentStates, traversedTransitions)
    }
    
    private def List<State> calculateNewCurrentStates(List<State> oldCurrentStates, List<Transition> takenTransitions) {
        val newCurrentStates = <State> newArrayList
        
        // Preprocessing for better performance of lookup
        val seenStates = <State> newHashSet
        val outgoingTransitionsForState = <State, List<Transition>> newHashMap
        for(trans : takenTransitions) {
            val source = trans.sourceState
            val outgoingTransitionsOfSource = outgoingTransitionsForState.getOrDefault(source, newArrayList)
            outgoingTransitionsOfSource.add(trans)
            outgoingTransitionsForState.put(trans.sourceState, outgoingTransitionsOfSource)
        }
        
        // Follow path of transitions from current states to the ending state, which is the new current state.
        // NOTE: This only works if the used transition for a state is unambiguous, i.e.,
        // there is at most one outgoing transition per state in this tick. 
        val states = oldCurrentStates
        while(!states.isNullOrEmpty) {
            val state = states.get(0)
            seenStates.add(state)
            val outgoingTransitions = outgoingTransitionsForState.getOrDefault(state, newArrayList)
            if(outgoingTransitions.size == 0) {
                // No outgoing transitions, thus the control flow stays here
                newCurrentStates.add(state)
                // This state is done
                states.remove(state)
            } else if(outgoingTransitions.size == 1) {
                // Exactly one outgoing transition, thus the next state is unambiguous
                val transition = outgoingTransitions.get(0)
                val next = transition.targetState
                
                // Leave state
                states.remove(state)
                // Also leave all child states
                val children = StateIterator.sccAllContainedStates(state)
                states.removeAll(children.toList)
                
                // Enter next state
                states.add(next)
                // Also enter all initial child states
                val nextInitialStates = getInitialStates(next)
                states.addAll(nextInitialStates)
                
                // This transition is done
                outgoingTransitions.remove(transition)
            } else {
                // More than one outgoing state. It is not clear which path has been taken.
                System.err.println("The used control flow cannot be clearly determined for this tick. Diagram highlighting of current state will not work.")
                return newCurrentStates
            }
        }
        
        return newCurrentStates
    }
    
    private def ViewContext getDiagramViewContext() {
        val diagramViews = DiagramView.getAllDiagramViews
        if (!diagramViews.isNullOrEmpty) {
            val DiagramView viewPart = diagramViews.get(0);
            val viewer = viewPart.getViewer() 
            return viewer.getViewContext();
        }
    }
    
    private def void unhighlightDiagram() {
        if(!lastHighlighting.isNullOrEmpty) {
            for (graphElement : lastHighlighting) {
                unhighlightElement(graphElement)
            }
        }
    }
    
    private def void highlightDiagram(DataPool pool) {
        if(diagramViewContext == null) {
            diagramViewContext = getDiagramViewContext    
        }
        
        calculateSimulationControlFlow(pool)
        
        if(traversedTransitions.isNullOrEmpty && traversedStates.isNullOrEmpty && currentStates.isNullOrEmpty) {
            return
        }
        
        // Find the graph elements in the diagram for the EObjects that should be highlighted
        val traversedGraphElements = getGraphElements(traversedTransitions + traversedStates)
        val currentGraphElements = if(currentStates.isNullOrEmpty)
                                       newArrayList
                                   else
                                       getGraphElements(#[] + currentStates)
        lastHighlighting = (traversedGraphElements + currentGraphElements).toList

        // Add new highlighting
        val traversedStyle = KRenderingFactory.eINSTANCE.createKForeground()
        traversedStyle.setColor(Colors.DODGER_BLUE)
        traversedStyle.setPropagateToChildren(true)
        
        val currentStyle = KRenderingFactory.eINSTANCE.createKForeground()
        currentStyle.setColor(Colors.RED)
        currentStyle.setPropagateToChildren(true)
        
        // Highlight traversed elements
        for (graphElement : traversedGraphElements) {
            highlightElement(graphElement, traversedStyle)
        }
        // Highlight current elements
        for (graphElement : currentGraphElements) {
            highlightElement(graphElement, currentStyle)
        }
    }
    
    private def void highlightElement(KLabeledGraphElement elem, KForeground style) {
        // Remember that this style is to highlight the diagram.
        // This is used to filter for highlighting styles when they should be removed.
        style.setProperty(HIGHLIGHTING_MARKER, DataPoolView.this)
        // Highlight container of this element
        val ren = elem.getData(typeof(KContainerRendering))
        ren.styles.add(EcoreUtil.copy(style))
        // Highlight label of this element
        if (!elem.labels.isNullOrEmpty) {
            val label = elem.labels.get(0)
            val ren2 = label.getData(typeof(KText))
            ren2.styles.add(EcoreUtil.copy(style))
        }
    }
    
    private def void unhighlightElement(KLabeledGraphElement elem) {
        // Remove highlighting from container of this element
        val ren = elem.getData(typeof(KContainerRendering));
        Iterables.removeIf(ren.styles, [it.isHighlighting]);
        // Remove highlighting from label of this element
        if (!elem.labels.isNullOrEmpty) {
            val label = elem.labels.get(0)
            val ren2 = label.getData(typeof(KText));
            Iterables.removeIf(ren2.styles, [it.isHighlighting]);
        }
    }
    
    private def boolean isHighlighting(KStyle style) {
        return style.getProperty(HIGHLIGHTING_MARKER) == DataPoolView.this
    }
    
    private def List<KLabeledGraphElement> getGraphElements(Iterable<EObject> eObjects) {
        val elements = <KLabeledGraphElement> newArrayList
        for (eObject : eObjects) {
            val element = diagramViewContext.getTargetElement(eObject, typeof(KLabeledGraphElement));
            if (element != null) {
                elements.add(element);
            }
        }
        return elements
    }
    
    private def List<State> getInitialStates(State rootState) {
        val initialStates = <State> newArrayList
        for(region : rootState.regions) {
            if(region instanceof ControlflowRegion) {
                val initState = region.states.findFirst[it.isInitial]
                if(initState != null) {
                    initialStates.add(initState)
                }
            }
        }
        return initialStates
    }
}