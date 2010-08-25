/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IEditorPart;

/**
 * Abstract super class for validation action factories on diagram editors.
 * Provides a generic method for getting the EPackage of an active diagram
 * editor.
 * 
 * @author soh
 */
public abstract class AbstractDiagramEditorValidationActionFactory extends
        AbstractValidationActionFactory {

    @Override
    public boolean supportsActiveEditor(final IEditorPart editor) {
        if (editor != null && editor instanceof DiagramEditor) {
            Object obj = ((DiagramEditor) editor).getDiagramEditPart()
                    .getModel();
            if (obj != null && obj instanceof View) {
                EObject eObj = ((View) obj).getElement();
                EPackage ePackage1 = eObj.eClass().getEPackage();
                EPackage ePackage2 = getEPackage();
                if (ePackage1 != null && ePackage2 != null) {
                    return ePackage1.equals(ePackage2);
                }
            }
        }
        return false;
    }

    public abstract EPackage getEPackage();

}
