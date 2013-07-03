package de.cau.cs.kieler.eso.vhdl;

//import java.io.File;
import org.eclipse.core.internal.resources.File;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.yakindu.sct.model.stext.STextStandaloneSetup;

import com.google.inject.Injector;

import de.cau.cs.kieler.scl.handler.AbstractModelFileHandler;
import de.cau.cs.kieler.sim.eso.eso.tracelist;
import de.cau.cs.kieler.eso.vhdl.xtend.ESO2VHDL;

/**
 * Model transformation handler for core ESO to VHDL Testbench. 
 *
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
//@SuppressWarnings("restriction")
public class VHDLtbGenerator extends AbstractModelFileHandler {

    private static Injector injector = new STextStandaloneSetup().createInjectorAndDoEMFRegistration();
    
    public static final String TRANSFORMATIONCOMMAND = "de.cau.cs.kieler.eso.vhdl.ESO2VHDL";

    public VHDLtbGenerator() {
    }

    public String ModelHandlerFileExtension() {
            return "eso";
    }

    public String ModelHandlerFileExtensionTransformed() {
            return "tb.vhd";
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
    
    public CharSequence doTransformation(EObject modelObject,
                    String commandString, ISelection selection) {

        File file = (File) ((TreeSelection) selection).getFirstElement();

        //The SCl model is needed to transform a core ESO trace to a VHDL testbench
        //it must have the same name and it must place in the same folder as the ESO file
        //ESO core generation: test.eso transforms to test.core.eso therefore two times removeFileExtension
        java.io.File ioFile = file.getFullPath().removeFileExtension()
                .removeFileExtension().addFileExtension("scl").toFile();
        
        if (commandString.equals(TRANSFORMATIONCOMMAND)) {
            CharSequence transformed = (new ESO2VHDL())
                            .transformESO2VHDL((tracelist) modelObject, ioFile);
            return transformed;
        }
        
        return null;
    }
    
    public void doPostProcessing(EObject modelObject) {
    }
}
