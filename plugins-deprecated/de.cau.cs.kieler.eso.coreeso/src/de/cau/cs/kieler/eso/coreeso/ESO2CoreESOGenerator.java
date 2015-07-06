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
package de.cau.cs.kieler.eso.coreeso;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.jface.viewers.ISelection;
import org.yakindu.sct.model.stext.STextStandaloneSetup;

import com.google.inject.Injector;

import de.cau.cs.kieler.eso.coreeso.xtend.ESO2CoreESO;
import de.cau.cs.kieler.scl.handler.AbstractModelFileHandler;
import de.cau.cs.kieler.sim.eso.eso.tracelist;

/**
 * @author gjo
 *
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
            return "core.eso";
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
            
        if (commandString.equals(TRANSFORMATIONCOMMAND)) {
            tracelist transformed = (new ESO2CoreESO())
                            .transformESO2CoreESO((tracelist) modelObject);
            return transformed;
        }
        
        return null;
    }
    
}
