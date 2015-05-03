/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.esterel.scl.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;

import com.google.inject.Injector;

import de.cau.cs.kieler.core.model.handlers.AbstractConvertModelHandler;
import de.cau.cs.kieler.esterel.esterel.Program;
import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.scl.SCLStandaloneSetup;

/**
 * @author krat
 *
 */
public class SclToEsterelHandler extends AbstractConvertModelHandler {

    public static final String SCL_TRANSFORMATION =
            "de.cau.cs.kieler.esterel.scl.SclToEsterel";

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

        transformed = model;
        if (commandString.equals(SCL_TRANSFORMATION)) {
            transformed = (Program) KielerCompiler.compile("SCL_TO_ESTEREL", model, false, false).getEObject();
        } 
        return transformed;
    }

}
