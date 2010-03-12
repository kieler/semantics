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

import org.eclipse.emf.ecore.EObject;

/**
 * Interface for creating a bridge between a transformation framework and KIELER.
 * 
 * Every transformation framework that is used by the KSBasE Plug-in has to implement this
 * interface. The {@link XtendTransformationFramework} class contains an implementation for the
 * Xtend framework.
 * 
 * @author mim
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
     * @param parametersToMap
     *            The list of parameters that should be mapped. If this is null, the parameters are
     *            retrieved from the current selection
     * @param parameter
     *            The list of parameter types.
     * @return True if all parameters could be set.
     * 
     */
    boolean setParameters(List<EObject> parametersToMap, String... parameter);

    /**
     * Creates the actual mapping between the selected diagram elements and the given list of formal
     * parameters.
     * 
     * @param parametersToMap
     *            The list of parameters that should be mapped. If this is null, the parameters are
     *            retrieved from the current selection
     *            
     * @param parameter
     *            The list of formal parameters
     * @return The parameters or null if the mapping could not achieved
     */
    List<Object> createParameterMapping(List<EObject> parametersToMap, String... parameter);

    /**
     * Sets the transformation parameters.
     * 
     * @param parameter
     *            The actual parameters
     */
    void setParameters(Object[] parameter);

    /**
     * Resets the transformation framework.
     */
    void reset();

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
