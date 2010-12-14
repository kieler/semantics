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
package de.cau.cs.kieler.kies.transformation.core;

import java.util.HashMap;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.mwe.core.ConfigurationException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.internal.xtend.xtend.XtendFile;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtend.XtendFacade;
import org.eclipse.xtend.expression.ExecutionContextImpl;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.typesystem.MetaModel;
import org.eclipse.xtend.typesystem.emf.EcoreUtil2;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;
import org.json.JSONObject;

import de.cau.cs.kieler.core.ui.util.EditorUtils;
import de.cau.cs.kieler.core.util.Maybe;
import de.cau.cs.kieler.kies.transformation.kivi.TransformationTrigger;
import de.cau.cs.kieler.sim.kiem.IJSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.JSONObjectDataComponent;
import de.cau.cs.kieler.sim.kiem.KiemExecutionException;
import de.cau.cs.kieler.sim.kiem.KiemInitializationException;

/**
 * Abstract implementation of a TransformationDataComponent.
 * 
 * @author uru
 * 
 */
public abstract class AbstractTransformationDataComponent extends JSONObjectDataComponent implements
        IJSONObjectDataComponent {

    private TransactionalEditingDomain domain;
    private Shell shell;

    /**
     * {@inheritDoc}
     */
    public void initialize() throws KiemInitializationException {
        domain = getActiveEditorEditingDomain();
        PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {

            public void run() {
                IWorkbench wb = PlatformUI.getWorkbench();
                shell = wb.getActiveWorkbenchWindow().getShell();
            }
        });
    }

    /**
     * {@inheritDoc}
     */
    public JSONObject step(final JSONObject arg0) throws KiemExecutionException {

        // do next transformation
        TransformationDescriptor descriptor = getNextTransformation();
        if (descriptor != null) {
            System.out.println("Trigger");
            if (TransformationTrigger.getInstance() != null) {
                TransformationTrigger.getInstance().step(getXtendFacade(),
                        descriptor.getTransformationName(), descriptor.getParameters(), domain);
            }
        } else {
            PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
                public void run() {
                    MessageDialog.openInformation(shell, "Done",
                            "Transformation finished. No further elements to process.");
                }
            });
            throw new KiemExecutionException("No Further Transformations", true, false, true, null);
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public void wrapup() throws KiemInitializationException {
    }

    /**
     * {@inheritDoc}
     */
    public boolean isObserver() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isProducer() {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isHistoryObserver() {
        return true;
    }

    /**
     * @return the XtendFacade responsible for calling the extensions.
     */
    public abstract XtendFacade getXtendFacade();

    /**
     * @return all base packages needed for the transformations planned.
     */
    public abstract String[] getBasePackages();

    /**
     * @return the actual transformation file (.ext)
     */
    public abstract String getTransformationFile();

    /**
     * @return either the next transformation or <code>null</code>.
     */
    public abstract TransformationDescriptor getNextTransformation();

    /**
     * 
     * @return the currently active editor.
     */
    protected DiagramEditor getActiveEditor() {

        final Maybe<DiagramEditor> maybe = new Maybe<DiagramEditor>();
        Display.getDefault().syncExec(new Runnable() {
            public void run() {
                IEditorPart editor = EditorUtils.getLastActiveEditor();
                if (editor instanceof DiagramEditor) {
                    maybe.set((DiagramEditor) editor);
                }
            }
        });
        return maybe.get();
    }

    /**
     * 
     * @return currently active editor's editing domain
     */
    protected TransactionalEditingDomain getActiveEditorEditingDomain() {
        DiagramEditor activeEditor = getActiveEditor();
        if (activeEditor != null) {
            return activeEditor.getEditingDomain();
        }
        return null;
    }

    /**
     * 
     * @param rs
     *            some resource set.
     * @return an editing domain for this resource set.
     */
    protected TransactionalEditingDomain getEditingDomainForResourceSet(final ResourceSet rs) {
        return TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(rs);
    }

    /**
     * initializes an XtendFacade and returns the instance.
     * 
     * @param extentionFile
     *            file containing the extentions.
     * @param basePackages
     *            emf packages needed within the transformation.
     * @return XtendFacade
     */
    public static XtendFacade initializeFacade(final String extentionFile,
            final String[] basePackages) {
        return initializeFacade(extentionFile, basePackages, null);
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
            final String[] basePackages, final HashMap<String, Variable> globalVars) {
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
                System.err.println("A problem occured while registering MetaModel: "
                        + basePackage);
                return;
            }
        }
    }

}
