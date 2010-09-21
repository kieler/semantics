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
package de.cau.cs.kieler.kvid.visual.complex;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.core.service.IProviderChangeListener;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.internal.services.editpart.IEditPartProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.CreateGraphicEditPartOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.IEditPartOperation;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * {@link IEditPartProvider} for node classes provided by KViD.
 * 
 * @author jjc
 *
 */
@SuppressWarnings("restriction")
public class DataDisplayEditPartProvider implements IEditPartProvider {
    
    private static final String DATA_DISPLAY_ELEMENTS_ID = "de.cau.cs.kieler.kvid.dataDisplay";
    
    private IConfigurationElement[] extensions = null;

    /**
     * Not used and therefore not implemented.
     * 
     * @param listener An also ignored listener
     */
    public void addProviderChangeListener(final IProviderChangeListener listener) {
        //Not used, ignored
    }

    /**
     * {@inheritDoc}
     */
    public boolean provides(final IOperation operation) {
        if (extensions == null) {
            extensions = Platform.getExtensionRegistry()
                    .getConfigurationElementsFor(DATA_DISPLAY_ELEMENTS_ID);
        }
        for (IConfigurationElement element : extensions) {
            for (IConfigurationElement child : element.getChildren()) {
                String hint = child.getAttribute("semanticHint");
                if (operation instanceof CreateGraphicEditPartOperation) {
                    View view = ((IEditPartOperation) operation).getView();
                    if (view.getType().equals(hint)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * Not used and therefore not implemented.
     * 
     * @param listener An also ignored listener
     */
    public void removeProviderChangeListener(final IProviderChangeListener listener) {
        //Not used, ignored
    }

    /**
     * {@inheritDoc} 
     */
    public IGraphicalEditPart createGraphicEditPart(final View view) {
        IGraphicalEditPart part = null;
        outer:
        for (IConfigurationElement element : extensions) {
            for (IConfigurationElement child : element.getChildren()) {
                String hint = child.getAttribute("semanticHint");
                if (view.getType().equals(hint)) {
                    AbstractDisplayFactory factory;
                    try {
                        factory = (AbstractDisplayFactory) element
                                .createExecutableExtension("factoryClass");
                        part = factory.create(view, hint);
                        break outer;
                    } catch (CoreException ex) {
                        System.err
                                .println("Error in Extension Point defining"
                                        + " a factory for the semanticHint: "
                                        + hint);
                        ex.printStackTrace();
                    }
                }
            }
        }
        return part;
    }

    /**
     * {@inheritDoc} 
     */
    public RootEditPart createRootEditPart(final Diagram diagram) {
        //KViD won't provide RootEditParts, thus ignored 
        return null;
    }

}
