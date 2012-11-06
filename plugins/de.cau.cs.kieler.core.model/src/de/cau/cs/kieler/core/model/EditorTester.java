/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model;

import org.eclipse.core.expressions.PropertyTester;

/**
 * A property tester that checks whether the given element is supported using the
 * {@link GraphicalFrameworkService}.
 * 
 * @kieler.ignore We'd like to get rid of this.
 * @author cmot
 */
public class EditorTester extends PropertyTester {

    /**
     * {@inheritDoc}
     */
    public boolean test(final Object receiver, final String property, final Object[] args,
            final Object expectedValue) {
        return GraphicalFrameworkService.getInstance().isSupported(receiver);
    }

}
