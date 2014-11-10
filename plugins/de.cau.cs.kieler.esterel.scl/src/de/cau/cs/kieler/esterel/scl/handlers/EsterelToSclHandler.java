/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */


package de.cau.cs.kieler.esterel.scl.handlers;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.cau.cs.kieler.esterel.scl.transformations.EsterelToSclTransformation;
import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.scl.scl.Program;

/**
 * Handles the Esterel to SCL transformation by loading the selected .strl file,
 * transforming it and saving it as a .scl with the same filename
 * TODO use AbstractConvertModelHandler
 * @author krat
 *
 */

public class EsterelToSclHandler extends AbstractHandler {

    /**
     * {@inheritDoc}
     */
    public Object execute(ExecutionEvent event) throws ExecutionException {
        
        ISelection selection = HandlerUtil.getCurrentSelection(event);
        if (selection instanceof IStructuredSelection) {
            Object element = ((IStructuredSelection) selection).getFirstElement();
            if (element instanceof IFile) {
                IFile esterelFile = (IFile) element;
                 
                // Load Esterel file
                de.cau.cs.kieler.esterel.esterel.Program esterelProgram = loadEsterelProgram(esterelFile);
                 
                // Call the transformation
                Injector injector = Guice.createInjector();
                EsterelToSclTransformation transformation =
                        injector.getInstance(EsterelToSclTransformation.class);
                Program program = transformation.transformProgram(esterelProgram);
//                Program program = (Program) KielerCompiler.compile("ESTERELTOSCL", esterelProgram, false, false).getEObject();
                 
                
                // Save SCL program
                IFile programFile = esterelFile.getParent().getFile(
                        new Path(esterelFile.getName().substring(0, esterelFile.getName().length()-4) + "scl"));
                saveSCLProgram(programFile, program);
                 
                
                // Refresh the parent folder to have the new file show up in the UI
                try {
                    esterelFile.getParent().refreshLocal(IResource.DEPTH_ONE, null);
                } catch (CoreException e) {
                    // TODO Ignore
                }
            }
        }
        return null;
    }
     
    /**
     * Load the Esterel model from the given file.
     *
     * @param esterelFile the file to load the esterel model from.
     * @return the esterel model.
     * @throws ExecutionException if the file couldn't be opened.
     */
    private de.cau.cs.kieler.esterel.esterel.Program loadEsterelProgram(IFile esterelFile) throws ExecutionException {
        // Create a resource set.
        ResourceSet resourceSet = new ResourceSetImpl();
         
         
        // Get the URI of the model file.
        // TODO beautify
        URI fileURI = URI.createFileURI(esterelFile.getRawLocation().makeAbsolute().toFile().getAbsolutePath());
         
        // Demand load the resource for this file, here the actual loading is done.
        Resource resource = resourceSet.getResource(fileURI, true);
        
         
        // get model elements from the resource
        de.cau.cs.kieler.esterel.esterel.Program esterelProgram;
        if (resource.getContents().get(0) instanceof de.cau.cs.kieler.esterel.esterel.Program) {
                esterelProgram = (de.cau.cs.kieler.esterel.esterel.Program) resource.getContents().get(0);
        } else {
                throw new ExecutionException("Resource is not an instance of esterel.Program");
        }
        return esterelProgram;
    }
     
    /**
     * Saves the given SCL program in the given file.
     *
     * @param programFile the file to save the SCL program to.
     * @param program the SCL program to save.
     * @throws ExecutionException if there was an error saving the file.
     */
    private void saveSCLProgram(IFile programFile, Program program) throws ExecutionException {
        // Create a resource set.
        ResourceSet resourceSet = new ResourceSetImpl();
         
        // Get the URI of the model file.
        URI fileURI = URI.createFileURI(programFile.getRawLocation().makeAbsolute().toFile().getAbsolutePath());
        System.out.println("URI " + fileURI);
         
        // Create a resource for this file.
        Resource resource = resourceSet.createResource(fileURI);
         
        // Add the model objects to the contents.
        resource.getContents().add(program);
         
        // Save the contents of the resource to the file system.
        try
        {
            resource.save(Collections.EMPTY_MAP); // the map can pass special saving options to the operation
        } catch (IOException e) {
            System.out.println("EsterelToSclHandler: Could not save file");
            /* error handling */
        }
    }
    

}