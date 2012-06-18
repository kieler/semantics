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
 */
package de.cau.cs.kieler.core.model.xtend.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowContextDefaultImpl;
import org.eclipse.emf.mwe.core.WorkflowInterruptedException;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.internal.core.Workflow;
import org.eclipse.emf.mwe.utils.Reader;
import org.eclipse.xpand2.Generator;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.PostProcessor;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;
import org.eclipse.xtend.util.stdlib.ExtIssueReporter;

import de.cau.cs.kieler.core.model.m2m.TransformException;
import de.cau.cs.kieler.core.model.xtend.m2m.M2MProgressMonitor;
import de.cau.cs.kieler.core.ui.ProgressMonitorAdapter;
import de.cau.cs.kieler.core.ui.util.MonitoredOperation;

/**
 * Utility class for performing model to text transformations using xpand.
 * 
 * @author soh
 */
@SuppressWarnings("restriction")
public final class XpandTransformationUtil {

    /**
     * Creates a new XpandTransformationUtil.
     */
    private XpandTransformationUtil() {
        // do nothing
    }

    /**
     * This transformation uses the xpand transformation language.
     * 
     * @param monitor
     *            if true a progress bar is displayed
     * @param xpandFile
     *            filename that holds the xpand functions
     * @param startFunction
     *            initial transformation function
     * @param inputModelURI
     *            EMF URI for input model (may be a local resource URI)
     * @param outPath
     *            the output path
     * @param modelPackages
     *            EPackage of the metamodels that need to be known to the transformation
     * 
     * @return the Status about success and errors and warnings
     */
    public static XtendStatus model2TextTransform(final ProgressMonitorAdapter monitor,
            final String xpandFile, final String startFunction, final URI inputModelURI,
            final String outPath, final EPackage... modelPackages) {
        return model2TextTransform(monitor, xpandFile, startFunction, inputModelURI, outPath, null,
                modelPackages);
    }

    /**
     * This transformation uses the xpand transformation language.
     * 
     * @param monitor
     *            if true a progress bar is displayed
     * @param xpandFile
     *            filename that holds the xpand functions
     * @param startFunction
     *            initial transformation function
     * @param inputModelURI
     *            EMF URI for input model (may be a local resource URI)
     * @param outPath
     *            the output path
     * @param postProcessor
     *            the post processor
     * @param modelPackages
     *            EPackage of the metamodels that need to be known to the transformation
     * @return the Status about success and errors and warnings
     */
    public static XtendStatus model2TextTransform(final ProgressMonitorAdapter monitor,
            final String xpandFile, final String startFunction, final URI inputModelURI,
            final String outPath, final PostProcessor postProcessor,
            final EPackage... modelPackages) {
        monitor.begin("Model2Text transformation", 2);

        // Workflow
        Workflow workflow = new Workflow();

        // EMF reader
        Reader emfReader = new Reader();
        emfReader.setUri(inputModelURI.toString());
        emfReader.setModelSlot("inputmodel");
        // ptolemy models may contain strange XML elements that are not
        // specified in XSD
        emfReader.getResourceSet().getLoadOptions()
                .put(XMIResource.OPTION_RECORD_UNKNOWN_FEATURE, true);
        // add parser option to avoid searching for DTDs online. This would
        // require an
        // online connection to execute the transformation
        HashMap<String, Boolean> parserFeatures = new HashMap<String, Boolean>();
        parserFeatures.put("http://xml.org/sax/features/validation", Boolean.FALSE);
        parserFeatures.put("http://apache.org/xml/features/nonvalidating/load-dtd-grammar",
                Boolean.FALSE);
        parserFeatures.put("http://apache.org/xml/features/nonvalidating/load-external-dtd",
                Boolean.FALSE);
        emfReader.getResourceSet().getLoadOptions()
                .put(XMLResource.OPTION_PARSER_FEATURES, parserFeatures);

        Generator xpandComponent = new Generator();
        Outlet outlet = new Outlet();
        outlet.setPath(outPath);

        // Beautifier
        if (postProcessor != null) {
            outlet.addPostprocessor(postProcessor);
        }

        // XpandComponent
        xpandComponent.addOutlet(outlet);
        // Meta models
        for (EPackage ePackage : modelPackages) {
            EmfMetaModel metaModel = new EmfMetaModel(ePackage);
            xpandComponent.addMetaModel(metaModel);
        }
        xpandComponent.setExpand(xpandFile + "::" + startFunction + " FOR inputmodel");

        // xpandComponent.setOutputSlot("outputmodel");

        // workflow
        WorkflowContext wfx = new WorkflowContextDefaultImpl();
        // register Issues component that allows to pass informations,
        // warnings or errors
        // back to the application
        ExtIssueReporter issueReporter = new ExtIssueReporter();
        Issues issues = new org.eclipse.emf.mwe.core.issues.IssuesImpl();
        M2MProgressMonitor m2mMonitor = new M2MProgressMonitor(monitor, 2);

        workflow.addComponent(emfReader);
        workflow.addComponent(issueReporter);
        workflow.addComponent(xpandComponent);

        // workflow.invoke(wfx, (ProgressMonitor)monitor.subTask(80),
        // issues);
        Exception e = null;
        try {
            workflow.invoke(wfx, m2mMonitor, issues);
        } catch (WorkflowInterruptedException we) {
            if (we.getMessage().contains("UnknownHostException")) {
                e = new TransformException("Failed loading Ptolemy file. "
                        + "Could not resolve the Ptolemy DTD. Unfortunately the parser"
                        + " currently requires an Internet connection.", we);
            } else {
                e = we;
            }
        } catch (Exception myE) {
            e = myE;
        }
        // obtain the unknown features of the input file
        Map<EObject, AnyType> unknownFeatures = new HashMap<EObject, AnyType>();
        for (Resource resource : emfReader.getResourceSet().getResources()) {
            if (resource instanceof XMLResource) {
                unknownFeatures.putAll(((XMLResource) resource).getEObjectToExtensionMap());
            }
        }

        XtendStatus status = new XtendStatus(issues, xpandComponent.getLogMessage(),
                unknownFeatures, e);
        monitor.done();
        return status;
    }

    /**
     * This transformation uses the xpand transformation language. Same as
     * {@link model2TextTransform} but executes the transformation in a MonitoredOperation and
     * automatically pops up a progress bar.
     * 
     * @param xpandFile
     *            filename that holds the xpand functions
     * @param startFunction
     *            initial transformation function
     * @param inputModelURI
     *            EMF URI for input model (may be a local resource URI)
     * @param outPath
     *            the output path of the transformation
     * @param modelPackages
     *            EPackages of the metamodels that need to be known to the transformation
     * 
     * @throws TransformException
     *             if something fails
     * 
     * @return the Status about success and errors and warnings
     * 
     */
    public static XtendStatus model2TextTransform(final String xpandFile,
            final String startFunction, final URI inputModelURI, final String outPath,
            final EPackage... modelPackages) throws TransformException {
        MonitoredOperation monitoredOperation = new MonitoredOperation() {
            @Override
            protected IStatus execute(final IProgressMonitor monitor) {
                return model2TextTransform(new ProgressMonitorAdapter(monitor), xpandFile,
                        startFunction, inputModelURI, outPath, modelPackages);
            }
        };
        monitoredOperation.runMonitored();
        return (XtendStatus) monitoredOperation.getStatus();
    }

    /**
     * This transformation uses the xpand transformation language. Same as
     * 
     * @param xpandFile
     *            filename that holds the xpand functions
     * @param startFunction
     *            initial transformation function
     * @param inputModelURI
     *            EMF URI for input model (may be a local resource URI)
     * @param outPath
     *            the output path of the transformation
     * @param postProcessor
     *            the post processor
     * @param modelPackages
     *            EPackages of the metamodels that need to be known to the transformation
     * @return the Status about success and errors and warnings
     * @throws TransformException
     *             if something fails {@link model2TextTransform} but executes the transformation in
     *             a MonitoredOperation and automatically pops up a progress bar.
     */
    public static XtendStatus model2TextTransform(final String xpandFile,
            final String startFunction, final URI inputModelURI, final String outPath,
            final PostProcessor postProcessor, final EPackage... modelPackages)
            throws TransformException {
        MonitoredOperation monitoredOperation = new MonitoredOperation() {
            @Override
            protected IStatus execute(final IProgressMonitor monitor) {
                return model2TextTransform(new ProgressMonitorAdapter(monitor), xpandFile,
                        startFunction, inputModelURI, outPath, postProcessor, modelPackages);
            }
        };
        monitoredOperation.runMonitored();
        return (XtendStatus) monitoredOperation.getStatus();
    }

}
