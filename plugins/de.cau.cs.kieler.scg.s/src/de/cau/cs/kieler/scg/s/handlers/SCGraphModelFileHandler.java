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
package de.cau.cs.kieler.scg.s.handlers;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.cau.cs.kieler.core.model.handlers.AbstractConvertModelHandler;
import de.cau.cs.kieler.s.SPlugin;
import de.cau.cs.kieler.s.SStandaloneSetup;
import de.cau.cs.kieler.scg.SCGraph;
import de.cau.cs.kieler.scg.s.transformations.SCGToSTransformation;
import de.cau.cs.kieler.scg.schedulers.AbstractScheduler;
import de.cau.cs.kieler.scg.schedulers.SimpleScheduler;
import de.cau.cs.kieler.scg.sequentializer.AbstractSequentializer;
import de.cau.cs.kieler.scg.sequentializer.SimpleSequentializer;
import de.cau.cs.kieler.scg.transformations.BasicBlockTransformation;
import de.cau.cs.kieler.scg.transformations.DependencyTransformation;
import de.cau.cs.kieler.scgbb.SCGraphBB;
import de.cau.cs.kieler.scgdep.SCGraphDep;
import de.cau.cs.kieler.scgsched.SCGraphSched;

/**
 * Handler for menu contributions
 *
 * @author ssm
 * @kieler.design 2014-01-08 proposed 
 * @kieler.rating 2014-01-08 proposed yellow
 */
public class SCGraphModelFileHandler extends AbstractConvertModelHandler {

    public static final String SCG_TRANSFORMATION =
            "de.cau.cs.kieler.scg.commands.SCGToSTransformation";

    private static Injector injector = new SStandaloneSetup()
        .createInjectorAndDoEMFRegistration();

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getTargetExtension(EObject model, ExecutionEvent event, ISelection selection) {
        return "s";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Injector createResourceInjector() {
        return injector;
    }

    public String getDiagramEditorID() {
        return SPlugin.EDITOR_ID;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    protected Object transform(EObject model, ExecutionEvent event, ISelection selection) {
        String commandString = event.getCommand().getId().toString();
        EObject transformed = null;

        DependencyTransformation transformation1 =
                Guice.createInjector().getInstance(DependencyTransformation.class);        
        BasicBlockTransformation transformation2 =
                Guice.createInjector().getInstance(BasicBlockTransformation.class);
        AbstractScheduler transformation3 =
                Guice.createInjector().getInstance(SimpleScheduler.class);        
        AbstractSequentializer transformation4 =
                        Guice.createInjector().getInstance(SimpleSequentializer.class);
        SCGToSTransformation transformation5 =
        		Guice.createInjector().getInstance(SCGToSTransformation.class);
        
        // Call the model transformation (this creates a copy of the model containing the
        // refactored model).
        transformed = model;
        if (commandString.equals(SCG_TRANSFORMATION)) {
            if (!selection.toString().contains(".seq.scg")) {
                if (!(transformed instanceof SCGraphDep)) 
                    transformed = transformation1.transform(transformed);
                if (!(transformed instanceof SCGraphBB)) 
                    transformed = transformation2.transform(transformed);
                if (!(transformed instanceof SCGraphSched)) 
                    transformed = transformation3.transform(transformed, null);            
                transformed = transformation4.transform(transformed);
            }
            
            transformed = transformation5.transformSCGToS((SCGraph) transformed);
        } 
        return transformed;
    }

}
