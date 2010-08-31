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

import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

import de.cau.cs.kieler.kvid.datadistributor.IDataListener;

/**
 * @author jjc
 *
 */
public abstract class AbstractDataDisplayEditPart extends ShapeNodeEditPart
        implements IDataListener {
    
    /**
     * Constructor using only the constructor of the superclass.
     * 
     * @param view The view to contribute to
     */
    public AbstractDataDisplayEditPart(final View view) {
        super(view);
    }

    /**
     * {@inheritDoc}
     */
    public abstract void triggerDataChanged();

    /**
     * {@inheritDoc}
     */
    public abstract void triggerWrapup();
    
    /**
     * {@inheritDoc}
     */
    @Override
    protected abstract NodeFigure createNodeFigure();

}
