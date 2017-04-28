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
package de.cau.cs.kieler.prom.builder

import java.util.Map
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResourceDelta
import org.eclipse.core.resources.IResourceDeltaVisitor
import org.eclipse.core.resources.IncrementalProjectBuilder
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.resources.IResource
import java.util.ArrayList

/**
 * @author aas
 * 
 */
class KiCoBuilder extends IncrementalProjectBuilder {
    public static val String BUILDER_ID = "de.cau.cs.kieler.prom.KiCoBuilder"; 
    
    protected override IProject[] build(int kind, Map args, IProgressMonitor monitor) {
        if (kind == IncrementalProjectBuilder.FULL_BUILD) {
            fullBuild(monitor);
        } else {
            val delta = getDelta(getProject());
            if (delta == null) {
               fullBuild(monitor);
            } else {
               incrementalBuild(delta, monitor);
            }
        }
        return null;
    }   

    private def void incrementalBuild(IResourceDelta delta, IProgressMonitor monitor) {
        System.out.println("incremental build on "+delta);
        try {
            val ArrayList<IResource> changedResources = newArrayList()
            
            delta.accept(new IResourceDeltaVisitor() {
                override visit(IResourceDelta delta) throws CoreException {
                    val res = delta.getResource()
                    if(res.type == IResource.FILE) {
                        if(res.fileExtension.equalsIgnoreCase("sct")) {
                            changedResources.add(res)
                        }
                    }
                    return true; // visit children too
                }
            });
            
            for(r : changedResources) {
                System.out.println("changed: " + r.getRawLocation());
            }
        } catch (CoreException e) {
            e.printStackTrace();
        }
    }

    private def void fullBuild(IProgressMonitor monitor) {
        System.out.println("full build");
    }
}
