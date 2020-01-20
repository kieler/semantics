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
package de.cau.cs.kieler.sccharts.ui.debug.breakpoints

import org.eclipse.jdt.debug.core.IJavaBreakpointListener
import org.eclipse.jdt.debug.core.IJavaDebugTarget
import org.eclipse.jdt.debug.core.IJavaBreakpoint
import org.eclipse.jdt.debug.core.IJavaLineBreakpoint
import org.eclipse.debug.core.DebugException
import org.eclipse.jdt.debug.core.IJavaThread
import org.eclipse.jdt.debug.core.IJavaType
import java.nio.charset.StandardCharsets
import org.eclipse.swt.widgets.Display
import de.cau.cs.kieler.sccharts.SCCharts
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.texteditor.ITextEditor
import org.eclipse.jdt.core.ICompilationUnit
import org.eclipse.jdt.core.IMethod
import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import java.util.List
import org.eclipse.ui.progress.UIJob
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Status
import com.google.inject.Guice
import org.eclipse.jdt.internal.debug.core.model.JDIStackFrame
import de.cau.cs.kieler.sccharts.text.parser.SCTXStandaloneParser
import org.eclipse.jdt.ui.JavaUI
import org.eclipse.jdt.core.dom.Message
import de.cau.cs.kieler.sccharts.processors.statebased.DebugAnnotations
import de.cau.cs.kieler.sccharts.ui.debug.view.DebugDiagramView
import de.cau.cs.kieler.sccharts.ui.debug.highlighting.DebugHighlighter
import org.eclipse.jdt.debug.core.IJavaVariable
import de.cau.cs.kieler.sccharts.Transition

/**
 * @author peu
 *
 */
class JavaBreakpointListener implements IJavaBreakpointListener {
    
    @Inject extension SCChartsScopeExtensions
    
    
    new() {
        super()
        pendingBreakpoints = <IJavaBreakpoint> newLinkedList
        Guice.createInjector.injectMembers(this)
    }
    
    val debugHighlighter = DebugHighlighter.instance
    
//    var breakpointToTarget = new HashMap<IJavaBreakpoint,IJavaDebugTarget>()
    
    var lastModelString = ""
    var SCCharts currentModel;
    
    val List<IJavaBreakpoint> pendingBreakpoints
    
    /**
     * Find the model states in the original SCChart currently being executed.
     */
    def List<State> findExecutingStates(IJavaThread thread, IJavaBreakpoint breakpoint, SCCharts model) {
        
        val executingStates = <State> newLinkedList
        
        // Each stack frame corresponds to one method call, each of which may correspond to a state's method
        for (frame : thread.stackFrames) {
            val methodName = (frame as JDIStackFrame).methodName
            
            // Use UIJob to get active editor -----------------------------------------
            val ITextEditor[] editorArr = newArrayOfSize(1)
            
            val job = new UIJob("getActiveEditor") {
                
                override runInUIThread(IProgressMonitor monitor) {
                    try {
                        editorArr.set(0, PlatformUI.getWorkbench?.activeWorkbenchWindow.getActivePage?.getActiveEditor as ITextEditor)
                        return Status.OK_STATUS
                    } catch (Exception e){
                        e.printStackTrace
                        return Status.CANCEL_STATUS
                    }
                }   
            }
            
            job.schedule
            job.join
            
            val editor = editorArr.head

            // Extract method object from editor corresponding the current stack frame 
            val typeRoot = JavaUI.getEditorInputTypeRoot(editor.editorInput)
            val compilationUnit = (typeRoot.getAdapter(ICompilationUnit) as ICompilationUnit)
            
            val methods = <IMethod> newLinkedList
            for (type : compilationUnit.allTypes) {
                methods.addAll(type.methods)
            }
            
            val foundMethods = <IMethod> newLinkedList
            
            for (method : methods) {
                if (method.elementName.equals(methodName)) {
                    foundMethods.add(method)
                }
            }
            
            // Get Javadoc attached to method(s) and resolve to SCCharts States in original model
            for (method : foundMethods) {
                
                val javadocRange = method.javadocRange
                if (javadocRange !== null) {
                    val comment = compilationUnit.source.substring(javadocRange.offset, javadocRange.offset + javadocRange.length)
                    // TODO redo this with regex matchers
                    val commentLines = comment.split("\n")
                    // get last-but-first line, which is the last text line of the comment
                    val stateNameString = commentLines.get(commentLines.length - 2)
                    val stateName = stateNameString.split("\\* ").get(1)
                    val states = model.getStatesByID(stateName.split(" ").get(1).split("\\(").get(0))
                    val stateHashString = stateName.split("\\(").last
                    val stateHashValue = stateHashString.substring(0, stateHashString.length - 1)
                    executingStates.addAll(states.filter[DebugAnnotations.getFullNameHash(it).toString.equals(stateHashValue)].toList)
                }
            }
        }
        
        return executingStates
    }
    
    /**
     * Extract all active states from the current model
     */
    def List<State> findActiveStates(IJavaThread thread, IJavaBreakpoint breakpoint, SCCharts model) {
        
        val context = thread.findVariable("rootContext")
        val activeStates = extractStatesFromContext(context, model) 
        return activeStates
        
    }
    
    /**
     * Recursively extract active states from this and all enclosed contexts
     */
    def List<State> extractStatesFromContext(IJavaVariable context, SCCharts model) {
        
        val vars = context.value.variables
        val activeStates = <State> newLinkedList
        
        for (variable : vars) {
            if (variable.name.equals("threadStatus")) {
                val status = variable.value?.variables.filter[name.equals("name")].head?.value?.valueString
                // If region was not yet initialized or has terminated already, ignore all active states within it
                if (status === null || status.equals("null") || status.equals("TERMINATED")) {
                    return <State> newLinkedList
                }
            } else if (variable.name.equals("activeState")) {
                // Get the currently active state on this hierarchy level
                val varValue = variable.value
                if (!varValue.valueString.equals("null") ) {
                    val stateName = varValue.variables.filter[name.equals("origin")].head.value.toString
                    // TODO redo this with regex matchers, throws exceptions
                    val states = model.getStatesByID(stateName.split(" ").get(1).split("\\(").get(0))
                    val stateHashString = stateName.split("\\(").last
                    val stateHashValue = stateHashString.substring(0, stateHashString.length - 2)
                    activeStates.addAll(states.filter[DebugAnnotations.getFullNameHash(it).toString.equals(stateHashValue)])
                }
            } else {
                // Get the active state from a child region
                activeStates.addAll(extractStatesFromContext(variable as IJavaVariable, model))
            }
        }
        
        return activeStates
    }
    
    /**
     * Return all states with a given name in a given model.
     * TODO move this to some helper method
     */
    def List<State> getStatesByID(SCCharts model, String stateName) {
        var col = <State> newLinkedList
        
        for (state : model.rootStates) {
            col.addAll(state.allStates.filter[name.equals(stateName)].toList)
        }
        
        return col
    }
    
    /**
     * Determine the transition associated with the given breakpoint.
     */
    def Transition findCurrentTransition(IJavaThread thread, IJavaBreakpoint breakpoint, SCCharts model, List<State> activeStates) {

        if (breakpoint instanceof TransitionCheckBreakpoint) {
            return breakpoint.transition
        }

//        // Use UIJob to get active editor -----------------------------------------
//        val ITextEditor[] editorArr = newArrayOfSize(1)
//
//        val job = new UIJob("getActiveEditor") {
//
//            override runInUIThread(IProgressMonitor monitor) {
//                try {
//                    editorArr.set(0,
//                        PlatformUI.getWorkbench?.activeWorkbenchWindow.getActivePage?.getActiveEditor as ITextEditor)
//                    return Status.OK_STATUS
//                } catch (Exception e) {
//                    e.printStackTrace
//                    return Status.CANCEL_STATUS
//                }
//            }
//        }
//
//        job.schedule
//        job.join
//
//        val editor = editorArr.head
//
//        // Extract line text -------------------------------------------------------
//        val lineNumber = (breakpoint as ILineBreakpoint).lineNumber - 1
//        val document = editor.documentProvider.getDocument(editor.editorInput)
//        val offset = document.getLineOffset(lineNumber) // TODO throws BadLocationException sometimes since the editor switches to the active breakpoint AFTER this method is complete
//        val length = document.getLineLength(lineNumber)
//        val lineText = document.get(offset, length)
//        
//        val lineTextSplit = lineText.split("//")
//        if (lineTextSplit.length >= 2) {
//            val commentText = lineTextSplit.get(1)
//            if (commentText !== null) {
//                // The line has a comment, which may be a transition indicator
//                val commentTextSplit = commentText.split("\\(Priority ")
//                if (commentTextSplit.length >= 2) { 
//                    // TODO does not work with more than 9 transitions on one state
//                    val prio = Integer.parseInt(commentTextSplit.get(1)?.charAt(0).toString)
//                    if (prio != 0) {
//                        // now determine what state the transition leaves from.
//                        // Note that that is usually, but not always the lowest active state.
//                        // Special case: abort.
//                        val transitionHashString = commentTextSplit.last.split("\\(")
//                        val transitionHash = transitionHashString.last.substring(0, transitionHashString.last.length - 2)
//                        for (state : activeStates) {
//                            if (state.outgoingTransitions.length >= prio) {
//                                val transition = state.outgoingTransitions.get(prio - 1)
//                                if (DebugAnnotations.getFullNameHash(transition).toString.equals(transitionHash)) {
//                                    return transition
//                                }
//                            }
//                        }
//                        
//                    }
//                }
//            }
//        }
        
        return null
    }
    
    override breakpointHit(IJavaThread thread, IJavaBreakpoint breakpoint) {
        if (!breakpoint.isEnabled) {
            println("Disabled breakpoint, skipping...")
            return DONT_SUSPEND
        }
        println("Hitting breakpoint!")
        println(breakpoint)

        val target = thread.debugTarget as IJavaDebugTarget
        val chartVar = target.findVariable("ORIGINAL_SCCHART")
        if (chartVar !== null && chartVar.javaType.name.equals("java.lang.String")) {
            println("Code is derived from SCChart!")
            val text = chartVar.value.valueString
            // Only re-display model if it's not the same one as before
            val diagramView = DebugDiagramView.instance
            if (currentModel === null || (text !== null && !text.equals(lastModelString)) || diagramView === null ||
                diagramView.needsInit) {
                lastModelString = text
                currentModel = SCTXStandaloneParser.parseScope(text, StandardCharsets.UTF_8)

                println("New model; New synthesis...")
                Display.^default.syncExec(new Runnable {
                    override run() {
                        DebugDiagramView.updateView(currentModel)
                    }
                })

                // make sure to register all breakpoints in the breakpoint manager
                for (pendingBreakpoint : pendingBreakpoints) {
                    DebugBreakpointManager.instance.presentBreakpoint(pendingBreakpoint, currentModel)
                }
                pendingBreakpoints.clear

            } else {
                // Otherwise, clear all highlightings
                debugHighlighter.clearAllHighlights
            }

            if (breakpoint instanceof TransitionWatchBreakpoint) {
                println("Hit watch breakpoint.")
                DebugBreakpointManager.instance.watchBreakpointHit(breakpoint)
                return DONT_SUSPEND
            } else {

                // Find the currently active states on SCCharts Level
                val activeStates = findActiveStates(thread, breakpoint, currentModel)
                for (state : activeStates) {
                    debugHighlighter.highlightActiveState(state)
                }

                // Find and visualize the states currently being executed on Java level
                val executingStates = findExecutingStates(thread, breakpoint, currentModel)
                for (state : executingStates) {
                    debugHighlighter.highlightExecutingState(state)
                }

                // If the breakpoint was triggered when checking for a transition,
                // display the transition currently being checked
                if (breakpoint instanceof TransitionCheckBreakpoint) {
                    val currentTransition = findCurrentTransition(thread, breakpoint, currentModel, executingStates)
                    if (currentTransition !== null) {
                        debugHighlighter.highlightExecutingTransition(currentTransition)
                    }
                } else if (breakpoint instanceof StateBreakpoint) {
                    DebugBreakpointManager.instance.stateBreakpointHit(breakpoint)
                }
                return SUSPEND
            }
        }

        return DONT_CARE
    }
    
    
    
    /**************************************************************************************
     * Unsupported Method Stubs ***********************************************************
     **************************************************************************************/
    override breakpointInstalled(IJavaDebugTarget target, IJavaBreakpoint breakpoint) {
        // TODO ignore for now
    }

    override breakpointRemoved(IJavaDebugTarget target, IJavaBreakpoint breakpoint) {
        // TODO ignore for now
    }
    
    override installingBreakpoint(IJavaDebugTarget target, IJavaBreakpoint breakpoint, IJavaType type) {
        println("Installing Breakpoint!")
        return DONT_CARE
    }
    
    override breakpointHasCompilationErrors(IJavaLineBreakpoint breakpoint, Message[] errors) {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }
    
    override addingBreakpoint(IJavaDebugTarget target, IJavaBreakpoint breakpoint) {
        
        println("Adding breakpoint!")
        if (currentModel === null) {
            // cannot register breakpoint yet, must do so later
            pendingBreakpoints.add(breakpoint)
        } else {
            DebugBreakpointManager.instance.presentBreakpoint(breakpoint, currentModel)
        }
    }
    
    override breakpointHasRuntimeException(IJavaLineBreakpoint breakpoint, DebugException exception) {
        // TODO ignore for now
    }
    
}

