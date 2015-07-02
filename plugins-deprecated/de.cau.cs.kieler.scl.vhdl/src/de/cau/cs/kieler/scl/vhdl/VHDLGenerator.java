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
package de.cau.cs.kieler.scl.vhdl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.jface.viewers.ISelection;
import org.yakindu.sct.model.stext.STextStandaloneSetup;
import com.google.inject.Injector;

import de.cau.cs.kieler.scl.vhdl.xtend.SCL2VHDL;
import de.cau.cs.kieler.scl.scl.Program;
import de.cau.cs.kieler.scl.handler.AbstractModelFileHandler;

public class VHDLGenerator extends AbstractModelFileHandler {
    
        private static Injector injector = new STextStandaloneSetup().createInjectorAndDoEMFRegistration();
        
        public static final String TRANSFORMATIONCOMMAND = "de.cau.cs.kieler.scl.vhdl.SCL2VHDL";

        public VHDLGenerator() {
        }

        public String ModelHandlerFileExtension() {
                return "scl";
        }

        public String ModelHandlerFileExtensionTransformed() {
                return "vhdl";
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
                if (commandString.equals(TRANSFORMATIONCOMMAND)) {
                    CharSequence transformed = (new SCL2VHDL())
                                    .transform((Program) modelObject);
                    return transformed;
                }
                
                return null;
        }
        
        public void doPostProcessing(EObject modelObject) {
        }
                
}
