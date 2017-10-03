package de.cau.cs.kieler.prom.ui

import de.cau.cs.kieler.prom.PromPlugin
import de.cau.cs.kieler.prom.console.PromConsole
import de.cau.cs.kieler.prom.ui.console.PromUIConsole
import de.cau.cs.kieler.prom.ui.internal.KiBuildActivator
import org.eclipse.core.runtime.Status
import org.eclipse.swt.widgets.Display
import org.eclipse.ui.plugin.AbstractUIPlugin
import org.eclipse.ui.statushandlers.StatusAdapter
import org.eclipse.ui.statushandlers.StatusManager
import org.osgi.framework.BundleContext

import static de.cau.cs.kieler.prom.PromPlugin.*
import static de.cau.cs.kieler.prom.console.PromConsole.*

/**
 * The activator class controls the plug-in life cycle
 */
class PromUIPlugin extends KiBuildActivator {
    // The plug-in ID
    public static val PLUGIN_ID = "de.cau.cs.kieler.prom.ui"
    // $NON-NLS-1$
    // The shared instance
    static var PromUIPlugin plugin

    /** 
     * The constructor
     */
    new() {
    }

    /*
     * (non-Javadoc)
     * @see AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    override void start(BundleContext context) throws Exception {
        super.start(context)
        plugin = this
        
        // Register console
        PromConsole.currentConsole = new PromUIConsole
        // Register preference store
        PromPlugin.preferenceStore = preferenceStore
    }

    /*
     * (non-Javadoc)
     * @see AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
     */
    override void stop(BundleContext context) throws Exception {
        plugin = null
        super.stop(context)
    }

    /** 
     * Returns the shared instance
     * @return the shared instance
     */
    static def PromUIPlugin getDefault() {
        return plugin
    }

    /**
     * Executes a procedure (i.e. a method/function that returns nothing) in the UI thread.
     * 
     * @param procedure The procedure to execute in the UI thread
     */ 
    public static def void asyncExecInUI( ()=>void procedure ) {
        Display.getDefault().asyncExec(new Runnable() {
            override void run() {
                try {
                    procedure.apply
                } catch(Exception e) {
                    // Show all uncaught exceptions to the user
                    showError(e)
                }
            }
        });
    }
    
    /** 
     * Log an information
     * 
     * @param msg The message
     */
    static def void log(String msg) {
        log(msg, null, Status.INFO)
    }

    /** 
     * Log an error
     * 
     * @param msg The message
     * @param e The exception that caused the error
     */
    static def void log(String msg, Exception e) {
        log(msg, e, Status.ERROR)
    }

    /** 
     * Log a message
     * 
     * @param msg The message
     * @param e The exception that caused the message
     * @param severity The severity of the message status
     */
    private static def void log(String msg, Exception e, int severity) {
        log(severity, msg, e, StatusManager.LOG)
    }
    
    /**
     * Show an exception to the user.
     * 
     * @param e The exception
     */
    static def void showError(Exception e) {
        showMessage(e.message, e, Status.ERROR)
    }
    
    /**
     * Show an exception to the user.
     * 
     * @param msg The message
     * @param e The exception that caused the message
     */
    static def void showError(String msg, Exception e) {
        showMessage(msg, e, Status.ERROR)
    }
    
    /**
     * Show a message to the user and also log that message to the console.
     * 
     * @param msg The message
     * @param e The exception that caused the message
     * @param severity The severity of the message status
     */
    static def void showMessage(String msg, Exception e, int severity) {
        log(severity, msg, e, StatusManager.LOG.bitwiseOr(StatusManager.SHOW))
    }
    
    /**
     * Send a Status with the severity, message and exception
     * to the status manager and which will handle it using the given style.
     * 
     * @param severity The severity of the message. For example Status.INFO, Status.ERROR
     * @param msg The message
     * @param e The exception that caused the message to apprear
     * @param style The style how the status should be handled. One of StatusManager.NONE, LOG, SHOW, BLOCK
     */
    private static def void log(int severity, String msg, Exception e, int style) {
        val status = new Status(severity, PLUGIN_ID, msg, e)
        val statusAdapter = new StatusAdapter(status)
        StatusManager.getManager().handle(statusAdapter, style)
    }
}
