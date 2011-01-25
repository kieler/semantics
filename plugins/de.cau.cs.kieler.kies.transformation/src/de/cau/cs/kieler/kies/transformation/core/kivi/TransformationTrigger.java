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
package de.cau.cs.kieler.kies.transformation.core.kivi;

import de.cau.cs.kieler.core.kivi.AbstractTrigger;
import de.cau.cs.kieler.core.kivi.AbstractTriggerState;
import de.cau.cs.kieler.core.kivi.ITrigger;
import de.cau.cs.kieler.kies.transformation.core.TransformationContext;

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
     * 
     * @param context
     */
    public void step(final TransformationContext context) {
        trigger(new TransformationState(context));
    }

    /**
     * 
     * @author uru
     * 
     */
    public static final class TransformationState extends AbstractTriggerState {

        private TransformationContext context;

        /**
         * Default Constructor.
         * 
         * @deprecated is this needed by kivi? TODO
         */
        public TransformationState() {
        }

        /**
         * 
         * @param theContext
         */
        public TransformationState(final TransformationContext theContext) {
            super();
            this.context = theContext;
        }

        /**
         * @return the context
         */
        public TransformationContext getContext() {
            return context;
        }

        /**
         * {@inheritDoc}
         */
        public Class<? extends ITrigger> getTriggerClass() {
            return TransformationTrigger.class;
        }

    }

}
