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
package de.cau.cs.kieler.core.model.transformation.xtend;

import org.eclipse.xtend.XtendFacade;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;

import de.cau.cs.kieler.core.model.CoreModelPlugin;
import de.cau.cs.kieler.core.model.transformation.ITransformationFramework;

/**
 * An implementation of the ITransformationFramework interface for the use with the Xtend framework.
 * 

 * @author mim
 * 
 * @kieler.rating 2010-01-08 proposed yellow
 */

public class XtendTransformationFramework implements ITransformationFramework {

    /** The Xtend facade, used to execute a transformation. **/
    private XtendFacade xtendFacade;
    /** The extension parameters. **/
    private Object[] parameters;
    /** The name of the extension. **/
    private String extension;
    /** The component status. **/
    private boolean initalized;

    /**
     * Creates a new Xtend component.
     * 
     */
    public XtendTransformationFramework() {
        initalized = false;
    }

    /**
     * Executes a transformation using the XtendFacade.
     * 
     * @param fileName
     *            The extension file name
     * @param operation
     *            The extension to execute
     * @param metaModel
     *            The EMF metamodel.
     * @param parameter
     *            The parameters
     * @return False if an error occoured.
     */
    public boolean initializeTransformation(final String fileName, final String operation,
            final EmfMetaModel metaModel, final Object... parameter) {
        xtendFacade = XtendFacade.create(fileName);
        xtendFacade.registerMetaModel(metaModel);

        if (!xtendFacade.hasExtension(operation, parameter)) {
            CoreModelPlugin.getDefault().logError(
                    "Could not find transformation " + operation + " with the parameters"
                            + parameter);
        } else {
            this.parameters = parameter;
            this.extension = operation;
            initalized = true;
        }
        return true;
    }

    /**
     * Executes a transformation.
     */
    public void executeTransformation() {
        if (initalized) {
            xtendFacade.call(extension, parameters);
        } else {
            CoreModelPlugin.getDefault().logError(
                    "Could not execute transformation: Transformation not initalized poroperly");
        }
    }
}
