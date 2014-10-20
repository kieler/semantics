// SUPPRESS CHECKSTYLE NEXT Header
/******************************************************************************
 * Copyright (c) 2002, 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation 
 ****************************************************************************/
package de.cau.cs.kieler.karma.util.expandcollapsebutton;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Locator;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;

/**
 * A resizable editpolicy for resizable compartments.
 * 
 * @author melaasar
 * @author ckru
 * @kieler.design proposed by msp
 * @kieler.ignored
 */
public class AdvancedRenderingResizableCompartmentEditPolicy extends ResizableCompartmentEditPolicy {

    private AdvancedRenderingCompartmentCollapseHandle collapseHandle;

    private IFigure collapseFigure;

    private IFigure expandFigure;

    private Locator collapseExpandLocator;
    
    private Dimension collapseExpandSize;

    //Taken from original eclipse code, blame them
    @SuppressWarnings("rawtypes")
    @Override
    protected List createCollapseHandles() {
        IGraphicalEditPart part = (IGraphicalEditPart) getHost();

        List<AdvancedRenderingCompartmentCollapseHandle> collapseHandles = 
                new ArrayList<AdvancedRenderingCompartmentCollapseHandle>();
        collapseHandle = new AdvancedRenderingCompartmentCollapseHandle(part, collapseFigure,
                expandFigure, collapseExpandLocator, collapseExpandSize);
        collapseHandles.add(collapseHandle);
        return collapseHandles;
    }

    /**
     * set custom collapse figure.
     * @param figure the new custom figure
     */
    public void setCollapseFigure(final IFigure figure) {
        this.collapseFigure = figure;
    }
    
    /**
     * gets the custom collapse figure.
     * @return the custom collapse figure
     */
    public IFigure getCollapseFigure() {
        return this.collapseFigure;
    }

    /**
     * set custom expand figure.
     * @param figure the new custom figure
     */
    public void setExpandFigure(final IFigure figure) {
        this.expandFigure = figure;
    }
    
    /**
     * gets the custom expand figure.
     * @return the custom expand figure
     */
    public IFigure getExpandFigure() {
        return this.expandFigure;
    }

    /**
     * set custom collapse/expand locator.
     * @param locator the new custom figure
     */
    public void setCollapseExpandLocator(final Locator locator) {
        this.collapseExpandLocator = locator;
    }
    
    /**
     * gets the custom collapse/expand locator.
     * @return the custom locator
     */
    public Locator getCollapseExpandLocator() {
        return this.collapseExpandLocator;
    }
    
    /**
     * set custom size of the clickable area to expand/collapse.
     * @param dim the new size
     */
    public void setCollapseExpandSize(final Dimension dim) {
        this.collapseExpandSize = dim;
    }
    
    /**
     * gets the custom size of the clickable area to expand/collapse.
     * @return the custom size
     */
    public Dimension getCollapseExpandSize() {
        return this.collapseExpandSize;
    }

}
