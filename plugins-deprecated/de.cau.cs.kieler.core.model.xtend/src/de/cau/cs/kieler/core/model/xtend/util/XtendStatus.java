/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model.xtend.util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap.Entry;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.MWEDiagnostic;

import de.cau.cs.kieler.core.model.CoreModelPlugin;

/**
 * Class to create a MultiStatus object from an Issues object that contains
 * Xtend Errors, Warnings and Infos. Might still be IStatus.OK, if the Issues
 * object is empty. Can be used to directly show issues in the Status Manager.
 * 
 * @author haf
 * @kieler.rating 2010-06-04 proposed yellow proposed by haf
 */
public class XtendStatus implements IStatus {

    private Issues myIssues;
    private Map<EObject, AnyType> myUnknownFeatures;
    private String myLogMessage;
    private Exception myException;
    private IStatus[] children;
    private int severity = IStatus.OK;
    private Throwable firstException = null;

    /**
     * Constructor taking an Xtend Issues which contains Errors, Infos,
     * Warnings.
     * 
     * @param issues
     *            the input diagnostic information
     * @param logMessage
     *            the logMessage of the Xtend components. Might carry detailed
     *            information about where an error occured, including a stack
     *            trace of the Xtend file.
     * @param unknownFeatures
     *            if the input file is an XMIResource, unknown features (not
     *            specified XML elements) get recorded and can be passed to this
     *            status
     * @param e
     *            an Exception occuring during transformation may be passed here
     */
    public XtendStatus(final Issues issues, final String logMessage,
            final Map<EObject, AnyType> unknownFeatures, final Exception e) {
        this.myIssues = issues;
        this.myUnknownFeatures = unknownFeatures;
        this.myLogMessage = logMessage;
        this.myException = e;
    }

    /**
     * {@inheritDoc}
     */
    public IStatus[] getChildren() {
        if (children == null) {
            List<IStatus> myStatus = new LinkedList<IStatus>();

            // add exception if there is one
            if (myException != null) {
                IStatus status = new Status(IStatus.ERROR, CoreModelPlugin.PLUGIN_ID, "Exception "
                        + myException.getMessage(), myException);
                myStatus.add(status);
                severity = IStatus.ERROR;
                if (firstException == null) {
                    firstException = myException;
                }
            }

            // add issues (Errors, Warnings, Infos)
            MWEDiagnostic[] tempDiags = myIssues.getErrors();
            for (int i = 0; i < tempDiags.length; i++) {
                MWEDiagnostic diagnostic = tempDiags[i];
                IStatus status = new Status(IStatus.ERROR, CoreModelPlugin.PLUGIN_ID, "Error: "
                        + diagnostic.getMessage(), diagnostic.getException());
                myStatus.add(status);
                severity = IStatus.ERROR;
                if (firstException == null) {
                    firstException = diagnostic.getException();
                }
            }

            tempDiags = myIssues.getWarnings();
            for (int i = 0; i < tempDiags.length; i++) {
                MWEDiagnostic diagnostic = tempDiags[i];
                IStatus status = new Status(IStatus.WARNING, CoreModelPlugin.PLUGIN_ID, "Warning: "
                        + diagnostic.getMessage(), diagnostic.getException());
                myStatus.add(status);
                if (firstException == null) {
                    firstException = diagnostic.getException();
                }
                if (severity != IStatus.ERROR) {
                    severity = IStatus.WARNING;
                }
            }

            tempDiags = myIssues.getInfos();
            for (int i = 0; i < tempDiags.length; i++) {
                MWEDiagnostic diagnostic = tempDiags[i];
                IStatus status = new Status(IStatus.INFO, CoreModelPlugin.PLUGIN_ID, "Info: "
                        + diagnostic.getMessage(), diagnostic.getException());
                myStatus.add(status);
                if (firstException == null) {
                    firstException = diagnostic.getException();
                }
                if (severity != IStatus.ERROR && severity != IStatus.WARNING) {
                    severity = IStatus.INFO;
                }
            }

            // add warnings about unknown features
            Map<EObject, AnyType> unknownFeatures = getUnknownFeatures();
            for (EObject targetObject : unknownFeatures.keySet()) {
                IStatus status = new Status(IStatus.WARNING, CoreModelPlugin.PLUGIN_ID,
                        "Unknown XML feature found in input. Unknown feature: \n"
                                + serialize(unknownFeatures.get(targetObject)) + "\nfor Object\n"
                                + targetObject.toString());
                myStatus.add(status);

                if (severity != IStatus.ERROR) {
                    severity = IStatus.WARNING;
                }
            }

            children = new IStatus[myStatus.size()];
            children = myStatus.toArray(children);
        }
        return children;

    }

    /**
     * {@inheritDoc}
     */
    public int getCode() {
        return 0;
    }

    /**
     * {@inheritDoc}
     */
    public Throwable getException() {
        return firstException;
    }

    /**
     * {@inheritDoc}
     */
    public String getMessage() {
        if (severity == IStatus.OK) {
            return "Model-to-model transformation successfully done.";
        }
        StringBuffer msg = new StringBuffer();
        if (severity == IStatus.INFO) {
            msg.append("Info");
        }
        if (severity == IStatus.WARNING) {
            msg.append("Warning");
        }
        if (severity == IStatus.ERROR) {
            msg.append("Error");
        }
        if (getChildren().length > 1) {
            msg.append("s");
        }
        msg.append(" in an Xtend model-to-model transformation.");
        msg.append("\n Log Message: " + myLogMessage);
        return msg.toString();
    }

    /**
     * {@inheritDoc}
     */
    public String getPlugin() {
        return CoreModelPlugin.PLUGIN_ID;
    }

    /**
     * {@inheritDoc}
     */
    public int getSeverity() {
        getChildren(); // calc severity from children
        return severity;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isMultiStatus() {
        IStatus[] status = getChildren();
        return status.length > 0;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isOK() {
        return severity == IStatus.OK;
    }

    /**
     * {@inheritDoc}
     */
    public boolean matches(final int severityMask) {
        return ((severity & severityMask) > 0);
    }

    /**
     * If the input file is an XMIResource, unknown features (not specified XML
     * elements) get recorded and can be passed to this status.
     * 
     * @return a map of unknown XML tags/attributes occured during the
     *         transformation
     */
    public Map<EObject, AnyType> getUnknownFeatures() {
        if (myUnknownFeatures == null) {
            myUnknownFeatures = new HashMap<EObject, AnyType>();
        }
        return myUnknownFeatures;
    }

    private String getString(final AnyType anyType) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("(");
        // buffer.append("Any: ");

        buffer.append(getString(anyType.getAny()));
        buffer.append(getString(anyType.getAnyAttribute()));
        buffer.append(getString(anyType.getMixed()));
        buffer.append(")");
        return buffer.toString();
    }

    private String getString(final FeatureMap map) {
        StringBuffer buffer = new StringBuffer();
        for (Entry entry : map) {
            buffer.append(entry.getEStructuralFeature().getName());
            String val = "=\"" + entry.getValue() + "\" ";
            if (entry.getValue() instanceof AnyType) {
                // recursive call
                val = " " + getString((AnyType) entry.getValue());
            }
            buffer.append(val + " ");
        }
        buffer.append(" ");
        return buffer.toString();
    }

    private String serialize(final AnyType anyType) {
        // Create a resource set.
        ResourceSet resourceSet = new ResourceSetImpl();

        // Register the default resource factory -- only needed for stand-alone!
        // this tells EMF to use XML to save the model
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
                Resource.Factory.Registry.DEFAULT_EXTENSION, new XMLResourceFactoryImpl());

        // Get the URI of the model file.
        URI fileURI = URI.createFileURI(new File("dummy.xml").getAbsolutePath());

        // Create a resource for this file.
        Resource resource = resourceSet.createResource(fileURI);

        // Add the model objects to the contents.
        resource.getContents().add(anyType);

        HashMap<String, Object> options = new HashMap<String, Object>();
        options.put(XMLResource.OPTION_EXTENDED_META_DATA, true);
        
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        // Save the contents of the resource to the file system.
        try {
            resource.save(outputStream, options); 
        } catch (Exception e) {
            return getString(anyType);
        }
        return outputStream.toString();
    }
}
