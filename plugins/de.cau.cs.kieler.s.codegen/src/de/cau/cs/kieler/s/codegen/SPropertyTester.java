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
package de.cau.cs.kieler.s.codegen;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.xtext.ui.editor.XtextEditor;

/**
 * @author soh
 */
public class SPropertyTester extends PropertyTester {

    /**
     * {@inheritDoc}
     */
    public boolean test(final Object receiver, final String property,
            final Object[] args, final Object expectedValue) {
        if (property.equals("activeSEditor") && receiver instanceof XtextEditor) {
            XtextEditor ed = (XtextEditor) receiver;
            System.out.println(ed.getLanguageName());
        }
        System.out.println(receiver);
        System.out.println(property);
        return false;
    }

}
