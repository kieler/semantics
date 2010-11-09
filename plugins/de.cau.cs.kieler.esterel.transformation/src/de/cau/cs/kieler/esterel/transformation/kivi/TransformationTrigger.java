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

    public TransformationTrigger() {
        instance = this;
    }

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

    public void step(String extentionFile, String transformationName, Object[] parameters,
            String[] basePackages, TransactionalEditingDomain editingDomain) {
        trigger(new TransformationDescriptor(extentionFile, transformationName, parameters,
                basePackages, editingDomain));
    }

    /**
     * 
     * @author uru
     * 
     */
    public static final class TransformationDescriptor extends AbstractTriggerState {

        private String extentionFile;
        private String transformationName;
        private Object[] parameters;
        private String[] basePackages;
        private TransactionalEditingDomain editingDomain;

        /**
         * 
         */
        public TransformationDescriptor() {
            // TODO Auto-generated constructor stub
        }

        /**
         * @param extentionFile
         * @param transformationName
         * @param parameters
         * @param basePackages
         * @param editingDomain
         */
        public TransformationDescriptor(String extentionFile, String transformationName,
                Object[] parameters, String[] basePackages, TransactionalEditingDomain editingDomain) {
            super();
            this.extentionFile = extentionFile;
            this.transformationName = transformationName;
            this.parameters = parameters;
            this.basePackages = basePackages;
            this.editingDomain = editingDomain;
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
        @Override
        public Class<? extends ITrigger> getTriggerClass() {
            return TransformationTrigger.class;
        }

    }

}
