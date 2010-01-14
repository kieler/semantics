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

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.internal.xtend.expression.ast.DeclaredParameter;
import org.eclipse.internal.xtend.xtend.XtendFile;
import org.eclipse.internal.xtend.xtend.ast.Extension;
import org.eclipse.xtend.XtendFacade;
import org.eclipse.xtend.XtendResourceParser;
import org.eclipse.xtend.typesystem.emf.EcoreUtil2;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;

import de.cau.cs.kieler.core.model.CoreModelPlugin;
import de.cau.cs.kieler.core.model.transformation.AbstractTransformation;
import de.cau.cs.kieler.core.model.transformation.ITransformationFramework;

/**
 * An implementation of the ITransformationFramework interface for the use with the Xtend framework.
 * 
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
     * @param basePackage
     *            The class name of the editors EPackage
     * @param parameter
     *            The parameters
     * @return False if an error occoured.
     */
    public boolean initializeTransformation(final String fileName, final String operation,
            final String basePackage, final Object... parameter) {
        xtendFacade = XtendFacade.create(fileName);

        // The EMFMetaMetaModel,
        EmfMetaModel metaModel;

        // Load the EPackage class by using EcoreUtils
        EPackage pack = EcoreUtil2.getEPackageByClassName(basePackage);
        // create EMFMetaModel with the given EPackage
        metaModel = new EmfMetaModel(pack);
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

    /**
     * Parses in-place transformations from an Xtend file.
     * 
     * @param fileName
     *            a URL to the transformation file
     * @return A list of AbstractTransformations
     */
    public List<AbstractTransformation> parseInPlaceTransformations(final URL fileName) {
        if (fileName != null) {
            try {
                // Using the XtendResourceParser to read transformations
                XtendResourceParser parser = new XtendResourceParser();
                Reader reader = new InputStreamReader(fileName.openStream());
                Object o = parser.parse(reader, "features.ext"); //$NON-NLS-1$
                if (o != null) {
                    LinkedList<AbstractTransformation> transformations = 
                        new LinkedList<AbstractTransformation>();
                    // irgendwie werden die parameter nicht richtig gesetzt
                    XtendFile xtFile = (XtendFile) o;
                    for (Extension ext : xtFile.getExtensions()) {
                        // Only read in-place methods
                        if (!ext.getReturnTypeIdentifier().getValue().equals("Void")) { //$NON-NLS-1$
                            continue;
                        }
                        // Read parameters:
                        LinkedList<String> params = new LinkedList<String>();
                        for (DeclaredParameter param : ext.getFormalParameters()) {
                            params.add(param.getType().getValue());
                        }
                        transformations.add(new XtendTransformation(ext.getName(), params));
                    }
                    return transformations;
                }
            } catch (SecurityException sec) {
                CoreModelPlugin.getDefault().logError(
                        "Unable to parse Xtend file: Not allowed to open file."); //$NON-NLS-1$
            } catch (IOException e) {
                CoreModelPlugin.getDefault().logError(
                        "Unable to parse Xtend file: Error while reading file."); //$NON-NLS-1$
            }
        }
        return null;
    }

    /**
     * The default file extension for Xtend is .ext.
     * @return .ext
     */
    public String getFileExtension() {
        return XtendFile.FILE_EXTENSION;
    }

}
