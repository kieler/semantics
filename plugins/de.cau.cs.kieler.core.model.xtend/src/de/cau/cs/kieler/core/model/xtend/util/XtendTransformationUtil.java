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
package de.cau.cs.kieler.core.model.xtend.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.mwe.core.ConfigurationException;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowContextDefaultImpl;
import org.eclipse.emf.mwe.core.WorkflowInterruptedException;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.internal.core.Workflow;
import org.eclipse.emf.mwe.utils.Reader;
import org.eclipse.emf.mwe.utils.Writer;
import org.eclipse.internal.xtend.xtend.XtendFile;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xtend.XtendComponent;
import org.eclipse.xtend.XtendFacade;
import org.eclipse.xtend.expression.ExecutionContextImpl;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.typesystem.emf.EcoreUtil2;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;
import org.eclipse.xtend.util.stdlib.ExtIssueReporter;

import de.cau.cs.kieler.core.model.m2m.TransformException;
import de.cau.cs.kieler.core.model.xtend.Activator;
import de.cau.cs.kieler.core.model.xtend.m2m.M2MProgressMonitor;
import de.cau.cs.kieler.core.ui.KielerProgressMonitor;
import de.cau.cs.kieler.core.ui.util.MonitoredOperation;

/**
 * Utitlity class to conveniently execute Xtend transformations.
 * 
 * @author haf
 * @author cds
 * @author uru
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
     * @param workflowHook
     *            This component is hooked into the workflow just before the transformed model is
     *            written to a file. Can be used to do some last transformation work.
     * @param involvedMetamodels
     *            EPackages of metamodels that need to be known to the transformation
     * 
     * @return the Status about success and errors and warnings
     */
    public static XtendStatus model2ModelTransform(final KielerProgressMonitor monitor,
            final String xtendFile, final String startFunction, final URI inputModelURI,
            final URI outputModelURI, final TransformationWorkflowHook workflowHook,
            final EPackage... involvedMetamodels) {

        monitor.begin("Model2Model transformation", 2);

        // Workflow
        Workflow workflow = new Workflow();
        WorkflowContext wfx = new WorkflowContextDefaultImpl();

        // COMPONENT 1: EMF reader
        // Loads the source model.
        Reader emfReader = new Reader();
        emfReader.setUri(inputModelURI.toString());
        emfReader.setModelSlot("inputmodel");

        // Ptolemy models may contain strange XML elements that are not
        // specified in XSD
        emfReader.getResourceSet().getLoadOptions()
                .put(XMIResource.OPTION_RECORD_UNKNOWN_FEATURE, true);

        // Add parser option to avoid searching for DTDs online. This would require an
        // online connection to execute the transformation
        HashMap<String, Boolean> parserFeatures = new HashMap<String, Boolean>();
        parserFeatures.put("http://xml.org/sax/features/validation", Boolean.FALSE);
        parserFeatures.put("http://apache.org/xml/features/nonvalidating/load-dtd-grammar",
                Boolean.FALSE);
        parserFeatures.put("http://apache.org/xml/features/nonvalidating/load-external-dtd",
                Boolean.FALSE);
        emfReader.getResourceSet().getLoadOptions()
                .put(XMLResource.OPTION_PARSER_FEATURES, parserFeatures);

        // COMPONENT 2: Issue Reporter
        // Allows to pass information, warnings or errors back to the application
        ExtIssueReporter issueReporter = new ExtIssueReporter();
        Issues issues = new org.eclipse.emf.mwe.core.issues.IssuesImpl();
        M2MProgressMonitor m2mMonitor = new M2MProgressMonitor(monitor, 2);

        // COMPONENT 3: Xtend transformation
        // Does the actual transformation.
        XtendComponent xtendComponent = new XtendComponent();
        xtendComponent.setInvoke(xtendFile + "::" + startFunction + "(inputmodel)");
        xtendComponent.setOutputSlot("outputmodel");

        // Add the Metamodels
        for (EPackage ePackage : involvedMetamodels) {
            xtendComponent.addMetaModel(new EmfMetaModel(ePackage));
        }

        // COMPONENT 4: Workflow Hook
        // May do some last-minute transformation work.
        if (workflowHook != null) {
            workflowHook.setReader(emfReader);
            workflowHook.setInputModelSlot("inputmodel");
            workflowHook.setOutputModelSlot("outputmodel");
        }

        // COMPONENT 5: EMF Writer
        // Saves the transformed model.
        Writer emfWriter = new Writer();
        emfWriter.setUri(outputModelURI.toString());
        emfWriter.setModelSlot("outputmodel");
        emfWriter.setResourceSet(new ResourceSetImpl());

        // Set up the workflow's components
        workflow.addComponent(emfReader);
        workflow.addComponent(issueReporter);
        workflow.addComponent(xtendComponent);
        if (workflowHook != null) {
            workflow.addComponent(workflowHook);
        }
        workflow.addComponent(emfWriter);

        // Run the workflow
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

        // Obtain the unknown features of the input file
        Map<EObject, AnyType> unknownFeatures = new HashMap<EObject, AnyType>();
        for (Resource resource : emfReader.getResourceSet().getResources()) {
            if (resource instanceof XMLResource) {
                unknownFeatures.putAll(((XMLResource) resource).getEObjectToExtensionMap());
            }
        }

        // Prepare a status object that tells the caller about how the transformation went
        XtendStatus status = new XtendStatus(issues, xtendComponent.getLogMessage(),
                unknownFeatures, e);
        monitor.done();

        return status;
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
     * @param involvedMetamodels
     *            EPackages of metamodels that need to be known to the transformation
     * 
     * @return the Status about success and errors and warnings
     */
    public static XtendStatus model2ModelTransform(final KielerProgressMonitor monitor,
            final String xtendFile, final String startFunction, final URI inputModelURI,
            final URI outputModelURI, final EPackage... involvedMetamodels) {

        return model2ModelTransform(monitor, xtendFile, startFunction, inputModelURI,
                outputModelURI, null, involvedMetamodels);
    }

    /**
     * This transformation uses the Xtend transformation language. Same as
     * {@link model2ModelTransform} but executes the transformation in a MonitoredOperation an
     * automatically pops up a progress bar.
     * 
     * @param xtendFile
     *            filename that holds the xtend functions
     * @param startFunction
     *            initial transformation function
     * @param inputModelURI
     *            EMF URI for input model (may be a local resource URI)
     * @param outputModelURI
     *            EMF URI for output model
     * @param involvedMetamodels
     *            EPackages of metamodels that need to be known to the transformation
     * 
     * @throws TransformException
     *             if something fails
     * 
     * @return the Status about success and errors and warnings
     * 
     */
    public static IStatus model2ModelTransform(final String xtendFile, final String startFunction,
            final URI inputModelURI, final URI outputModelURI, final EPackage... involvedMetamodels)
            throws TransformException {
        MonitoredOperation monitoredOperation = new MonitoredOperation() {
            @Override
            protected IStatus execute(final IProgressMonitor monitor) {
                return XtendTransformationUtil.model2ModelTransform(new KielerProgressMonitor(
                        monitor), xtendFile, startFunction, inputModelURI, outputModelURI,
                        involvedMetamodels);
            }
        };
        monitoredOperation.runMonitored();
        return monitoredOperation.getStatus();
    }

    /**
     * initializes an XtendFacade and returns the instance.
     * 
     * @param extensionFile
     *            file containing the extentions.
     * @param basePackages
     *            emf packages needed within the transformation.
     * @return XtendFacade
     */
    public static XtendFacade initializeFacade(final String extensionFile,
            final String[] basePackages) {
        return initializeFacade(extensionFile, basePackages, null);
    }

    /**
     * initializes an XtendFacade and returns the instance.
     * 
     * @param extentionFile
     *            file containing the extentions.
     * @param basePackages
     *            emf packages needed within the transformation.
     * @param globalVars
     *            map with global variables
     * @return XtendFacade
     */
    public static XtendFacade initializeFacade(final String extentionFile,
            final String[] basePackages, final Map<String, Variable> globalVars) {
        String extentionWithout = extentionFile;
        // cut off file extention
        if (extentionWithout.contains("." + XtendFile.FILE_EXTENSION)) {
            extentionWithout = extentionWithout.substring(0,
                    extentionWithout.indexOf("." + XtendFile.FILE_EXTENSION));
        }

        XtendFacade xtendFacade = null;
        if (globalVars != null) {
            ExecutionContextImpl exec = new ExecutionContextImpl(globalVars);
            xtendFacade = XtendFacade.create(exec, extentionWithout);
        } else {
            xtendFacade = XtendFacade.create(extentionWithout);
        }

        registerEPackages(xtendFacade, basePackages);

        return xtendFacade;
    }

    private static void registerEPackages(final XtendFacade xtendFacade, final String[] basePackages) {
        // Register all meta models
        for (String basePackage : basePackages) {
            try {
                EPackage pack = EcoreUtil2.getEPackageByClassName(basePackage);

                // create EMFMetaModel with the given EPackage
                EmfMetaModel metaModel = new EmfMetaModel(pack);
                xtendFacade.registerMetaModel(metaModel);
            } catch (ConfigurationException ce) {
                // package class could not be found
                // this is bad and should not happen.
                Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
                        "A problem occured while registering MetaModel "
                                + "(maybe the package name was misspelled).", ce);
                StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
                return;
            }
        }
    }
}
