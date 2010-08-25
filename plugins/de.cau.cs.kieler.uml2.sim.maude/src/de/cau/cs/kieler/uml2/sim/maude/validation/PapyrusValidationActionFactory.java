package de.cau.cs.kieler.uml2.sim.maude.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.Action;
import org.eclipse.papyrus.diagram.statemachine.part.ValidateAction;
import org.eclipse.papyrus.editor.PapyrusMultiDiagramEditor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.uml2.uml.UMLPackage;

import de.cau.cs.kieler.core.model.validation.AbstractValidationActionFactory;

public class PapyrusValidationActionFactory extends
        AbstractValidationActionFactory {

    /**
     * {@inheritDoc}
     */
    @Override
    public Action getValidationAction(final IWorkbenchPage page) {
        return new ValidateAction(page);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean supportsEditor(final IEditorPart editor) {
        if (editor instanceof PapyrusMultiDiagramEditor) {
            EObject eObj = (EObject) ((PapyrusMultiDiagramEditor) editor)
                    .getDiagramEditPart().getModel();
            if (eObj != null && eObj instanceof View) {
                eObj = ((View) eObj).getElement();
                return eObj.eClass().getEPackage().equals(UMLPackage.eINSTANCE);
            }
        }
        return false;
    }

}
