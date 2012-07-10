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

import org.eclipse.gmf.runtime.diagram.ui.providers.DiagramGlobalActionHandler;

import de.cau.cs.kieler.core.model.gmf.handlers.AbstractCutCopyPasteHandlerProvider;

/**
 * Handler for passing cut, copy and paste request to the appropriate KSbase
 * handler if applicable.
 * 
 * @author soh
 */
public class SyncchartsCutCopyPasteHandlerProvider extends
        AbstractCutCopyPasteHandlerProvider {

    /**
     * {@inheritDoc}
     */
    @Override
    protected DiagramGlobalActionHandler getHandler() {
        return new SyncchartsCutCopyPasteHandler();
    }
}
