/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2012 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.s.sc;

import java.io.IOException;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.internal.resources.File;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.PlatformUI;

import de.cau.cs.kieler.core.model.util.ModelUtil;
import de.cau.cs.kieler.s.s.Program;

/**
 * Generate SC Code from a an S file using new Xtend language.
 * 
 * @author cmot
 * @kieler.design 2012-11-26 proposed cmot
 * @kieler.rating 2012-11-26 proposed yellow
 */
@SuppressWarnings("restriction")
public class CGenerator implements IHandler {

    /**
     * {@inheritDoc}
     */
    public void addHandlerListener(final IHandlerListener handlerListener) {
        // Do nothing
    }

    // -------------------------------------------------------------------------
    
    /**
     * {@inheritDoc}
     */
    public void dispose() {
        // Do nothing
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public Object execute(final ExecutionEvent event) throws ExecutionException {

        // get input model from currently selected file in Explorer
        ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                .getSelectionService().getSelection();
        File modelFile = (File) ((TreeSelection) selection).getFirstElement();
        IPath modelFilePath = new Path(modelFile.getFullPath().toString());
        
        try {
            // Load S Program
            Program program =  (Program) ModelUtil.loadEObjectFromModelFile(modelFilePath);
            
            // Calculate output path for SC-m2t
            URI input = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);
            URI scOutput = URI.createURI("");
            scOutput = URI.createURI(input.toString());
            scOutput = scOutput.trimFragment();
            scOutput = scOutput.trimFileExtension().appendFileExtension("c");

            URI header = URI.createURI("");
            header = URI.createURI(input.toString());
            header = scOutput.trimFragment();
            header = scOutput.trimFileExtension().appendFileExtension("h");

            IPath headerPath = new Path(header.toPlatformString(false).replace("%20", " "));
            IFile headerFile = ModelUtil.convertIPathToIFile(headerPath);
            
            String headerFileInclude = "";
            if (headerFile.exists()) {
                headerFileInclude = "#include \""+headerFile.getName()+"\"";
            }
            
            // Do not use the alternative syntax
            boolean alternativeSyntax = false;
            
            // Generate SC Code
            IPath scOutputPath = new Path(scOutput.toPlatformString(false).replace("%20", " "));
            IFile scOutputFile = ModelUtil.convertIPathToIFile(scOutputPath);
            String scOutputString = ModelUtil.getAbsoluteFilePath(scOutputFile);
            S2SCPlugin.generateCCode(program, scOutputString, scOutputPath.toString(), 
                            alternativeSyntax, headerFileInclude);                    

        } catch (IOException e) {
            throw new ExecutionException("Cannot read input file.");
        }

        // Refresh the file explorer
        try {
            ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, null);
        } catch (CoreException e2) {
            e2.printStackTrace();
        }

        return null;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean isEnabled() {
        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public boolean isHandled() {
        return true;
    }

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    public void removeHandlerListener(final IHandlerListener handlerListener) {
        // Do nothing
    }

    // -------------------------------------------------------------------------

}
