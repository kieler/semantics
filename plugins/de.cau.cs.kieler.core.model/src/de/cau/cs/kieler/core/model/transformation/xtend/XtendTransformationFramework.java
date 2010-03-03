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

import org.eclipse.emf.ecore.EObject;
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
import de.cau.cs.kieler.core.model.util.ModelingUtil;

/**
 * An implementation of the ITransformationFramework interface for the use with the Xtend framework.
 * 
 * 
 * @author mim
 * 
 * @kieler.rating 2010-01-08 proposed yellow
 */

public class XtendTransformationFramework implements ITransformationFramework {

    private static final int XTEND_LIST_TYPE_PLENGTH = 5;
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
     * Sets the actual parameters.
     * 
     * @param parameter
     *            The parameters.
     */
    public void setParameters(final Object... parameter) {
        this.parameters = parameter.clone();
    }

    /**
     * Sets the transformation parameters by matching the current selection with the given list of
     * types.
     * 
     * @param parameter
     *            The list of parameter types.
     * 
     * @return True if all parameters could be matched
     */
    public boolean setParameters(final String... parameter) {

        List<EObject> slist = ModelingUtil.getModelElementsFromSelection();
        LinkedList<Object> params = new LinkedList<Object>();

        for (String param : parameter) {
            // Is the parameter a list?
            if (param.contains("List")) {
                // A List-Type is : List[T] so we need the list param type.
                String listType = param.substring(XTEND_LIST_TYPE_PLENGTH, param.length() - 1);
                List<EObject> listParameterEntries = new LinkedList<EObject>();
                // Search first occurrence of listType
                boolean started = false; // did we find the type?
                for (EObject next : slist) {
                    if (next.eClass().getName().equals(listType)) {
                        listParameterEntries.add(next);
                        started = true;
                    } else {
                        if (started) {
                            // so we started to add elements and now we found some other type, so
                            // break the loop.
                            break;
                        }
                    }
                }
                params.add(listParameterEntries);
                // Remove selection elements:
                for (EObject e : listParameterEntries) {
                    slist.remove(e);
                }
            } else {
                // Search first element matching type 'param'
                EObject buffer = null;
                for (EObject next : slist) {
                    if (next.eClass().getName().equals(param)) {
                        buffer = next;
                        params.add(next);
                        break;
                    }
                }
                // Remove element from selection list
                if (buffer != null) {
                    slist.remove(buffer);
                }
            }
        }
        this.parameters = params.toArray(new Object[params.size()]);
        return slist.size() == 0;
    }

    /**
     * Initializes a transformation using the XtendFacade.
     * 
     * @param fileName
     *            The extension file name
     * @param operation
     *            The extension to execute
     * @param basePackages
     *            The class name of the editors EPackage
     * @return False if an error occurred.
     */
    public boolean initializeTransformation(final String fileName, final String operation,
            final String... basePackages) {
        if (parameters == null) {
            return false;
        }

        // removing file extension
        String withFileExt = fileName;

        if (withFileExt.contains("." + XtendFile.FILE_EXTENSION)) {
            withFileExt = withFileExt.substring(0, withFileExt.indexOf("."
                    + XtendFile.FILE_EXTENSION));
        }

        xtendFacade = XtendFacade.create(withFileExt);
        // Register all meta models
        for (String basePackage : basePackages) {
            // The EMFMetaMetaModel,
            EmfMetaModel metaModel;

            // Load the EPackage class by using EcoreUtils
            EPackage pack = EcoreUtil2.getEPackageByClassName(basePackage);
            // create EMFMetaModel with the given EPackage
            metaModel = new EmfMetaModel(pack);
            xtendFacade.registerMetaModel(metaModel);
        }

        if (!xtendFacade.hasExtension(operation, parameters)) {
            return false;
        } else {
            this.extension = operation;
            initalized = true;
        }
        return true;
    }

    /**
     * Executes a transformation.
     * 
     * @return The return value from XtendFacade.call()
     */
    public Object executeTransformation() {
        Object result = null;
        if (initalized) {
            result = xtendFacade.call(extension, parameters);
        } else {
            CoreModelPlugin.getDefault().logError(
                    "Could not execute transformation: Transformation not initalized poroperly");
        }
        return result;
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
                        XtendTransformation xt = new XtendTransformation();
                        xt.setTransformation(ext.getName());
                        xt.addParameters(params);
                        transformations.add(xt);
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
     * The default file extension for Xtend is 'ext'.
     * 
     * @return 'ext'
     */
    public String getFileExtension() {
        return XtendFile.FILE_EXTENSION;
    }

}
