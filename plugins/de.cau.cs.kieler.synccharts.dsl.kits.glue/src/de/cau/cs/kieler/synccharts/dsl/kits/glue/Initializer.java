/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright ${year} by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.dsl.kits.glue;

import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.synccharts.dsl.kits.glue.concurrency.ConcurrentModificationObserver;

/**
 * @author oba
 * 
 */
public class Initializer implements IStartup {

    public void earlyStartup() {
        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                // get the workbench, then the workbench window
                // from there to the active page
                IWorkbenchPage activePage = PlatformUI.getWorkbench()
                        .getActiveWorkbenchWindow().getActivePage();
                // now we can add part listeners, e.g. our concurrent
                // modification observer, to the active page
                activePage.addPartListener(new ConcurrentModificationObserver(
                        activePage));
            }
        });
    }

}
