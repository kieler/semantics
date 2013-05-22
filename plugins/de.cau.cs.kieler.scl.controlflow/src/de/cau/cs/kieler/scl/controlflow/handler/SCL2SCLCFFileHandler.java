package de.cau.cs.kieler.scl.controlflow.handler;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.yakindu.sct.model.sgraph.Statechart;
import org.yakindu.sct.model.stext.STextStandaloneSetup;
import org.yakindu.sct.ui.editor.DiagramActivator;
import org.yakindu.sct.ui.editor.editor.StatechartDiagramEditor;

import com.google.inject.Injector;

import de.cau.cs.kieler.scl.controlflow.xtend.SCLToSCLCFTransformation;
import de.cau.cs.kieler.scl.handler.AbstractModelFileHandler;
import de.cau.cs.kieler.scl.scl.Program;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * 
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class SCL2SCLCFFileHandler extends AbstractModelFileHandler {

    private static Injector injector = new STextStandaloneSetup()
            .createInjectorAndDoEMFRegistration();

    public static final String SCCTRANSFORMATIONCOMMAND = "de.cau.cs.kieler.scl.controlflow.commands.SCLToSCLCFTransformation";

    public SCL2SCLCFFileHandler() {
    }

    public String ModelHandlerFileExtension() {
        return "scl";
    }

    public String ModelHandlerFileExtensionTransformed() {
        return "cf.scl";
    }

    public String ModelHandlerDiagramEditorID() {
        return "de.cau.cs.kieler.scl.SCL";
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

    public EObject doTransformation(EObject modelObject, String commandString) {
        if (commandString.equals(SCCTRANSFORMATIONCOMMAND)) {
            EObject transformed = (new SCLToSCLCFTransformation())
                    .transformSCLToSCLControlflow((Program) modelObject);
            return transformed;
        }

        return null;
    }

}
