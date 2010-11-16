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
package de.cau.cs.kieler.esterel.transformation.kivi;

import org.eclipse.emf.transaction.TransactionalEditingDomain;

import de.cau.cs.kieler.core.kivi.AbstractTrigger;
import de.cau.cs.kieler.core.kivi.AbstractTriggerState;
import de.cau.cs.kieler.core.kivi.ITrigger;

/**
 * @author uru
 * 
 */
public class TransformationTrigger extends AbstractTrigger {

    private static TransformationTrigger instance;

    /**
     * default constructor.
     */
    public TransformationTrigger() {
        instance = this;
    }

    /**
     * faux singleton.
     * 
     * @return instance
     */
    public static TransformationTrigger getInstance() {
        return instance;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void register() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void unregister() {
    }

    /**
     * initiates a transformation.
     * 
     * @param extentionFile
     *            file containing the extentions.
     * @param theTransformationName
     *            name of the transformation to run.
     * @param theParameters
     *            parameters to pass.
     * @param basePackages
     *            emf packages needed within the transformation.
     * @param theEditingDomain
     *            editing domain in which the transformation should be performed.
     */
    public void step(final String extentionFile, final String theTransformationName,
            final Object[] theParameters, final String[] basePackages,
            final TransactionalEditingDomain theEditingDomain) {
        trigger(new TransformationState(extentionFile, theTransformationName, theParameters,
                basePackages, theEditingDomain));
    }

    /**
     * 
     * @author uru
     * 
     */
    public static final class TransformationState extends AbstractTriggerState {

        private String extentionFile;
        private String transformationName;
        private Object[] parameters;
        private String[] basePackages;
        private TransactionalEditingDomain editingDomain;

        /**
         * Default Constructor.
         */
        public TransformationState() {
        }

        /**
         * @param theExtentionFile
         *            file containing the extentions.
         * @param theTransformationName
         *            name of the transformation to run.
         * @param theParameters
         *            parameters to pass.
         * @param theBasePackages
         *            emf packages needed within the transformation.
         * @param theEditingDomain
         *            editing domain in which the transformation should be performed.
         */
        public TransformationState(final String theExtentionFile,
                final String theTransformationName, final Object[] theParameters,
                final String[] theBasePackages, final TransactionalEditingDomain theEditingDomain) {
            super();
            this.extentionFile = theExtentionFile;
            this.transformationName = theTransformationName;
            this.parameters = theParameters;
            this.basePackages = theBasePackages;
            this.editingDomain = theEditingDomain;
        }

        /**
         * @return the extentionFile
         */
        public String getExtentionFile() {
            return extentionFile;
        }

        /**
         * @return the transformationName
         */
        public String getTransformationName() {
            return transformationName;
        }

        /**
         * @return the parameters
         */
        public Object[] getParameters() {
            return parameters;
        }

        /**
         * @return the basePackages
         */
        public String[] getBasePackages() {
            return basePackages;
        }

        /**
         * @return the editingDomain
         */
        public TransactionalEditingDomain getEditingDomain() {
            return editingDomain;
        }

        /**
         * {@inheritDoc}
         */
        public Class<? extends ITrigger> getTriggerClass() {
            return TransformationTrigger.class;
        }

    }

}
