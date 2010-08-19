package de.cau.cs.kieler.uml2.sim.maude.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.papyrus.editor.PapyrusMultiDiagramEditor;
import org.eclipse.ui.IEditorPart;

import de.cau.cs.kieler.core.model.validation.IModelDiagramInterface;

public class ModelDiagramInterface implements IModelDiagramInterface {

    public ModelDiagramInterface() {
    }

    public EObject getModel(IEditorPart editorPart) {
        if (editorPart instanceof PapyrusMultiDiagramEditor) {
            EObject eObj = (EObject)((PapyrusMultiDiagramEditor)editorPart).getDiagramEditPart().getModel();
            if (eObj != null && eObj instanceof View) {
                eObj = ((View) eObj).getElement();
            }
            return eObj;
        }
        return null;
    }

}
