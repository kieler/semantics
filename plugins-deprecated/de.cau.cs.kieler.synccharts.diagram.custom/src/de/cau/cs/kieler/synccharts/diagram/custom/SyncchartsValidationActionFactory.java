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
package de.cau.cs.kieler.synccharts.diagram.custom;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.Action;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;

import de.cau.cs.kieler.core.model.validation.AbstractValidationActionFactory;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.diagram.part.ValidateAction;

/**
 * @author soh
 * @kieler.ignore (excluded from review process)
 */
public class SyncchartsValidationActionFactory extends AbstractValidationActionFactory {

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean supportsEditor(final IEditorPart editor) {
        if (editor != null && editor instanceof DiagramEditor) {
            Object obj = ((DiagramEditor) editor).getDiagramEditPart()
                    .getModel();
            if (obj != null && obj instanceof View) {
                EObject eObj = ((View) obj).getElement();
                EPackage ePackage1 = eObj.eClass().getEPackage();
                EPackage ePackage2 = SyncchartsPackage.eINSTANCE;
                if (ePackage1 != null && ePackage2 != null) {
                    return ePackage1.equals(ePackage2);
                }
            }
        }
        return false;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public Action getValidationAction(final IWorkbenchPage page) {
        return new ValidateAction(page);
    }
    
}
