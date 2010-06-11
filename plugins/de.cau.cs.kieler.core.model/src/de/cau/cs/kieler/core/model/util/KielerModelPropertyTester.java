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
package de.cau.cs.kieler.core.model.util;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;

/**
 * This tester tests whether the active editor is a diagram editor and thus
 * problem markers can be toggled.
 * 
 * @author soh
 * @kieler.rating 2010-06-11 proposed yellow soh
 */
public class KielerModelPropertyTester extends PropertyTester {

    /**
     * {@inheritDoc}
     */
    public boolean test(final Object receiver, final String property,
            final Object[] args, final Object expectedValue) {
        if (property.equals("isDiagramEditor")
                && receiver instanceof DiagramEditor) {
            // editor might have markers and validation action
            return true;
        }
        // determine whether the validation manager has any check files
        // for the currenly active diagram editor.
        if (property.equals("hasValidateAction")
                && receiver instanceof DiagramEditor) {
            EPackage ePackage = ValidationManager.getEPackageOfActiveEditor();
            return !ValidationManager.getRegisteredFiles(ePackage).isEmpty();
        }
        return false;
    }

}
