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
import java.util.HashMap
import java.nio.charset.StandardCharsets
import de.cau.cs.kieler.klighd.ui.DiagramViewManager
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

/**
 * @author peu
 *
 */
class JavaBreakpointListener implements IJavaBreakpointListener {
    
    @Inject extension SCChartsScopeExtensions
    
    new() {
        Guice.createInjector.injectMembers(this)
    }
    
    var breakpointToTarget = new HashMap<IJavaBreakpoint,IJavaDebugTarget>()
    
    /**
     * Find the active model states in the original SCChart.
     */
    def List<State> findCurrentStates(IJavaThread thread, IJavaBreakpoint breakpoint, SCCharts model) {
        
        
        val activeStates = <State> newLinkedList
        
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

            // Extract name of method of this stack frame -----------------------------
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
            
            println("Found " + foundMethods.size + " matching method(s).")
            
            // Get Javadoc attached to method(s) and resolve to SCCharts States in original model
            for (method : foundMethods) {
                
                val javadocRange = method.javadocRange
                if (javadocRange !== null) {
                    val comment = compilationUnit.source.substring(javadocRange.offset, javadocRange.offset + javadocRange.length)
                    
                    val commentLines = comment.split("\n")
                    // get last-but-first line, which is the last text line of the comment
                    val stateNameString = commentLines.get(commentLines.length - 2)
                    val stateName = stateNameString.split("\\* ").get(1)
                    val states = model.getStatesByID(stateName.split(" ").get(1).split("\\(").get(0))
                    // TODO filter for states with the same name
//                    val stateHashString = stateName.split("\\(").last
//                    val stateHashValue = stateHashString.substring(0, stateHashString.length - 1)
//                    activeStates.addAll(states.filter[hashCode.equals(stateHashValue)].toList)
                    activeStates.addAll(states)
                }
            }
        }
        
        // TODO debug only
        for (state : activeStates) {
            println(state.name)
        }
        
        return activeStates
    }
    
    /**
     * Return all states with a given name in a given model.
     */
    def List<State> getStatesByID(SCCharts model, String stateName) {
        var col = <State> newLinkedList
        
        for (state : model.rootStates) {
            col.addAll(state.allStates.filter[name.equals(stateName)].toList)
        }
        
        return col
    }
    
    
    override addingBreakpoint(IJavaDebugTarget target, IJavaBreakpoint breakpoint) {
        println("Adding breakpoint!")
    }
    
    override breakpointHasRuntimeException(IJavaLineBreakpoint breakpoint, DebugException exception) {
        // TODO ignore for now
    }
    
    override breakpointHit(IJavaThread thread, IJavaBreakpoint breakpoint) {
        println("Hitting breakpoint!")
        
        if (breakpointToTarget.containsKey(breakpoint)) {
            val target = breakpointToTarget.get(breakpoint)
            val chartVar = target.findVariable("ORIGINAL_SCCHART")
            if (chartVar !== null && chartVar.javaType.name.equals("java.lang.String")) {
                println("Code is derived from SCChart!")
                val text = chartVar.value.valueString
                val model = SCTXStandaloneParser.parseScope(text, StandardCharsets.UTF_8)
                Display.getDefault().asyncExec(new Runnable {
                    override run() {
                        DiagramViewManager.createView(null, "TestView", model)
                    }
                })
                findCurrentStates(thread, breakpoint, model)
                // TODO visualize the states that are currently active
                return SUSPEND
            }
        
        }
        
        
        
        return DONT_CARE
    }
    
    override breakpointInstalled(IJavaDebugTarget target, IJavaBreakpoint breakpoint) {
        breakpointToTarget.put(breakpoint, target)
        // TODO ignore for now
    }
    
    override breakpointRemoved(IJavaDebugTarget target, IJavaBreakpoint breakpoint) {
        breakpointToTarget.remove(breakpoint)
        // TODO ignore for now
    }
    
    override installingBreakpoint(IJavaDebugTarget target, IJavaBreakpoint breakpoint, IJavaType type) {
        println("Installing Breakpoint!")
        return DONT_CARE
    }
    
    override breakpointHasCompilationErrors(IJavaLineBreakpoint breakpoint, Message[] errors) {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }
    
}
