/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 *
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 *
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.core.model.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowContextDefaultImpl;
import org.eclipse.emf.mwe.core.WorkflowInterruptedException;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.internal.core.Workflow;
import org.eclipse.emf.mwe.utils.Reader;
import org.eclipse.emf.mwe.utils.Writer;
import org.eclipse.xtend.XtendComponent;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;
import org.eclipse.xtend.util.stdlib.ExtIssueReporter;

import de.cau.cs.kieler.annotations.AnnotationsPackage;
import de.cau.cs.kieler.core.KielerException;
import de.cau.cs.kieler.core.model.ui.M2MProgressMonitor;
import de.cau.cs.kieler.core.ui.KielerProgressMonitor;
import de.cau.cs.kieler.core.ui.util.MonitoredOperation;
import de.cau.cs.kieler.expressions.ExpressionsPackage;

/**
 * Utitlity class to conveniently execute Xtend transformations.
 * 
 * @author haf
 * @kieler.rating 2010-06-04 proposed yellow proposed by haf
 */
@SuppressWarnings("restriction")
public final class XtendTransformationUtil {

    private XtendTransformationUtil() {
    }

    /**
     * This transformation uses the Xtend transformation language.
     * 
     * @param monitor
     *            if true a progress bar is displayed
     * @param xtendFile
     *            filename that holds the xtend functions
     * @param startFunction
     *            initial transformation function
     * @param inputModelURI
     *            EMF URI for input model (may be a local resource URI)
     * @param outputModelURI
     *            EMF URI for output model
     * @param modelPackage1
     *            EPackage of first metamodel that need to be known to the
     *            transformation
     * @param modelPackage2
     *            EPackage of second metamodel that need to be known to the
     *            transformation
     * 
     * @return the Status about success and errors and warnings
     * 
     *         TODO: maybe someone needs to register more than exactly 2
     *         metamodels, so make the parameters a list instead of 2 fixed
     *         parameters
     */
    public static XtendStatus model2ModelTransform(final KielerProgressMonitor monitor,
            final String xtendFile, final String startFunction, final URI inputModelURI,
            final URI outputModelURI, final EPackage modelPackage1, final EPackage modelPackage2) {
        monitor.begin("Model2Model transformation", 2);

        // Workflow
        Workflow workflow = new Workflow();

        // EMF reader
        Reader emfReader = new Reader();
        emfReader.setUri(inputModelURI.toString());
        emfReader.setModelSlot("inputmodel");
        // ptolemy models may contain strange XML elements that are not
        // specified in XSD
        emfReader.getResourceSet().getLoadOptions().put(XMIResource.OPTION_RECORD_UNKNOWN_FEATURE,
                true);
        // add parser option to avoid searching for DTDs online. This would require an
        // online connection to execute the transformation
        HashMap<String, Boolean> parserFeatures = new HashMap<String, Boolean>();
        parserFeatures.put("http://xml.org/sax/features/validation", 
                Boolean.FALSE);
        parserFeatures.put("http://apache.org/xml/features/nonvalidating/load-dtd-grammar",
                Boolean.FALSE); 
        parserFeatures.put("http://apache.org/xml/features/nonvalidating/load-external-dtd",
                Boolean.FALSE);
        emfReader.getResourceSet().getLoadOptions().put(XMLResource.OPTION_PARSER_FEATURES,
                parserFeatures);
        
        // EMF Writer for target model
        Writer emfWriter = new Writer();
        emfWriter.setUri(outputModelURI.toString());
        emfWriter.setModelSlot("outputmodel");
        emfWriter.setResourceSet(new ResourceSetImpl());

        // Meta models
        EmfMetaModel metaModel1 = new EmfMetaModel(modelPackage1);
        EmfMetaModel metaModel2 = new EmfMetaModel(modelPackage2);

        // XtendComponent
        XtendComponent xtendComponent = new XtendComponent();
        xtendComponent.addMetaModel(metaModel1);
        xtendComponent.addMetaModel(metaModel2);
        xtendComponent.setInvoke(xtendFile + "::" + startFunction + "(inputmodel)");
        xtendComponent.setOutputSlot("outputmodel");

        // add the Annotations Metamodel by default
        xtendComponent.addMetaModel(new EmfMetaModel(AnnotationsPackage.eINSTANCE));
        xtendComponent.addMetaModel(new EmfMetaModel(ExpressionsPackage.eINSTANCE));

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
        workflow.addComponent(xtendComponent);
        workflow.addComponent(emfWriter);
        // workflow.invoke(wfx, (ProgressMonitor)monitor.subTask(80),
        // issues);
        Exception e = null;
        try {
            workflow.invoke(wfx, m2mMonitor, issues);
        } catch (WorkflowInterruptedException we) {
            if (we.getMessage().contains("UnknownHostException")) {
                e = new KielerException("Failed loading Ptolemy file. "
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

        XtendStatus status = new XtendStatus(issues, xtendComponent.getLogMessage(),
                unknownFeatures, e);
        monitor.done();
        return status;
    }

    /**
     * This transformation uses the Xtend transformation language. Same as
     * {@link model2ModelTransform} but executes the transformation in a
     * MonitoredOperation an automatically pops up a progress bar.
     * 
     * @param xtendFile
     *            filename that holds the xtend functions
     * @param startFunction
     *            initial transformation function
     * @param inputModelURI
     *            EMF URI for input model (may be a local resource URI)
     * @param outputModelURI
     *            EMF URI for output model
     * @param modelPackage1
     *            EPackage of first metamodel that need to be known to the
     *            transformation
     * @param modelPackage2
     *            EPackage of second metamodel that need to be known to the
     *            transformation
     * 
     * @throws KielerException
     *             if something fails
     * 
     * @return the Status about success and errors and warnings
     * 
     */
    public static XtendStatus model2ModelTransform(final String xtendFile,
            final String startFunction, final URI inputModelURI, final URI outputModelURI,
            final EPackage modelPackage1, final EPackage modelPackage2) throws KielerException {
        MonitoredOperation monitoredOperation = new MonitoredOperation() {
            @Override
            protected IStatus execute(final IProgressMonitor monitor) {
                return XtendTransformationUtil.model2ModelTransform(new KielerProgressMonitor(
                        monitor), xtendFile, startFunction, inputModelURI, outputModelURI,
                        modelPackage1, modelPackage2);
            }
        };
        monitoredOperation.runMonitored();
        return (XtendStatus) monitoredOperation.getStatus();
    }
}
