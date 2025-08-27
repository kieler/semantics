/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2009 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model.util;

import org.eclipse.core.resources.IFile;

/**
 * Interface for a function with arguments of one type and returning a string.
 * 
 * @author soh
 * @param <Type>
 *            the type of the arguments
 */
public interface FunctionReturningString<Type> {

    /**
     * Evaluate the function.
     * 
     * @param args
     *            the arguments
     * @return the string return
     */
    String evaluate(Object... args);

    /**
     * Example function for computing the representation of an IFile.
     * 
     * @author soh
     */
    public static class IFileToStringFunction implements
            FunctionReturningString<IFile> {

        /**
         * {@inheritDoc}
         */
        public String evaluate(final Object... args) {
            IFile file = (IFile) args[0];
            return file.getFullPath().toString();
        }

    }
}
