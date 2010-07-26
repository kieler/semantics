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
package de.cau.cs.kieler.synccharts.text.kits.bridge;

import java.util.HashMap;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.xtext.ui.editor.XtextEditor;

import de.cau.cs.kieler.core.model.util.ModelingUtil;
import de.cau.cs.kieler.core.model.validation.IValidationActionFactory;
import de.cau.cs.kieler.core.ui.util.EditorUtils;
import de.cau.cs.kieler.synccharts.text.kits.validation.AbstractKitsJavaValidator;

/**
 * Factory for constructing the validate actions for the actions grammar.
 * 
 * @author soh
 */
public class KitsValidationActionFactory implements IValidationActionFactory {

    /**
     * {@inheritDoc}
     */
    public Action getValidationAction(final IWorkbenchPage page) {

        return new Action() {

            @Override
            public void run() {
                AbstractKitsJavaValidator validator = new AbstractKitsJavaValidator();
                IEditorPart ed = EditorUtils.getLastActiveEditor();
                if (ed != null && ed instanceof XtextEditor) {
                    EObject eObj = ModelingUtil
                            .getModelFromXtextEditor((XtextEditor) ed);
                    // FIXME: Not working yet... shows no errors
                    validator.validate(eObj, null,
                            new HashMap<Object, Object>());
                }
            }
        };
    }
}
