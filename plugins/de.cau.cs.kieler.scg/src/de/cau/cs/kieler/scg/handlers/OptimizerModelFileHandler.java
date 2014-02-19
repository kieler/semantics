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
package de.cau.cs.kieler.scg.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.cau.cs.kieler.core.model.handlers.AbstractConvertModelHandler;
import de.cau.cs.kieler.sccharts.text.sct.SctStandaloneSetup;
import de.cau.cs.kieler.scg.SCGPlugin;
import de.cau.cs.kieler.scg.SCGraph;
import de.cau.cs.kieler.scg.ScgFactory;
import de.cau.cs.kieler.scg.extensions.SCGCopyExtensions;
import de.cau.cs.kieler.scg.optimizer.CopyPropagation;
import de.cau.cs.kieler.scg.optimizer.NotGuardMinimizer;
import de.cau.cs.kieler.scg.optimizer.UnreferencedGuardElimination;
import de.cau.cs.kieler.scg.sequentializer.SimpleSequentializer;
import de.cau.cs.kieler.scgsched.SCGraphSched;

/**
 * Handler for menu contributions
 *
 * @author ssm
 * @kieler.design 2014-01-08 proposed 
 * @kieler.rating 2014-01-08 proposed yellow
 */
public class OptimizerModelFileHandler extends AbstractConvertModelHandler {

    public static final String OPTIMIZER_COPYPROPAGATION =
            "de.cau.cs.kieler.scg.commands.optimizer.copyPropagation";
    public static final String OPTIMIZER_UNREFERENCEDGUARDELIMINATION =
            "de.cau.cs.kieler.scg.commands.optimizer.unreferencedGuardElimination";

    private static Injector injector = new SctStandaloneSetup()
        .createInjectorAndDoEMFRegistration();

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getTargetExtension(EObject model, ExecutionEvent event, ISelection selection) {
        return "optimized.scg";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Injector createResourceInjector() {
        return injector;
    }

    public String getDiagramEditorID() {
        return SCGPlugin.EDITOR_ID;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    protected Object transform(EObject model, ExecutionEvent event, ISelection selection) {
        String commandString = event.getCommand().getId().toString();
        EObject transformed = null;
       
        // Call the model transformation (this creates a copy of the model containing the
        // refactored model).
        transformed = model;
        if (commandString.equals(OPTIMIZER_COPYPROPAGATION)) {
    		SCGCopyExtensions copyExtensions = Guice.createInjector().getInstance(SCGCopyExtensions.class);
            CopyPropagation copyPropagation = Guice.createInjector().getInstance(CopyPropagation.class);
            
            SCGraph optSCG = ScgFactory.eINSTANCE.createSCGraph();
            copyExtensions.copySCG((SCGraph) model, optSCG);
            transformed = copyPropagation.optimize(optSCG);
        } 
        if (commandString.equals(OPTIMIZER_UNREFERENCEDGUARDELIMINATION)) {
    		SCGCopyExtensions copyExtensions = Guice.createInjector().getInstance(SCGCopyExtensions.class);
            UnreferencedGuardElimination unreferencedGuardElimination = 
            		Guice.createInjector().getInstance(UnreferencedGuardElimination.class);
            
            SCGraph optSCG = ScgFactory.eINSTANCE.createSCGraph();
            copyExtensions.copySCG((SCGraph) model, optSCG);
            transformed = unreferencedGuardElimination.optimize(optSCG);
        } 
        return transformed;
    }

}
