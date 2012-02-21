/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sim.kart.ui;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.swt.widgets.Display;

import de.cau.cs.kieler.sim.kart.IRefresh;

/**
 * @author ssc
 * 
 */
public class Refresh implements IRefresh {

    /**
     * {@inheritDoc}
     */
    public void refreshProjectExplorer() {
        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
                
                for(IProject p : projects) {
                    try {
                        p.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
                    } catch (CoreException e) {
                        // do nothing, auto-refresh will simply not work
                    }
                }
            }
        });

    }

}
