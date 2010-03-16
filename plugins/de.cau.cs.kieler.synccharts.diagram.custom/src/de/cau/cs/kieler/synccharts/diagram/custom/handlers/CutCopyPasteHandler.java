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
package de.cau.cs.kieler.synccharts.diagram.custom.handlers;

import java.util.Hashtable;

import org.eclipse.gmf.runtime.common.ui.services.action.global.AbstractGlobalActionHandlerProvider;
import org.eclipse.gmf.runtime.common.ui.services.action.global.IGlobalActionHandler;
import org.eclipse.gmf.runtime.common.ui.services.action.global.IGlobalActionHandlerContext;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;

/**
 * Handler for passing cut, copy and paste request to the appropriate KSbase
 * handler if applicable.
 * 
 * @author soh
 * @kieler.rating 2010-03-01 proposed yellow
 */
public class CutCopyPasteHandler extends AbstractGlobalActionHandlerProvider {

    /**
     * List for handlers.
     */
    private Hashtable<IWorkbenchPart, CutCopyPasteSupportHandler> handlerList = new Hashtable<IWorkbenchPart, CutCopyPasteSupportHandler>();

    /**
     * Creates a new instance.
     */
    public CutCopyPasteHandler() {
        super();
    }

    /**
     * Returns a global action handler that supports global image operations
     * (cut, copy, and paste).
     */
    @Override
    public IGlobalActionHandler getGlobalActionHandler(
            final IGlobalActionHandlerContext context) {
        /* Create the handler */
        if (!getHandlerList().containsKey(context.getActivePart())) {
            getHandlerList().put(context.getActivePart(),
                    new CutCopyPasteSupportHandler());

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
                        public void partActivated(IWorkbenchPart part) {
                            // Do nothing
                        }

                        /**
                         * @see org.eclipse.ui.IPartListener#partBroughtToTop(IWorkbenchPart)
                         */
                        public void partBroughtToTop(IWorkbenchPart part) {
                            // Do nothing
                        }

                        /**
                         * @see org.eclipse.ui.IPartListener#partClosed(IWorkbenchPart)
                         */
                        public void partClosed(IWorkbenchPart part) {
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
                        public void partDeactivated(IWorkbenchPart part) {
                            // Do nothing
                        }

                        /**
                         * @see org.eclipse.ui.IPartListener#partOpened(IWorkbenchPart)
                         */
                        public void partOpened(IWorkbenchPart part) {
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
    private Hashtable<IWorkbenchPart, CutCopyPasteSupportHandler> getHandlerList() {
        return handlerList;
    }

}
