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
package de.cau.cs.kieler.eso.coreeso;

import org.eclipse.core.internal.resources.File;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.yakindu.sct.model.stext.STextStandaloneSetup;

import com.google.inject.Injector;

import de.cau.cs.kieler.eso.coreeso.xtend.ESO2CoreESO;
import de.cau.cs.kieler.scl.handler.AbstractModelFileHandler;
import de.cau.cs.kieler.sim.eso.eso.tracelist;

/**
 * Model transformation handler forESO to core ESO. 
 *
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class ESO2CoreESOGenerator extends AbstractModelFileHandler {

private static Injector injector = new STextStandaloneSetup().createInjectorAndDoEMFRegistration();
    
    public static final String TRANSFORMATIONCOMMAND = "de.cau.cs.kieler.eso.coreeso.eso2coreeso";

    public ESO2CoreESOGenerator() {
    }

    public String ModelHandlerFileExtension() {
            return "eso";
    }

    public String ModelHandlerFileExtensionTransformed() {
            return "core.vhdl.eso";
    }

    public String ModelHandlerDiagramEditorID() {
            return "de.cau.cs.kieler.kaom.diagram.part.KaomDiagramEditorID";
    }

    public PreferencesHint ModelHandlerDiagramPreferencesHint() {
            return new PreferencesHint("");
    }

    public boolean ModelHandlerCreateDiagram() {
            return false;
    }

    public boolean ModelHandlerOpenEditor() {
            return false;
    }
    
    public Injector CreateResourceInjector() {
        return injector;
    }
    
    public String getTransformationCommand(){
        return TRANSFORMATIONCOMMAND;
    }

    public tracelist doTransformation(EObject modelObject,
                    String commandString, ISelection selection) {       
           
        File file = (File) ((TreeSelection) selection).getFirstElement();

        //The SCl model is needed to transform a core ESO trace to a VHDL testbench
        //it must have the same name and it must place in the same folder as the ESO file
        //ESO core generation: test.eso transforms to test.core.eso therefore two times removeFileExtension
        java.io.File ioFile = file.getFullPath().removeFileExtension()
                .removeFileExtension().removeFileExtension().addFileExtension("scl").toFile();
        
        if (commandString.equals(TRANSFORMATIONCOMMAND)) {
            tracelist transformed = (new ESO2CoreESO())
                            .transformESO2CoreESO((tracelist) modelObject, ioFile);
            return transformed;
        }
        
        return null;
    }
    
}
