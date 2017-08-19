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
package de.cau.cs.kieler.cview.ui;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.swt.widgets.Shell;

import de.cau.cs.kieler.cview.CViewPlugin;
import de.cau.cs.kieler.cview.CViewProgressMonitorDialog;
import de.cau.cs.kieler.cview.KLighDController;
import de.cau.cs.kieler.cview.RunnableWithProgress;
import de.cau.cs.kieler.cview.hooks.ICViewExport;

/**
 * @author delphino
 *
 */
public class ExportHandler {

    /**
     * Export the model using a progress monitor.
     * 
     * @param fileToWrite
     * @param selectedHook
     */
    public static void exportModel(String fileToWrite, ICViewExport selectedHook) {
        int workTotal = 1;
        try {
            new CViewProgressMonitorDialog(new Shell()).run(true, true,
                    (new RunnableWithProgress() {
                        public void run(IProgressMonitor monitor) {
                            SubMonitor subMonitor = SubMonitor.convert(monitor, workTotal);
                            monitor.beginTask("Processing " + workTotal + " files...", workTotal);
                            subMonitor.worked(1);
                            
                            // Call the private export method
                            exportModel(fileToWrite, selectedHook, monitor);
                        }
                    }));
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // -------------------------------------------------------------------------
    
    /**
     * Export the model.
     * 
     * @param fileToWrite
     * @param selectedHook
     * @param monitor
     */
    private static void exportModel(String fileToWrite, ICViewExport selectedHook, IProgressMonitor monitor) {
        PrintWriter out;
        boolean success = false;
        try {
            out = new PrintWriter(fileToWrite);
            String exported = selectedHook.export(KLighDController.getModel(), monitor);
            if (exported == null || exported.equals("")) {
                CViewPlugin.openMessageDialog("Export Analysis", "Nothing to export.", false, false);
                success = true;
            } else {
                out.append(exported);
                out.close();
                success = true;
                CViewPlugin.openMessageDialog("Export Analysis",
                        "Export completed.\n\nFile written to '" + fileToWrite + "'.",
                        false, false);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (!success) {
            CViewPlugin.openMessageDialog("Error", "Could not export to '" + fileToWrite + "'.",
                    true, false);
        }
        
    }
    
    // -------------------------------------------------------------------------
    
}
