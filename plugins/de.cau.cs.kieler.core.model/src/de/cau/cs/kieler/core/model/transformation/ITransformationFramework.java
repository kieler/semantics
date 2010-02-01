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
 * 
 *****************************************************************************/
package de.cau.cs.kieler.core.model.transformation;

import java.net.URL;
import java.util.List;

/**
 * Interface for executing a transformation with a framework.
 * 
 * Every transformation framework that is used by the KSBAsE Plug-in has to implement this
 * interface. The {@link XtendTransformationFramework} contains an implementation for the Xtend
 * framework.
 * 
 * @author mim
 * 
 * @kieler.rating 2010-01-08 proposed yellow
 * 
 */
public interface ITransformationFramework {

    /**
     * Returns the default file extension for this framework without the leading dot.
     * 
     * @return A string representing the file extension
     */
    String getFileExtension();

    /**
     * Executes a transformation with the parameters set with the initalizeTransformation method.
     * 
     * @return A return value from the transformation. May be null
     */
    Object executeTransformation();

    /**
     * Sets the transformation parameters by matching the current selection with the given list of
     * types. The framework may return 'false' if the parameters could not be matched.
     * 
     * @param parameter
     *            The list of parameter types.
     * @return True if all parameters could be set.
     * 
     */
    boolean setParameters(String... parameter);

    /**
     * Sets the transformation parameters.
     * 
     * @param parameter
     *            The actual parameters
     */
    void setParameters(Object... parameter);

    /**
     * Initializes a transformation. This includes the parameter mapping, if necessary. The
     * parameter 'parameter' is only a string representation of the parameter types of the given
     * operation.
     * 
     * @param fileName
     *            The transformation file name
     * @param operation
     *            The operation to execute
     * @param basePackages
     *            The class name of the editors EPackage
     * @return False if an error occurred.
     */
    boolean initializeTransformation(String fileName, String operation, String... basePackages);

    /**
     * Parses a transformation file and returns the existing in-place transformations.
     * 
     * @param fileName
     *            a URL to the transformation file
     * @return a list of abstract transformations.
     */
    List<AbstractTransformation> parseInPlaceTransformations(final URL fileName);
}
