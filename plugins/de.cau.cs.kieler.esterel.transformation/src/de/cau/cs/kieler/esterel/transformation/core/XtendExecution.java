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
package de.cau.cs.kieler.esterel.transformation.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.mwe.core.ConfigurationException;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.internal.xtend.xtend.XtendFile;
import org.eclipse.xtend.XtendFacade;
import org.eclipse.xtend.expression.ExecutionContextImpl;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.typesystem.emf.EcoreUtil2;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;

import de.cau.cs.kieler.core.model.transformation.TransformationException;
import de.cau.cs.kieler.core.model.transformation.xtend.XtendTransformationFramework;

/**
 * This class runs a xpand transformation on an arbitrary EObject. To do so it needs information
 * about the transformation file and the corresponding base packages.
 * 
 * @author uru
 * 
 */
public class XtendExecution {

    /** the file containing the transformation (.ext). */
    private String transformationFile;
    /** list with all needed base packages. */
    private List<String> basePackages;
    /** editing domain for the elements being edited. */
    private TransactionalEditingDomain editDomain;

    /**
     * Default constructor taking the transformation file and the base packages.
     * 
     * @param theTransFile
     *            transformation file (.ext).
     * @param theBasePackages
     *            base packages (e.g.
     *            <strong>"de.cau.cs.kieler.synccharts.SyncchartsPackage"</strong>).
     */
    public XtendExecution(final String theTransFile, final List<String> theBasePackages) {
        transformationFile = theTransFile;
        this.basePackages = theBasePackages;
    }

    /**
     * @param theEditDomain
     *            the editDomain to set
     */
    public void setEditDomain(final TransactionalEditingDomain theEditDomain) {
        this.editDomain = theEditDomain;
    }

    /**
     * execute the transformation for the given model on the corresponding command stack. prior to
     * execution an edit domain has to be provided
     * 
     * @param parameter
     *            parameters wit the models for which the transformation should be run.
     * @param transformation
     *            the name of the transformation to run
     */
    public void executeTransformation(final Object[] parameter, final String transformation) {

        // get editing domain and execute
        if (editDomain == null) {
            // TODO
            System.err.println("NO EDITING DOMAIN SET");
            return;
        }

        // create command
        XpandCommand xCommand = new XpandCommand(parameter, transformation);
        CommandStack stack = editDomain.getCommandStack();
        stack.execute(xCommand);
    }

    public void undoTransformation() {
        CommandStack stack = editDomain.getCommandStack();

        Command c = stack.getUndoCommand();
        do {
            stack.undo();
            c = stack.getUndoCommand();
        } while ((!c.getLabel().equals("Transformation Command")));

    }

    /**
     * inner class representing Xpand command. creating a framework and running the.
     * 
     * @author uru
     * 
     */
    private class XpandCommand extends RecordingCommand {

        private XtendFacade xtendFacade;
        private Object[] parameters;
        private String transformation;

        /** Cached MetaModelPackages. **/
        private HashMap<String, EPackage> packageCache;

        public XpandCommand(final Object[] elements, final String transforma) {
            super(editDomain, "Transformation Command");
            parameters = elements;
            transformation = transforma;
            packageCache = new HashMap<String, EPackage>();

            if (transformationFile.contains("." + XtendFile.FILE_EXTENSION)) {
                transformationFile = transformationFile.substring(0,
                        transformationFile.indexOf("." + XtendFile.FILE_EXTENSION));
            }

            HashMap<String, Variable> map = new HashMap<String, Variable>();
            map.put("recursive", new Variable("boolean", true));
            ExecutionContextImpl exec = new ExecutionContextImpl(map);

            xtendFacade = XtendFacade.create(exec, transformationFile);
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
                        System.err.println("ERRORRRRRR");
                        return;
                    }
                }
                // create EMFMetaModel with the given EPackage
                metaModel = new EmfMetaModel(pack);
                xtendFacade.registerMetaModel(metaModel);
            }
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public boolean canExecute() {
            return true;
        }

        /**
         * creates a <code>XtendTransformationFramework</code> with the corresponding information
         * and executes the transformation.
         */
        @Override
        protected void doExecute() {
            // XtendTransformationFramework framework = new XtendTransformationFramework();
            // framework.setParameters(parameters);

            System.out.println(transformation + Arrays.toString(parameters));
            // boolean init = framework.initializeTransformation(transformationFile, transformation,
            // basePackages.toArray(new String[basePackages.size()]));

            // if (!init) {
            // // TODO throw exception
            // System.err.println("ERROR INITIALIZING");
            // }

            Object o = xtendFacade.call(transformation, parameters);

            // try {
            // framework.executeTransformation();
            // } catch (TransformationException e) {
            // e.printStackTrace();
            // }

        }

    }

}
