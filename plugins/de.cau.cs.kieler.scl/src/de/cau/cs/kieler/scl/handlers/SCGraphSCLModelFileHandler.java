/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scl.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.cau.cs.kieler.core.model.handlers.AbstractConvertModelHandler;
import de.cau.cs.kieler.scg.SCGraph;
import de.cau.cs.kieler.scl.SCLStandaloneSetup;
import de.cau.cs.kieler.scl.transformations.SCGToSCLTransformation;

/**
 * @author ssm
 *
 */
public class SCGraphSCLModelFileHandler extends AbstractConvertModelHandler {

    public static final String SCG_TRANSFORMATION =
            "de.cau.cs.kieler.scl.commands.SCGToSCLTransformation";

    private static Injector injector = new SCLStandaloneSetup()
        .createInjectorAndDoEMFRegistration();

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getTargetExtension(EObject model, ExecutionEvent event, ISelection selection) {
        return "scl";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Injector createResourceInjector() {
        return injector;
    }

    public String getDiagramEditorID() {
        return null;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    protected Object transform(EObject model, ExecutionEvent event, ISelection selection) {
        String commandString = event.getCommand().getId().toString();
        EObject transformed = null;

        SCGToSCLTransformation transformation =
        Guice.createInjector().getInstance(SCGToSCLTransformation.class);
        
        // Call the model transformation (this creates a copy of the model containing the
        // refactored model).
        transformed = model;
        if (commandString.equals(SCG_TRANSFORMATION)) {
            transformed = transformation.transformSCGToSCL((SCGraph) model);
        } 
        return transformed;
    }

}
