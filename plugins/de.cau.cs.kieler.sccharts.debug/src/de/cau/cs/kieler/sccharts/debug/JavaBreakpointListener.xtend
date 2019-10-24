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
package de.cau.cs.kieler.sccharts.debug

import org.eclipse.jdt.debug.core.IJavaBreakpointListener
import org.eclipse.jdt.debug.core.IJavaDebugTarget
import org.eclipse.jdt.debug.core.IJavaBreakpoint
import org.eclipse.jdt.debug.core.IJavaLineBreakpoint
import org.eclipse.debug.core.DebugException
import org.eclipse.jdt.debug.core.IJavaThread
import org.eclipse.jdt.debug.core.IJavaType
import org.eclipse.jdt.core.dom.Message
import java.util.HashMap
import java.nio.charset.StandardCharsets
import de.cau.cs.kieler.klighd.ui.DiagramViewManager
import org.eclipse.swt.widgets.Display

/**
 * @author peu
 *
 */
class JavaBreakpointListener implements IJavaBreakpointListener {
    
    var breakpointToTarget = new HashMap<IJavaBreakpoint,IJavaDebugTarget>()
    
    
    override addingBreakpoint(IJavaDebugTarget target, IJavaBreakpoint breakpoint) {
        println("Adding breakpoint!")
    }
    
    override breakpointHasRuntimeException(IJavaLineBreakpoint breakpoint, DebugException exception) {
        // TODO ignore for now
    }
    
    override breakpointHit(IJavaThread thread, IJavaBreakpoint breakpoint) {
        // TODO testing only
        println("Hitting breakpoint!")
        
        if (breakpointToTarget.containsKey(breakpoint)) {
            val target = breakpointToTarget.get(breakpoint)
            val chartVar = target.findVariable("ORIGINAL_SCCHART")
            if (chartVar !== null && chartVar.javaType.name.equals("java.lang.String")) {
                println("Code is derived from SCChart!")
                val text = chartVar.value.valueString
                println("Original SCChart: " + text);
                val model = SCTXStandaloneParser.parseScope(text, StandardCharsets.UTF_8)
                Display.getDefault().asyncExec(new Runnable {
                    override run() {
                        DiagramViewManager.createView(null, "TestView", model)
                    }
                })
                
            }
            
//            val frames = thread.stackFrames
//            for (frame : frames) {
//                println("frame: " + frame)
//            }
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
    
    override breakpointHasCompilationErrors(IJavaLineBreakpoint breakpoint,
            Message[] errors) {
        // ignore
    }
    
}