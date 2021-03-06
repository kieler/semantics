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

import com.google.inject.Guice
import com.google.inject.Inject
import de.cau.cs.kieler.klighd.ide.model.MessageModel
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.extensions.SCChartsScopeExtensions
import de.cau.cs.kieler.sccharts.processors.statebased.DebugAnnotations
import de.cau.cs.kieler.sccharts.text.parser.SCTXStandaloneParser
import de.cau.cs.kieler.sccharts.ui.debug.highlighting.DebugHighlighter
import de.cau.cs.kieler.sccharts.ui.debug.view.DebugDiagramView
import java.io.IOException
import java.io.InputStream
import java.net.URL
import java.nio.charset.StandardCharsets
import java.util.List
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.Status
import org.eclipse.debug.core.DebugPlugin
import org.eclipse.jdt.core.ICompilationUnit
import org.eclipse.jdt.core.IField
import org.eclipse.jdt.core.IMethod
import org.eclipse.jdt.debug.core.IJavaBreakpoint
import org.eclipse.jdt.debug.core.IJavaBreakpointListener
import org.eclipse.jdt.debug.core.IJavaDebugTarget
import org.eclipse.jdt.debug.core.IJavaThread
import org.eclipse.jdt.debug.core.IJavaVariable
import org.eclipse.jdt.internal.debug.core.breakpoints.JavaLineBreakpoint
import org.eclipse.jdt.internal.debug.core.model.JDIStackFrame
import org.eclipse.jdt.internal.ui.javaeditor.JavaEditor
import org.eclipse.jdt.ui.JavaUI
import org.eclipse.swt.widgets.Display
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.progress.UIJob
import org.eclipse.ui.texteditor.ITextEditor

/**
 * Central class to synchronize and manage all breakpoints generated by the debugger.
 * 
 * This class is responsible for coordinating debugging events and different models.
 * It keeps track of all models used in the current debugging session 
 * and their associated @link{ModelBreakpointManager}s.
 * Functionality of registering breakpoint hits and other events is separated in class @link{JavaBreakpointListener}.
 * 
 * @author peu
 *
 */
class DebugBreakpointManager {
    
    /* FIELDS *******************************************************************/
    static var DebugBreakpointManager instance
    
    // To efficiently access the last loaded model and avoid reloading it unnecessarily
    var currentModelPath = ""
    var SCCharts currentModel;
    
    // Saves models loaded before to avoid reloading them from the file
    val pathToModel = <String, SCCharts> newHashMap
    // Gives the appropriate highlighter for each model
    val pathToHighlighter = <String, DebugHighlighter> newHashMap
    // Gives the appropriate ModelBreakpointManager for each model
    val pathToBpManager = <String, ModelBreakpointManager> newHashMap
    
    // Indicates whether the current model is visible in the DebugDiagramView
    var modelBeingDisplayed = false

    // Breakpoints that have not yet been registered because the model was unavailable
    val List<IJavaBreakpoint> pendingBreakpoints = <IJavaBreakpoint> newLinkedList
    
    /* INJECTIONS ***************************************************************/
    @Inject extension SCChartsScopeExtensions
    
    /* CONSTRUCTOR **************************************************************/
    private new(){
        Guice.createInjector.injectMembers(this)
    }

    static def getInstance() {
        if (instance === null) {
            instance = new DebugBreakpointManager
        }
        return instance
    }
    
    /****************************************************************************
     * L I S T E N E R   I N T E R F A C E **************************************
     ****************************************************************************/
    
    /**
     * Takes all appropriate actions upon hitting a breakpoint.
     * Instances of @link{IJavaBreakpointListener} should call this method.
     */
    def breakpointHit(IJavaThread thread, IJavaBreakpoint breakpoint) {
        try {
            ensureCorrectModel(thread)        
        } catch (IllegalStateException e) {
            return IJavaBreakpointListener.DONT_CARE
        }
        
        val bpManager = pathToBpManager.get(currentModelPath)

        // Make sure to register all breakpoints in the appropriate breakpoint manager
        val remove = <IJavaBreakpoint> newLinkedList
        for (pendingBreakpoint : pendingBreakpoints) {
            val success = bpManager.presentBreakpoint(pendingBreakpoint, currentModel)
            if (success) {
                remove.add(pendingBreakpoint)
            }
        }
        pendingBreakpoints.removeAll(remove)

        if (breakpoint instanceof TransitionWatchBreakpoint) {
            // Watch breakpoints are used internally to register when a state has been left.
            // Therefore, there is no need to suspend the execution here.
            bpManager.watchBreakpointHit(breakpoint)
            return IJavaBreakpointListener.DONT_SUSPEND
        }  else if (breakpoint instanceof StateBreakpoint) {
            pathToBpManager.get(currentModelPath).disableStateBreakpoints(breakpoint)
        }
        
        // Determine the model path associated with the currently active editor
        val modelPath = getModelStringFromEditor
        if (modelPath != currentModelPath) {
            // This breakpoint belongs to an editor that has not yet been opened
            // Therefore, we need to register it for later to do the corresponding highlighting
            // as soon as the matching editor opens
            pathToBpManager.get(currentModelPath).breakpointHit(thread, breakpoint)
        } else {
            // The matching editor is open already, we can directly do the highlighting
            val activeStates = findActiveStates(thread)
            val executingStates = findExecutingStates(thread)
            var Transition executingTransition
            if (breakpoint instanceof TransitionBreakpoint) {
                executingTransition = findCurrentTransition(breakpoint)
            }
            highlight(activeStates, executingStates, executingTransition)
        }
        return IJavaBreakpointListener.SUSPEND   
    }
    
    /**
     * Notify this manager that a debug step is ending.
     * Used to perform highlighting while stepping through the model.
     */
    def stepEnding(IJavaThread thread) {
        val lineNumber = thread.topStackFrame.lineNumber

        try {
            ensureCorrectModel(thread)
            val activeStates = findActiveStates(thread)
            val executingStates = findExecutingStates(thread)
            val currentTransition = findCurrentTransition(thread, lineNumber - 1, findActiveStates(thread))

            highlight(activeStates, executingStates, currentTransition)
        } catch (IllegalStateException e) {
            // silent catch
            // This happens if there is no model associated with the editor, 
            // i.e. if it does not contain code generated from SCCharts.
        }
    }
    
    /**
     * Clears all highlightings in all models after a debug run concludes.
     */
    def runEnding() {
        for (hl : pathToHighlighter.values) {
            hl.clearAllHighlights
        }
    }
    
    /**
     * Clears all highlightings from the previous suspension when the execution resumes.
     */
    def resuming() {
        for (hl : pathToHighlighter.values) {
            hl.clearAllHighlights
        }
    }
    
    /**
     * Registers a breakpoint with this manager.
     * This method ensures that the breakpoint is either registered now with the appropriate model
     * or preserved and re-registered later as soon as the correct model is available.
     */
    def addBreakpoint(IJavaBreakpoint breakpoint) {
        if (currentModel === null) {
            // cannot register breakpoint yet, must do so later
            pendingBreakpoints.add(breakpoint)
        } else {
            val result = pathToBpManager.get(currentModelPath).presentBreakpoint(breakpoint, currentModel)
            if (!result) {
                // Was not successful in registering; Breakpoint does not belong to current model.
                pendingBreakpoints.add(breakpoint)
            }
        }
    }
    
    /****************************************************************************
     * A C T I O N   I N T E R F A C E ******************************************
     ****************************************************************************/
    
    def toggleBreakpoint(State state) {
        pathToBpManager.get(currentModelPath).toggleBreakpoint(state)
    }
    
    def toggleBreakpoint(Transition transition) {
        pathToBpManager.get(currentModelPath).toggleBreakpoint(transition)
    }
    
    def toggleCheckBreakpoint(Transition transition) {
        pathToBpManager.get(currentModelPath).toggleCheckBreakpoint(transition)
    }
    
    /****************************************************************************
     * A C T I V E   S T A T E S ************************************************
     ****************************************************************************/
    
    /**
     * Extract all active states from the current model
     */
    private def List<State> findActiveStates(IJavaThread thread) {
        val context = thread.findVariable("rootContext")
        val activeStates = extractStatesFromContext(context)
        return activeStates
    }

    /**
     * Recursively extract active states from this and all enclosed contexts
     */
    private def List<State> extractStatesFromContext(IJavaVariable context) {

        val vars = context.value.variables
        val activeStates = <State>newLinkedList

        for (variable : vars) {
            if (variable.name.equals("threadStatus")) {
                val status = variable.value?.variables.filter[name.equals("name")].head?.value?.valueString
                // If region was not yet initialized or has terminated already, ignore all active states within it
                if (status === null || status.equals("null") || status.equals("TERMINATED")) {
                    return <State>newLinkedList
                }
            } else if (variable.name.equals("activeState")) {
                // Get the currently active state on this hierarchy level
                val varValue = variable.value
                if (!varValue.valueString.equals("null")) {
                    val stateName = varValue.variables.filter[name.equals("origin")].head.value.toString
                    // TODO redo this with regex matchers, throws exceptions
                    if (stateName != "\"\"") {
                        val states = getStatesByID(stateName.split(" ").get(1).split("\\(").get(0))
                        val stateHashString = stateName.split("\\(").last
                        val stateHashValue = stateHashString.substring(0, stateHashString.length - 2)
                        activeStates.addAll(states.filter [
                            DebugAnnotations.getFullNameHash(it).toString.equals(stateHashValue)
                        ])
                    }
                }
            } else {
                // Get the active state from a child region
                activeStates.addAll(extractStatesFromContext(variable as IJavaVariable))
            }
        }
        return activeStates
    }
    
    /****************************************************************************
     * E X E C U T I N G   S T A T E S ******************************************
     ****************************************************************************/
    
    /**
     * Find the model states in the original SCChart currently being executed.
     */
    private def List<State> findExecutingStates(IJavaThread thread) {

        val executingStates = <State>newLinkedList

        // Each stack frame corresponds to one method call, each of which may correspond to a state's method
        for (frame : thread.stackFrames) {
            val methodName = (frame as JDIStackFrame).methodName

            val editor = retrieveActiveEditor

            // Extract method object from editor corresponding the current stack frame 
            val typeRoot = JavaUI.getEditorInputTypeRoot(editor.editorInput)
            val compilationUnit = (typeRoot.getAdapter(ICompilationUnit) as ICompilationUnit)

            val methods = <IMethod>newLinkedList
            for (type : compilationUnit.allTypes) {
                methods.addAll(type.methods)
            }

            val foundMethods = <IMethod>newLinkedList

            for (method : methods) {
                if (method.elementName.equals(methodName)) {
                    foundMethods.add(method)
                }
            }

            // Get Javadoc attached to method(s) and resolve to SCCharts States in original model
            for (method : foundMethods) {

                val javadocRange = method.javadocRange
                if (javadocRange !== null) {
                    val comment = compilationUnit.source.substring(javadocRange.offset,
                        javadocRange.offset + javadocRange.length)
                    // TODO redo this with regex matchers
                    val commentLines = comment.split("\n")
                    // get last-but-first line, which is the last text line of the comment
                    val stateNameString = commentLines.get(commentLines.length - 2).trim
                    val stateName = stateNameString.split("\\* ").get(1)
                    val states = getStatesByID(stateName.split(" ").get(1).split("\\(").get(0))
                    val stateHashString = stateName.split("\\(").last
                    val stateHashValue = stateHashString.substring(0, stateHashString.length - 1).trim
                    executingStates.addAll(states.filter [
                        DebugAnnotations.getFullNameHash(it).toString.equals(stateHashValue)
                    ].toList)
                }
            }
        }
        return executingStates
    }
    
    /****************************************************************************
     * E X E C U T I N G   T R A N S I T I O N S ********************************
     ****************************************************************************/
    
    /**
     * Determine the transition associated with the given breakpoint.
     */
    private def Transition findCurrentTransition(IJavaBreakpoint breakpoint) {

        if (breakpoint instanceof TransitionBreakpoint) {
            return breakpoint.transition
        }
        return null
    }
    
    /**
     * Determine the transition associated with the current execution state.
     */
    private def Transition findCurrentTransition(IJavaThread thread, int lineNumber, List<State> activeStates) {

        val editor = retrieveActiveEditor

        // Extract line text
        val document = editor.documentProvider.getDocument(editor.editorInput)
        val offset = document.getLineOffset(lineNumber) // TODO throws BadLocationException sometimes since the editor switches to the active breakpoint AFTER this method is complete
        val length = document.getLineLength(lineNumber) // Above note may be fixed by now
        val lineText = document.get(offset, length)
        
        val lineTextSplit = lineText.split("//")
        if (lineTextSplit.length >= 2) {
            val commentText = lineTextSplit.get(1)
            if (commentText !== null) {
                // The line has a comment, which may be a transition indicator
                val commentTextSplit = commentText.split("\\(Priority ")
                if (commentTextSplit.length >= 2) { 
                    // TODO does not work with more than 9 transitions on one state
                    // TODO redo with matchers
                    val prio = Integer.parseInt(commentTextSplit.get(1)?.charAt(0).toString)
                    if (prio != 0) {
                        // now determine what state the transition leaves from.
                        // Note that that is usually, but not always the lowest active state.
                        // Special case: abort.
                        val transitionHashString = commentTextSplit.last.split("\\(")
                        val transitionHash = transitionHashString.last.substring(0, transitionHashString.last.length - 2)
                        for (state : activeStates) {
                            if (state.outgoingTransitions.length >= prio) {
                                val transition = state.outgoingTransitions.get(prio - 1)
                                if (DebugAnnotations.getFullNameHash(transition).toString.equals(transitionHash)) {
                                    return transition
                                }
                            }
                        }
                        
                    }
                }
            }
        }
    }
    
    /****************************************************************************
     * M O D E L   M A N A G E M E N T ******************************************
     ****************************************************************************/
    
    /**
     * Method to ensure that the required model is available (i.e. loaded) and set as current model
     * If the model has been loaded before, it will not be reloaded.
     */
    private def ensureCorrectModel(IJavaThread thread) {
        val target = thread.debugTarget as IJavaDebugTarget
        val chartVar = target.findVariable("ORIGINAL_SCCHART")
        if (chartVar !== null && chartVar.javaType.name.equals("java.lang.String")) {
            val text = chartVar.value.valueString
            setModel(text)
        } else {
            throw new IllegalStateException("Cannot retrieve model; Code not generated from SCCharts.")
        }
    }

    /**
     * Loads all breakpoints associated with the given resource.
     * This is used to load breakpoints from editors when no debug session is active.
     */
    def loadBreakpoints (IResource resource) {
        val bpManager = DebugPlugin.^default.breakpointManager 
        val debugBpManager = pathToBpManager.get(currentModelPath)
        // present all breakpoints to the manager to ensure all of them are registered
        for (marker : resource.findMarkers(JavaLineBreakpoint.LINE_BREAKPOINT_MARKER, true, 0)) {
            debugBpManager.presentBreakpoint(bpManager.getBreakpoint(marker) as IJavaBreakpoint, currentModel)
        }
        
        // process any breakpoints that have been hit while the editor was hidden
        val thread = debugBpManager.lastThread
        val breakpoint = debugBpManager.lastBreakpoint
        if (thread !== null && breakpoint !== null) {
            val activeStates = findActiveStates(thread)
            val executingStates = findExecutingStates(thread)
            var Transition currentTransition = null
            // If the breakpoint was triggered when checking for a transition,
            // display the transition currently being checked
            if (breakpoint instanceof TransitionCheckBreakpoint ||
                breakpoint instanceof TransitionTakenBreakpoint) {
                currentTransition = findCurrentTransition(breakpoint)
            }
            highlight(activeStates, executingStates, currentTransition)
        }
    }

    /**
     * Sets the model associated with the given path as current model.
     * Loads the model from the file if it hasn't been loaded before.
     */
    def setModel(String text) {
        if (text === null) {
            return
        }
        // Only re-display model if it's not the same one as before or there is none currently being displayed
        val diagramView = DebugDiagramView.instance
        if (currentModel === null || diagramView?.needsInit || (text != currentModelPath)
            || ((text == currentModelPath) && !modelBeingDisplayed)) {
            
            // Only re-parse / reload the model if it is not the same one as before
            if (text != currentModelPath) {
                currentModelPath = text
                val mapEntry = pathToModel.get(text)
                if (mapEntry !== null) {
                    // Model has been found in map; no need to reload it.
                    currentModel = mapEntry
                } else {
                    // Model has not been loaded yet; Need to load it and
                    // create highlighter and ModelBreakpointManager for it.
                    currentModel = retrieveModel(text);
                    pathToModel.put(text, currentModel)
                    val hl = new DebugHighlighter
                    pathToHighlighter.put(text, hl)
                    pathToBpManager.put(text, new ModelBreakpointManager(hl))
                }
            }
            Display.^default.syncExec(new Runnable {
                override run() {
                    DebugDiagramView.updateView(currentModel)
                }
            })
            
            // If the diagram view is currently open, make sure all highlightings and decorators are in place 
            if (diagramView !== null) {
                modelBeingDisplayed = true
                pathToHighlighter.get(text).reapplyAllHighlights
                pathToBpManager.get(text).reAddBreakpointDecorators
            }
        }
    }

    /****************************************************************************
     * H E L P E R   M E T H O D S **********************************************
     ****************************************************************************/

    /**
     * Clears the diagram view and displays a placeholder MessageModel.
     */
    def clearModel() {
        modelBeingDisplayed = false
        Display.^default.syncExec(new Runnable {
            override run() {
                DebugDiagramView.updateView(new MessageModel("No model in active editor."))
            }
        })
    }
    
    /**
     * Loads a model from the given path.
     */
    private def retrieveModel(String path) {
        // Try to interpret the path as workspace-relative path
        var InputStream fileContents
        try {
            fileContents = ResourcesPlugin.workspace.root.getFile(new Path(path))?.contents
            
        } catch (Exception e) {
            // If the path is not workspace relative, treat it as an absolute file URL
           try {
               fileContents = new URL(path).openStream
           } catch (IOException ioEx) {
               println("Error: File " + path + " not found.")
               fileContents = null
           }
        }
        if (fileContents !== null) {
            var text = ""
            while (fileContents.available > 0) {
                var byte[] bytes = newByteArrayOfSize(128)
                fileContents.read(bytes)
                text += new String(bytes)
            }
            fileContents.close
            if (text != "") {
                return SCTXStandaloneParser.parseScope(text, StandardCharsets.UTF_8)
            }
        }
        // If the path could not be interpreted in either way, the model cannot be loaded.
        return null
    }
    
    /**
     * Return all states with a given name in the current model.
     */
    private def List<State> getStatesByID(String stateName) {
        var states = <State>newLinkedList

        for (state : currentModel.rootStates) {
            states.addAll(state.allStates.filter[name.equals(stateName)].toList)
        }

        return states
    }

    /**
     * Performs highlighting for active and execution states as well as the current transition.
     * Note that this uses a slight delay to avoid KLighD init errors.
     */
    private def highlight(List<State> activeStates, List<State> executingStates, Transition currentTransition) {
        new UIJob("Diagram Highlighting") {
            val hl = pathToHighlighter.get(currentModelPath)
            override runInUIThread(IProgressMonitor monitor) {
                for (activeState : activeStates) {
                    hl.highlightActiveState(activeState)
                }
                for (executingState : executingStates) {
                    hl.highlightExecutingState(executingState)
                }
                if (currentTransition !== null) {
                    hl.highlightExecutingTransition(currentTransition)
                }
                return Status.OK_STATUS
            }
        }.schedule(2)
    }

    /**
     * Extracts the value of the ORIGINAL_SCCHART variable from a model.
     */
    private def getModelStringFromEditor() {
        val editor = retrieveActiveEditor
        // TODO copied
        var String modelPath = ""
        if (editor instanceof JavaEditor) {
            val typeRoot = JavaUI.getEditorInputTypeRoot(editor.editorInput)
            val compilationUnit = (typeRoot.getAdapter(ICompilationUnit) as ICompilationUnit)
            val originalVars = <IField>newLinkedList
            for (type : compilationUnit.allTypes) {
                originalVars.addAll(type.fields.filter[it.elementName == "ORIGINAL_SCCHART"])
            }
            if (!originalVars.empty) {
                val doc = editor.documentProvider.getDocument(editor.editorInput)
                val lineNumber = doc.getLineOfOffset(originalVars.head.sourceRange.offset)
                val lineOffset = doc.getLineOffset(lineNumber)
                val lineLength = doc.getLineLength(lineNumber)
                modelPath = doc.get(lineOffset, lineLength).split(" = ").last.replaceAll("[;\"]", "").trim
            }
        }
        return modelPath
    }
    
    /**
     * Use a synchronous UIJob to retrieve the currently active editor. 
     */
    private def retrieveActiveEditor() {
       
        val ITextEditor[] editorArr = newArrayOfSize(1)
        val job = new UIJob("getActiveEditor") {
            override runInUIThread(IProgressMonitor monitor) {
                try {
                    editorArr.set(0,
                        PlatformUI.getWorkbench?.activeWorkbenchWindow.getActivePage?.getActiveEditor as ITextEditor)
                    return Status.OK_STATUS
                } catch (Exception e) {
                    e.printStackTrace
                    return Status.CANCEL_STATUS
                }
            }
        }

        job.schedule
        job.join
        return editorArr.head
    }
}