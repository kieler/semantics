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

import org.eclipse.xtend.typesystem.emf.EmfMetaModel;

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
     * Executes a transformation with the parameters set with the initalizeTransformation method.
     */
    void executeTransformation();

    /**
     * Initializes a transformation.
     * 
     * @param fileName
     *            The transformation file name
     * @param operation
     *            The operation to execute
     * @param metaModel
     *            The EMF metamodel
     * @param parameter
     *            The parameters for the transformation
     * @return False if an error occurred.
     */
    boolean initializeTransformation(String fileName, String operation, EmfMetaModel metaModel,
            Object... parameter);
}
