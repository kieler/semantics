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
package de.cau.cs.kieler.core.model.xtend.transformation.xtend;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.mwe.core.ConfigurationException;
import org.eclipse.internal.xtend.expression.ast.DeclaredParameter;
import org.eclipse.internal.xtend.xtend.XtendFile;
import org.eclipse.internal.xtend.xtend.ast.Extension;
import org.eclipse.xtend.XtendFacade;
import org.eclipse.xtend.XtendResourceParser;
import org.eclipse.xtend.expression.EvaluationException;
import org.eclipse.xtend.typesystem.emf.EcoreUtil2;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;

import de.cau.cs.kieler.core.model.CoreModelPlugin;
import de.cau.cs.kieler.core.model.gmf.util.GmfModelingUtil;
import de.cau.cs.kieler.core.model.m2m.TransformException;
import de.cau.cs.kieler.core.model.xtend.transformation.AbstractTransformation;
import de.cau.cs.kieler.core.model.xtend.transformation.ITransformationFramework;

/**
 * An implementation of the ITransformationFramework interface for the use with the Xtend framework.
 * 
 * FIXME this class depends on a GMF utility class; after it has been removed, the dependency to core.model.gmf should be deleted
 * 
 * @author mim
 * @deprecated This class is used by KSBasE. For new implementations extend the
 *             {@link XtendTransformationContext} instead.
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
    /** Cached MetaModelPackages. **/
    private HashMap<String, EPackage> packageCache;

    /**
     * Creates a new Xtend component.
     * 
     */
    public XtendTransformationFramework() {
        initalized = false;
        packageCache = new HashMap<String, EPackage>();
    }

    /**
     * Sets the actual parameters.
     * 
     * @param parameter
     *            The parameters.
     */
    public void setParameters(final Object[] parameter) {
        this.parameters = parameter.clone();
    }

    /**
     * Creates a mapping between the selected diagram elements and the given list of formal
     * parameters.
     * 
     * @param parametersToMap
     *            The list of parameters that should be mapped. If this is null, the parameters are
     *            retrieved from the current selection
     * @param parameter
     *            The list of formal parameters
     * @return The parameters or null if the mapping could not achieved
     */
    public List<Object> createParameterMapping(final List<EObject> parametersToMap,
            final String... parameter) {
        List<EObject> slist = null;
        if (parametersToMap == null) {
            slist = GmfModelingUtil.getModelElementsFromSelection();
        } else {
            slist = new LinkedList<EObject>();
            slist.addAll(parametersToMap);
        }
        int selSize = slist.size();
        LinkedList<Object> params = new LinkedList<Object>();
        if (parameter == null) {
            return null;
        }
        for (String param : parameter) {
            // Is the parameter a list?
            if (param == null) {
                continue;
            }
            if (param.contains("List")) {
                // A List-Type is : List[T] so we need the list param type.
                String listType = param.substring(XTEND_LIST_TYPE_PLENGTH, param.length() - 1);
                List<EObject> listParameterEntries = new LinkedList<EObject>();
                // Search first occurrence of listType
                boolean started = false; // did we find the type?
                for (EObject next : slist) {
                    // Ensure that next and listType contain valid values (cmot/msp, 27.06.2011)
                    try {
                        if (next.eClass().getName().equals(listType) || listType.equals("Object")) {
                            listParameterEntries.add(next);
                            started = true;
                        } else {
                            if (started) {
                                // so we started to add elements and now we found
                                // some other type, so
                                // break the loop.
                                break;
                            }
                        }
                    } catch (Exception e) {
                        //Fixing: #1697 with try-catch now to ensure valid values
                    }
                }
                if (listParameterEntries.size() > 0) {
                    params.add(listParameterEntries);
                }
                // Remove selection elements:
                for (EObject e : listParameterEntries) {
                    slist.remove(e);
                }
            } else {
                // Search first element matching type 'param'
                EObject buffer = null;
                for (EObject next : slist) {
                    try {
                    	// FIXME: this simply compares the class name with the parameter type name this fails
                    	// for many cases, e.g. subclasses or implemented classes like:
                    	// type: Node, parameter: NodeImpl
                    	// type: Node, parameter: MyNode extends Node
                    	// this is really bad! (haf)
                        if (next.eClass().getName().equals(param)) {
                            buffer = next;
                            params.add(next);
                            break;
                        }
                    } catch (NullPointerException npe) {
                        /*
                         * haf: prevent NPE in condition. do nothing as this will simply continue
                         * with the next loop iteration and ignore the current element in slist.
                         */
                    }
                }
                // Remove element from selection list
                if (buffer != null) {
                    slist.remove(buffer);
                }
            }
        }

        return slist.size() == 0 && selSize >= parameter.length ? params : null;
    }

    /**
     * Sets the transformation parameters by matching the current selection with the given list of
     * types.
     * 
     * @param parametersToMap
     *            The list of parameters that should be mapped. If this is null, the parameters are
     *            retrieved from the current selection
     * @param parameter
     *            The list of parameter types.
     * 
     * @return True if all parameters could be matched
     */
    public boolean setParameters(final List<EObject> parametersToMap, final String... parameter) {
        List<Object> mapping = createParameterMapping(parametersToMap, parameter);
        if (mapping != null) {
            this.parameters = mapping.toArray(new Object[mapping.size()]);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Resets the framework. This needs to be called if a transformation is initialized but not
     * executed.
     */
    public void reset() {
        initalized = false;
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
        if (initalized) {
            return false;
        }
        if (parameters == null) {
            return false;
        }

        // removing file extension
        String withFileExt = fileName;

        if (withFileExt.contains("." + XtendFile.FILE_EXTENSION)) {
            withFileExt = withFileExt.substring(0,
                    withFileExt.indexOf("." + XtendFile.FILE_EXTENSION));
        }
        xtendFacade = XtendFacade.create(withFileExt);
        // Register all meta models
        for (String basePackage : basePackages) {
            // The EMFMetaMetaModel,
            EmfMetaModel metaModel;

            // Load the EPackage class by using EcoreUtils
            EPackage pack = packageCache.get(basePackage);
            if (pack == null) {
                try {
                    pack = EcoreUtil2.getEPackageByClassName(basePackage);
                    packageCache.put(basePackage, pack);
                } catch (ConfigurationException ce) {
                    // package class could not be found
                    // this is bad and should not happen.
                    // We will return 'false' here and try
                    // again later.
                    return false;
                }
            }
            // create EMFMetaModel with the given EPackage
            metaModel = new EmfMetaModel(pack);
            xtendFacade.registerMetaModel(metaModel);
        }

        this.extension = operation;
        initalized = true;

        return true;
    }

    /**
     * Executes a transformation.
     * 
     * @return The return value from XtendFacade.call()
     * @throws TransformException in case the transformation fails
     */
    public Object executeTransformation() throws TransformException {
        Object result = null;
        if (initalized) {
            try {
                result = xtendFacade.call(extension, parameters);
            } catch (EvaluationException e0) {
                throw new TransformException(e0);
            } catch (IllegalArgumentException e0) {
                throw new TransformException(e0);
            }
        } else {
            CoreModelPlugin.getDefault().logError(
                    "Could not execute transformation: Transformation not initalized properly");
        }
        initalized = false;
        return result;
    }

    /**
     * Parses a transformation file and returns the existing transformations.
     * 
     * @param fileName
     *            a URL to the transformation file
     * @param inplaceOnly
     *            indicates if only in-place transformations should be parsed. If this flag is set
     *            to 'false' in-place transformations will be ignored!
     * @return a list of abstract transformations.
     */
    public List<AbstractTransformation> parseTransformations(final URL fileName,
            final boolean inplaceOnly) {
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
                        if (inplaceOnly && !ext.getReturnTypeIdentifier().getValue().equals("Void")) {
                            continue;
                        } else if (!inplaceOnly
                                && ext.getReturnTypeIdentifier().getValue().equals("Void")) {
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
