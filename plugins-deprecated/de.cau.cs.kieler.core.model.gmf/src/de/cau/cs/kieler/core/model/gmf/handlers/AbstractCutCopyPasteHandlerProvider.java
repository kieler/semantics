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
package de.cau.cs.kieler.core.model.gmf.handlers;

import java.util.Hashtable;

import org.eclipse.gmf.runtime.common.ui.services.action.global.AbstractGlobalActionHandlerProvider;
import org.eclipse.gmf.runtime.common.ui.services.action.global.IGlobalActionHandler;
import org.eclipse.gmf.runtime.common.ui.services.action.global.IGlobalActionHandlerContext;
import org.eclipse.gmf.runtime.diagram.ui.providers.DiagramGlobalActionHandler;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;

/**
 * Handler for passing cut, copy and paste request to the appropriate KSbase
 * handler if applicable.
 * 
 * @author soh
 * @kieler.design 2010-06-15 msp, cmot
 * @kieler.ignore (excluded from review process)
 */
public abstract class AbstractCutCopyPasteHandlerProvider extends
        AbstractGlobalActionHandlerProvider {

    /**
     * List of handlers.
     */
    // SUPPRESS CHECKSTYLE NEXT LineLength
    private Hashtable<IWorkbenchPart, DiagramGlobalActionHandler> handlerList = new Hashtable<IWorkbenchPart, DiagramGlobalActionHandler>();

    /**
     * Creates a new instance.
     */
    public AbstractCutCopyPasteHandlerProvider() {
        super();
    }

    /**
     * Provides the actual handler.
     * 
     * @return the handler
     */
    protected abstract DiagramGlobalActionHandler getHandler();

    /**
     * 
     * {@inheritDoc}
     */
    @Override
    public IGlobalActionHandler getGlobalActionHandler(
            final IGlobalActionHandlerContext context) {
        /* Create the handler */
        if (!getHandlerList().containsKey(context.getActivePart())) {
            getHandlerList().put(context.getActivePart(), getHandler());

            /*
             * Register as a part listener so that the cache can be cleared when
             * the part is disposed
             */
            context.getActivePart().getSite().getPage().addPartListener(
                    new IPartListener() {

                        private IWorkbenchPart localPart = context
                                .getActivePart();

                        /**
                         * @see org.eclipse.ui.IPartListener#partActivated(IWorkbenchPart)
                         */
                        public void partActivated(final IWorkbenchPart part) {
                            // Do nothing
                        }

                        /**
                         * @see org.eclipse.ui.IPartListener#partBroughtToTop(IWorkbenchPart)
                         */
                        public void partBroughtToTop(final IWorkbenchPart part) {
                            // Do nothing
                        }

                        /**
                         * @see org.eclipse.ui.IPartListener#partClosed(IWorkbenchPart)
                         */
                        public void partClosed(final IWorkbenchPart part) {
                            /* Remove the cache associated with the part */
                            if (part != null && part == localPart
                                    && getHandlerList().containsKey(part)) {
                                getHandlerList().remove(part);
                                localPart.getSite().getPage()
                                        .removePartListener(this);
                                localPart = null;
                            }
                        }

                        /**
                         * @see org.eclipse.ui.IPartListener#partDeactivated(IWorkbenchPart)
                         */
                        public void partDeactivated(final IWorkbenchPart part) {
                            // Do nothing
                        }

                        /**
                         * @see org.eclipse.ui.IPartListener#partOpened(IWorkbenchPart)
                         */
                        public void partOpened(final IWorkbenchPart part) {
                            // Do nothing
                        }
                    });
        }

        return getHandlerList().get(context.getActivePart());
    }

    /**
     * Returns the handlerList.
     * 
     * @return Hashtable
     */
    private Hashtable<IWorkbenchPart, DiagramGlobalActionHandler> getHandlerList() {
        return handlerList;
    }

}
