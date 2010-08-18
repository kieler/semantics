package de.cau.cs.kieler.core.model.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.IEditorPart;

// TODO: soh please comment
/**
 * The Interface IModelDiagramInterface.
 */
public interface IModelDiagramInterface {

    /**
     * Gets the model of the editor part to check.
     * 
     * @param editorPart
     *            the editor part
     * @return the model
     */
    public EObject getModel(IEditorPart editorPart);
    
}
