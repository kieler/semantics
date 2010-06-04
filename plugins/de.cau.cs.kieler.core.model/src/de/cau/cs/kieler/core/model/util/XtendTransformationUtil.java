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

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
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
import de.cau.cs.kieler.core.model.CoreModelPlugin;
import de.cau.cs.kieler.core.model.ui.M2MProgressMonitor;
import de.cau.cs.kieler.core.ui.KielerProgressMonitor;
import de.cau.cs.kieler.core.ui.util.MonitoredOperation;

/**
 * Utitlity class to conveniently execute Xtend transformations. 
 *  
 * @author haf
 * @kieler.rating 2010-06-04 proposed yellow proposed by haf
 */
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
     * @throws KielerException
     *             if something fails
     * 
     * @return the Status about success and errors and warnings
     * 
     * TODO: maybe someone needs to register more than exactly 2 metamodels, so make the
     *       parameters a list instead of 2 fixed parameters
     */
    public static IStatus model2ModelTransform(final KielerProgressMonitor monitor,
            final String xtendFile, final String startFunction, final URI inputModelURI,
            final URI outputModelURI, final EPackage modelPackage1, final EPackage modelPackage2)
            throws KielerException {
        monitor.begin("Model2Model transformation", 2);
        try {
            // Workflow
            Workflow workflow = new Workflow();

            // EMF reader
            Reader emfReader = new Reader();
            emfReader.setUri(inputModelURI.toString());
            emfReader.setModelSlot("inputmodel");
            // ptolemy models may contain strange XML elements that are not
            // specified in XSD
            emfReader.getResourceSet().getLoadOptions().put(
                    XMIResource.OPTION_RECORD_UNKNOWN_FEATURE, true);

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
            workflow.invoke(wfx, m2mMonitor, issues);

            XtendStatus status = new XtendStatus(issues);
            monitor.done();
            return status;
        } catch (WorkflowInterruptedException wie) {
            return new Status(IStatus.ERROR, CoreModelPlugin.PLUGIN_ID,
                    "Error at model-to-model Xtend transformation. Workflow interrupted."
                            + " Make sure the input is correct file type.", wie);
        } catch (Exception e) {
            return new Status(IStatus.ERROR, CoreModelPlugin.PLUGIN_ID,
                    "Error at model-to-model Xtend transformation.", e);
        } finally {
            monitor.done();
        }
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
    public static IStatus model2ModelTransform(final String xtendFile, final String startFunction,
            final URI inputModelURI, final URI outputModelURI, final EPackage modelPackage1,
            final EPackage modelPackage2) throws KielerException {
        MonitoredOperation monitoredOperation = new MonitoredOperation() {
            @Override
            protected IStatus execute(final IProgressMonitor monitor) {
                try {
                    return XtendTransformationUtil.model2ModelTransform(new KielerProgressMonitor(
                            monitor), xtendFile, startFunction, inputModelURI, outputModelURI,
                            modelPackage1, modelPackage2);
                } catch (KielerException e) {
                    return new Status(IStatus.ERROR, CoreModelPlugin.PLUGIN_ID,
                            "Error at model-to-model Xtend transformation.", e);
                }
            }
        };
        monitoredOperation.runMonitored();
        return monitoredOperation.getStatus();
    }
}
