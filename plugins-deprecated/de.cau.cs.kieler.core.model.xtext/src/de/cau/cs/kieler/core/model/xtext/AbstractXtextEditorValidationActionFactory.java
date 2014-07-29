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
package de.cau.cs.kieler.core.model.xtext;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.ui.editor.XtextEditor;

import de.cau.cs.kieler.core.model.validation.AbstractValidationActionFactory;
import de.cau.cs.kieler.core.model.xtext.util.XtextModelingUtil;

/**
 * Abstract super class for validation action factories for xtext editors.
 * 
 * @author soh
 */
public abstract class AbstractXtextEditorValidationActionFactory extends
        AbstractValidationActionFactory {

    @Override
    public boolean supportsEditor(final IEditorPart editor) {
        if (editor != null && editor instanceof XtextEditor) {
            XtextEditor xtextEd = (XtextEditor) editor;
            EObject eObj = XtextModelingUtil.getModelFromXtextEditor(xtextEd, false);
            if (eObj != null) {
                return eObj.eClass().getEPackage().equals(getEPackage());
            }
        }
        return false;
    }

    /**
     * Reveals the EPackage the check is registered for.
     * 
     * @return the EPackage the check is registered for.
     */
    public abstract EPackage getEPackage();
}
