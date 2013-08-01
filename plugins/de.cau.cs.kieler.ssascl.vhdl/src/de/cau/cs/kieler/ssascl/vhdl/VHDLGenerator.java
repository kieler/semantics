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
package de.cau.cs.kieler.ssascl.vhdl;

import org.eclipse.core.internal.resources.File;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.yakindu.sct.model.stext.STextStandaloneSetup;
import com.google.inject.Injector;

import de.cau.cs.kieler.scl.scl.Program;
import de.cau.cs.kieler.scl.handler.AbstractModelFileHandler;
import de.cau.cs.kieler.ssascl.vhdl.xtend.SSASCL2VHDL;

/**
 * @author gjohannsen
 *
 */
public class VHDLGenerator extends AbstractModelFileHandler {
    
    private static Injector injector = new STextStandaloneSetup().createInjectorAndDoEMFRegistration();
    
    public static final String TRANSFORMATIONCOMMAND = "de.cau.cs.kieler.ssascl.vhdl.SSASCL2VHDL";

    public VHDLGenerator() {
    }

    public String ModelHandlerFileExtension() {
            return "scl";
    }

    public String ModelHandlerFileExtensionTransformed() {
            return "vhd";
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

    public CharSequence doTransformation(EObject modelObject,
                    String commandString, ISelection selection) {
        
    File file = (File) ((TreeSelection) selection).getFirstElement();
           
    java.io.File ioFile = file.getFullPath().toFile();
        
            if (commandString.equals(TRANSFORMATIONCOMMAND)) {
                CharSequence transformed = (new SSASCL2VHDL())
                                .transform((Program) modelObject, ioFile);
                return transformed;
            }
            
            return null;
    }
    
    public void doPostProcessing(EObject modelObject) {
    }
            
}
