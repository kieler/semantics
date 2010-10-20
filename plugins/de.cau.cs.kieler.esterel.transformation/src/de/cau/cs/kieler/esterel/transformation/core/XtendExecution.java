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
import java.util.List;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

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
    /** editing domain for the graphical elements being edited. */
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
    public void executeTransformation(final EObject[] parameter, final String transformation) {

        // create command
        XpandCommand xCommand = new XpandCommand(parameter, transformation);

        // get editing domain and execute
        if (editDomain == null) {
            // TODO
            System.err.println("NO EDITING DOMAIN SET");
            return;
        }
        CommandStack stack = editDomain.getCommandStack();
        stack.execute(xCommand);
    }

    /**
     * inner class representing Xpand command. creating a framework and running the.
     * 
     * @author uru
     * 
     */
    private class XpandCommand extends AbstractCommand {

        private Object[] parameters;
        private String transformation;

        public XpandCommand(final EObject[] elements, final String transforma) {
            parameters = elements;
            transformation = transforma;
        }

        /**
         * creates a <code>XtendTransformationFramework</code> with the corresponding information
         * and executes the transformation.
         */
        public void execute() {
            XtendTransformationFramework framework = new XtendTransformationFramework();
            framework.setParameters(parameters);
            System.out.println(transformation + Arrays.toString(parameters));
            boolean init = framework.initializeTransformation(transformationFile, transformation,
                    basePackages.toArray(new String[basePackages.size()]));

            if (!init) {
                // TODO throw exception
                System.err.println("ERROR INITIALIZING");
            }

            try {
                framework.executeTransformation();
            } catch (TransformationException e) {
                e.printStackTrace();
            }
        }

        /**
         * {@inheritDoc}
         */
        @Override
        public boolean canExecute() {
            return true;
        }

        public void redo() {
            // not supported yet
        }
    }

}
