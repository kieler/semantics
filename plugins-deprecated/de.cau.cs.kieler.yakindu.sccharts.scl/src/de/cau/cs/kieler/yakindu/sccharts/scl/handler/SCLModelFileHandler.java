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
package de.cau.cs.kieler.yakindu.sccharts.scl.handler;

import java.util.EnumSet;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.jface.viewers.ISelection;
import org.yakindu.sct.model.sgraph.Statechart;
import org.yakindu.sct.model.stext.STextStandaloneSetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.cau.cs.kieler.yakindu.sccharts.scl.xtend.CoreToSCLTransformation;
import de.cau.cs.kieler.yakindu.sccharts.scl.xtend.CoreToSCLOptimization;
import de.cau.cs.kieler.yakindu.sccharts.scl.xtend.SCLOptimizations;
import de.cau.cs.kieler.scl.handler.AbstractModelFileHandler;

/**
 * @author ssm
 *
 */

/* This class handles the ui context menu events on scl resources. */
public class SCLModelFileHandler extends AbstractModelFileHandler {

    // Create an injector to load the transformation via guice.
    private static Injector injector = new STextStandaloneSetup()
            .createInjectorAndDoEMFRegistration();

    // String command constants
    public static final String SCLTRANSFORMATIONCOMMAND = "de.cau.cs.kieler.yakindu.sccharts.scl.commands.CoreToSCLTransformation";
    public static final String SCLTRANSFORMATIONCOMMANDNOOPT = "de.cau.cs.kieler.yakindu.sccharts.scl.commands.CoreToSCLTransformationNoOpt";
    public static final String SCLTRANSFORMATIONCOMMANDONLYGOTO = "de.cau.cs.kieler.yakindu.sccharts.scl.commands.CoreToSCLTransformationOnlyGoto";
    public static final String SCLTRANSFORMATIONCOMMANDONLYLABEL = "de.cau.cs.kieler.yakindu.sccharts.scl.commands.CoreToSCLTransformationOnlyLabel";
    public static final String SCLTRANSFORMATIONCOMMANDONLYSELFLOOP = "de.cau.cs.kieler.yakindu.sccharts.scl.commands.CoreToSCLTransformationOnlySelfloop";
    public static final String SCLTRANSFORMATIONCOMMANDONLYSTATEPOSITION = "de.cau.cs.kieler.yakindu.sccharts.scl.commands.CoreToSCLTransformationOnlyStatePosition";

    // Constructor
    public SCLModelFileHandler() {
    }

    // Source resource file extension
    public String ModelHandlerFileExtension() {
        return "scc";
    }

    // Transformation target file extension
    public String ModelHandlerFileExtensionTransformed() {
        return "scl";
    }

    // ID of the diagram editor
    public String ModelHandlerDiagramEditorID() {
        return "de.cau.cs.kieler.scl.SCL";
    }

    // Preferences hint
    public PreferencesHint ModelHandlerDiagramPreferencesHint() {
        return new PreferencesHint("");
    }

    // Do not create a diagram automatically.
    public boolean ModelHandlerCreateDiagram() {
        return false;
    }

    // Do not open an editor automatically.
    public boolean ModelHandlerOpenEditor() {
        return false;
    }

    // Returns the static injector.
    public Injector CreateResourceInjector() {
        return injector;
    }

    // Executed when the transformation is invoked.
    public EObject doTransformation(EObject modelObject, String commandString, ISelection selection) {

        final EnumSet<SCLOptimizations> opt = EnumSet.noneOf(SCLOptimizations.class);
        // Use the default transformation optimizations or
        // use the optimization selected in the context menu.
        opt.add(SCLOptimizations.GOTO);
        opt.add(SCLOptimizations.LABEL);
        opt.add(SCLOptimizations.SELFLOOP);
        if (commandString.equals(SCLTRANSFORMATIONCOMMANDNOOPT)) {
            opt.clear();
        }
        if (commandString.equals(SCLTRANSFORMATIONCOMMANDONLYGOTO)) {
            opt.clear();
            opt.add(SCLOptimizations.GOTO);
        }
        if (commandString.equals(SCLTRANSFORMATIONCOMMANDONLYLABEL)) {
            opt.clear();
            opt.add(SCLOptimizations.LABEL);
        }
        if (commandString.equals(SCLTRANSFORMATIONCOMMANDONLYSELFLOOP)) {
            opt.clear();
            opt.add(SCLOptimizations.SELFLOOP);
        }
        if (commandString.equals(SCLTRANSFORMATIONCOMMANDONLYSTATEPOSITION)) {
            opt.clear();
            opt.add(SCLOptimizations.STATEPOSITION);
        }

        // Invoke the transformation via guice...
        EObject transformed = Guice.createInjector().getInstance(CoreToSCLTransformation.class)
                .transformCoreToSCL((Statechart) modelObject, opt);
        // ... and resolve references.
        EcoreUtil.resolveAll(transformed);
        return transformed;
    }

    // No post-processing
    public void doPostProcessing(EObject modelObject) {
    }

}
